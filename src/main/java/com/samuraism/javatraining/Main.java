package com.samuraism.javatraining;

import org.h2.tools.Server;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
@MapperScan("com.samuraism.javatraining.todo.mybatis") // Mapperのパッケージを指定

public class Main {
    public static void main(String[] args) throws SQLException{
        // H2をサーバモードで起動
        Server.main(
                // tcpリスナを有効化
                "-tcp",
                // 存在しないDBへの接続を試みたら作る
                "-ifNotExists"
        );
        SpringApplication.run(Main.class, args);
    }
}
