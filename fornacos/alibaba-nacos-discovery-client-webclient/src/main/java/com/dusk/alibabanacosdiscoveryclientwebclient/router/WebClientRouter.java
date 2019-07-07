package com.dusk.alibabanacosdiscoveryclientwebclient.router;

import com.dusk.alibabanacosdiscoveryclientwebclient.handle.WebClientHandle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author dusk
 * @since 2019/7/7 15:07
 */
@Configuration
public class WebClientRouter {

    @Bean
    public RouterFunction<ServerResponse> router(WebClientHandle handle) {
        return RouterFunctions.route(RequestPredicates.GET("/testInvoke3").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), handle::test);
    }
}
