import java.util.Scanner;
class CourseAvailablity{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String[] course = new String[20];
		System.out.println("Enter no of course: ");
		int CourseCount = in.nextInt();
		Boolean find = false;

		if(CourseCount < 0 || CourseCount > 20){
			System.out.println("Invalid Range");
		}
		else{
			for(int i = 0 ; i < CourseCount ; i++){
				System.out.println("Enter course " + (i+1) + " : ");
				course[i] = in.next();
			}
			
			System.out.println("Enter the course to be searched: ");
			String CourseSearch = in.next();

			for(int i = 0 ; i < CourseCount ; i++){
				if(CourseSearch.equals(course[i])){
					System.out.println(CourseSearch + " course is available");
					find = true;
					break;
				}
			}
			if(!find){
				System.out.println(CourseSearch + " course is not available");
			}
		}
	}
} 