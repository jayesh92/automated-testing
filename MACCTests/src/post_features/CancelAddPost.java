/**
 * This class tests the cancel add post functionality. 
 * 
 * @author daisy
 */

package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CancelAddPost extends common.CommonCode {
	private String expectedTitle; 

	@Test
	public void canceladdpost() {
		
		driver.get(utilities.Constants.list_of_posts);
		WebElement addPost = driver.findElement(By.linkText(
				utilities.Constants.addNewPost));
		addPost.click();	
		WebElement cancel = driver.findElement(By.linkText("Cancel"));
		cancel.click();
	}		
}