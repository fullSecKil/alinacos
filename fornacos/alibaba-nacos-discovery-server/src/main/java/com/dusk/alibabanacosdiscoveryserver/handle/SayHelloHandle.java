package com.dusk.alibabanacosdiscoveryserver.handle;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author dusk
 * @since 2019/7/6 0:10
 */
@Component
public class SayHelloHandle {

    public Mono<ServerResponse> sayHello(ServerRequest request) {
        String name = request.queryParam("name").get();
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("hello, " + name));
    }
}
