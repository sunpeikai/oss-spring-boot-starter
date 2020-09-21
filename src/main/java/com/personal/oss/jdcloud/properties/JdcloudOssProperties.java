/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.personal.oss.jdcloud.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sunpeikai
 * @version JdcloudOssProperties, v0.1 2020/9/17 14:29
 * @description
 */
@ConfigurationProperties("oss.jdcloud")
public class JdcloudOssProperties {
    private boolean enable;
    private String endpoint;
    private String accessKey;
    private String secretKey;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
