package com.gotkx.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 */
@Configuration
@MapperScan({"com.gotkx.mall.mbg.mapper","com.gotkx.mall.dao"})
public class MyBatisConfig {
}
