package body;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import metric.Body;
import persistence.PersistenceController;

public class testBody {

	@Before
	public void buildUp() throws Exception {
		/*HashMap<String,String> collection = new HashMap<String,String>();
		
		
		Date mDate = new Date();
		float chestSkinfold = 5;
		float stomachSkinfold = 19;
		float thighSkinfold = 8;
		float weight = (float) 187.5;
		
		Body metric = Body.getNew(mDate, chestSkinfold, stomachSkinfold, thighSkinfold, weight);
		collection.put(metric.getDate().toString(), metric.toString());
		*/
	}
	
	@Test
	public void testAddMetric() {
		Body metric = Body.getNew(new Date(), (float) 5, (float) 1, (float) 4, (float) 180.63);
		assertEquals(200, PersistenceController.addMetric(metric));
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testAddMetricNullDate() {
		Body metric = Body.getNew(null, (float) 5, (float) 1, (float) 4, (float) 180.63);	
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void testAddMetricIllegalChestFold() {
		Body metric = Body.getNew(new Date(), (float) 0, (float) 5, (float) 6, (float) -1);		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddMetricIllegalStomachFold() {
		Date someDate = new Date();
		Body metric = Body.getNew(someDate, (float) 2, (float) 0, (float) 6, (float) 6);		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddMetricIllegalThighFold() {
		Body metric = Body.getNew(new Date(), (float) 2, (float) 5, (float) 0, (float) -1);	
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddMetricIllegalWeight() {
		Body metric = Body.getNew(new Date(), (float) 2, (float) 5, (float) 6, (float) 0);	
	}
	
}
