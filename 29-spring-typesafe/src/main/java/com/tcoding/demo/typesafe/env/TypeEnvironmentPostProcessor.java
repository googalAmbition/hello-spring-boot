package com.tcoding.demo.typesafe.env;

import com.typesafe.config.ConfigFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
public class TypeEnvironmentPostProcessor implements EnvironmentPostProcessor {

    private PropertiesPropertySourceLoader loader = new PropertiesPropertySourceLoader();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        // 加载application.conf 文件
        TypesafePropertySource propertySource = new TypesafePropertySource("typesafe_config", ConfigFactory.load());
        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addLast(propertySource);


        // 加载my.yaml
        try {
            List<PropertySource<?>> myYaml = loader.load("myYaml", new ClassPathResource("my.yaml"));
            propertySources.addLast(myYaml.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

