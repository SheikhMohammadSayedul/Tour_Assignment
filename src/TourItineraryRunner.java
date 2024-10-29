public class TourItineraryRunner {
    public static void main(String[] args) {
        TourItinerary[] itinerary = {
                new TourItinerary("Monday", "9:00 AM", "Visit Museum"),
                new TourItinerary("Monday", "1:00 PM", "Lunch at Central Park"),
                new TourItinerary("Tuesday", "10:00 AM", "City Tour"),
                new TourItinerary("Wednesday", "11:00 AM", "Beach"),
                new TourItinerary("Thursday", "2:00 PM", "Shopping"),
                new TourItinerary("Friday", "6:00 PM", "Dinner Cruise"),
        };

        for (TourItinerary item : itinerary) {
            System.out.println(item);
        }
    }
}
