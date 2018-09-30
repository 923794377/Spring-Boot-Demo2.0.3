package com.example.dao.impl;

import com.example.dao.BaseDAO;
import com.example.dao.CompanyAgentDao;
import com.example.model.CompanyAgent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王兴荣
 * @create 2018-07-30 14:03
 **/
@Slf4j
public class CompanyAgentDaoImpl extends BaseDAO implements CompanyAgentDao {
    @Override
    public CompanyAgent findById(Integer ca_id) {
        log.info("CompanyAgentDaoImpl.findById");
        return sqlSessionTemplateZkd.selectOne("com.example.dao.findById",ca_id);
    }

    @Override
    public int insertCompanyAgent(CompanyAgent companyAgent) {
        return sqlSessionTemplateZkd.selectOne("com.example.dao.insertCompanyAgent",companyAgent);
    }
}
