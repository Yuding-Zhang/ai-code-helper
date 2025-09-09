package com.yuding.aicodehelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: ai-code-helper
 * @BelongsPackage: com.yuding.aicodehelper.ai
 * @Author: YuDing
 * @CreateTime: 2025-09-09  20:24
 * @Description: TODO
 * @Version: 1.0
 */

@Service
@Slf4j
public class AiCodeHelper {

    @Resource
    private ChatModel qwenChatModel;

    public String chat(String message){
        UserMessage userMessage = UserMessage.from(message);
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("aiMessage: {}", aiMessage);
        return aiMessage.text();
    }

}
