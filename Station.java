import java.util.Scanner;

public class Station {
    final int max_detectives = 5;
    private Detective[] detectivesList;
    private String name;
    private int currentDetectiveCount;
    static int lastBadgeNumber = 0;

    //Create Station with its name and initialization
    public Station(String name) {
        detectivesList = new Detective[max_detectives];
        this.name = name;
        currentDetectiveCount = 0;
    }
    //Prints out detectives at the station
    public void printDetectives() {
        System.out.println("List of detectives for "+name);
        for (Detective detective : detectivesList) {
            if (detective != null) {
                System.out.print(detective.toString());
            }
        }
        System.out.println();
    }
    //Logic for hiring new detectives (Num of hire does not exceed max_detectives)
    public void hireDetective() {
        if (currentDetectiveCount < max_detectives) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New hire for " + name + "...Enter detective's name: ");
            String detectiveName = sc.nextLine();

            detectivesList[currentDetectiveCount] = new Detective(detectiveName, lastBadgeNumber + 1);
            lastBadgeNumber++;
            currentDetectiveCount++;
        }
        else {
            System.out.println("Can't hire any more detectives for " + name);
        }
    }


}
