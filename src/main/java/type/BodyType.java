package type;

import java.util.Date;

public interface BodyType {

	public abstract Date getDate();
	public abstract float getChestFold();
	public abstract float getStomachFold();
	public abstract float getThighFold();
	public abstract float getWeight();
	public abstract String toString();	
	
}
