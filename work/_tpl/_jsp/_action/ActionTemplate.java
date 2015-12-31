/*
 * $RCSfile: ActionTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-05-28 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:\WorkSpace\ayada\webapp
 * path: /action/action.jsp
 * lastModified: 2014-05-28 13:48:32 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.0.8 (built 2014-06-28 16:26:01 143)
 */
package _tpl._jsp._action;

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
 * <p>Title: ActionTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
public class ActionTemplate extends JspTemplate
{
    public static void main(String[] args)
    {
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        ActionTemplate template = new ActionTemplate();

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

        /* TEXT: lineNumber: 1 */
        out.write("<div>\r\n    <h3>");
        /* EXPRESSION: lineNumber: 2 */
        out.write(expressionContext.getString("template.home"));
        /* TEXT: lineNumber: 2 */
        out.write("/include/static.jsp</h3>\r\n    ");

        /* NODE START: lineNumber: 3, offset: 3, length: 4, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_4 */
        /* <c:forEach items="1, 2, 3" var="myi">...</c:forEach> */
        Object _jsp_old_var_4 = pageContext.getAttribute("myi");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_4 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_4.setParent((Tag)null);
        _jsp_ForEachTag_4.setPageContext(pageContext);
        _jsp_ForEachTag_4.setVar("myi");
        _jsp_ForEachTag_4.setItems("1, 2, 3");
        if(_jsp_ForEachTag_4.doStartTag() != Tag.SKIP_BODY){
            while(true){
                /* VARIABLE: lineNumber: 3 */
                out.print(pageContext.getAttribute("myi"), false);
                /* TEXT: lineNumber: 3 */
                out.write(",");
                if(_jsp_ForEachTag_4.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                    break;
                }
            }
        }
        _jsp_ForEachTag_4.release();
        pageContext.setAttribute("myi", _jsp_old_var_4);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_4 */

        /* TEXT: lineNumber: 3 */
        out.write("\r\n</div>\r\n");
        out.flush();
        jspWriter.flush();
    }
}
