package com.helonghai.tc.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 如果开启熔断 服务a就不能回滚了，所以需要关闭
 */

@Component
//@FeignClient(value = "tx-client-two" ,fallback = Fusing.class)
@FeignClient(value = "tx-client-two")
public interface Feign {
	
	@RequestMapping(value = "/clientTwoController/test2",method = RequestMethod.GET)
    String sayHiFromClientOne();

}
