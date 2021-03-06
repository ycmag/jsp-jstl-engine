/*
 * $RCSfile: SqlTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /sqlTagTest.jsp
 * lastModified: 2014-03-31 17:18:38 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:04 837)
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
 * <p>Title: SqlTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class SqlTagTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        SqlTagTestTemplate template = new SqlTagTestTemplate();

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

        // NODE START: lineNumber: 2, offset: 2, length: 2, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_3
        // <sql:execute sql=\"delete from my_test2;\" out=\"${pageContext.getOut()}\"/>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_3 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_3.setPageContext(pageContext);
        _jsp_SqlTag_3.setParent((Tag)null);
        _jsp_SqlTag_3.setSql("delete from my_test2;");
        _jsp_SqlTag_3.setOut(ExpressionUtil.evaluate(expressionContext, "${pageContext.getOut()}", java.lang.Object.class));
        int _jsp_start_flag_3 = _jsp_SqlTag_3.doStartTag();

        if(_jsp_start_flag_3 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_3 != Tag.SKIP_BODY) {
            _jsp_SqlTag_3.doAfterBody();
        }
        _jsp_SqlTag_3.doEndTag();
        _jsp_SqlTag_3.release();
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_3

        // NODE START: lineNumber: 3, offset: 4, length: 2, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_5
        // <sql:execute sql=\"insert into my_test2(my_id, my_code, my_name) values (1, &#39;1&#39;, &#39;1&#39;);\"/>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_5 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_5.setPageContext(pageContext);
        _jsp_SqlTag_5.setParent((Tag)null);
        _jsp_SqlTag_5.setSql("insert into my_test2(my_id, my_code, my_name) values (1, \'1\', \'1\');");
        int _jsp_start_flag_5 = _jsp_SqlTag_5.doStartTag();

        if(_jsp_start_flag_5 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_5 != Tag.SKIP_BODY) {
            _jsp_SqlTag_5.doAfterBody();
        }
        _jsp_SqlTag_5.doEndTag();
        _jsp_SqlTag_5.release();
        // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_5

        // NODE START: lineNumber: 4, offset: 6, length: 2, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_7
        // <sql:execute home=\"${template.home}/database\" file=\"create.sql\" encoding=\"UTF-8\" out=\"${pageContext.getOut()}\"/>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_7 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_7.setPageContext(pageContext);
        _jsp_SqlTag_7.setParent((Tag)null);
        _jsp_SqlTag_7.setHome(ExpressionUtil.getString(expressionContext, "${template.home}/database"));
        _jsp_SqlTag_7.setFile("create.sql");
        _jsp_SqlTag_7.setEncoding("UTF-8");
        _jsp_SqlTag_7.setOut(ExpressionUtil.evaluate(expressionContext, "${pageContext.getOut()}", java.lang.Object.class));
        int _jsp_start_flag_7 = _jsp_SqlTag_7.doStartTag();

        if(_jsp_start_flag_7 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_7 != Tag.SKIP_BODY) {
            _jsp_SqlTag_7.doAfterBody();
        }
        _jsp_SqlTag_7.doEndTag();
        _jsp_SqlTag_7.release();
        // NODE END: lineNumber: 4, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_7

        // TEXT: lineNumber: 4
        // out.write("\r\n");
        out.write(_jsp_string_9, 0, _jsp_string_9.length);

        // NODE START: lineNumber: 6, offset: 9, length: 20, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_10
        // <sql:execute>...</sql:execute>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_10 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_10.setPageContext(pageContext);
        _jsp_SqlTag_10.setParent((Tag)null);
        int _jsp_start_flag_10 = _jsp_SqlTag_10.doStartTag();

        if(_jsp_start_flag_10 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_10 != Tag.SKIP_BODY) {
            int _jsp_flag_10 = 0;
            if(_jsp_start_flag_10 == BodyTag.EVAL_BODY_BUFFERED) {
                BodyContent _jsp_body_content_10 = pageContext.pushBody();
                _jsp_SqlTag_10.setBodyContent(_jsp_body_content_10);
                _jsp_SqlTag_10.doInitBody();
                out = _jsp_body_content_10;
            }

            do {
                // NODE START: lineNumber: 7, offset: 10, length: 9, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_11
                // <c:forEach items=\"1, 2, 3, 4, 5\" var=\"id\">...</c:forEach>
                Object _jsp_old_var_11 = pageContext.getAttribute("id");
                com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_11 = new com.skin.ayada.jstl.core.ForEachTag();
                _jsp_ForEachTag_11.setParent(_jsp_SqlTag_10);
                _jsp_ForEachTag_11.setPageContext(pageContext);
                _jsp_ForEachTag_11.setVar("id");
                _jsp_ForEachTag_11.setItems("1, 2, 3, 4, 5");
                if(_jsp_ForEachTag_11.doStartTag() != Tag.SKIP_BODY) {
                    while(true) {
                        // TEXT: lineNumber: 7
                        // out.write("        insert into my_test1(my_id, my_code, my_name) values (");
                        out.write(_jsp_string_12, 0, _jsp_string_12.length);
                        // VARIABLE: lineNumber: 8
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 8
                        // out.write(", \'");
                        out.write(_jsp_string_14, 0, _jsp_string_14.length);
                        // VARIABLE: lineNumber: 8
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 8
                        // out.write("\', \'");
                        out.write(_jsp_string_16, 0, _jsp_string_16.length);
                        // VARIABLE: lineNumber: 8
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 8
                        // out.write("\');\r\n");
                        out.write(_jsp_string_18, 0, _jsp_string_18.length);
                        if(_jsp_ForEachTag_11.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                            break;
                        }
                    }
                }
                _jsp_ForEachTag_11.release();
                pageContext.setAttribute("id", _jsp_old_var_11);
                // jsp.jstl.core.ForEachTag END
                // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_11

                // NODE START: lineNumber: 10, offset: 19, length: 9, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_20
                // <c:forEach items=\"1, 2, 3, 4, 5\" var=\"id\">...</c:forEach>
                Object _jsp_old_var_20 = pageContext.getAttribute("id");
                com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_20 = new com.skin.ayada.jstl.core.ForEachTag();
                _jsp_ForEachTag_20.setParent(_jsp_SqlTag_10);
                _jsp_ForEachTag_20.setPageContext(pageContext);
                _jsp_ForEachTag_20.setVar("id");
                _jsp_ForEachTag_20.setItems("1, 2, 3, 4, 5");
                if(_jsp_ForEachTag_20.doStartTag() != Tag.SKIP_BODY) {
                    while(true) {
                        // TEXT: lineNumber: 10
                        // out.write("        insert into my_test2(my_id, my_code, my_name) values (");
                        out.write(_jsp_string_21, 0, _jsp_string_21.length);
                        // VARIABLE: lineNumber: 11
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 11
                        // out.write(", \'");
                        out.write(_jsp_string_23, 0, _jsp_string_23.length);
                        // VARIABLE: lineNumber: 11
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 11
                        // out.write("\', \'");
                        out.write(_jsp_string_25, 0, _jsp_string_25.length);
                        // VARIABLE: lineNumber: 11
                        expressionContext.print(out, pageContext.getAttribute("id"));
                        // TEXT: lineNumber: 11
                        // out.write("\');\r\n");
                        out.write(_jsp_string_27, 0, _jsp_string_27.length);
                        if(_jsp_ForEachTag_20.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                            break;
                        }
                    }
                }
                _jsp_ForEachTag_20.release();
                pageContext.setAttribute("id", _jsp_old_var_20);
                // jsp.jstl.core.ForEachTag END
                // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_20

                _jsp_flag_10 = _jsp_SqlTag_10.doAfterBody();
            }
            while(_jsp_flag_10 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_10 == BodyTag.EVAL_BODY_BUFFERED) {
                out = pageContext.popBody();
            }
        }
        _jsp_SqlTag_10.doEndTag();
        _jsp_SqlTag_10.release();
        // NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_10

        // TEXT: lineNumber: 13
        // out.write("\r\n");
        out.write(_jsp_string_30, 0, _jsp_string_30.length);

        // NODE START: lineNumber: 15, offset: 30, length: 3, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_31
        // <sql:execute>...</sql:execute>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_31 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_31.setPageContext(pageContext);
        _jsp_SqlTag_31.setParent((Tag)null);
        int _jsp_start_flag_31 = _jsp_SqlTag_31.doStartTag();

        if(_jsp_start_flag_31 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_31 != Tag.SKIP_BODY) {
            int _jsp_flag_31 = 0;
            if(_jsp_start_flag_31 == BodyTag.EVAL_BODY_BUFFERED) {
                BodyContent _jsp_body_content_31 = pageContext.pushBody();
                _jsp_SqlTag_31.setBodyContent(_jsp_body_content_31);
                _jsp_SqlTag_31.doInitBody();
                out = _jsp_body_content_31;
            }

            do {
                // TEXT: lineNumber: 15
                // out.write("delete from my_test2;\r\ninsert into my_test2(my_id, my_code, my_name) values (1001, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1002, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1003, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1004, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1005, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1006, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1007, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1008, \'1001\', \'1001\');\r\n");
                out.write(_jsp_string_32, 0, _jsp_string_32.length);
                _jsp_flag_31 = _jsp_SqlTag_31.doAfterBody();
            }
            while(_jsp_flag_31 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_31 == BodyTag.EVAL_BODY_BUFFERED) {
                out = pageContext.popBody();
            }
        }
        _jsp_SqlTag_31.doEndTag();
        _jsp_SqlTag_31.release();
        // NODE END: lineNumber: 15, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_31

        // TEXT: lineNumber: 25
        // out.write("\r\n");
        out.write(_jsp_string_34, 0, _jsp_string_34.length);

        // NODE START: lineNumber: 27, offset: 34, length: 2, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_35
        // <sql:execute connection=\"${connection}\" sql=\"insert into my_test2(my_id, my_code, my_name) values (1009, &#39;1001&#39;, &#39;1001&#39;);\"/>
        com.skin.ayada.jstl.sql.SqlTag _jsp_SqlTag_35 = new com.skin.ayada.jstl.sql.SqlTag();
        _jsp_SqlTag_35.setPageContext(pageContext);
        _jsp_SqlTag_35.setParent((Tag)null);
        _jsp_SqlTag_35.setConnection(pageContext.getValue("connection", java.sql.Connection.class));
        _jsp_SqlTag_35.setSql("insert into my_test2(my_id, my_code, my_name) values (1009, \'1001\', \'1001\');");
        int _jsp_start_flag_35 = _jsp_SqlTag_35.doStartTag();

        if(_jsp_start_flag_35 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_35 != Tag.SKIP_BODY) {
            _jsp_SqlTag_35.doAfterBody();
        }
        _jsp_SqlTag_35.doEndTag();
        _jsp_SqlTag_35.release();
        // NODE END: lineNumber: 27, tagClassName: com.skin.ayada.jstl.sql.SqlTag, tagInstanceName: _jsp_SqlTag_35

        // TEXT: lineNumber: 27
        // out.write("\r\n<table>\r\n    <tr>\r\n        <td>id</td>\r\n        <td>userName</td>\r\n        <td>nickName</td>\r\n    </tr>\r\n");
        out.write(_jsp_string_37, 0, _jsp_string_37.length);

        // NODE START: lineNumber: 35, offset: 37, length: 9, tagClassName: com.skin.ayada.jstl.sql.QueryTag, tagInstanceName: _jsp_QueryTag_38
        // <sql:query var=\"resultSet\" sql=\"select * from my_test2 where my_id &gt; 1001\" offset=\"2\">...</sql:query>
        com.skin.ayada.jstl.sql.QueryTag _jsp_QueryTag_38 = new com.skin.ayada.jstl.sql.QueryTag();
        try {
            _jsp_QueryTag_38.setPageContext(pageContext);
            _jsp_QueryTag_38.setParent((Tag)null);
            _jsp_QueryTag_38.setVar("resultSet");
            _jsp_QueryTag_38.setSql("select * from my_test2 where my_id > 1001");
            _jsp_QueryTag_38.setOffset(2);
            int _jsp_start_flag_38 = _jsp_QueryTag_38.doStartTag();

            if(_jsp_start_flag_38 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_38 != Tag.SKIP_BODY) {
                int _jsp_flag_38 = 0;

                do {
                    // TEXT: lineNumber: 35
                    // out.write("    <tr>\r\n        <td>");
                    out.write(_jsp_string_39, 0, _jsp_string_39.length);
                    // EXPRESSION: lineNumber: 37
                    expressionContext.print(out, expressionContext.getString("resultSet.getLong(\"my_id\")"));
                    // TEXT: lineNumber: 37
                    // out.write("</td>\r\n        <td>");
                    out.write(_jsp_string_41, 0, _jsp_string_41.length);
                    // EXPRESSION: lineNumber: 38
                    expressionContext.print(out, expressionContext.getString("resultSet.getString(\"my_code\")"));
                    // TEXT: lineNumber: 38
                    // out.write("</td>\r\n        <td>");
                    out.write(_jsp_string_43, 0, _jsp_string_43.length);
                    // EXPRESSION: lineNumber: 39
                    expressionContext.print(out, expressionContext.getString("resultSet.getString(\"my_name\")"));
                    // TEXT: lineNumber: 39
                    // out.write("</td>\r\n    </tr>\r\n");
                    out.write(_jsp_string_45, 0, _jsp_string_45.length);
                    _jsp_flag_38 = _jsp_QueryTag_38.doAfterBody();
                }
                while(_jsp_flag_38 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_QueryTag_38.doEndTag();
            _jsp_QueryTag_38.release();
        }
        catch(Throwable throwable) {
            try {
                _jsp_QueryTag_38.doCatch(throwable);
            } catch (Throwable t) {
                throw new Exception(t);
            }
        }
        finally {
            _jsp_QueryTag_38.doFinally();
        }
        // NODE END: lineNumber: 35, tagClassName: com.skin.ayada.jstl.sql.QueryTag, tagInstanceName: _jsp_QueryTag_38

        // TEXT: lineNumber: 41
        // out.write("</table>\r\n");
        out.write(_jsp_string_47, 0, _jsp_string_47.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_9 = "\r\n".toCharArray();
    public static final char[] _jsp_string_12 = "        insert into my_test1(my_id, my_code, my_name) values (".toCharArray();
    public static final char[] _jsp_string_14 = ", \'".toCharArray();
    public static final char[] _jsp_string_16 = "\', \'".toCharArray();
    public static final char[] _jsp_string_18 = "\');\r\n".toCharArray();
    public static final char[] _jsp_string_21 = "        insert into my_test2(my_id, my_code, my_name) values (".toCharArray();
    public static final char[] _jsp_string_23 = ", \'".toCharArray();
    public static final char[] _jsp_string_25 = "\', \'".toCharArray();
    public static final char[] _jsp_string_27 = "\');\r\n".toCharArray();
    public static final char[] _jsp_string_30 = "\r\n".toCharArray();
    public static final char[] _jsp_string_32 = "delete from my_test2;\r\ninsert into my_test2(my_id, my_code, my_name) values (1001, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1002, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1003, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1004, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1005, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1006, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1007, \'1001\', \'1001\');\r\ninsert into my_test2(my_id, my_code, my_name) values (1008, \'1001\', \'1001\');\r\n".toCharArray();
    public static final char[] _jsp_string_34 = "\r\n".toCharArray();
    public static final char[] _jsp_string_37 = "\r\n<table>\r\n    <tr>\r\n        <td>id</td>\r\n        <td>userName</td>\r\n        <td>nickName</td>\r\n    </tr>\r\n".toCharArray();
    public static final char[] _jsp_string_39 = "    <tr>\r\n        <td>".toCharArray();
    public static final char[] _jsp_string_41 = "</td>\r\n        <td>".toCharArray();
    public static final char[] _jsp_string_43 = "</td>\r\n        <td>".toCharArray();
    public static final char[] _jsp_string_45 = "</td>\r\n    </tr>\r\n".toCharArray();
    public static final char[] _jsp_string_47 = "</table>\r\n".toCharArray();

}
