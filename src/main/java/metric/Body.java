package metric;

import java.util.Date;

import type.BodyType;
import org.json.JSONObject;

import com.google.common.base.Preconditions;

public class Body implements BodyType {

	private Date loDate;
	private float loChestFold;
	private float loStomachFold;
	private float loThighFold;
	private float loWeight;
	
	private Body(Date date, float chestFold, float stomachFold, float thighFold, float weight) {
		Preconditions.checkNotNull(date);
		loDate = date;
		loChestFold = chestFold;
		loStomachFold = stomachFold;
		loThighFold = thighFold;
		loWeight = weight;
	}

	public static Body getNew(Date date, float chestFold, float stomachFold, float thighFold, float weight) {
		return new Body(date, chestFold, stomachFold, thighFold, weight);
	}

	@Override
	public Date getDate() {
		return loDate;
	}

	@Override
	public float getChestFold() {
		return loChestFold;
	}

	@Override
	public float getStomachFold() {
		return loStomachFold;
	}

	@Override
	public float getThighFold() {
		return loThighFold;
	}

	@Override
	public float getWeight() {
		return loWeight;
	}

	public String toString() {
		return new JSONObject( this ).toString();
	}
}
