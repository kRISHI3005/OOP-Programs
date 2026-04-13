
interface Exam {
    boolean isPassed(int mark);
}


interface Classify {
    String getDivision(double average);
}


class Result implements Exam, Classify {

      @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // passing criteria
    }

       @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Practical28 {
    public static void main(String[] args) {
        Result result = new Result();

        int mark = 55;
        double average = 62.5;

               System.out.println("Is Passed: " + result.isPassed(mark));

             System.out.println("Division: " + result.getDivision(average));
    }
}