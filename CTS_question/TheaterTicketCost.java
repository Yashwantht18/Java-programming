import java.util.Scanner;
class TheaterTicketCost{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of ticket: ");
		int ticket = in.nextInt();

		if(ticket < 5 || ticket > 40){
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		else{
			System.out.println("Do you want refreshment: ");
			String refreshment = in.next();
			System.out.println("Do you want coupon code: ");
			String couponCode = in.next();

			System.out.println("If you want a circle, Enter k or q: ");
			String circle = in.next(); 			

			double cost = 0.00;
	
			if(circle.equals("k") || circle.equals("K")){
				cost += 75 * ticket;
				//System.out.println(cost+ " "+ " k");
			}
			if(circle.equals("q") || circle.equals("Q")){
				cost += 150 * ticket;
				//System.out.println(cost+ " "+ " q");
			}
			if(ticket > 20){
				cost = cost - 10/100.0 * cost;
				//System.out.println(cost+ " "+ " 10");
			}
			if(couponCode.equals("y") || couponCode.equals("Y")){
				cost -= 2/100.0 * cost;
				//System.out.println(cost+ " "+ " cc");
			}
			
			if(refreshment.equals("y") || refreshment.equals("Y")){
				cost += 50 *  ticket;
				//System.out.println(cost+ " "+ " re");
			}
			
			

			System.out.println(cost);
		}

		
	}
}