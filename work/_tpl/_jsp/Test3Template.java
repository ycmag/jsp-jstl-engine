/*
 * $RCSfile: Test3Template.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /test3.jsp
 * lastModified: 2016-01-08 16:38:52 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:07 773)
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
import java.util.Map; // jsp:directive.import: lineNumber: 1
import java.util.List; // jsp:directive.import: lineNumber: 2


/**
 * <p>Title: Test3Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Test3Template extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        Test3Template template = new Test3Template();

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
        // <jsp:directive.page import="java.util.Map"/>

        // jsp:directive.page: lineNumber: 2
        // <jsp:directive.page import="java.util.List"/>

        // TEXT: lineNumber: 2
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html;\"/>\r\n<style type=\"text/css\">\r\nbody{font-size: 10pt; color: #333333;}\r\nthead{ font-weight: bold; background-color: #c8fbaf;}\r\ntd{font-size: 10pt; text-align: center;}\r\n.odd{background-color: #f3defb;}\r\n.even{background-color: #effff8;}\r\n</style>\r\n</head>\r\n<body>\r\n    <h1>test</h1>\r\n    <table>\r\n        <thead>\r\n            <tr>\r\n                <th>test1</th>\r\n                <th>test2</th>\r\n                <th>test3</th>\r\n                <th>test4</th>\r\n                <th>test5</th>\r\n            </tr>\r\n        </thead>\r\n        <tbody>\r\n");
        out.write(_jsp_string_5, 0, _jsp_string_5.length);

        // jsp:scriptlet: lineNumber: 28
                int i = 0;
                List<Map<String, Object>> userList = (List<Map<String, Object>>)(pageContext.getAttribute("userList"));

                for(Map<String, Object> user : userList) {
            
        // jsp:scriptlet END

        // TEXT: lineNumber: 33
        // out.write("            <tr ");
        out.write(_jsp_string_8, 0, _jsp_string_8.length);

        // jsp:expression: lineNumber: 34
        expressionContext.print(out, (((i & 1) == 1 ? "old" : "even")));
        // jsp:expression END

        // TEXT: lineNumber: 34
        // out.write(">\r\n                <td>");
        out.write(_jsp_string_11, 0, _jsp_string_11.length);

        // jsp:expression: lineNumber: 35
        expressionContext.print(out, (i + 1));
        // jsp:expression END

        // TEXT: lineNumber: 35
        // out.write("</td>\r\n                <td>");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);

        // jsp:expression: lineNumber: 36
        expressionContext.print(out, (user.get("code")));
        // jsp:expression END

        // TEXT: lineNumber: 36
        // out.write("</td>\r\n                <td>");
        out.write(_jsp_string_17, 0, _jsp_string_17.length);

        // jsp:expression: lineNumber: 37
        expressionContext.print(out, (user.get("name")));
        // jsp:expression END

        // TEXT: lineNumber: 37
        // out.write("</td>\r\n                <td>");
        out.write(_jsp_string_20, 0, _jsp_string_20.length);

        // jsp:expression: lineNumber: 38
        expressionContext.print(out, (user.get("date")));
        // jsp:expression END

        // TEXT: lineNumber: 38
        // out.write("</td>\r\n                <td>");
        out.write(_jsp_string_23, 0, _jsp_string_23.length);

        // jsp:expression: lineNumber: 39
        expressionContext.print(out, (user.get("value")));
        // jsp:expression END

        // TEXT: lineNumber: 39
        // out.write("</td>\r\n                <td style=\"color: red\">");
        out.write(_jsp_string_26, 0, _jsp_string_26.length);

        // jsp:expression: lineNumber: 40
        expressionContext.print(out, (((Float)(user.get("value")) > 105.5 ? "a" : "b")));
        // jsp:expression END

        // TEXT: lineNumber: 40
        // out.write("</td>\r\n                <td style=\"color: red\">");
        out.write(_jsp_string_29, 0, _jsp_string_29.length);

        // jsp:expression: lineNumber: 41
        expressionContext.print(out, (((Float)(user.get("value")) > 105.5 ? "a" : "b")));
        // jsp:expression END

        // TEXT: lineNumber: 41
        // out.write("</td>\r\n            </tr>\r\n");
        out.write(_jsp_string_32, 0, _jsp_string_32.length);

        // jsp:scriptlet: lineNumber: 43
                }
            
        // jsp:scriptlet END

        // TEXT: lineNumber: 45
        // out.write("        </tbody>\r\n    </table>\r\n</body>\r\n</html>\r\n");
        out.write(_jsp_string_35, 0, _jsp_string_35.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_5 = "<html>\r\n<head>\r\n<title>test</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html;\"/>\r\n<style type=\"text/css\">\r\nbody{font-size: 10pt; color: #333333;}\r\nthead{ font-weight: bold; background-color: #c8fbaf;}\r\ntd{font-size: 10pt; text-align: center;}\r\n.odd{background-color: #f3defb;}\r\n.even{background-color: #effff8;}\r\n</style>\r\n</head>\r\n<body>\r\n    <h1>test</h1>\r\n    <table>\r\n        <thead>\r\n            <tr>\r\n                <th>test1</th>\r\n                <th>test2</th>\r\n                <th>test3</th>\r\n                <th>test4</th>\r\n                <th>test5</th>\r\n            </tr>\r\n        </thead>\r\n        <tbody>\r\n".toCharArray();
    public static final char[] _jsp_string_8 = "            <tr ".toCharArray();
    public static final char[] _jsp_string_11 = ">\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_14 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_17 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_20 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_23 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_26 = "</td>\r\n                <td style=\"color: red\">".toCharArray();
    public static final char[] _jsp_string_29 = "</td>\r\n                <td style=\"color: red\">".toCharArray();
    public static final char[] _jsp_string_32 = "</td>\r\n            </tr>\r\n".toCharArray();
    public static final char[] _jsp_string_35 = "        </tbody>\r\n    </table>\r\n</body>\r\n</html>\r\n".toCharArray();

}
