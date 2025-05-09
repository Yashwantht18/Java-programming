import java.util.Scanner;
class ChannelMoves{

	public static int len(int n){
		int size = 0;
		while(n > 0){
			size++;
			n /= 10;
		}
		return size;
	}
	
	public static int cal(int a , int b , int[] blocked){
		int move = 0;
		boolean block = false;
		if(a > b){
			for(int i = b ; i < a ; i++){
				for(int j = 0 ; j < blocked.length ; j++){
					if(i != blocked[j]){
						block = true;
					} 
				}
				if(!block) move++;
			}
		}
		else if(a == b){
			return move;
		}
		else{
			for(int i = a ; i < b ; i++){
				for(int j = 0 ; j < blocked.length ; j++){
					if(i != blocked[j]){
						block = true;
					} 
				}
				if(!block) move++;
			}
		}
		return move;
	}


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

               	System.out.print("Enter No of Blocked Channel : ");
        	int size = sc.nextInt();

              	int[] blocked_channel = new int[size];

               	System.out.println("Enter " + size + " Channel:");
        	for (int i = 0; i < size; i++) {
            		blocked_channel[i] = sc.nextInt();
        	}

		int lowest_channel = 1;
		int highest_channel = 20;
		int no_of_channel_to_view = 4;

		int[] view = {1,2,9,11};
		int clicks = 0;
		boolean blocked = false;
		int[] previous_channel = new int[no_of_channel_to_view];
		for(int i = 0 ; i < view.length ; i++){
			int channel_no = view[i];

			for(int j = 0 ; j < size ; j++){
				if(channel_no == blocked_channel[j]){
					blocked = true;
				} 
			}


			previous_channel[i] = view[i];
			int length = len(channel_no);
			if(!blocked && clicks == 0){
				clicks = length;
			}
			else if(i > 1 && channel_no == previous_channel[i-2]){
				clicks += 1;
			}
			else if(!blocked){
				int moves = cal(channel_no , previous_channel[i-1] , blocked_channel);
				if(moves <= length){
					clicks += moves;
				}
				else{
					clicks += length;
				}
			} 
		}
		
				
		System.out.println(clicks);
	}
}