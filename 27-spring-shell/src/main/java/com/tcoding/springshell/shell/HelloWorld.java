package com.tcoding.springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author 陈天成
 * @date 2022/9/28.
 */
@ShellComponent
public class HelloWorld {

    @ShellMethod("说hello")
    public void say(String name) {
        System.out.println("hello " + name);
    }
}

