package com.Sample.entity;

//this class is a POJO class used for data transfer (DTO) between the connected layers.

public class SampleUserInfo {  
	
	private String name;
	private String email;
	private String password;
	//private String address;
	
//generate Getters and Setters of the above fields
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
    public String getPassword() { return password; } public void
    setPassword(String password) { this.password = password; }
	 /*public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}*/
//Here we have generated the hahsCode() and equals() for avoiding object collision.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		SampleUserInfo other = (SampleUserInfo) obj;
		/*if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;*/
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	

}
