class CostOfPainting{
	public static void main(String args[]){
		int Interiorwalls = 6;
		int Exteriorwalls = 3;
		int InteriorWallCost = 18;
		int ExteriorwallsCost = 12;
		double[] area = {12.3,15.2,12.3,15.2,12.3,15.2,10.10,10.10,10.00};
		double sum = 0.00;
		for(int i = 0 ; i < area.length ;  i++){
			if(i < Interiorwalls){
				sum += area[i] * InteriorWallCost;
			}
			else{
				sum += area[i] * ExteriorwallsCost;
			}
		}
		System.out.println(sum);
	}
}


