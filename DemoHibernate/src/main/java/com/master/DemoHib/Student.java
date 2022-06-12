package com.master.DemoHib;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class Student {

	    @Id
	    @Column(name="id")
		private int sid;
		@Column(name="name")
		private String sname;
		@Column(name="phone_number")
		private String sphone;
		private String address;
	
		@OneToMany(mappedBy="student" ,fetch=FetchType.EAGER)
	    Collection<Laptop> laptops = new ArrayList<Laptop>();

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getSphone() {
			return sphone;
		}

		public void setSphone(String sphone) {
			this.sphone = sphone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Collection<Laptop> getLaptops() {
			return laptops;
		}

		public void setLaptops(Collection<Laptop> laptops) {
			this.laptops = laptops;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", address=" + address
					+ ", laptops=" + laptops + "]";
		}
		
		
}
