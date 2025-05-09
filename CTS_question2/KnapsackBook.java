import java.util.*;
class KnapsackBook{
	public static void main(String args[]){

		ArrayList<Integer> marking_zero_price = new ArrayList<>();
		ArrayList<Integer> marking_one_price = new ArrayList<>();
		ArrayList<Integer> marking_zero_value = new ArrayList<>();
		ArrayList<Integer> marking_one_value = new ArrayList<>();

		ArrayList<Integer> max_one_price = new ArrayList<>();
		ArrayList<Integer> max_zero_price = new ArrayList<>();
		
		ArrayList<Integer> max_one_value = new ArrayList<>();
		ArrayList<Integer> max_zero_value = new ArrayList<>();

		ArrayList<Integer> max_value = new ArrayList<>();
		ArrayList<Integer> max_price = new ArrayList<>();
		

		int Totalprice = 15;
		int[] serialNo = {1,2,3,4};
		int[] value = {6,5,7,4	};
		int[] price = {5,4,6,3};
		int[] marking = {1,1,1,1};

		for(int i = 0 ; i < marking.length ; i++){
			if(marking[i] == 0){
				marking_zero_price.add(price[i]);
			}
		}
		for(int i = 0 ; i < marking.length ; i++){
			if(marking[i] == 1){
				marking_one_price.add(price[i]);
			}
		}

		for(int i = 0 ; i < value.length ; i++){
			if(marking[i] == 0){
				 marking_zero_value.add(value[i]);
			}
		}
		
		for(int i = 0 ; i < value.length ; i++){
			if(marking[i] == 1){
				 marking_one_value.add(value[i]);
			}
		}
		
		
		// not calulate
		if(marking_zero_price.size() != 0){
			for(int i = 0 ; i < marking_zero_price.size()-1 ; i++){
				for(int j = i+1 ; j < marking_zero_price.size(); j++){
					int sum = marking_zero_price.get(i) + marking_zero_price.get(j);
					max_zero_price.add(sum);
				}
				
			}
		}
		

		if(marking_one_price.size() != 0){
			for(int i = 0 ; i < marking_one_price.size()-1 ; i++){
				for(int j = i+1 ; j < marking_one_price.size(); j++){
					int sum = marking_one_price.get(i) + marking_one_price.get(j);
					max_one_price.add(sum);
				}
				
			}
		}

		// not calculate
		if( marking_zero_value.size() != 0){
			for(int i = 0 ; i < marking_zero_value.size()-1 ; i++){
				for(int j = i+1 ; j < marking_zero_value.size(); j++){
					int sum = marking_zero_value.get(i) + marking_zero_value.get(j);
					max_zero_value.add(sum);
				}
				
			}
		}

		if( marking_one_value.size() != 0){
			for(int i = 0 ; i < marking_one_value.size()-1 ; i++){
				for(int j = i+1 ; j < marking_one_price.size(); j++){
					int sum = marking_one_value.get(i) + marking_one_value.get(j);
					max_one_value.add(sum);
				}
				
			}
		}

		if(max_zero_price.size() != 0 &&  max_one_price.size() != 0){	
			for(int i = 0 ; i < max_zero_price.size() ; i++){
				for(int j = 0 ; j < max_one_price.size(); j++){
					int sum = max_zero_price.get(i) + max_one_price.get(j);
					if(sum <= Totalprice){
						max_price.add(sum);
					}
					else{
						max_price.add(0);
					}
				}
				
			}
		}
		else if(max_zero_price.size() != 0){
			
		}
		else{
			max_price = max_one_price;
		}

		
		if(marking_zero_price.size() != 0 && max_one_price.size() != 0){
			for(int i = 0 ; i < marking_zero_price.size() ; i++){
				for(int j = 0 ; j < max_one_price.size(); j++){
					int sum = marking_zero_price.get(i) + max_one_price.get(j);
					//System.out.println(sum);
					if(sum <= Totalprice){
						max_price.add(sum);
					}
					else{
						max_price.add(0);
					}
				}			
			}
		}
	
		if(max_zero_value.size() != 0 && max_one_value.size() != 0){
			for(int i = 0 ; i < max_zero_value.size() ; i++){
				for(int j = 0 ; j < max_one_value.size(); j++){
					int sum = max_zero_value.get(i) + max_one_value.get(j);
					max_value.add(sum);
					
				}
			
			}
		}
		else if(max_zero_value.size() != 0){

		}
		else{
			max_value = max_one_value;
		}

		if(marking_zero_value.size() != 0 && max_one_value.size() != 0){
			for(int i = 0 ; i < marking_zero_value.size() ; i++){
				for(int j = 0 ; j < max_one_value.size(); j++){
					int sum = marking_zero_value.get(i) + max_one_value.get(j);
					max_value.add(sum);
				
				}
			
			}
		}
		
		
		System.out.println();
		for(int i = 0 ; i < max_price.size() ; i++){
			if(max_price.get(i) <= Totalprice){
				List<Integer> arr = new ArrayList<>(max_value.subList(i , max_value.size()));
				//for(int j = 0 ; j < arr.size() ; j++){
				//	System.out.print(arr.get(j) + " " );
				//}
				//System.out.println();
				int max = Collections.max(arr);
				int index = max_value.indexOf(max);
				if(i == index && max_price.get(i) != 0){
					System.out.println(max_price.get(i));
					break;
				}
			}				
		}

		

		

		
		

	}
}