package Homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("математика");
        Course physics = new Course("физика");
        Course astronomy = new Course("астрономия");
        Course biology = new Course("биология");
        Course chemistry = new Course("химия");

        Student student1 = new Student("Михаил", Arrays.asList(math, physics, astronomy));
        Student student2 = new Student("Екатерина", Arrays.asList(math, biology, chemistry));
        Student student3 = new Student("Андрей", Arrays.asList(math, physics, chemistry, biology));
        Student student4 = new Student("Анастасия", Arrays.asList(physics, astronomy));

        List<Student> studentList = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4));

        uniqueCourses(studentList);
        curious3(studentList);
        whoIsStudying(studentList, math);

    }

    public static List<Course> uniqueCourses (List<Student> studentList){
        List<Course> courses = studentList.stream()
                .map(s -> s.getCourses())
                .flatMap(c -> c.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Список уникальных курсов:");
        System.out.println(courses);
        return courses;

    }

    public static List<Student> curious3 (List<Student> studentList){
        List<Student> curiousStudents = studentList.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Список из трех самых любознательных студентов:");
        System.out.println(curiousStudents);
        return curiousStudents;
    }

    public static List<Student> whoIsStudying (List<Student> studentList, Course course){
        List<Student> whoIsStudyingList = studentList.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList());
        System.out.println("Список студентов, посещающих курс " + course + ":");
        System.out.println(whoIsStudyingList);
        return whoIsStudyingList;
    }
}
