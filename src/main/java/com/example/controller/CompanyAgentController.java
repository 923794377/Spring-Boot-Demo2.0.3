package com.example.controller;

import com.example.model.CompanyAgent;
import com.example.service.CompanyAgentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王兴荣
 * @create 2018-07-26 11:26
 **/
@Slf4j
@RestController//@RestController=@controller+@ResponseBody(返回json )用RestController不能出现视图页面
public class CompanyAgentController {

    @Autowired
    private CompanyAgentService companyAgentService;

    @RequestMapping("/findCompanyAgent")
    public  Map<String, Object> findCompanyAgent() {
        CompanyAgent byId =companyAgentService.findById(92);
        Map<String, Object> map = new HashMap<>();
        map.put("CompanyAgent",byId);
        return map;
    }

    @RequestMapping("/addCompanyAgent")
    public  Map<String, Object> addCompanyAgent() {
        try {
            companyAgentService.insertCompanyAgent();
            /*companyAgentService.insertCompanyAgent();
            companyAgentService.insertCompanyAgent1();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("CompanyAgent","CompanyAgent-insert");
        return map;
    }
}
