public class TourFeedbackRunner {
    public static void main(String[] args) {
        TourFeedback[] feedbacks = new TourFeedback[3];

        feedbacks[0] = new TourFeedback("Alice", 8, "Great tour, very informative!");
        feedbacks[1] = new TourFeedback("Bob", 7, "Good experience, but could be better.");
        feedbacks[2] = new TourFeedback("Charlie", 9, "Excellent! Had a lot of fun.");
        double totalRating = 0;
        for (TourFeedback feedback : feedbacks) {
            totalRating += feedback.getRating();
        }
        double averageRating = totalRating / feedbacks.length;
        System.out.println("Average Rating: " + averageRating);

        System.out.println("Comments:");
        for (TourFeedback feedback : feedbacks) {
            System.out.println(feedback.getComments());
        }
    }
}
