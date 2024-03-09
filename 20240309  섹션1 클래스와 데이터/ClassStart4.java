package class1;

public class ClassStart4 {
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

        Student[] Students = new Student[2];
        Students[0] = student1;
        Students[1] = student2;

        System.out.println("이름 : " + Students[0].name + " 나이:" + Students[0].age + " 성적:" + Students[0].grade);
        System.out.println("이름 : " + Students[1].name + " 나이:" + Students[1].age + " 성적:" + Students[1].grade);
    }
}
