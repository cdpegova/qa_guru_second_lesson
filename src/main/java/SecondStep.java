import java.util.Scanner;

public class SecondStep {

    public static void main(String[] args){
        FirstStep firstStep = new FirstStep();
        Scanner scanner = new Scanner(System.in);
        firstStep.firstTeam =  scanner.nextLine();
        firstStep.secondTeam = scanner.nextLine();
        firstStep.storeFirstTeam = scanner.nextInt();
        firstStep.storeSecondTeam = scanner.nextInt();
        firstStep.result();
    }
}
