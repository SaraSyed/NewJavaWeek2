
public class TooHot {
	
	public boolean tooHot(int temp, boolean isSummer) {
	    if(isSummer && 60 <= temp && temp <= 100)
	        return true;
	          
	    if(!isSummer && 60 <= temp && temp <= 90)
	        return true;
	                    
	    return false;
	}

}
