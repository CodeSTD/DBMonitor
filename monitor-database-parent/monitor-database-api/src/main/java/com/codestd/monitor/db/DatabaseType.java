/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codestd.monitor.db;

/**
 * 数据库类型，含关系型数据库和非关系型数据库
 * @author wangchengwei
 * @since 1.0.0
 */
public enum DatabaseType {

    //Relational Database
    ORACLE,
    DB2,
    MYSQL,
    MSSQL,
    POSTGRESQL,
    SYBASE,

    //NoSql database
    MONGODB(false),
    HBASE(false),
    COUCHDB(false),
    CASSANDRA(false),
    HYPERTABLE(false),
    REDIS(false),
    NEO4J(false),
    TC(false),
    TT(false),
    FLARE(false),
    BERKELEY(false),
    MEMCACHEDB(false),
    MEMLINK(false),
    DB4O(false),
    VERSANT(false),
    BASEX(false),
    ORACLE_NOSQL(false);

    private boolean isRelational;

    DatabaseType(){
        this.isRelational = true;
    }

    DatabaseType(boolean isRelational){
        this.isRelational = isRelational;
    }
}
