package hibernate_maven_student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String name;
private String fathername;
private String mothername;
private String address;
private int totalmarks;
private double percentage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getMothername() {
	return mothername;
}
public void setMothername(String mothername) {
	this.mothername = mothername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(int totalmarks) {
	this.totalmarks = totalmarks;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fathername=" + fathername + ", mothername=" + mothername
			+ ", address=" + address + ", totalmarks=" + totalmarks + ", percentage=" + percentage + "]";
}


}
