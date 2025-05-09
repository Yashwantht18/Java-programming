class doctorFee{
	public static void main(String args[]){
		int[] ages = {20,30,40,50,2,3,14};
		int fees = 0;
		for(int i =  0;  i < ages.length ; i++){
			if(ages[i] < 17){
				fees += 200;
			}
			else if(ages[i] >= 17 && ages[i] < 40){
				fees += 400;
			}
			else{
				fees += 300;
			}
		}
		System.out.println(fees);
	} 
}


