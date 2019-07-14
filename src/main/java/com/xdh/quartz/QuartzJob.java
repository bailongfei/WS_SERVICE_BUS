package com.xdh.quartz;

import com.xdh.utils.strings.DateFormatUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @Package: com.xdh.quartz
 * @ClassName: QuartzJob
 * @Description: 定时任务
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 15:01
 * @Version: 1.0
 */
@Component
public class QuartzJob  {

    @Scheduled(cron = "0 0/1 * * * ? ")
    public void execute() {
        System.out.println("定时任务:"+DateFormatUtil.getDate());
    }
}
