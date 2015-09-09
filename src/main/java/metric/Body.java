package metric;

import java.util.Date;

import type.BodyType;
import org.json.JSONObject;

import com.google.common.base.Preconditions;

/**
 * Represents a measurement about weight and skinfolds at a point in time
 */
public class Body implements BodyType {

	private Date _date;
	private float _chestFold;
	private float _stomachFold;
	private float _thighFold;
	private float _weight;
	
	private Body(Date date, float chestFold, float stomachFold, float thighFold, float weight) {
		Preconditions.checkNotNull(date);
		_date = date;
		
		if (chestFold 	 <=0 || 
			stomachFold <=0 ||
			thighFold 	 <=0 || 
			weight 	 <=0) {
			throw new IllegalArgumentException();
		} else {
			_chestFold = chestFold;
			_stomachFold = stomachFold;
			_thighFold = thighFold;
			_weight = weight;	
		}
	}

	public static Body getNew(Date date, float chestFold, float stomachFold, float thighFold, float weight) throws NullPointerException, IllegalArgumentException {
		return new Body(date, chestFold, stomachFold, thighFold, weight);
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public float getChestFold() {
		return _chestFold;
	}

	@Override
	public float getStomachFold() {
		return _stomachFold;
	}

	@Override
	public float getThighFold() {
		return _thighFold;
	}

	@Override
	public float getWeight() {
		return _weight;
	}

	public String toString() {
		return new JSONObject( this ).toString();
	}
}
