package body;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
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
	public void testAddMetric() throws Exception {
		Date mDate = new Date();
		float chestSkinfold = 5;
		float stomachSkinfold = 19;
		float thighSkinfold = 8;
		float weight = (float) 187.5;
		
		Body metric = Body.getNew(mDate, chestSkinfold, stomachSkinfold, thighSkinfold, weight);	
		System.out.println(metric.toString());
		assertEquals(200, PersistenceController.addMetric(metric));
	}
	
	@Test
	public void testGetMetric() throws Exception {
		assertEquals(1,1);
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
}
