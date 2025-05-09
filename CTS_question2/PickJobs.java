class PickJobs{
	public static void main(String args[]){
		int no_of_jobs = 4;
	//	int[] start_time = {600,710,805,910,1005};
	//	int[] end_time = {700,800,900,1000,1100};
	//	int[] profit = {10,20,30,40,50};

		int[] start_time = {800,1000,1230,1400};
		int[] end_time = {1200,1300,1400,1500};
		int[] profit = {100,90,60,80};


	//	int[] start_time = {200,400,300,900};
	//	int[] end_time = {300,700,800,1000};
	//	int[] profit = {10,20,30,50};


	//	int[] start_time = {800,830,1015};
	//	int[] end_time = {900,1000,1115}; 
	//	int[] profit = {40,60,70};
	
		
		int cost = 0;
		int i = 0;
		int job_left = 0;
		int earnings = 0;
		
		while(i < no_of_jobs){
			System.out.println(i);
			if(i == no_of_jobs-1){
				break;
			}
			if(start_time[i] < start_time[i+1]){
				if(end_time[i] <= start_time[i+1]){
					cost += profit[i];
				}
				else{
					if(profit[i] > profit[i+1]){
						earnings += profit[i+1];
						job_left++;
					}
					else{
						earnings += profit[i];
						job_left++;
					}
				}
				
			}
			else if(start_time[i] > start_time[i+1]){
				if(profit[i] > profit[i+1]){
					earnings += profit[i+1];
					job_left++;
				}
				else{
					earnings += profit[i];
					job_left++;
				}
			}
			i++;			
		}
		System.out.println(job_left + " " + earnings);	
	}
}