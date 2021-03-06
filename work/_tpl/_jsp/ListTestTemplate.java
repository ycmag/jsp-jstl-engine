/*
 * $RCSfile: ListTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /listTest.jsp
 * lastModified: 2015-12-31 11:31:38 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:03 618)
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


/**
 * <p>Title: ListTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class ListTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        ListTestTemplate template = new ListTestTemplate();

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
        // TEXT: lineNumber: 1
        // out.write("<h1>\\nser.jsp</h1>\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 2, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_2
        // <c:out value=\"&lt;h1&gt;\\nse\r\nr.jsp&lt;/h1&gt;\">...</c:out>
        com.skin.ayada.jstl.core.OutTag.write(out, "<h1>\\nse\r\nr.jsp</h1>", false);
        // out.print("<h1>\\nse\r\nr.jsp</h1>");
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_2

        // TEXT: lineNumber: 2
        // out.write("\r\n\r\n<h1>\\user.jsp</h1>\r\n");
        out.write(_jsp_string_4, 0, _jsp_string_4.length);

        // NODE START: lineNumber: 5, offset: 4, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_5
        // <c:out value=\"&lt;h1&gt;\\user\r\n.jsp&lt;/h1&gt;\">...</c:out>
        com.skin.ayada.jstl.core.OutTag.write(out, "<h1>\\user\r\n.jsp</h1>", false);
        // out.print("<h1>\\user\r\n.jsp</h1>");
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_5

        // TEXT: lineNumber: 5
        // out.write("\r\n\r\n");
        out.write(_jsp_string_7, 0, _jsp_string_7.length);

        // NODE START: lineNumber: 7, offset: 7, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_8
        // <c:set var=\"myVar1\" value=\"abc\"/>
        pageContext.setAttribute("myVar1", "abc");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_8

        // NODE START: lineNumber: 8, offset: 9, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_10
        // <c:out value=\"${myVar1}\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, pageContext.getAttribute("myVar1"), false);
        // out.print(ExpressionUtil.getString(expressionContext, "${myVar1}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 8, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_10

        // TEXT: lineNumber: 8
        // out.write("\r\n");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);

        // NODE START: lineNumber: 9, offset: 12, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_13
        // <c:out value=\"xxx${myVar1}xxx\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, ExpressionUtil.evaluate(expressionContext, "xxx${myVar1}xxx", null), false);
        // out.print(ExpressionUtil.getString(expressionContext, "xxx${myVar1}xxx"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 9, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_13

        // TEXT: lineNumber: 9
        // out.write("\r\n");
        out.write(_jsp_string_15, 0, _jsp_string_15.length);

        // NODE START: lineNumber: 10, offset: 15, length: 8, tagClassName: com.skin.ayada.jstl.core.ListTag, tagInstanceName: _jsp_ListTag_16
        // <c:list name=\"myList\">...</c:list>
        com.skin.ayada.jstl.core.ListTag _jsp_ListTag_16 = new com.skin.ayada.jstl.core.ListTag();
        _jsp_ListTag_16.setPageContext(pageContext);
        _jsp_ListTag_16.setParent((Tag)null);
        _jsp_ListTag_16.setName("myList");
        int _jsp_start_flag_16 = _jsp_ListTag_16.doStartTag();

        if(_jsp_start_flag_16 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_16 != Tag.SKIP_BODY) {
            int _jsp_flag_16 = 0;

            do {
                // NODE START: lineNumber: 11, offset: 16, length: 2, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_17
                // <c:element index=\"0\" value=\"${myVar1}\"/>
                _jsp_ListTag_16.setElement(0, pageContext.getAttribute("myVar1"));
                // jsp.jstl.core.ElementTag END
                // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_17

                // NODE START: lineNumber: 12, offset: 18, length: 2, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_19
                // <c:element index=\"0\" value=\"abc${myVar1}xyz\"/>
                _jsp_ListTag_16.setElement(0, ExpressionUtil.evaluate(expressionContext, "abc${myVar1}xyz", null));
                // jsp.jstl.core.ElementTag END
                // NODE END: lineNumber: 12, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_19

                // NODE START: lineNumber: 13, offset: 20, length: 2, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_21
                // <c:element index=\"2\" value=\"456\"/>
                _jsp_ListTag_16.setElement(2, 456);
                // jsp.jstl.core.ElementTag END
                // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.ElementTag, tagInstanceName: _jsp_ElementTag_21

                _jsp_flag_16 = _jsp_ListTag_16.doAfterBody();
            }
            while(_jsp_flag_16 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_ListTag_16.doEndTag();
        _jsp_ListTag_16.release();
        // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.ListTag, tagInstanceName: _jsp_ListTag_16

        // VARIABLE: lineNumber: 15
        expressionContext.print(out, pageContext.getAttribute("myList"));

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "<h1>\\nser.jsp</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_4 = "\r\n\r\n<h1>\\user.jsp</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_7 = "\r\n\r\n".toCharArray();
    public static final char[] _jsp_string_12 = "\r\n".toCharArray();
    public static final char[] _jsp_string_15 = "\r\n".toCharArray();

}
