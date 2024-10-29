public class TourItinerary {
    private String day;
    private String time;
    private String activity;

    public TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return "Day: " + day + ", Time: " + time + ", Activity: " + activity;
    }
}
