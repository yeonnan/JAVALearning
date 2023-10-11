package exercise.chapter_26;

public class Student {
    //속성
    String schoolName;
    int classYear; //몇학년
    int classroomNumbers; //몇반
    int studentNumber; //몇번

    //기본정보
    String name;
    String gender;

    //행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생 : 저는 %s 선생님께 %s 과목을 배웁니다 \n", teacherName, subjectName);

    }

    //생성자
    Student() {
    }
    Student(String pName, String pGender) {
        name = pName;
        gender = pGender;
    }

    //파라미터
    //생성자를 만들게 되면 생성자에 들어가는 함수가 자동으로 매칭이 되도록 만드는 중
    Student(String pSchoolName, int pClassYear, int pClassroomNum, int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumbers = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }
}
