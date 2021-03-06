/*
 * $RCSfile: TestTagTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /testTag.jsp
 * lastModified: 2016-01-08 23:09:57 217
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:17:08 024)
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
 * <p>Title: TestTagTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class TestTagTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        TestTagTemplate template = new TestTagTemplate();

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
        // NODE START: lineNumber: 1, offset: 0, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_1
        // <c:test myObject=\"${pageContext}\"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_1 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_1.setPageContext(pageContext);
        _jsp_TestTag_1.setParent((Tag)null);
        _jsp_TestTag_1.setMyObject(pageContext.getAttribute("pageContext"));
        int _jsp_start_flag_1 = _jsp_TestTag_1.doStartTag();

        if(_jsp_start_flag_1 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_1 != Tag.SKIP_BODY) {
            _jsp_TestTag_1.doAfterBody();
        }
        _jsp_TestTag_1.doEndTag();
        _jsp_TestTag_1.release();
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_1

        // NODE START: lineNumber: 2, offset: 2, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_3
        // <c:test myObject=\"${user.name}\"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_3 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_3.setPageContext(pageContext);
        _jsp_TestTag_3.setParent((Tag)null);
        _jsp_TestTag_3.setMyObject(ExpressionUtil.evaluate(expressionContext, "${user.name}", java.lang.Object.class));
        int _jsp_start_flag_3 = _jsp_TestTag_3.doStartTag();

        if(_jsp_start_flag_3 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_3 != Tag.SKIP_BODY) {
            _jsp_TestTag_3.doAfterBody();
        }
        _jsp_TestTag_3.doEndTag();
        _jsp_TestTag_3.release();
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_3


        out.flush();
        jspWriter.flush();
    }


}
