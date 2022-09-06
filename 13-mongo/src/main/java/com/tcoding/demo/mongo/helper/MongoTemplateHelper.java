package com.tcoding.demo.mongo.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Component
public class MongoTemplateHelper {

    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean createCollection(String name) {
        return mongoTemplate.collectionExists(name);
    }

    public void dropCollection(String name){
        mongoTemplate.dropCollection(name);
    }
}

