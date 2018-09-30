package com.example.dao;

import com.example.model.CompanyAgent;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyAgentDao {

    CompanyAgent findById(Integer ca_id);

    int insertCompanyAgent(CompanyAgent companyAgent);
}
