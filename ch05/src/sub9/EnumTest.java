package sub9;

enum Day {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}


public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day today = Day.FRIDAY;
		
		switch(today) {
        case MONDAY    -> System.out.println("월요일");
        case TUESDAY   -> System.out.println("화요일");
        case WEDNESDAY -> System.out.println("수요일");
        case THURSDAY  -> System.out.println("목요일");
        case FRIDAY    -> System.out.println("금요일");
        case SATURDAY  -> System.out.println("토요일");
        case SUNDAY    -> System.out.println("일요일");
		}
	}
}
