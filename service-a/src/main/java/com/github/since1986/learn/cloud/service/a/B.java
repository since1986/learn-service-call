package com.github.since1986.learn.cloud.service.a;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("com-github-since1986-learn-cloud-service-b")
public interface B {

    @RequestMapping(method = RequestMethod.GET, value = "/echo")
    Echo getEcho(@RequestParam("id") long id, @RequestParam("showTimestamp") boolean showTimestamp);
}
