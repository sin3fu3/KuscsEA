/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuscs.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shin
 */
@Entity
@Table(name = "t_user_base")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUserBaseEntity.findAll", query = "SELECT t FROM TUserBaseEntity t"),
    @NamedQuery(name = "TUserBaseEntity.findById", query = "SELECT t FROM TUserBaseEntity t WHERE t.id = :id"),
    @NamedQuery(name = "TUserBaseEntity.findByLastName", query = "SELECT t FROM TUserBaseEntity t WHERE t.lastName = :lastName"),
    @NamedQuery(name = "TUserBaseEntity.findByFirstName", query = "SELECT t FROM TUserBaseEntity t WHERE t.firstName = :firstName"),
    @NamedQuery(name = "TUserBaseEntity.findByBirthDay", query = "SELECT t FROM TUserBaseEntity t WHERE t.birthDay = :birthDay"),
    @NamedQuery(name = "TUserBaseEntity.findByCreateTime", query = "SELECT t FROM TUserBaseEntity t WHERE t.createTime = :createTime"),
    @NamedQuery(name = "TUserBaseEntity.findByUpdateTime", query = "SELECT t FROM TUserBaseEntity t WHERE t.updateTime = :updateTime")})
public class TUserBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "birth_day")
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    public TUserBaseEntity() {
    }

    public TUserBaseEntity(Integer id) {
        this.id = id;
    }

    public TUserBaseEntity(Integer id, String lastName, String firstName, Date createTime) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUserBaseEntity)) {
            return false;
        }
        TUserBaseEntity other = (TUserBaseEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuscs.dao.TUserBaseEntity[ id=" + id + " ]";
    }
    
}
