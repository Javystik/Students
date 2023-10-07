package com.zoi4erom.students.businessLogic;

public class Student {
     private String lastName;
     private String firstName;
     private String middleName;
     private String birthday;
     private String address;
     private String phoneNumber;
     private String faculty; //факультет
     private int course; //курс

     public Student(String lastName, String firstName, String middleName, String birthday, String address, String phoneNumber, String faculty, int course) {
          this.lastName = lastName;
          this.firstName = firstName;
          this.middleName = middleName;
          this.birthday = birthday;
          this.address = address;
          this.phoneNumber = phoneNumber;
          this.faculty = faculty;
          this.course = course;
     }

     @Override
     public String toString() {
          return lastName + " "
                  + firstName + " "
                  + middleName + " "
                  + birthday + " "
                  + address + " "
                  + phoneNumber + " "
                  + faculty + " "
                  + course;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getMiddleName() {
          return middleName;
     }

     public void setMiddleName(String middleName) {
          this.middleName = middleName;
     }

     public String getBirthday() {
          return birthday;
     }

     public void setBirthday(String birthday) {
          this.birthday = birthday;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getPhoneNumber() {
          return phoneNumber;
     }

     public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
     }

     public String getFaculty() {
          return faculty;
     }

     public void setFaculty(String faculty) {
          this.faculty = faculty;
     }

     public int getCourse() {
          return course;
     }

     public void setCourse(int course) {
          this.course = course;
     }
}