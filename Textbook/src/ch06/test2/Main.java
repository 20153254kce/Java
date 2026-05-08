package ch06.test2;

public class Main {
    public static void main(String[] args) {
        // 1. 좌석 3개 생성 (배열로 관리하면 더 좋습니다)
        Seat s1 = new Seat(10);
        Seat s2 = new Seat(11);
        
        // 2. 학생 생성
        Student st1 = new Student("철수");
        Student st2 = new Student("영희");
        
        // 3. 기능 테스트
        st1.takeSeat(s1); // 철수가 10번 예약
        st2.takeSeat(s1); // 영희가 10번 시도 -> "이미 사용 중" 출력
        
        st1.printStudentStatus();
        st2.printStudentStatus();
        
        st1.leaveSeat();  // 철수 퇴실
        st2.takeSeat(s1); // 이제 영희가 10번 예약 가능
        
        st2.printStudentStatus();
    }
}
