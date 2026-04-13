interface Classify {
    String getDivision(double average);
}
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        double avg = 65.5;

        String division = r.getDivision(avg);

        System.out.println("Average: " + avg);
        System.out.println("Division: " + division);
    }
}