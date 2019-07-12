package hello.spring.cloud.job.executor.jobhandler;

import hello.spring.cloud.job.core.biz.model.ReturnT;
import hello.spring.cloud.job.core.handler.IJobHandler;
import hello.spring.cloud.job.core.handler.annotation.JobHandler;
import hello.spring.cloud.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;


/**
 * @author HeLongHai
 * @className DemoTwoJobHandler
 * @description TODO
 * @date 2019/6/5 11:46
 * @email 18566749129@163.com
 */

@JobHandler(value="demoTwoJobHandler")
@Component
public class DemoTwoJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("XXL-JOB, 开始订单定时任务");
        System.out.println("XXL-JOB, Hello World.");
        return SUCCESS;
    }

}
