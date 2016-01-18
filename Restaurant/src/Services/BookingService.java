package Services;

import java.util.Date;

public interface BookingService {
	boolean book(int username, int numofpeople, String date, String time);
	boolean cancel();
}
