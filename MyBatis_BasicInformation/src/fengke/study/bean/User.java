package fengke.study.bean;

import java.io.Serializable;
/**
 * ʵ����
 * @author ���
 *	��test���ݿ��е�Emp����ص�ʵ����
 */
public class User implements Serializable{
	//�û�ID
	private Integer eid;
	//�û�����
	private String ename;
	//�û��Ա�
	private String esex;
	//�û�����
	private Integer eage;
	//�û�����
	private String ehobby;
	//��������
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
		String temp="Ա�����֣�"+ename+"Ա���Ա�"+esex+"���ű�ţ�"+depid;
		return temp;
	}
	
	
	

}
