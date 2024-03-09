package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001

        student1.name = "학생 1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student(); // x002

        student2.name = "학생 2";
        student2.age = 16;
        student2.grade = 70;

        Student[] Students = {student1, student2};

        for (int i = 0; i < Students.length; i++){
            System.out.println("이름 : " + Students[i].name + " 나이:" + Students[i].age + " 성적:" + Students[i].grade);
        }
        for (int i = 0; i < Students.length; i++){
            Student s = Students[i];
            System.out.println("이름 : " + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        for (Student s : Students){
            System.out.println(s.name + s.age + s.grade);
        }
        // iter 단축키!
    }
}
