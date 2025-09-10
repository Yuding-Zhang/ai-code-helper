package com.yuding.aicodehelper.ai;

import dev.langchain4j.service.SystemMessage;

/**
 * @BelongsProject: ai-code-helper
 * @BelongsPackage: com.yuding.aicodehelper.ai
 * @Author: YuDing
 * @CreateTime: 2025-09-09  21:35
 * @Description: TODO
 * @Version: 1.0
 */
public interface AICodeHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String message);
}
