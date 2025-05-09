class NoOfVechicles{
	public static void main(String args[]){
		int Vechicles = 6;
		int wheelers = 18;
		int copy = wheelers;
		int TwoWheeler = 0;
		int FourWheeler = 0;
		if(Vechicles < 0){
			System.out.println("-1");
		}
		else{
			while(wheelers > 0){
				if(1 * 2 + 1 * 4 <= wheelers && (TwoWheeler+FourWheeler)+2 <= Vechicles){
					TwoWheeler++;
					FourWheeler++;
					wheelers -= 1 * 2 + 1 * 4;
						
				}
				else if(1 * 4 <= wheelers && TwoWheeler+(FourWheeler+1) <= Vechicles){
					FourWheeler++;
					wheelers -= 1 * 4;
					
				}
				else if(1 * 2 <= wheelers && (TwoWheeler+1)+FourWheeler <= Vechicles){
					TwoWheeler++;
					wheelers -= 1 * 2;
					
				}
			}
		}
		System.out.println("No of Two Wheelers : " + TwoWheeler);
		System.out.println("No of Four Wheelers : " + FourWheeler);
	}
}