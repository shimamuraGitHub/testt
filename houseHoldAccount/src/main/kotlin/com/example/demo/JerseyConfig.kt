package com.example.demo

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rs")
class JerseyConfig :ResourceConfig(){
	
	// コンストラクタの代わりとしてinitを使用
    init {
		// RESTの窓口クラスの格納されているパッケージを指定
        packages("com.example.demo.test");
    }
}