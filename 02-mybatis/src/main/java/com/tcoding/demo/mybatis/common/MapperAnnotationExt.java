package com.tcoding.demo.mybatis.common;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;

import java.util.List;

/**
 *
 */
public class MapperAnnotationExt extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {
        for (String k: properties.stringPropertyNames()) {
            interfaze.addAnnotation(k);
            interfaze.addImportedType(new FullyQualifiedJavaType(properties.getProperty(k)));
        }
        return true;
    }
}

