package com.tcoding.demo.extend.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestResourceLoaderAware implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method);
    }
}

