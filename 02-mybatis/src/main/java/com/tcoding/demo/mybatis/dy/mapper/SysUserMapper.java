package com.tcoding.demo.mybatis.dy.mapper;

import static com.tcoding.demo.mybatis.dy.mapper.SysUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.tcoding.demo.mybatis.dy.model.SysUser;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.269026+08:00", comments="Source Table: sys_user")
    BasicColumn[] selectList = BasicColumn.columnList(id, userName, userDetailId, groupId, password, phoneNumber, cTime, uTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.258593+08:00", comments="Source Table: sys_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<SysUser> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.263017+08:00", comments="Source Table: sys_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysUserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_detail_id", property="userDetailId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="c_time", property="cTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="u_time", property="uTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysUser> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.264244+08:00", comments="Source Table: sys_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysUserResult")
    Optional<SysUser> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.264782+08:00", comments="Source Table: sys_user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.265156+08:00", comments="Source Table: sys_user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.265505+08:00", comments="Source Table: sys_user")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.265943+08:00", comments="Source Table: sys_user")
    default int insert(SysUser row) {
        return MyBatis3Utils.insert(this::insert, row, sysUser, c ->
            c.map(userName).toProperty("userName")
            .map(userDetailId).toProperty("userDetailId")
            .map(groupId).toProperty("groupId")
            .map(password).toProperty("password")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(cTime).toProperty("cTime")
            .map(uTime).toProperty("uTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.267646+08:00", comments="Source Table: sys_user")
    default int insertSelective(SysUser row) {
        return MyBatis3Utils.insert(this::insert, row, sysUser, c ->
            c.map(userName).toPropertyWhenPresent("userName", row::getUserName)
            .map(userDetailId).toPropertyWhenPresent("userDetailId", row::getUserDetailId)
            .map(groupId).toPropertyWhenPresent("groupId", row::getGroupId)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
            .map(phoneNumber).toPropertyWhenPresent("phoneNumber", row::getPhoneNumber)
            .map(cTime).toPropertyWhenPresent("cTime", row::getcTime)
            .map(uTime).toPropertyWhenPresent("uTime", row::getuTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.27005+08:00", comments="Source Table: sys_user")
    default Optional<SysUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.270425+08:00", comments="Source Table: sys_user")
    default List<SysUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.270742+08:00", comments="Source Table: sys_user")
    default List<SysUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.271059+08:00", comments="Source Table: sys_user")
    default Optional<SysUser> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.271424+08:00", comments="Source Table: sys_user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.271789+08:00", comments="Source Table: sys_user")
    static UpdateDSL<UpdateModel> updateAllColumns(SysUser row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userName).equalTo(row::getUserName)
                .set(userDetailId).equalTo(row::getUserDetailId)
                .set(groupId).equalTo(row::getGroupId)
                .set(password).equalTo(row::getPassword)
                .set(phoneNumber).equalTo(row::getPhoneNumber)
                .set(cTime).equalTo(row::getcTime)
                .set(uTime).equalTo(row::getuTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.272255+08:00", comments="Source Table: sys_user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysUser row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userName).equalToWhenPresent(row::getUserName)
                .set(userDetailId).equalToWhenPresent(row::getUserDetailId)
                .set(groupId).equalToWhenPresent(row::getGroupId)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
                .set(cTime).equalToWhenPresent(row::getcTime)
                .set(uTime).equalToWhenPresent(row::getuTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.273129+08:00", comments="Source Table: sys_user")
    default int updateByPrimaryKey(SysUser row) {
        return update(c ->
            c.set(userName).equalTo(row::getUserName)
            .set(userDetailId).equalTo(row::getUserDetailId)
            .set(groupId).equalTo(row::getGroupId)
            .set(password).equalTo(row::getPassword)
            .set(phoneNumber).equalTo(row::getPhoneNumber)
            .set(cTime).equalTo(row::getcTime)
            .set(uTime).equalTo(row::getuTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.273734+08:00", comments="Source Table: sys_user")
    default int updateByPrimaryKeySelective(SysUser row) {
        return update(c ->
            c.set(userName).equalToWhenPresent(row::getUserName)
            .set(userDetailId).equalToWhenPresent(row::getUserDetailId)
            .set(groupId).equalToWhenPresent(row::getGroupId)
            .set(password).equalToWhenPresent(row::getPassword)
            .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
            .set(cTime).equalToWhenPresent(row::getcTime)
            .set(uTime).equalToWhenPresent(row::getuTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}