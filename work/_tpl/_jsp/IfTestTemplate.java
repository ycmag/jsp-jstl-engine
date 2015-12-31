/*
 * $RCSfile: IfTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-06-28 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: C:\WorkSpace\ayada\webapp
 * path: ifTest.jsp
 * lastModified: 2014-06-28 11:54:18 586
 * options: -fastJstl false
 * JSP generated by JspCompiler-1.0.0.8 (built 2014-06-28 11:54:20 427)
 */
package _tpl._jsp;

import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;

/**
 * <p>Title: IfTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
public class IfTestTemplate extends JspTemplate
{
    public static void main(String[] args)
    {
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        IfTestTemplate template = new IfTestTemplate();

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

        /* NODE START: lineNumber: 1, offset: 0, length: 4, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_1 */
        /* <c:if test="${1 == 1}">...</c:if> */
        com.skin.ayada.jstl.core.IfTag _jsp_IfTag_1 = new com.skin.ayada.jstl.core.IfTag();
        _jsp_IfTag_1.setParent((Tag)null);
        _jsp_IfTag_1.setPageContext(pageContext);
        _jsp_IfTag_1.setTest(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}"));
        int _jsp_start_flag_1 = _jsp_IfTag_1.doStartTag();

        if(_jsp_start_flag_1 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_1 != Tag.SKIP_BODY){
            int _jsp_flag_1 = 0;

            do{
                /* VARIABLE: lineNumber: 1 */
                out.print(pageContext.getAttribute("userName"), false);
                /* TEXT: lineNumber: 1 */
                out.write(" - Hello World !");
                _jsp_flag_1 = _jsp_IfTag_1.doAfterBody();
            }
            while(_jsp_flag_1 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_IfTag_1.doEndTag();
        _jsp_IfTag_1.release();
        /* NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_1 */

        out.flush();
        jspWriter.flush();
    }
}
