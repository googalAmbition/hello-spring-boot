package com.tcoding.demo.typesafe.env;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import org.springframework.core.env.EnumerablePropertySource;

import java.util.Map;

/**
 * 将typesafe的typesafe.conf接入到springboot的property体系中
 * @author taylor
 */
public class TypesafePropertySource extends EnumerablePropertySource<Config> {

    public TypesafePropertySource(String name, Config source) {
        super(name, source);
    }

    @Override
    public String[] getPropertyNames() {
        return source.entrySet().stream().map(Map.Entry::getKey).toArray(String[]::new);
    }

    @Override
    public Object getProperty(String s) {
        try {
            return source.hasPath(s) ? source.getAnyRef(s) : null;
        } catch (ConfigException.BadPath e) {
            return null;
        }
    }
}
