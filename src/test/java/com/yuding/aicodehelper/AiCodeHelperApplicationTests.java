package com.yuding.aicodehelper;

import com.yuding.aicodehelper.ai.AiCodeHelper;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperApplicationTests {
    @Resource
    private AiCodeHelper aiCodeHelper;

    @Test
    void chat() {
        aiCodeHelper.chat("写一个java程序，打印1到10的偶数");
    }

    @Test
    void chatWithUserMessage() {
        // 采用的模型不支持多模态输入，这里仅供测试使用
        UserMessage userMessage = UserMessage.from(
                TextContent.from("解释这个图片"),
                ImageContent.from("")
        );
        aiCodeHelper.chatWithUserMessage(userMessage);
    }
}
