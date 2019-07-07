package com.dusk.alibabanacosdiscoveryserver.router;

import com.dusk.alibabanacosdiscoveryserver.handle.SayHelloHandle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author dusk
 * @since 2019/7/6 0:22
 */

@Configuration
public class SRouter {
    @Bean
    public RouterFunction<ServerResponse> router(SayHelloHandle handle) {
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), handle::sayHello);
    }
}
