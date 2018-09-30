package com.example.model;

import lombok.Data;

import java.util.Date;

/**
 * 企业经纪人
 */
@Data
public class CompanyAgent {

  // 企业人员编码
  private Integer ca_id;
  // 企业人员名称
  private String ca_name;
  // 企业人员昵称
  private String ca_nickname;
  // 经纪人头像
  private String ca_headImage;
  // 企业人员电话
  private String ca_phone;
  // 企业人员密码
  private String ca_password;
  // 企业人员备注
  private String ca_remark;
  // 是否离职（1：在职0：离职）
  private Integer ca_bool;
  // 公司编码
  private Integer cy_id;
  // 经纪人状态 1：创建 2：实名审核 3：正常
  private Integer ca_state;
  // 登陆次数
  private Integer ca_num;
  // 是否删除(0,未删除;1已删除)
  private Integer is_delete;
  // 企业人员创建时间
  private Date ca_create;
  // 短信验证码
  private String ca_code;
  // 短信验证码生成时间
  private Date ca_codeDate;
}
