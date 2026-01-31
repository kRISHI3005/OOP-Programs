class LoanCalculator1 {

    // Home loan
    double calculateEMI(int principal, int time, float rate) {
        double r = rate / (12 * 100);
        int t = time * 12;

        return (principal * r * Math.pow(1 + r, t)) /
               (Math.pow(1 + r, t) - 1);
    }

    // Vehicle loan
    double calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int t = time * 12;

        return (principal * r * Math.pow(1 + r, t)) /
               (Math.pow(1 + r, t) - 1);
    }

    // Personal loan (fixed 10% interest)
    double calculateEMI(int principal, int time) {
        double r = 10.0 / (12 * 100);
        int t = time * 12;

        return (principal * r * Math.pow(1 + r, t)) /
               (Math.pow(1 + r, t) - 1);
    }

    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        // Home loan
        double homeEMI = loan.calculateEMI(5000000, 20, 8.5f);
        System.out.println("Home Loan EMI: ₹" + homeEMI);

        // Vehicle loan
        double vehicleEMI = loan.calculateEMI(800000, 5, 9.2);
        System.out.println("Vehicle Loan EMI: ₹" + vehicleEMI);

        // Personal loan
        double personalEMI = loan.calculateEMI(200000, 2);
        System.out.println("Personal Loan EMI: ₹" + personalEMI);
    }
}
