package com.zoi4erom.students.businessLogic;

public class StudentManager {
     private static Student[] studentsArray;

     public StudentManager() {
          studentsArray = new Student[15];

          studentsArray[0] = new Student("Петренко", "Ірина", "Володимирівна", "05.07.2000",
                  "Проспект Гагаріна 7", "+38050432145", "Медицина", 4);
          studentsArray[1] = new Student("Сидоренко", "Вікторія", "Сергіївна", "30.11.1920",
                  "Вулиця Шевченка 25", "+38063781236", "Право", 3);
          studentsArray[2] = new Student("Григоренко", "Денис", "Олександрович", "12.09.2022",
                  "Проспект Перемоги 14", "+38099875412", "Економіка", 1);
          studentsArray[3] = new Student("Козлов", "Максим", "Олегович", "18.05.1923",
                  "Вулиця Лісова 5", "+38073123456", "Архітектура", 5);
          studentsArray[4] = new Student("Іванова", "Анастасія", "Петрівна", "25.12.1996",
                  "Проспект Соборний 9", "+38066789012", "Журналістика", 2);
          studentsArray[5] = new Student("Іванов", "Олег", "Олегович", "20.03.2000",
                  "Проспект Героїв України 12", "+38050555555", "Фізика", 3);
          studentsArray[6] = new Student("Петрова", "Марія", "Петрівна", "15.08.1999",
                  "Вулиця Київська 8", "+38063333333", "Хімія", 4);
          studentsArray[7] = new Student("Сергієнко", "Ігор", "Васильович", "03.06.2002",
                  "Проспект Пушкіна 20", "+38097777777", "Інформатика", 2);
          studentsArray[8] = new Student("Ковальчук", "Олена", "Миколаївна", "10.09.1998",
                  "Вулиця Лісна 15", "+38074444444", "Математика", 5);
          studentsArray[9] = new Student("Захаренко", "Наталія", "Вікторівна", "27.11.2001",
                  "Проспект Спортивний 3", "+38068888888", "Біологія", 1);
          studentsArray[10] = new Student("Смирнов", "Артем", "Олександрович", "14.04.1921",
                  "Проспект Гагаріна 15", "+38060123456", "Медицина", 2);
          studentsArray[11] = new Student("Зайцев", "Ірина", "Володимирівна", "08.07.2010",
                  "Вулиця Шевченка 25", "+38063781236", "Право", 3);
          studentsArray[12] = new Student("Козлова", "Ольга", "Сергіївна", "02.11.2011",
                  "Проспект Перемоги 14", "+38099875412", "Економіка", 1);
          studentsArray[13] = new Student("Іванов", "Іван", "Олександрович", "19.09.2005",
                  "Вулиця Лісова 5", "+38073123456", "Архітектура", 5);
          studentsArray[14] = new Student("Петренко", "Катерина", "Петрівна", "25.12.1996",
                  "Проспект Соборний 9", "+38066789012", "Журналістика", 2);
     }

     public void facultyStudents(String faculty) { //вивід студентів за вказаним факультетом
          for (Student student : studentsArray) {
               if (student.getFaculty().equals(faculty)) {
                    System.out.println(student);
               }
          }
     }

     public void facultyAndCourseStudents(String faculty, int course) { //вивід студентів за вказаним факультетом та курсом
          for (Student student : studentsArray) {
               if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                    System.out.println(student);
               }
          }
     }

     public void studentsBornAfterYear(int userYear) { //вивід студентів що народились після заданого року
          for (Student student : studentsArray) {
               String[] parts = student.getBirthday().split("\\.");
               int year = Integer.parseInt(parts[2]);
               if (userYear > year) {
                    System.out.println(student);
               }
          }
     }

     public void allStudents() { //вивід всіх студентів
          for (int i = 0; i < studentsArray.length; i++) {
               System.out.println(studentsArray[i]);
          }
     }
}