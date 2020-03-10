/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.spring.multidatasource.util;

import java.util.UUID;

/**
 * uuid 生成器.
 *
 * @author zhuxiuhong
 * @since 2018年2月11日
 */
public class UUIDUtil {

    private UUIDUtil() {
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
