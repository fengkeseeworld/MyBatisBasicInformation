package fengke.study.bean;

import java.io.Serializable;
/**
 * 实体类
 * @author 锋客
 *	与test数据库中的Emp表相关的实体类
 */
public class User implements Serializable{
	//用户ID
	private Integer eid;
	//用户姓名
	private String ename;
	//用户性别
	private String esex;
	//用户年龄
	private Integer eage;
	//用户爱好
	private String ehobby;
	//所属部门
	private Integer	depid;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsex() {
		return esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public String getEhobby() {
		return ehobby;
	}

	public void setEhobby(String ehobby) {
		this.ehobby = ehobby;
	}

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	@Override
	public String toString() {
		String temp="员工名字："+ename+"员工性别："+esex+"部门编号："+depid;
		return temp;
	}
	
	
	

}
