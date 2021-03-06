/*
 * $RCSfile: OutTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /outTest.jsp
 * lastModified: 2016-01-08 22:10:25 188
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:03 929)
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
 * <p>Title: OutTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class OutTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        OutTestTemplate template = new OutTestTemplate();

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
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 6, offset: 1, length: 4, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_2
        // <c:map name=\"user\">...</c:map>
        com.skin.ayada.jstl.core.MapTag _jsp_MapTag_2 = new com.skin.ayada.jstl.core.MapTag();
        _jsp_MapTag_2.setPageContext(pageContext);
        _jsp_MapTag_2.setParent((Tag)null);
        _jsp_MapTag_2.setDynamicAttribute("name", "user");
        int _jsp_start_flag_2 = _jsp_MapTag_2.doStartTag();

        if(_jsp_start_flag_2 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_2 != Tag.SKIP_BODY) {
            int _jsp_flag_2 = 0;

            do {
                // NODE START: lineNumber: 7, offset: 2, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_3
                // <c:entry name=\"userName\" value=\"xuesong.net\"/>
                _jsp_MapTag_2.setAttribute("userName", "xuesong.net");
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_3

                _jsp_flag_2 = _jsp_MapTag_2.doAfterBody();
            }
            while(_jsp_flag_2 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_MapTag_2.doEndTag();
        _jsp_MapTag_2.release();
        // NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_2

        // TEXT: lineNumber: 8
        // out.write("<h1>Hello World !</h1>\r\n");
        out.write(_jsp_string_6, 0, _jsp_string_6.length);

        // jsp:scriptlet: lineNumber: 10
    int myInt = 0;
    float myFloat = 1.1f;

        // jsp:scriptlet END

        // TEXT: lineNumber: 13
        // out.write("%%");
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        // EXPRESSION: lineNumber: 14
        out.write(expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 14
        // out.write("\r\n");
        out.write(_jsp_string_11, 0, _jsp_string_11.length);

        // jsp:expression: lineNumber: 15
        expressionContext.print(out, ((myInt + myFloat)));
        // jsp:expression END

        // TEXT: lineNumber: 15
        // out.write("\r\n##");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        // EXPRESSION: lineNumber: 16
        expressionContext.print(out, expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 16
        // out.write("\r\n");
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        // EXPRESSION: lineNumber: 17
        out.write(expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 17
        // out.write("\r\n\r\n");
        out.write(_jsp_string_18, 0, _jsp_string_18.length);

        // NODE START: lineNumber: 19, offset: 18, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_19
        // <c:out value=\"${pageContext}\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, pageContext.getAttribute("pageContext"), false);
        // out.print(ExpressionUtil.getString(expressionContext, "${pageContext}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 19, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_19

        // TEXT: lineNumber: 19
        // out.write("\r\n");
        out.write(_jsp_string_21, 0, _jsp_string_21.length);

        // NODE START: lineNumber: 20, offset: 21, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_22
        // <c:out value=\"1 ${user.userName}\">...</c:out>
        com.skin.ayada.jstl.core.OutTag.write(out, ExpressionUtil.evaluate(expressionContext, "1 ${user.userName}", null), false);
        // out.print(ExpressionUtil.getString(expressionContext, "1 ${user.userName}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 20, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_22

        // TEXT: lineNumber: 20
        // out.write("\r\n");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        // NODE START: lineNumber: 21, offset: 24, length: 5, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_25
        // <c:out>...</c:out>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 21
        // out.write("2 <div>");
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        // EXPRESSION: lineNumber: 21
        expressionContext.print(out, expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 21
        // out.write("</div>");
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        pageContext.print((BodyContent)out, false);
        out = pageContext.popBody();
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 21, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_25

        // TEXT: lineNumber: 21
        // out.write("\r\n");
        out.write(_jsp_string_30, 0, _jsp_string_30.length);

        // NODE START: lineNumber: 22, offset: 30, length: 2, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_31
        // <c:if test=\"${util.notEmpty(userList)}\">...</c:if>
        if(ExpressionUtil.getBoolean(expressionContext, "${util.notEmpty(userList)}")) {
        } // jsp.jstl.core.IfTag END
        // NODE END: lineNumber: 22, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_31

        // NODE START: lineNumber: 23, offset: 32, length: 6, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_33
        // <c:out id=\"1\" escapeXml=\"true\">...</c:out>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 23
        // out.write("<div>");
        out.write(_jsp_string_34, 0, _jsp_string_34.length);

        // NODE START: lineNumber: 23, offset: 34, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_35
        // <c:out id=\"2\" value=\"${user.userName}\">...</c:out>
        com.skin.ayada.jstl.core.OutTag.write(out, ExpressionUtil.evaluate(expressionContext, "${user.userName}", null), false);
        // out.print(ExpressionUtil.getString(expressionContext, "${user.userName}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 23, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_35

        // TEXT: lineNumber: 23
        // out.write("</div>");
        out.write(_jsp_string_37, 0, _jsp_string_37.length);
        pageContext.print((BodyContent)out, true);
        out = pageContext.popBody();
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 23, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_33

        // TEXT: lineNumber: 23
        // out.write("\r\n</body>\r\n</html>");
        out.write(_jsp_string_39, 0, _jsp_string_39.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n".toCharArray();
    public static final char[] _jsp_string_6 = "<h1>Hello World !</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_9 = "%%".toCharArray();
    public static final char[] _jsp_string_11 = "\r\n".toCharArray();
    public static final char[] _jsp_string_14 = "\r\n##".toCharArray();
    public static final char[] _jsp_string_16 = "\r\n".toCharArray();
    public static final char[] _jsp_string_18 = "\r\n\r\n".toCharArray();
    public static final char[] _jsp_string_21 = "\r\n".toCharArray();
    public static final char[] _jsp_string_24 = "\r\n".toCharArray();
    public static final char[] _jsp_string_26 = "2 <div>".toCharArray();
    public static final char[] _jsp_string_28 = "</div>".toCharArray();
    public static final char[] _jsp_string_30 = "\r\n".toCharArray();
    public static final char[] _jsp_string_34 = "<div>".toCharArray();
    public static final char[] _jsp_string_37 = "</div>".toCharArray();
    public static final char[] _jsp_string_39 = "\r\n</body>\r\n</html>".toCharArray();

}
