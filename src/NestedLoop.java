
public class NestedLoop {

	public static void main(String[] args) {
		  int weeks = 3;
		    int days = 7;

		  for(int i = 1; i <= weeks; ++i) { //day and week start from 1 this outer loop for counting week
		     System.out.println("Week: " + i);
          for(int j = 1; j <= days; ++j) { //this inner loop for counting days
		      System.out.println("  Day: " + j);
		   }
		}
	}
}
