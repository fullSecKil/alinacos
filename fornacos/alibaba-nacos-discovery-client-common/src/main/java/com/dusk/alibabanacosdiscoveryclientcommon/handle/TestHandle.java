package com.dusk.alibabanacosdiscoveryclientcommon.handle;

import org.springframework.stereotype.Component;


/**
 * @author dusk
 * @since 2019/7/6 23:18
 */
@Component
public class TestHandle {
//    @Autowired
//    LoadBalancerClient loadBalancerClient;

//    public Mono<ServerResponse> test(ServerRequest request) {
//        // // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
//        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
//        String url = serviceInstance.getUri() + "/hello?name=" + "zuishuai!!";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(url, String.class);
//        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("abc"));
//    }

}
