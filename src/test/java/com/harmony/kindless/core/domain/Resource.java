//package com.harmony.kindless.core.domain;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.harmony.umbrella.data.domain.BaseEntity;
//
///**
// * @author wuxii@foxmail.com
// */
//@Entity
//@Table(name = "K_RESOURCE")
//public class Resource extends BaseEntity<Long> {
//
//    private static final long serialVersionUID = 9016319189754199860L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long resourceId;
//    private String path;
//
//    @ManyToOne
//    @JoinColumn(name = "menuCode", referencedColumnName = "code")
//    private Menu menu;
//
//    @ManyToMany(mappedBy = "resources")
//    private List<Permission> permissions;
//
//    @Override
//    public Long getId() {
//        return resourceId;
//    }
//
//    public Long getResourceId() {
//        return resourceId;
//    }
//
//    public void setResourceId(Long resourceId) {
//        this.resourceId = resourceId;
//    }
//
//    public String getPath() {
//        return path;
//    }
//
//    public void setPath(String path) {
//        this.path = path;
//    }
//
//    public Menu getMenu() {
//        return menu;
//    }
//
//    public void setMenu(Menu menu) {
//        this.menu = menu;
//    }
//
//    public List<Permission> getPermissions() {
//        return permissions;
//    }
//
//    public void setPermissions(List<Permission> permissions) {
//        this.permissions = permissions;
//    }
//
//}
