public class VolumeCalculator{
	public static void main(String []args){
	
		/*creating variables radius, radiusInMile, volumeInKM, 
		volumeInMile to indicate radius of earth, radius of 
            earth in mile volume of earth in                  
		kilometer cube, volume of earth in mile cube respectively.*/
		double radius = 6378, radiusInMile, volumeInKM, volumeInMile;
	
		//calculating radius in mile
		radiusInMile = radius * 1.6;
		
		//calculating volume in kilometer
		volumeInKM = (4/3) * (22.0/7.0) * radius * radius * radius;
		
		//calculating volume in mile
		volumeInMile = (4/3) * (22.0/7.0) * radiusInMile * radiusInMile * radiusInMile;
		
		//printing the volume
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKM + " and cubic miles is " + volumeInMile);
	}
}



