/**
 * CopyRight (c) 2016 北京瑰柏科技有限公司 保留所有权利
 */
package com.yg.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.bean.AdminBean;
import com.yg.dao.AdminDao;
import com.yg.service.AdminService;

/**
 * 
 * @author  jack feng
 * @version 1.0.0.2017年6月15日
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService{
    
    Logger logger = LogManager.getLogger(AdminServiceImpl.class);
    
    @Autowired
    private AdminDao adminDao;

    /**
     * {@inheritDoc}
     * @throws Exception 
     * @see com.yg.service.AdminService#queryAdmin(java.lang.String, java.lang.String)
     */
    @Override
    public void queryAdmin(String admin, String password) throws Exception {
        AdminBean adminBean = null;
        try {
            adminBean = adminDao.queryAdmin(admin, password);
            if (adminBean == null) {
                throw new Exception("管理员登不存在!");
            }
        } catch (Exception e) {
            logger.error("管理员登录查询数据库错误",e);
            throw new Exception("管理员登录错误");
        }
    }

}
