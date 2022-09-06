package com.tcoding.demo.websocket.controller;

import com.tcoding.demo.websocket.server.WebsocketServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@RestController
public class WebsocketController {

    @RequestMapping("/push/{toUserId}")
    public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId) throws IOException {
        WebsocketServer.sendInfo(message, toUserId);
        return ResponseEntity.ok("MSG SEND SUCCESS");
    }
}

