package com.harmony.kindless.core.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.harmony.umbrella.data.domain.BaseEntity;

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

    private List<Resource> resources;

    public Permission() {
    }

    public Permission(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getId() {
        return code;
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

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getMenuCode() {
        return this.menu == null ? null : this.menu.getCode();
    }

    @Override
    public String toString() {
        return "{code:" + code + ", name:" + name + "}";
    }

}
