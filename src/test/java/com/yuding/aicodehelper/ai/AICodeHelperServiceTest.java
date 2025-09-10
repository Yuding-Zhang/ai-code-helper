package com.yuding.aicodehelper.ai;

import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.service.Result;
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

    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("你好，我是毓丁");
        System.out.println(result);
        result = aiCodeHelperService.chat("你好，还记得我吗");
        System.out.println(result);
    }

    @Test
    void chatForReport() {
        String userMessage = "你好，我是程序员yuding，请给制定该项目的报告";
        AICodeHelperService.Report report = aiCodeHelperService.chatForReport(userMessage);
        System.out.println(report);
    }

    @Test
    void chatWithRAG() {
        // 测试RAG，未封装result
//        String result = aiCodeHelperService.chat("前端技术中的javascript有什么学习路线？");
//        System.out.println(result);
        Result<String> result = aiCodeHelperService.chatWithRAG("前端技术中的javascript有什么学习路线？");
        System.out.println(result.sources());
        System.out.println(result.content());
    }
}
