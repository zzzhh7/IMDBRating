package edu.bristol;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;

public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating = 0;
        IMDBRating rater = new IMDBRating();

        averageRating = rater.addNewRating(2);
        assertTrue("Adding 1st rating: average should be 2.0", averageRating == 2.0);

        averageRating = rater.addNewRating(4);
        assertTrue("Adding 2nd rating: average should be 3.0", averageRating == 3.0);
    }
}
