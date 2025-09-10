package com.yuding.aicodehelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AICodeHelperServiceTest {

    @Resource
    private AICodeHelperService aiCodeHelperService;

    @Test
    void chat() {
        String result = aiCodeHelperService.chat("写一个java程序，打印出1到1000的数字");
        System.out.println(result);
    }
}
