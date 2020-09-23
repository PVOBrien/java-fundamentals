/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantConstructor() {
        Restaurant newRestaurant = new Restaurant("Serafina", "a beautiful place",4, 3);
        assertEquals("Name should be Serafina", "Serafina", newRestaurant.getName());
    }

    @Test public void testRestaurantString() {
        Restaurant newRestaurant = new Restaurant("Serafina", "wondrous!", 4, 3);
        assertEquals("Here's the toString result.", "Business Description\nName: Serafina\nBusiness Description: wondrous!\nBusiness Rating: 4", newRestaurant.toString());
    }

    @Test public void testRestaurantReviewAdd() {
        Review newReview = new Review("Serafina", "Paul O'Brien", 3);
        Review secondReview = new Review("Serafina", "Paul O'Brien", 1);
        Restaurant newRestaurant = new Restaurant("Serafina", "A wondrous place.", 2, 3);
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(secondReview);
        assertEquals("Average reviews should be 2.", 2, newRestaurant.getRating());
        assertEquals("this is the body", "Paul O'Brien", newRestaurant.restaurantReviewList.get(0).author);
    }
}
