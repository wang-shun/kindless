package com.harmony.kindless.domain.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.harmony.umbrella.data.domain.BaseEntity;

/**
 * @author wuxii@foxmail.com
 */
@Entity
@Table(name = "K_USER")
public class User extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    private Long userId;
    @Column(unique = true)
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String address;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(//
            name = "K_USER_ROLE", //
            joinColumns = { @JoinColumn(name = "username", referencedColumnName = "username") }, //
            inverseJoinColumns = { @JoinColumn(name = "role_code", referencedColumnName = "code") }//
    )
    private List<Role> roles;

    public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Long getId() {
        return getUserId();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{username:" + username + ", password:" + password + "}";
    }

}
