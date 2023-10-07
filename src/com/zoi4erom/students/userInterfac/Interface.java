package com.zoi4erom.students.userInterfac;

import com.zoi4erom.students.businessLogic.StudentManager;

import java.util.Scanner;

public class Interface {
     public static void runner() {
          Scanner in = new Scanner(System.in);

          String faculty;
          int course;
          int year;

          StudentManager studentManager = new StudentManager();

          int choice;

          do {
               System.out.println("Головне меню:");
               System.out.println("1: Список студентів навчального факультету.");
               System.out.println("2: Список студентів для кожного факультету і курсу.");
               System.out.println("3: Список студентів, що народилися після заданого року.");
               System.out.println("4: Список студентів.");
               System.out.println("0: Вихід.");
               System.out.print("Оберіть дію: ");

               choice = in.nextInt();
               in.nextLine();

               switch (choice) {
                    case 1:
                         System.out.print("Виберіть потрібний факультет: ");
                         faculty = in.nextLine();
                         studentManager.facultyStudents(faculty);
                         break;
                    case 2:
                         System.out.print("Виберіть потрібний факультет: ");
                         faculty = in.nextLine();
                         System.out.print("Виберіть потрібний курс: ");
                         course = in.nextInt();
                         studentManager.facultyAndCourseStudents(faculty, course);
                         break;
                    case 3:
                         System.out.print("Напишіть бажаний рік: ");
                         year = in.nextInt();
                         studentManager.studentsBornAfterYear(year);
                         break;
                    case 4:
                         studentManager.allStudents();
                         break;
                    case 0:
                         continue;
                    default:
                         System.out.println("Невірний вибір. Спробуйте ще раз.");
               }
          } while (choice != 0);
     }
}
