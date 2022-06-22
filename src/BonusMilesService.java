public class BonusMilesService {
    public int calculate(int cost) {
        int toEarnMiles = 20;
        int miles = cost / toEarnMiles;
        return miles;
    }
}
