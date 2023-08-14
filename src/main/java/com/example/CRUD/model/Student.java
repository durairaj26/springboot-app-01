package com.example.CRUD.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
@Table(name = "student")
public class Student {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String className;
    private double mark;
    private int ranking;
    private String mobileNumber;
    private String address;
    private String photo;
    private String bloodGroup;
    private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Long id, String name, int age, String className, double mark, int ranking, String mobileNumber,
			String address, String photo, String bloodGroup, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
		this.mark = mark;
		this.ranking = ranking;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.photo = photo;
		this.bloodGroup = bloodGroup;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + ", mark=" + mark
				+ ", ranking=" + ranking + ", mobileNumber=" + mobileNumber + ", address=" + address + ", photo="
				+ photo + ", bloodGroup=" + bloodGroup + ", email=" + email + "]";
	}

    // Constructors, getters, and setters
    
}
