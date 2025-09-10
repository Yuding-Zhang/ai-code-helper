package com.yuding.aicodehelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: ai-code-helper
 * @BelongsPackage: com.yuding.aicodehelper.ai
 * @Author: YuDing
 * @CreateTime: 2025-09-09  21:41
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class AICodeHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    public AICodeHelperService aiCodeHelperService() {
        return AiServices.create(AICodeHelperService.class, qwenChatModel);
    }

}
