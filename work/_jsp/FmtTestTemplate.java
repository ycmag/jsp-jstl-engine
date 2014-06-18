/*
 * $RCSfile: FmtTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-06-12 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * Home: D:\workspace2\ayada\webapp
 * Path: fmtTest.jsp
 * LastModified: 2014-06-12 19:00:29 628
 * JSP generated by JspCompiler-1.0.0.8 (built 2014-06-12 19:00:31 186)
 */
package _jsp;

import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;

/**
 * <p>Title: FmtTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
public class FmtTestTemplate extends JspTemplate
{
    public static void main(String[] args)
    {
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getDefaultPageContext(writer);
        FmtTestTemplate template = new FmtTestTemplate();

        try{
            template._execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable)
        {
            throwable.printStackTrace();
        }
     }

    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    public void _execute(final PageContext pageContext) throws Throwable
    {
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();

        /* NODE START: lineNumber: 1, offset: 0, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_1 */
        /* <c:set var="i18n" value="${I18n.getBundle(&#39;ayada_i18n&#39;, &#39;zh_cn&#39;)}"/> */
        pageContext.setAttribute("i18n", ExpressionUtil.evaluate(expressionContext, "${I18n.getBundle(\'ayada_i18n\', \'zh_cn\')}", null));
        /* jsp.jstl.core.SetTag END */
        /* NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_1 */

        /* TEXT: lineNumber: 2 */
        out.write("message1: ");
        /* EXPRESSION: lineNumber: 2 */
        out.write(expressionContext.getString("i18n.format(\"test.common.test4\", \"000\", \"111\", \"222\", \"333\")"));
        /* TEXT: lineNumber: 2 */
        out.write("\r\nmessage2: ");
        /* EXPRESSION: lineNumber: 3 */
        out.write(expressionContext.getString("i18n.message(\"test.common.test4\")"));
        /* TEXT: lineNumber: 3 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 5, offset: 7, length: 2, tagClassName: com.skin.ayada.jstl.fmt.SetBundleTag, tagInstanceName: _jsp_SetBundleTag_8 */
        /* <fmt:setBundle var="myI18n" basename="ayada_i18n"/> */
        com.skin.ayada.jstl.fmt.SetBundleTag _jsp_SetBundleTag_8 = new com.skin.ayada.jstl.fmt.SetBundleTag();
        _jsp_SetBundleTag_8.setParent((Tag)null);
        _jsp_SetBundleTag_8.setPageContext(pageContext);
        _jsp_SetBundleTag_8.setVar("myI18n");
        _jsp_SetBundleTag_8.setBasename("ayada_i18n");
        int _jsp_start_flag_8 = _jsp_SetBundleTag_8.doStartTag();

        if(_jsp_start_flag_8 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_8 != Tag.SKIP_BODY){
            _jsp_SetBundleTag_8.doAfterBody();
        }
        _jsp_SetBundleTag_8.doEndTag();
        _jsp_SetBundleTag_8.release();
        /* NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.fmt.SetBundleTag, tagInstanceName: _jsp_SetBundleTag_8 */

        /* TEXT: lineNumber: 5 */
        out.write("\r\nmessage3: ");
        /* EXPRESSION: lineNumber: 6 */
        out.write(expressionContext.getString("myI18n.format(\"test.common.test4\", \"000\", \"111\", \"222\", \"333\")"));
        /* TEXT: lineNumber: 6 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 8, offset: 12, length: 6, tagClassName: com.skin.ayada.jstl.fmt.BundleTag, tagInstanceName: _jsp_BundleTag_13 */
        /* <fmt:bundle basename="ayada_i18n">...</fmt:bundle> */
        com.skin.ayada.jstl.fmt.BundleTag _jsp_BundleTag_13 = new com.skin.ayada.jstl.fmt.BundleTag();
        try{
            _jsp_BundleTag_13.setParent((Tag)null);
            _jsp_BundleTag_13.setPageContext(pageContext);
            _jsp_BundleTag_13.setBasename("ayada_i18n");
            int _jsp_start_flag_13 = _jsp_BundleTag_13.doStartTag();

            if(_jsp_start_flag_13 == Tag.SKIP_PAGE){
                return;
            }
            if(_jsp_start_flag_13 != Tag.SKIP_BODY){
                int _jsp_flag_13 = 0;

                do{
                    /* TEXT: lineNumber: 8 */
                    out.write("\r\n    ");

                    /* NODE START: lineNumber: 9, offset: 14, length: 2, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_15 */
                    /* <fmt:message key="test.common.test1"/> */
                    com.skin.ayada.jstl.fmt.MessageTag _jsp_MessageTag_15 = new com.skin.ayada.jstl.fmt.MessageTag();
                    _jsp_MessageTag_15.setParent(_jsp_BundleTag_13);
                    _jsp_MessageTag_15.setPageContext(pageContext);
                    _jsp_MessageTag_15.setKey("test.common.test1");
                    int _jsp_start_flag_15 = _jsp_MessageTag_15.doStartTag();

                    if(_jsp_start_flag_15 == Tag.SKIP_PAGE){
                        return;
                    }
                    if(_jsp_start_flag_15 != Tag.SKIP_BODY){
                        _jsp_MessageTag_15.doAfterBody();
                    }
                    _jsp_MessageTag_15.doEndTag();
                    _jsp_MessageTag_15.release();
                    /* NODE END: lineNumber: 9, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_15 */

                    /* TEXT: lineNumber: 9 */
                    out.write("\r\n");
                    _jsp_flag_13 = _jsp_BundleTag_13.doAfterBody();
                }
                while(_jsp_flag_13 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_BundleTag_13.doEndTag();
            _jsp_BundleTag_13.release();
        }
        catch(Throwable throwable){
            _jsp_BundleTag_13.doCatch(throwable);
        }
        finally{
            _jsp_BundleTag_13.doFinally();
        }
        /* NODE END: lineNumber: 8, tagClassName: com.skin.ayada.jstl.fmt.BundleTag, tagInstanceName: _jsp_BundleTag_13 */

        /* TEXT: lineNumber: 10 */
        out.write("\r\n");

        /* NODE START: lineNumber: 11, offset: 19, length: 2, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_20 */
        /* <fmt:message key="test.common.test2" bundle="ayada_i18n"/> */
        com.skin.ayada.jstl.fmt.MessageTag _jsp_MessageTag_20 = new com.skin.ayada.jstl.fmt.MessageTag();
        _jsp_MessageTag_20.setParent((Tag)null);
        _jsp_MessageTag_20.setPageContext(pageContext);
        _jsp_MessageTag_20.setKey("test.common.test2");
        _jsp_MessageTag_20.setBundle("ayada_i18n");
        int _jsp_start_flag_20 = _jsp_MessageTag_20.doStartTag();

        if(_jsp_start_flag_20 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_20 != Tag.SKIP_BODY){
            _jsp_MessageTag_20.doAfterBody();
        }
        _jsp_MessageTag_20.doEndTag();
        _jsp_MessageTag_20.release();
        /* NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_20 */

        /* TEXT: lineNumber: 11 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 13, offset: 22, length: 10, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_23 */
        /* <fmt:message key="test.common.test4" bundle="ayada_i18n">...</fmt:message> */
        com.skin.ayada.jstl.fmt.MessageTag _jsp_MessageTag_23 = new com.skin.ayada.jstl.fmt.MessageTag();
        _jsp_MessageTag_23.setParent((Tag)null);
        _jsp_MessageTag_23.setPageContext(pageContext);
        _jsp_MessageTag_23.setKey("test.common.test4");
        _jsp_MessageTag_23.setBundle("ayada_i18n");
        int _jsp_start_flag_23 = _jsp_MessageTag_23.doStartTag();

        if(_jsp_start_flag_23 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_23 != Tag.SKIP_BODY){
            int _jsp_flag_23 = 0;
            if(_jsp_start_flag_23 == BodyTag.EVAL_BODY_BUFFERED){
                BodyContent _jsp_body_content_23 = (BodyContent)(pageContext.pushBody());
                _jsp_MessageTag_23.setBodyContent(_jsp_body_content_23);
                _jsp_MessageTag_23.doInitBody();
                out = _jsp_body_content_23;
            }

            do{
                /* NODE START: lineNumber: 14, offset: 23, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_24 */
                /* <fmt:param value="000"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_24 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_24.setParent(_jsp_MessageTag_23);
                _jsp_FmtParamTag_24.setPageContext(pageContext);
                _jsp_FmtParamTag_24.setValue(0);
                int _jsp_start_flag_24 = _jsp_FmtParamTag_24.doStartTag();

                if(_jsp_start_flag_24 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_24 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_24.doAfterBody();
                }
                _jsp_FmtParamTag_24.doEndTag();
                _jsp_FmtParamTag_24.release();
                /* NODE END: lineNumber: 14, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_24 */

                /* NODE START: lineNumber: 15, offset: 25, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_26 */
                /* <fmt:param value="111"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_26 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_26.setParent(_jsp_MessageTag_23);
                _jsp_FmtParamTag_26.setPageContext(pageContext);
                _jsp_FmtParamTag_26.setValue(111);
                int _jsp_start_flag_26 = _jsp_FmtParamTag_26.doStartTag();

                if(_jsp_start_flag_26 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_26 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_26.doAfterBody();
                }
                _jsp_FmtParamTag_26.doEndTag();
                _jsp_FmtParamTag_26.release();
                /* NODE END: lineNumber: 15, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_26 */

                /* NODE START: lineNumber: 16, offset: 27, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_28 */
                /* <fmt:param value="222"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_28 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_28.setParent(_jsp_MessageTag_23);
                _jsp_FmtParamTag_28.setPageContext(pageContext);
                _jsp_FmtParamTag_28.setValue(222);
                int _jsp_start_flag_28 = _jsp_FmtParamTag_28.doStartTag();

                if(_jsp_start_flag_28 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_28 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_28.doAfterBody();
                }
                _jsp_FmtParamTag_28.doEndTag();
                _jsp_FmtParamTag_28.release();
                /* NODE END: lineNumber: 16, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_28 */

                /* NODE START: lineNumber: 17, offset: 29, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_30 */
                /* <fmt:param value="333"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_30 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_30.setParent(_jsp_MessageTag_23);
                _jsp_FmtParamTag_30.setPageContext(pageContext);
                _jsp_FmtParamTag_30.setValue(333);
                int _jsp_start_flag_30 = _jsp_FmtParamTag_30.doStartTag();

                if(_jsp_start_flag_30 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_30 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_30.doAfterBody();
                }
                _jsp_FmtParamTag_30.doEndTag();
                _jsp_FmtParamTag_30.release();
                /* NODE END: lineNumber: 17, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_30 */

                _jsp_flag_23 = _jsp_MessageTag_23.doAfterBody();
            }
            while(_jsp_flag_23 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_23 == BodyTag.EVAL_BODY_BUFFERED){
                out = pageContext.popBody();
            }
        }
        _jsp_MessageTag_23.doEndTag();
        _jsp_MessageTag_23.release();
        /* NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_23 */

        /* TEXT: lineNumber: 18 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 20, offset: 33, length: 14, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_34 */
        /* <fmt:message key="test.common.test4" bundle="ayada_i18n">...</fmt:message> */
        com.skin.ayada.jstl.fmt.MessageTag _jsp_MessageTag_34 = new com.skin.ayada.jstl.fmt.MessageTag();
        _jsp_MessageTag_34.setParent((Tag)null);
        _jsp_MessageTag_34.setPageContext(pageContext);
        _jsp_MessageTag_34.setKey("test.common.test4");
        _jsp_MessageTag_34.setBundle("ayada_i18n");
        int _jsp_start_flag_34 = _jsp_MessageTag_34.doStartTag();

        if(_jsp_start_flag_34 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_34 != Tag.SKIP_BODY){
            int _jsp_flag_34 = 0;
            if(_jsp_start_flag_34 == BodyTag.EVAL_BODY_BUFFERED){
                BodyContent _jsp_body_content_34 = (BodyContent)(pageContext.pushBody());
                _jsp_MessageTag_34.setBodyContent(_jsp_body_content_34);
                _jsp_MessageTag_34.doInitBody();
                out = _jsp_body_content_34;
            }

            do{
                /* NODE START: lineNumber: 21, offset: 34, length: 3, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_35 */
                /* <fmt:param>...</fmt:param> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_35 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_35.setParent(_jsp_MessageTag_34);
                _jsp_FmtParamTag_35.setPageContext(pageContext);
                int _jsp_start_flag_35 = _jsp_FmtParamTag_35.doStartTag();

                if(_jsp_start_flag_35 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_35 != Tag.SKIP_BODY){
                    int _jsp_flag_35 = 0;
                    if(_jsp_start_flag_35 == BodyTag.EVAL_BODY_BUFFERED){
                        BodyContent _jsp_body_content_35 = (BodyContent)(pageContext.pushBody());
                        _jsp_FmtParamTag_35.setBodyContent(_jsp_body_content_35);
                        _jsp_FmtParamTag_35.doInitBody();
                        out = _jsp_body_content_35;
                    }

                    do{
                        /* TEXT: lineNumber: 21 */
                        out.write("000");
                        _jsp_flag_35 = _jsp_FmtParamTag_35.doAfterBody();
                    }
                    while(_jsp_flag_35 == IterationTag.EVAL_BODY_AGAIN);
                    if(_jsp_start_flag_35 == BodyTag.EVAL_BODY_BUFFERED){
                        out = pageContext.popBody();
                    }
                }
                _jsp_FmtParamTag_35.doEndTag();
                _jsp_FmtParamTag_35.release();
                /* NODE END: lineNumber: 21, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_35 */

                /* NODE START: lineNumber: 22, offset: 37, length: 3, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_38 */
                /* <fmt:param>...</fmt:param> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_38 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_38.setParent(_jsp_MessageTag_34);
                _jsp_FmtParamTag_38.setPageContext(pageContext);
                int _jsp_start_flag_38 = _jsp_FmtParamTag_38.doStartTag();

                if(_jsp_start_flag_38 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_38 != Tag.SKIP_BODY){
                    int _jsp_flag_38 = 0;
                    if(_jsp_start_flag_38 == BodyTag.EVAL_BODY_BUFFERED){
                        BodyContent _jsp_body_content_38 = (BodyContent)(pageContext.pushBody());
                        _jsp_FmtParamTag_38.setBodyContent(_jsp_body_content_38);
                        _jsp_FmtParamTag_38.doInitBody();
                        out = _jsp_body_content_38;
                    }

                    do{
                        /* TEXT: lineNumber: 22 */
                        out.write("111");
                        _jsp_flag_38 = _jsp_FmtParamTag_38.doAfterBody();
                    }
                    while(_jsp_flag_38 == IterationTag.EVAL_BODY_AGAIN);
                    if(_jsp_start_flag_38 == BodyTag.EVAL_BODY_BUFFERED){
                        out = pageContext.popBody();
                    }
                }
                _jsp_FmtParamTag_38.doEndTag();
                _jsp_FmtParamTag_38.release();
                /* NODE END: lineNumber: 22, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_38 */

                /* NODE START: lineNumber: 23, offset: 40, length: 3, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_41 */
                /* <fmt:param>...</fmt:param> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_41 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_41.setParent(_jsp_MessageTag_34);
                _jsp_FmtParamTag_41.setPageContext(pageContext);
                int _jsp_start_flag_41 = _jsp_FmtParamTag_41.doStartTag();

                if(_jsp_start_flag_41 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_41 != Tag.SKIP_BODY){
                    int _jsp_flag_41 = 0;
                    if(_jsp_start_flag_41 == BodyTag.EVAL_BODY_BUFFERED){
                        BodyContent _jsp_body_content_41 = (BodyContent)(pageContext.pushBody());
                        _jsp_FmtParamTag_41.setBodyContent(_jsp_body_content_41);
                        _jsp_FmtParamTag_41.doInitBody();
                        out = _jsp_body_content_41;
                    }

                    do{
                        /* TEXT: lineNumber: 23 */
                        out.write("222");
                        _jsp_flag_41 = _jsp_FmtParamTag_41.doAfterBody();
                    }
                    while(_jsp_flag_41 == IterationTag.EVAL_BODY_AGAIN);
                    if(_jsp_start_flag_41 == BodyTag.EVAL_BODY_BUFFERED){
                        out = pageContext.popBody();
                    }
                }
                _jsp_FmtParamTag_41.doEndTag();
                _jsp_FmtParamTag_41.release();
                /* NODE END: lineNumber: 23, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_41 */

                /* NODE START: lineNumber: 24, offset: 43, length: 3, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_44 */
                /* <fmt:param>...</fmt:param> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_44 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_44.setParent(_jsp_MessageTag_34);
                _jsp_FmtParamTag_44.setPageContext(pageContext);
                int _jsp_start_flag_44 = _jsp_FmtParamTag_44.doStartTag();

                if(_jsp_start_flag_44 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_44 != Tag.SKIP_BODY){
                    int _jsp_flag_44 = 0;
                    if(_jsp_start_flag_44 == BodyTag.EVAL_BODY_BUFFERED){
                        BodyContent _jsp_body_content_44 = (BodyContent)(pageContext.pushBody());
                        _jsp_FmtParamTag_44.setBodyContent(_jsp_body_content_44);
                        _jsp_FmtParamTag_44.doInitBody();
                        out = _jsp_body_content_44;
                    }

                    do{
                        /* TEXT: lineNumber: 24 */
                        out.write("333");
                        _jsp_flag_44 = _jsp_FmtParamTag_44.doAfterBody();
                    }
                    while(_jsp_flag_44 == IterationTag.EVAL_BODY_AGAIN);
                    if(_jsp_start_flag_44 == BodyTag.EVAL_BODY_BUFFERED){
                        out = pageContext.popBody();
                    }
                }
                _jsp_FmtParamTag_44.doEndTag();
                _jsp_FmtParamTag_44.release();
                /* NODE END: lineNumber: 24, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_44 */

                _jsp_flag_34 = _jsp_MessageTag_34.doAfterBody();
            }
            while(_jsp_flag_34 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_34 == BodyTag.EVAL_BODY_BUFFERED){
                out = pageContext.popBody();
            }
        }
        _jsp_MessageTag_34.doEndTag();
        _jsp_MessageTag_34.release();
        /* NODE END: lineNumber: 20, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_34 */

        /* TEXT: lineNumber: 25 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 27, offset: 48, length: 10, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_49 */
        /* <fmt:message key="test.common.test4" bundle="ayada_i18n">...</fmt:message> */
        com.skin.ayada.jstl.fmt.MessageTag _jsp_MessageTag_49 = new com.skin.ayada.jstl.fmt.MessageTag();
        _jsp_MessageTag_49.setParent((Tag)null);
        _jsp_MessageTag_49.setPageContext(pageContext);
        _jsp_MessageTag_49.setKey("test.common.test4");
        _jsp_MessageTag_49.setBundle("ayada_i18n");
        int _jsp_start_flag_49 = _jsp_MessageTag_49.doStartTag();

        if(_jsp_start_flag_49 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_49 != Tag.SKIP_BODY){
            int _jsp_flag_49 = 0;
            if(_jsp_start_flag_49 == BodyTag.EVAL_BODY_BUFFERED){
                BodyContent _jsp_body_content_49 = (BodyContent)(pageContext.pushBody());
                _jsp_MessageTag_49.setBodyContent(_jsp_body_content_49);
                _jsp_MessageTag_49.doInitBody();
                out = _jsp_body_content_49;
            }

            do{
                /* NODE START: lineNumber: 28, offset: 49, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_50 */
                /* <fmt:param value="aaa"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_50 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_50.setParent(_jsp_MessageTag_49);
                _jsp_FmtParamTag_50.setPageContext(pageContext);
                _jsp_FmtParamTag_50.setValue("aaa");
                int _jsp_start_flag_50 = _jsp_FmtParamTag_50.doStartTag();

                if(_jsp_start_flag_50 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_50 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_50.doAfterBody();
                }
                _jsp_FmtParamTag_50.doEndTag();
                _jsp_FmtParamTag_50.release();
                /* NODE END: lineNumber: 28, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_50 */

                /* NODE START: lineNumber: 29, offset: 51, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_52 */
                /* <fmt:param value="bbb"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_52 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_52.setParent(_jsp_MessageTag_49);
                _jsp_FmtParamTag_52.setPageContext(pageContext);
                _jsp_FmtParamTag_52.setValue("bbb");
                int _jsp_start_flag_52 = _jsp_FmtParamTag_52.doStartTag();

                if(_jsp_start_flag_52 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_52 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_52.doAfterBody();
                }
                _jsp_FmtParamTag_52.doEndTag();
                _jsp_FmtParamTag_52.release();
                /* NODE END: lineNumber: 29, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_52 */

                /* NODE START: lineNumber: 30, offset: 53, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_54 */
                /* <fmt:param value="ccc"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_54 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_54.setParent(_jsp_MessageTag_49);
                _jsp_FmtParamTag_54.setPageContext(pageContext);
                _jsp_FmtParamTag_54.setValue("ccc");
                int _jsp_start_flag_54 = _jsp_FmtParamTag_54.doStartTag();

                if(_jsp_start_flag_54 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_54 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_54.doAfterBody();
                }
                _jsp_FmtParamTag_54.doEndTag();
                _jsp_FmtParamTag_54.release();
                /* NODE END: lineNumber: 30, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_54 */

                /* NODE START: lineNumber: 31, offset: 55, length: 2, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_56 */
                /* <fmt:param value="ddd"/> */
                com.skin.ayada.jstl.fmt.FmtParamTag _jsp_FmtParamTag_56 = new com.skin.ayada.jstl.fmt.FmtParamTag();
                _jsp_FmtParamTag_56.setParent(_jsp_MessageTag_49);
                _jsp_FmtParamTag_56.setPageContext(pageContext);
                _jsp_FmtParamTag_56.setValue("ddd");
                int _jsp_start_flag_56 = _jsp_FmtParamTag_56.doStartTag();

                if(_jsp_start_flag_56 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_56 != Tag.SKIP_BODY){
                    _jsp_FmtParamTag_56.doAfterBody();
                }
                _jsp_FmtParamTag_56.doEndTag();
                _jsp_FmtParamTag_56.release();
                /* NODE END: lineNumber: 31, tagClassName: com.skin.ayada.jstl.fmt.FmtParamTag, tagInstanceName: _jsp_FmtParamTag_56 */

                _jsp_flag_49 = _jsp_MessageTag_49.doAfterBody();
            }
            while(_jsp_flag_49 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_49 == BodyTag.EVAL_BODY_BUFFERED){
                out = pageContext.popBody();
            }
        }
        _jsp_MessageTag_49.doEndTag();
        _jsp_MessageTag_49.release();
        /* NODE END: lineNumber: 27, tagClassName: com.skin.ayada.jstl.fmt.MessageTag, tagInstanceName: _jsp_MessageTag_49 */

        /* TEXT: lineNumber: 32 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 34, offset: 59, length: 2, tagClassName: com.skin.ayada.jstl.fmt.SetLocaleTag, tagInstanceName: _jsp_SetLocaleTag_60 */
        /* <fmt:setLocale value="fr_fr"/> */
        com.skin.ayada.jstl.fmt.SetLocaleTag _jsp_SetLocaleTag_60 = new com.skin.ayada.jstl.fmt.SetLocaleTag();
        _jsp_SetLocaleTag_60.setParent((Tag)null);
        _jsp_SetLocaleTag_60.setPageContext(pageContext);
        _jsp_SetLocaleTag_60.setValue("fr_fr");
        int _jsp_start_flag_60 = _jsp_SetLocaleTag_60.doStartTag();

        if(_jsp_start_flag_60 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_60 != Tag.SKIP_BODY){
            _jsp_SetLocaleTag_60.doAfterBody();
        }
        _jsp_SetLocaleTag_60.doEndTag();
        _jsp_SetLocaleTag_60.release();
        /* NODE END: lineNumber: 34, tagClassName: com.skin.ayada.jstl.fmt.SetLocaleTag, tagInstanceName: _jsp_SetLocaleTag_60 */

        /* TEXT: lineNumber: 34 */
        out.write("\r\n");

        /* NODE START: lineNumber: 35, offset: 62, length: 2, tagClassName: com.skin.ayada.jstl.fmt.NumberFormatTag, tagInstanceName: _jsp_NumberFormatTag_63 */
        /* <fmt:formatNumber value="123456789.012"/> */
        com.skin.ayada.jstl.fmt.NumberFormatTag _jsp_NumberFormatTag_63 = new com.skin.ayada.jstl.fmt.NumberFormatTag();
        _jsp_NumberFormatTag_63.setParent((Tag)null);
        _jsp_NumberFormatTag_63.setPageContext(pageContext);
        _jsp_NumberFormatTag_63.setValue(1.23456789012E8d);
        int _jsp_start_flag_63 = _jsp_NumberFormatTag_63.doStartTag();

        if(_jsp_start_flag_63 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_63 != Tag.SKIP_BODY){
            _jsp_NumberFormatTag_63.doAfterBody();
        }
        _jsp_NumberFormatTag_63.doEndTag();
        _jsp_NumberFormatTag_63.release();
        /* NODE END: lineNumber: 35, tagClassName: com.skin.ayada.jstl.fmt.NumberFormatTag, tagInstanceName: _jsp_NumberFormatTag_63 */

        /* TEXT: lineNumber: 35 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 37, offset: 65, length: 2, tagClassName: com.skin.ayada.jstl.core.ListTag, tagInstanceName: _jsp_ListTag_66 */
        /* <c:list name="userList"/> */
        com.skin.ayada.jstl.core.ListTag _jsp_ListTag_66 = new com.skin.ayada.jstl.core.ListTag();
        _jsp_ListTag_66.setParent((Tag)null);
        _jsp_ListTag_66.setPageContext(pageContext);
        _jsp_ListTag_66.setName("userList");
        int _jsp_start_flag_66 = _jsp_ListTag_66.doStartTag();

        if(_jsp_start_flag_66 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_66 != Tag.SKIP_BODY){
            _jsp_ListTag_66.doAfterBody();
        }
        _jsp_ListTag_66.doEndTag();
        _jsp_ListTag_66.release();
        /* NODE END: lineNumber: 37, tagClassName: com.skin.ayada.jstl.core.ListTag, tagInstanceName: _jsp_ListTag_66 */

        /* TEXT: lineNumber: 37 */
        out.write("\r\n");

        /* NODE START: lineNumber: 38, offset: 68, length: 17, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_69 */
        /* <c:forEach begin="1" end="5" varStatus="status">...</c:forEach> */
        Object _jsp_old_var_status_69 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_69 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_69.setParent((Tag)null);
        _jsp_ForEachTag_69.setPageContext(pageContext);
        _jsp_ForEachTag_69.setBegin(1);
        _jsp_ForEachTag_69.setEnd(5);
        _jsp_ForEachTag_69.setVarStatus("status");
        if(_jsp_ForEachTag_69.doStartTag() != Tag.SKIP_BODY){
            while(true){
                /* TEXT: lineNumber: 38 */
                out.write("\r\n    ");

                /* NODE START: lineNumber: 39, offset: 70, length: 6, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_71 */
                /* <c:map name="user">...</c:map> */
                com.skin.ayada.jstl.core.MapTag _jsp_MapTag_71 = new com.skin.ayada.jstl.core.MapTag();
                _jsp_MapTag_71.setParent((Tag)null);
                _jsp_MapTag_71.setPageContext(pageContext);
                _jsp_MapTag_71.setDynamicAttribute("name", "user");
                int _jsp_start_flag_71 = _jsp_MapTag_71.doStartTag();

                if(_jsp_start_flag_71 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_71 != Tag.SKIP_BODY){
                    int _jsp_flag_71 = 0;

                    do{
                        /* NODE START: lineNumber: 40, offset: 71, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_72 */
                        /* <c:entry name="userName" value="ayada${status.index}"/> */
                        _jsp_MapTag_71.setAttribute("userName", ExpressionUtil.evaluate(expressionContext, "ayada${status.index}", null));
                        /* jsp.jstl.core.AttributeTag END */
                        /* NODE END: lineNumber: 40, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_72 */

                        /* NODE START: lineNumber: 41, offset: 73, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_74 */
                        /* <c:entry name="nickName" value="ayada${status.index}"/> */
                        _jsp_MapTag_71.setAttribute("nickName", ExpressionUtil.evaluate(expressionContext, "ayada${status.index}", null));
                        /* jsp.jstl.core.AttributeTag END */
                        /* NODE END: lineNumber: 41, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_74 */

                        _jsp_flag_71 = _jsp_MapTag_71.doAfterBody();
                    }
                    while(_jsp_flag_71 == IterationTag.EVAL_BODY_AGAIN);
                }
                _jsp_MapTag_71.doEndTag();
                _jsp_MapTag_71.release();
                /* NODE END: lineNumber: 39, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_71 */

                /* TEXT: lineNumber: 42 */
                out.write("\r\n    ");

                /* NODE START: lineNumber: 43, offset: 77, length: 2, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_78 */
                /* <c:execute value="${userList.add(user)}"/> */
                ExpressionUtil.evaluate(expressionContext, "${userList.add(user)}", null);
                /* jsp.jstl.core.ExecuteTag END */
                /* NODE END: lineNumber: 43, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_78 */

                /* TEXT: lineNumber: 44 */
                out.write("    <div>1 index: ");
                /* EXPRESSION: lineNumber: 44 */
                out.write(expressionContext.getString("status.index"));
                /* TEXT: lineNumber: 44 */
                out.write(": user.userName: ");
                /* EXPRESSION: lineNumber: 44 */
                out.write(expressionContext.getString("user.userName"));
                /* TEXT: lineNumber: 44 */
                out.write("</div>\r\n");
                if(_jsp_ForEachTag_69.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                    break;
                }
            }
        }
        _jsp_ForEachTag_69.release();
        pageContext.setAttribute("status", _jsp_old_var_status_69);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 38, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_69 */

        /* TEXT: lineNumber: 45 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 47, offset: 86, length: 15, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_87 */
        /* <c:forEach begin="1" end="5" step="2" var="user" varStatus="status">...</c:forEach> */
        Object _jsp_old_var_87 = pageContext.getAttribute("user");
        Object _jsp_old_var_status_87 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_87 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_87.setParent((Tag)null);
        _jsp_ForEachTag_87.setPageContext(pageContext);
        _jsp_ForEachTag_87.setVar("user");
        _jsp_ForEachTag_87.setBegin(1);
        _jsp_ForEachTag_87.setEnd(5);
        _jsp_ForEachTag_87.setStep(2);
        _jsp_ForEachTag_87.setVarStatus("status");
        if(_jsp_ForEachTag_87.doStartTag() != Tag.SKIP_BODY){
            while(true){
                /* TEXT: lineNumber: 47 */
                out.write("\r\n    <div>2 index: ");
                /* EXPRESSION: lineNumber: 48 */
                out.write(expressionContext.getString("status.index"));
                /* TEXT: lineNumber: 48 */
                out.write(", begin: ");
                /* EXPRESSION: lineNumber: 48 */
                out.write(expressionContext.getString("status.begin"));
                /* TEXT: lineNumber: 48 */
                out.write(", end: ");
                /* EXPRESSION: lineNumber: 48 */
                out.write(expressionContext.getString("status.end"));
                /* TEXT: lineNumber: 48 */
                out.write(", step: ");
                /* EXPRESSION: lineNumber: 48 */
                out.write(expressionContext.getString("status.step"));
                /* TEXT: lineNumber: 48 */
                out.write(", count: ");
                /* EXPRESSION: lineNumber: 48 */
                out.write(expressionContext.getString("status.count"));
                /* TEXT: lineNumber: 48 */
                out.write(", user.userName: ");
                /* VARIABLE: lineNumber: 48 */
                out.print(pageContext.getAttribute("user"), false);
                /* TEXT: lineNumber: 48 */
                out.write("</div>");
                if(_jsp_ForEachTag_87.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                    break;
                }
            }
        }
        _jsp_ForEachTag_87.release();
        pageContext.setAttribute("user", _jsp_old_var_87);
        pageContext.setAttribute("status", _jsp_old_var_status_87);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 47, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_87 */

        out.flush();
        jspWriter.flush();
    }
}
