class FareCalculation{

	public static void main(String args[]){
		int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
		String[] BusStop = {"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA"};
		int fare_1000m = 5;
		int pointer = 0;
		int fareSum = 0;

		String Starting_busStop = "ni";
		String Goal_busStop = "ic";
	
		String Starting_busStop1 = Starting_busStop.toUpperCase();
		String Goal_busStop1 = Goal_busStop.toUpperCase();

		if(Starting_busStop1.equals(Goal_busStop1)){
			System.out.println("INVALID OUTPUT");
		}
		else{
			for(int i = 0 ; i < BusStop.length ; i++){
				if(BusStop[i].equals(Starting_busStop1)){
					pointer = i;
					//System.out.println(pointer);
					break;
				}
			} 
			while(!BusStop[pointer].equals(Goal_busStop1)){

				if(pointer == BusStop.length-1){
					pointer = pointer % (BusStop.length-1);
					fareSum += path[pointer];
				}
				else{				
					pointer++;
					//System.out.println(pointer);
					fareSum += path[pointer];
					//System.out.println(fareSum);
					}
			}
		}
		double FinalFare = (double) fareSum / 1000;
		//System.out.println(FinalFare);
		System.out.println(Math.ceil(FinalFare * fare_1000m));
	}
}


