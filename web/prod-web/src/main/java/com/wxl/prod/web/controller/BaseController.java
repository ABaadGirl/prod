package com.wxl.prod.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected void logBizMessage(String name, Object[] params) {
        if (this.logger.isInfoEnabled())
            this.logger.info(toLogMessage(name, params));
    }

    protected void logDebugMessage(String name, Object[] params) {
        if (this.logger.isDebugEnabled())
            this.logger.debug(toLogMessage(name, params));
    }

    private String toLogMessage(String name, Object[] params) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append("::");
        for (int i = 0; i < params.length; ++i) {
            stringBuilder.append(params[i]).append("|");
        }
        return stringBuilder.toString();
    }
}