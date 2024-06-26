package com.xiaoguan.train.batch.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * ClassName: TestJob
 * Package: com.xiaoguan.train.batch.job
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/5/21 20:42
 * @Version 1.0
 */
@DisallowConcurrentExecution
public class TestJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("TestJob Test开始");
        
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("TestJob Test结束");
    }
}
