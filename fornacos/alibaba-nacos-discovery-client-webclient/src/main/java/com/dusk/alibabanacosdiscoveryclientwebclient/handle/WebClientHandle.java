package com.dusk.alibabanacosdiscoveryclientwebclient.handle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author dusk
 * @since 2019/7/7 14:53
 */
@Component
public class WebClientHandle {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<ServerResponse> test(ServerRequest request) {
        return ServerResponse.ok().body(webClientBuilder.build().get().uri("http://alibaba-nacos-discovery-server/hello?name=didi")
                .retrieve().bodyToMono(String.class), String.class);
        // return ServerResponse.ok().contentType()
    }
}
