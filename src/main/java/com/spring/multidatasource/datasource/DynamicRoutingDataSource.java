package com.spring.multidatasource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("当前数据源："+ DynamicDataSourceContextHolder.get());
        return DynamicDataSourceContextHolder.get();
    }
}
