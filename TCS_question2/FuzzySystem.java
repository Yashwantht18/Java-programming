class FuzzySystem{
	public static void main(String args[]){
		int weight =  2001;
		if(weight < 0){
			System.out.println("INVALID INPUT");
		}
		else{
			if(weight == 0){
				System.out.println("Time Estimated: 0 minutes");
			}
			else if(weight <= 2000){
				System.out.println("Time Estimated: 25 minutes");
			}
			else if(weight <= 4000){
				System.out.println("Time Estimated: 35 minutes");
			}
			else if(weight > 7000){
				System.out.println("OVERLOADED");
			}
		}
	}
}