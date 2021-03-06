/*
 * $RCSfile: SimpleTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /simpleTagTest.jsp
 * lastModified: 2014-07-13 22:03:02 854
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:04 582)
 */
package _tpl._jsp;

import java.io.Writer;
import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.JspFragment;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;
import java.io.IOException; // jsp:directive.import: lineNumber: 4


/**
 * <p>Title: SimpleTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class SimpleTagTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        SimpleTagTestTemplate template = new SimpleTagTestTemplate();

        try {
            template.execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    @SuppressWarnings("unchecked")
    public void _execute(final PageContext pageContext) throws Throwable {
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();
        // jsp:directive.page: lineNumber: 1
        // <jsp:directive.page contentType="text/html;charset=UTF-8"/>

        // jsp:directive.taglib: lineNumber: 2
        // <jsp:directive.taglib taglib="" prefix="c" uri="http://java.sun.com/jsp/jstl/core"/>

        // jsp:directive.taglib: lineNumber: 3
        // <jsp:directive.taglib taglib="" prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"/>

        // jsp:directive.page: lineNumber: 4
        // <jsp:directive.page import="java.io.IOException"/>

        // TEXT: lineNumber: 4
        // out.write("<!-- t:import name=\"test:simpleTag\" className=\"test.com.skin.ayada.taglib.MySimpleTag\"/ -->\r\n");
        out.write(_jsp_string_9, 0, _jsp_string_9.length);

        // NODE START: lineNumber: 7, offset: 9, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_10
        // <c:forEach items=\"1,1\" var=\"myvar\">...</c:forEach>
        Object _jsp_old_var_10 = pageContext.getAttribute("myvar");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_10 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_10.setParent((Tag)null);
        _jsp_ForEachTag_10.setPageContext(pageContext);
        _jsp_ForEachTag_10.setVar("myvar");
        _jsp_ForEachTag_10.setItems("1,1");
        if(_jsp_ForEachTag_10.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // VARIABLE: lineNumber: 7
                expressionContext.print(out, pageContext.getAttribute("myvar"));
                if(_jsp_ForEachTag_10.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_10.release();
        pageContext.setAttribute("myvar", _jsp_old_var_10);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_10

        // NODE START: lineNumber: 8, offset: 12, length: 20, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_13
        // <test:simpleTag>...</test:simpleTag>
        test.com.skin.ayada.taglib.MySimpleTag _jsp_MySimpleTag_13 = new test.com.skin.ayada.taglib.MySimpleTag();
        _jsp_MySimpleTag_13.setPageContext(pageContext);
        _jsp_MySimpleTag_13.setParent((Tag)null);

        JspFragment_13 _jsp_fragment_13 = new JspFragment_13();
        _jsp_fragment_13.setPageContext(pageContext);
        _jsp_fragment_13.setParent(_jsp_MySimpleTag_13);

        _jsp_MySimpleTag_13.setJspBody(_jsp_fragment_13);
        _jsp_MySimpleTag_13.doTag();
        _jsp_MySimpleTag_13.release();
        // NODE END: lineNumber: 8, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_13

        // TEXT: lineNumber: 17
        // out.write("abc\r\n\r\n    <c:if test=\"${1 == 1}\">\r\n        <c:forEach items=\"1,1\" var=\"myvar\">${myvar}</c:forEach>\r\n    </c:if>\r\n1");
        out.write(_jsp_string_33, 0, _jsp_string_33.length);

        out.flush();
        jspWriter.flush();
    }

    // NODE START: lineNumber: 8, offset: 12, length: 20, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_13
    // <test:simpleTag>...</test:simpleTag>
    public class JspFragment_13 extends com.skin.ayada.tagext.AbstractJspFragment {
        @Override
        public void execute(final JspWriter writer) throws Exception {
            JspWriter out = writer;
            PageContext pageContext = this.getPageContext();
            ExpressionContext expressionContext = pageContext.getExpressionContext();
            Tag _jsp_MySimpleTag_13 = this.getParent();

            // offset: 13, length: 18
            // TEXT: lineNumber: 8
            // out.write("123");
            out.write(_jsp_string_14, 0, _jsp_string_14.length);
            // VARIABLE: lineNumber: 8
            expressionContext.print(out, pageContext.getAttribute("mytest"));
            // TEXT: lineNumber: 8
            // out.write("\r\n");
            out.write(_jsp_string_16, 0, _jsp_string_16.length);

            // NODE START: lineNumber: 9, offset: 16, length: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_17
            // <test:simpleTag>...</test:simpleTag>
            test.com.skin.ayada.taglib.MySimpleTag _jsp_MySimpleTag_17 = new test.com.skin.ayada.taglib.MySimpleTag();
            _jsp_MySimpleTag_17.setPageContext(pageContext);
            _jsp_MySimpleTag_17.setParent(_jsp_MySimpleTag_13);

            JspFragment_17 _jsp_fragment_17 = new JspFragment_17();
            _jsp_fragment_17.setPageContext(pageContext);
            _jsp_fragment_17.setParent(_jsp_MySimpleTag_17);

            _jsp_MySimpleTag_17.setJspBody(_jsp_fragment_17);
            _jsp_MySimpleTag_17.doTag();
            _jsp_MySimpleTag_17.release();
            // NODE END: lineNumber: 9, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_17

            // NODE START: lineNumber: 10, offset: 20, length: 5, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_21
            // <c:if test=\"${1 == 1}\">...</c:if>
            if(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")) {
                // NODE START: lineNumber: 11, offset: 21, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_22
                // <c:forEach items=\"1,1\" var=\"myvar\">...</c:forEach>
                Object _jsp_old_var_22 = pageContext.getAttribute("myvar");
                com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_22 = new com.skin.ayada.jstl.core.ForEachTag();
                _jsp_ForEachTag_22.setParent((Tag)null);
                _jsp_ForEachTag_22.setPageContext(pageContext);
                _jsp_ForEachTag_22.setVar("myvar");
                _jsp_ForEachTag_22.setItems("1,1");
                if(_jsp_ForEachTag_22.doStartTag() != Tag.SKIP_BODY) {
                    while(true) {
                        // VARIABLE: lineNumber: 11
                        expressionContext.print(out, pageContext.getAttribute("myvar"));
                        if(_jsp_ForEachTag_22.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                            break;
                        }
                    }
                }
                _jsp_ForEachTag_22.release();
                pageContext.setAttribute("myvar", _jsp_old_var_22);
                // jsp.jstl.core.ForEachTag END
                // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_22

            } // jsp.jstl.core.IfTag END
            // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_21

            // NODE START: lineNumber: 13, offset: 25, length: 5, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_26
            // <c:forEach items=\"1,1\">...</c:forEach>
            com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_26 = new com.skin.ayada.jstl.core.ForEachTag();
            _jsp_ForEachTag_26.setParent(_jsp_MySimpleTag_13);
            _jsp_ForEachTag_26.setPageContext(pageContext);
            _jsp_ForEachTag_26.setItems("1,1");
            if(_jsp_ForEachTag_26.doStartTag() != Tag.SKIP_BODY) {
                while(true) {
                    // NODE START: lineNumber: 14, offset: 26, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_27
                    // <c:forEach items=\"a,a\" var=\"myvar\">...</c:forEach>
                    Object _jsp_old_var_27 = pageContext.getAttribute("myvar");
                    com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_27 = new com.skin.ayada.jstl.core.ForEachTag();
                    _jsp_ForEachTag_27.setParent((Tag)null);
                    _jsp_ForEachTag_27.setPageContext(pageContext);
                    _jsp_ForEachTag_27.setVar("myvar");
                    _jsp_ForEachTag_27.setItems("a,a");
                    if(_jsp_ForEachTag_27.doStartTag() != Tag.SKIP_BODY) {
                        while(true) {
                            // VARIABLE: lineNumber: 14
                            expressionContext.print(out, pageContext.getAttribute("myvar"));
                            if(_jsp_ForEachTag_27.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                                break;
                            }
                        }
                    }
                    _jsp_ForEachTag_27.release();
                    pageContext.setAttribute("myvar", _jsp_old_var_27);
                    // jsp.jstl.core.ForEachTag END
                    // NODE END: lineNumber: 14, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_27

                    if(_jsp_ForEachTag_26.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                        break;
                    }
                }
            }
            _jsp_ForEachTag_26.release();
            // jsp.jstl.core.ForEachTag END
            // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_26

            // TEXT: lineNumber: 15
            // out.write("ss\r\n");
            out.write(_jsp_string_31, 0, _jsp_string_31.length);
        }
    }
    // NODE END: lineNumber: 8, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_13

    // NODE START: lineNumber: 9, offset: 16, length: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_17
    // <test:simpleTag>...</test:simpleTag>
    public class JspFragment_17 extends com.skin.ayada.tagext.AbstractJspFragment {
        @Override
        public void execute(final JspWriter writer) throws Exception {
            JspWriter out = writer;
            PageContext pageContext = this.getPageContext();
            ExpressionContext expressionContext = pageContext.getExpressionContext();
            Tag _jsp_MySimpleTag_17 = this.getParent();

            // offset: 17, length: 2
            // VARIABLE: lineNumber: 9
            expressionContext.print(out, pageContext.getAttribute("mytest"));
            // TEXT: lineNumber: 9
            // out.write("xyz");
            out.write(_jsp_string_19, 0, _jsp_string_19.length);
        }
    }
    // NODE END: lineNumber: 9, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_17

    public static final char[] _jsp_string_9 = "<!-- t:import name=\"test:simpleTag\" className=\"test.com.skin.ayada.taglib.MySimpleTag\"/ -->\r\n".toCharArray();
    public static final char[] _jsp_string_14 = "123".toCharArray();
    public static final char[] _jsp_string_16 = "\r\n".toCharArray();
    public static final char[] _jsp_string_19 = "xyz".toCharArray();
    public static final char[] _jsp_string_31 = "ss\r\n".toCharArray();
    public static final char[] _jsp_string_33 = "abc\r\n\r\n    <c:if test=\"${1 == 1}\">\r\n        <c:forEach items=\"1,1\" var=\"myvar\">${myvar}</c:forEach>\r\n    </c:if>\r\n1".toCharArray();

}
