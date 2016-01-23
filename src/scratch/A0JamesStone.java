package scratch;

public class A0JamesStone {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        // Version 1: just the code
        System.out.println("FINAL    1ST    2ND   3RD    OT       SO       T    ");
        System.out.println("-------------------------------------------------");
        System.out.println("SJS    |  1  |  0  |  1  |  0  |  (2 - 2)  |  3  |");
        System.out.println("CHS    |  0  |  0  |  2  |  0  |  (0 - 2)  |  2  |");
        System.out.println();
        
        // Version 2: separate methods for each logical step
    
    	printHeader();
        printVisitorScores();
        printHomeScores();
        printReturn();
       
        // Version 3: uses print method instead of println
     
    	System.out.print("FINAL	1ST    2ND   3RD    OT       SO       T    ");
        System.out.print("\n");
        System.out.print("-------------------------------------------------");
        System.out.print("\n");
        System.out.print("SJS    |  1  |  0  |  1  |  0  |  (2 - 2)  |  3  |");
        System.out.print("\n");
        System.out.print("CHS    |  0  |  0  |  2  |  0  |  (0 - 2)  |  2  |");
        System.out.print("\n");
    }
    
    /**
     * Prints the head of the table
     */
    public static void printHeader(){
        System.out.println("FINAL	1ST    2ND   3RD    OT       SO       T    ");
        System.out.println("-------------------------------------------------");
    }
    
    /**
     * prints the visiting team's scores
     */
    public static void printVisitorScores(){
        System.out.println("SJS    |  1  |  0  |  1  |  0  |  (2 - 2)  |  3  |");
    }

    /**
     * prints the home team's scores
     */
    public static void printHomeScores(){
        System.out.println("CHG    | 0  |  0  |  2  |  0  |  (0 - 2)  |  2  |");
    }
    
    /**
     * prints extra line
     */
    public static void printReturn(){
        System.out.println();
    }
}