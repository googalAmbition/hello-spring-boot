package com.tcoding.demo.extend.aware;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestEmbeddedValueResolverAware implements EmbeddedValueResolverAware {

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.err.println("TestEmbeddedValueResolverAware->setEmbeddedValueResolver");
    }
}

