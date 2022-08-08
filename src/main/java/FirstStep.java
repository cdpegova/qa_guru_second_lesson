public class FirstStep {
    int storeFirstTeam;
    String firstTeam;
    int storeSecondTeam;
    String secondTeam;

    void result(){
        if (storeFirstTeam > storeSecondTeam) {
            System.out.print("Победила команда " + firstTeam);
        }
        else {
            System.out.println("Победила команда " + secondTeam);
        }
    }
}
