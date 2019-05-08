package com.springboot.pojo;

import java.io.Serializable;
import java.util.Set;
/**
 * 角色功能菜单关联关系实体
 * @author lvjj
 */
public class RoleModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;//主键
	private int roleId;//角色id
	private int moduleId;//功能菜单id
	private Module module;
	
	
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	
	
	
	
}
