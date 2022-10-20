package com.tcoding.demo.filter.filter.bean;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
public class FilterBean1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException {
        System.out.println("bean-filter3");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

