/**
 * CopyRight (c) 2016 北京瑰柏科技有限公司 保留所有权利
 */
package com.yg.dao;

import org.apache.ibatis.annotations.Param;

import com.yg.bean.AdminBean;

/**
 * 
 * @author  jack feng
 * @version 1.0.0.2017年6月15日
 */
public interface AdminDao {

    
    /**
     * 查询管理员
     *
     * @param admin
     * @param password
     * @return
     */
    public AdminBean queryAdmin(@Param("admin")String admin,@Param("password")String password);
}
