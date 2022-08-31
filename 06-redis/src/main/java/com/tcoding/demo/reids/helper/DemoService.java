package com.tcoding.demo.reids.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陈天成
 * @date 2022/8/30.
 */
@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public String get(String s) {
        return demoDao.get(s);
    }

    public void get() {
        demoDao.get();
    }

    public void del() {
        demoDao.dle();
    }
}

