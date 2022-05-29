public class CreditPaymentService {
    public double calculate(double credit, double years, double percentages) {
        double mec = -1 * (years * 12);
        double pc = percentages / 1200;
        double formula;
        formula = credit * (pc / (1 - Math.pow((1 + pc), mec)));
        return formula;
    }
}
