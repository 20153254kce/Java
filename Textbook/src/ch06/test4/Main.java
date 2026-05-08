package ch06.test4;

public class Main {
    public static void main(String[] args) {
        Theater cgv = new Theater("CGV 서면", 3);

        // 좌석 3개 생성 및 상영관에 추가
        cgv.addSeat(new Seat(1, 12000), 0);
        cgv.addSeat(new Seat(2, 12000), 1);
        cgv.addSeat(new Seat(3, 15000), 2); // 프리미엄석

        cgv.bookSeat(1); // 1번 예약
        cgv.bookSeat(1); // 1번 다시 예약 시도 (이미 예약됨 출력)
        cgv.bookSeat(3); // 3번 예약

        System.out.println("총 매출액: " + cgv.getTotalSales()); 
    }
}