package com.tcoding.demo.mybatis.dy.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SysUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.253233+08:00", comments="Source Table: sys_user")
    public static final SysUser sysUser = new SysUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.255417+08:00", comments="Source field: sys_user.id")
    public static final SqlColumn<Long> id = sysUser.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.256171+08:00", comments="Source field: sys_user.user_name")
    public static final SqlColumn<String> userName = sysUser.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.256402+08:00", comments="Source field: sys_user.user_detail_id")
    public static final SqlColumn<Long> userDetailId = sysUser.userDetailId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.256593+08:00", comments="Source field: sys_user.group_id")
    public static final SqlColumn<Long> groupId = sysUser.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.256789+08:00", comments="Source field: sys_user.password")
    public static final SqlColumn<String> password = sysUser.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.256947+08:00", comments="Source field: sys_user.phone_number")
    public static final SqlColumn<String> phoneNumber = sysUser.phoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.257273+08:00", comments="Source field: sys_user.c_time")
    public static final SqlColumn<Date> cTime = sysUser.cTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.257534+08:00", comments="Source field: sys_user.u_time")
    public static final SqlColumn<Date> uTime = sysUser.uTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.255102+08:00", comments="Source Table: sys_user")
    public static final class SysUser extends AliasableSqlTable<SysUser> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> userDetailId = column("user_detail_id", JDBCType.BIGINT);

        public final SqlColumn<Long> groupId = column("group_id", JDBCType.BIGINT);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> phoneNumber = column("phone_number", JDBCType.VARCHAR);

        public final SqlColumn<Date> cTime = column("c_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> uTime = column("u_time", JDBCType.TIMESTAMP);

        public SysUser() {
            super("sys_user", SysUser::new);
        }
    }
}