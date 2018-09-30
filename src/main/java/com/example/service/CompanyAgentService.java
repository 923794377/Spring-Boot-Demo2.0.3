package com.example.service;

import com.example.dao.CompanyAgentDao;
import com.example.mapper.CompanyAgentMapper;
import com.example.model.CompanyAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 王兴荣
 * @create 2018-07-26 15:49
 **/
@Service
public class CompanyAgentService {
    /*@Autowired
    private CompanyAgentMapper companyAgentMapper;
    public CompanyAgent findById(Integer ca_id){
        return companyAgentMapper.findById(ca_id);
    }*/

    @Autowired
    private CompanyAgentDao companyAgentDao;


    @Transactional
    public CompanyAgent findById(Integer ca_id){
        return companyAgentDao.findById(ca_id);
    }

    @Transactional
    public void insertCompanyAgent() throws Exception {
        CompanyAgent companyAgent1 = new CompanyAgent();
        companyAgent1.setCa_name("张三");
        companyAgent1.setCa_nickname("张三娃");
        companyAgent1.setCa_remark("@Transactional测试");
        companyAgentDao.insertCompanyAgent(companyAgent1);
        int i = 1 / 1;

    }

    @Transactional
    public void insertCompanyAgent1() throws Exception {
        CompanyAgent companyAgent2 = new CompanyAgent();
        companyAgent2.setCa_name("李四");
        companyAgent2.setCa_nickname("李四娃娃");
        companyAgent2.setCa_remark("@Transactional测试");
        companyAgentDao.insertCompanyAgent(companyAgent2);
        int i = 1 / 1;

    }

    @Transactional
    public void insertCompanyAgentAndinsertCompanyAgent1() throws Exception {
        CompanyAgentService companyAgentService = new CompanyAgentService();
        companyAgentService.insertCompanyAgent();
        companyAgentService.insertCompanyAgent1();
    }


}
