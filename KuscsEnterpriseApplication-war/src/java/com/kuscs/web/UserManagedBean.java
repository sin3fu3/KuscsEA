/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuscs.web;

import java.time.LocalDateTime;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 * ユーザJSF管理対称Bean
 * @author shin
 */
@Named(value = "userManagedBean")
@ManagedBean
@SessionScoped
public class UserManagedBean {

    /**
     * ユーザーID
     */
    private Integer userId;
    /**
     * 名前
     */
    private String firstName;

    /**
     * 苗字
     */
    private String lastName;
    
    /**
     * 誕生日
     */
    private LocalDateTime birthDay; 
    
    /**
     * 生成日時
     */
    private LocalDateTime createTime;
    
    /**
     * 更新日時
     */
    private LocalDateTime updateTime;
    

    /**
     * Creates a new instance of UserManagedBean
     */
    public UserManagedBean() {
    }

    /**
     * ユーザーID取得
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 名前取得
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 名前設定
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 苗字取得
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 苗字設定
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 誕生日取得
     * @return the birthDay
     */
    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    /**
     * 誕生日設定
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 生成日時取得
     * @return the createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 更新日時取得
     * @return the updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新日時設定
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

}
