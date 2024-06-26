package za.ac.cput.factory;
//Sinothando Masiki 219153841

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Feedback;

import java.util.Date;

public class FeedbackFactory {

    // Method to create a feedback object
    public static Feedback createFeedback(String feedbackId, String rental, String customer, String rating, String comments, String feedbackDate) {


        // Create and return a new feedback object
        return new Feedback(feedbackId, rental, customer, rating, comments, feedbackDate);
    }
}

