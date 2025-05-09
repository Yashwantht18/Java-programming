class FittestTrainee{
	public static void main(String args[]){
			      //0 , 1 ,2 ,3  4  5  6  7  8
		int[] oxygen = {95,92,95,92,90,92,90,92,90};
		int Trainee1 = 0;
		int Trainee2 = 0;
		int Trainee3 = 0;
		int max = 0;
		for(int i = 0; i < oxygen.length ; i = i + 3){
			Trainee1 += oxygen[i];
		}
		Trainee1 = Trainee1/3;
		if(max < Trainee1){
			max = Trainee1;
		} 
		for(int i = 1; i < oxygen.length ; i = i + 3){
			Trainee2 += oxygen[i];
		}
		Trainee2 = Trainee2/3;
		if(max < Trainee2){
			max = Trainee2;
		} 

		for(int i = 2; i < oxygen.length ; i = i + 3){
			Trainee3 += oxygen[i];
		}
		Trainee3 = Trainee3/3;
		if(max < Trainee2){
			max = Trainee3;
		} 

		if(Trainee1 == max){
			System.out.println(" Trainee Number : 1");
		}
		if(Trainee2 == max){
			System.out.println(" Trainee Number : 2");
		}
		if(Trainee3 == max){
			System.out.println(" Trainee Number : 3");
		}
		

	}
}



