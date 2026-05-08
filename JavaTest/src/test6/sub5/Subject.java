package test6.sub5;

public class Subject {
    private String subName;
    private Student[] students;
    private int studentCount;

    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10]; //크기 배열 초기화
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if(studentCount < 10) {
        	students[studentCount] = student;
        	studentCount++;
        }
    }

    public void printSubjectInfo() {
        System.out.println("과목명 : " + subName);
        System.out.print("수강생 : ");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName());
            if (i < studentCount - 1) System.out.print(", "); // 콤마 처리
        }
        System.out.println();
    }

    public String getSubName() {
        return subName;
    }
}