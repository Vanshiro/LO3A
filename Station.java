import java.util.Scanner;

public class Station {
    final int max_detectives = 5;
    private Detective[] detectivesList;
    private String name;
    private int currentDetectiveCount;
    static int lastBadgeNumber = 0;

    public Station(String name) {
        detectivesList = new Detective[max_detectives];
        this.name = name;
        currentDetectiveCount = 0;
    }

    public void printDetectives() {
        for (Detective detective : detectivesList) {
            if (detective != null) {
                System.out.println(detective);
            }
        }
    }

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
