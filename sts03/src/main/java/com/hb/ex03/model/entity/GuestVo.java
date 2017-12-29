package com.hb.ex03.model.entity;

import java.sql.Date;

public class GuestVo {
	private int sabun;
	private String name;
	private Date nalzza;
	private int pay;
	
	public GuestVo() {
		//디폴트 생성자를 만드는 목적:모델 어트리뷰트 어노테이션으로 자동주입 시켰는데, vo 객체생성>커맨드객체생성>세터로 주입
		//근데 아래 필드 이용한 생성자때문에 디폴트 생성자를 안두면 인자를 안넘기면 자동으로 생성이 안되어버림
		//이 객체 생성될 때 빈게 싫으면 여기서 주입해도 됨. 좋은 패턴은 아님
		nalzza = new Date(System.currentTimeMillis());
		name="testconstr";
		sabun=9999;
		pay=0;
		
		
	}

	public GuestVo(int sabun, String name, Date nalzza, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.nalzza = nalzza;
		this.pay = pay;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNalzza() {
		return nalzza;
	}

	public void setNalzza(Date nalzza) {
		this.nalzza = nalzza;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "GuestVo [sabun=" + sabun + ", name=" + name + ", nalzza=" + nalzza + ", pay=" + pay + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pay;
		result = prime * result + sabun;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuestVo other = (GuestVo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pay != other.pay)
			return false;
		if (sabun != other.sabun)
			return false;
		return true;
	}
	
	
	
}
