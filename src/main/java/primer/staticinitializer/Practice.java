package primer.staticinitializer;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    private static Student[] students;

    {
        Student s1 = new Student("陈枫", 26, "男", "18657171839", "杭州", "chenf24K@163.com");
        Student s2 = new Student("郭贤", 30, "女", "13116605434", "孔敬", "guox24K@163.com");
        Student s3 = new Student("陈涛", 24, "男", "13105817834", "东莞", "chent24K@163.com");
        students = new Student[]{
                s1, s2, s3
        };
    }

    private void queryByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(name)) {
                studentList.add(s);
            }
        }
        if (studentList.size() == 0) {
            System.out.println("系统中未查询到\"" + name + "\"的信息。");
        } else {
            for (Student s : studentList) {
                System.out.println(s.toString());
            }
        }
    }

    private void queryByEmail(String email) {
        List<Student> studentList = new ArrayList<>();
        for (Student s : students) {
            if (s.getEmail().toLowerCase().contains(email)) {
                studentList.add(s);
            }
        }
        if (studentList.size() == 0) {
            System.out.println("系统中未匹配到对应的记录");
        } else {
            for (Student s : studentList) {
                System.out.println(s.toString());
            }
        }
    }

    private void queryByAddress(String address) {
        List<Student> studentList = new ArrayList<>();
        for (Student s : students) {
            if (s.getAddress().toLowerCase().contains(address)) {
                studentList.add(s);
            }
        }

        if (studentList.size() == 0) {
            System.out.println("系统中未匹配到对应的记录");
        } else {
            for (Student s : studentList) {
                System.out.println(s.toString());
            }
        }
    }

    public void queryOfType(int type, String param) {
        if (type == 1) {
            this.queryByName(param);
        }

        if (type == 2) {
            this.queryByEmail(param);
        }

        if (type == 3) {
            this.queryByAddress(param);
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.queryOfType(1,"陈");
    }
}
