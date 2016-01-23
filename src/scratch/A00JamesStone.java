package scratch;

/**
*
* @author James Stone
*/

public class A00JamesStone {  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Task 1 (see class definition)

        // Task 2
        double brobovskySergie = 2.65;
        double careyPrice = 2.06;
        double anttiNiemi = 2.45;
        double jaroslavHalak = 2.11;
        double joshHarding = 0.0;

        // E.g. initializing array to meaningful "null" values
        // double goalieArr[] = {-1.0, -1.0, -1.0, -1.0, -1.0};
        double goalieArr[] = new double[5]; // Initializes all values to 0.0
        goalieArr[0] = brobovskySergie;
        goalieArr[1] = careyPrice;
        goalieArr[2] = anttiNiemi;
        goalieArr[3] = jaroslavHalak;
        goalieArr[4] = joshHarding;


        // Manage a separate array with the names of the goalies
        String goalieNameArr[] = new String[5];
        goalieNameArr[0] = "Sergei Bobrovsky - CBJ";
        goalieNameArr[1] = "Carey Price - MTL";
        goalieNameArr[2] = "Antti Niemi - SJS";
        goalieNameArr[3] = "Jaroslav Halak - STL";
        goalieNameArr[4] = "Josh Harding - MIN";
        
        // Task 3
        
        for (int count = 0; count < goalieArr.length; count++) {
            if (goalieArr[count] <= -1) {
                System.out.println(goalieNameArr[count] + ": Implement logic");
            }
            else if (goalieArr[count] < 2) {
            	System.out.println("Excellent Goaltending");
            }	
            else if (goalieArr[count] >=2 && goalieArr[count] < 2.5) {
            	System.out.println("Strong Goaltending");
            }
            else if (goalieArr[count] >=2.5 && goalieArr[count] < 3) {
            	System.out.println("Fair Goaltending");
            }
            else if (goalieArr[count] >=3) {
            	System.out.println("Poor Goaltending");
            }
        }	
        
        // Task 4 (floating-point based)
        double fractionExcellent = 1.0/10.0;
        double fractionStrong = 1.0/2.0;
        double fractionFair = 1.0/5.0;
        double constantPoor = 10.0;

        for (int s = 10; s < 1000; s++)	{
        	double excellent = s * fractionExcellent;
        	double strong = s * fractionStrong;
        	double fair = s * fractionFair;
        	if (excellent + strong + fair + constantPoor == s) {
        		System.out.println(String.format("Fair Value = %s",fair));
        		break;
        	}
        }
        
        // Task 5 
        int salaryCap = 64300000;
        int averSalary = 2400000;

        while(int i < salaryCap; i++ * averSalary) {
            System.out.println(i);
        	break;
        }
    }
}