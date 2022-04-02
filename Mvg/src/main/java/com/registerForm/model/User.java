package com.registerForm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="UserRecord")
public class User {
	
		@Id
		private String id;
		
		@Indexed(unique = true)
		@Field(value="userid")
		private String userid;
		@Field(value="name")
		private String name;
		@Field(value="mail")
		private String mail;
		@Field(value="password")
		private String password;
		@Field(value="Birthday")
		private String birthday;
		@Field(value="Gender")
		private String gender;
		@Field(value="Address")
		private String address;
		@Field(value="profession")
		private String profession;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", userid=" + userid + ", name=" + name + ", mail=" + mail + ", password="
					+ password + ", birthday=" + birthday + ", gender=" + gender + ", address=" + address
					+ ", profession=" + profession + "]";
		}
		
		}
		