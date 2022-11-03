package com.tcoding.demo.mybatis.common;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 *
 */
public class SwaggerAnnotationExt extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field,
                                       TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                       IntrospectedTable introspectedTable,
                                       Plugin.ModelClassType modelClassType) {
        String remarks = introspectedColumn.getRemarks();
        int fields = topLevelClass.getFields().size();
        String annotation = getApiModelPropertyAnnotation(remarks, fields + 1);
        field.addAnnotation(annotation);
        topLevelClass.addImportedType(new FullyQualifiedJavaType("io.swagger.annotations.ApiModelProperty"));
        return true;
    }

    private String getApiModelPropertyAnnotation(String remarks, int position) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("@ApiModelProperty(notes = \""); //$NON-NLS-1$
        buffer.append(remarks);
        buffer.append("\", position = ");
        buffer.append(position);
        buffer.append(')');
        return buffer.toString();
    }
}