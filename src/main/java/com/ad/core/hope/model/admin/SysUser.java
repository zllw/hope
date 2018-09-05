package com.ad.core.hope.model.admin;

import java.io.Serializable;
import java.util.Date;

public class SysUser  implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.userId
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_uuid
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String userUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.role_ids
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String roleIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.locked
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Integer locked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phone
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sex
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.age
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.status
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    private Date lastLoginTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.userId
     *
     * @return the value of sys_user.userId
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.userId
     *
     * @param userid the value for sys_user.userId
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_uuid
     *
     * @return the value of sys_user.user_uuid
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_uuid
     *
     * @param userUuid the value for sys_user.user_uuid
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.role_ids
     *
     * @return the value of sys_user.role_ids
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.role_ids
     *
     * @param roleIds the value for sys_user.role_ids
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.locked
     *
     * @return the value of sys_user.locked
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.locked
     *
     * @param locked the value for sys_user.locked
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phone
     *
     * @return the value of sys_user.phone
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phone
     *
     * @param phone the value for sys_user.phone
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sex
     *
     * @return the value of sys_user.sex
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sex
     *
     * @param sex the value for sys_user.sex
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.age
     *
     * @return the value of sys_user.age
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.age
     *
     * @param age the value for sys_user.age
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.status
     *
     * @return the value of sys_user.status
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.status
     *
     * @param status the value for sys_user.status
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.last_login_time
     *
     * @return the value of sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.last_login_time
     *
     * @param lastLoginTime the value for sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 26 12:27:30 CST 2018
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}