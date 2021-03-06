package com.harmony.kindless.core.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.harmony.kindless.data.BaseEntity;

@Entity
@Table(name = "K_PERMISSION")
public class Permission extends BaseEntity<String> {

    private static final long serialVersionUID = 6179088839462016654L;
    @Id
    private String code;
    private String name;
    private String remark;

    // 模块码(菜单)
    @ManyToOne
    @JoinColumn(name = "menuCode", referencedColumnName = "code")
    private Menu menu;

    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles;

    public Permission() {
    }

    public Permission(String code) {
        this(code, null);
    }

    public Permission(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getId() {
        return getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "{code:" + code + ", name:" + name + "}";
    }

}
