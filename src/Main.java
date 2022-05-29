public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
      
        System.out.println();
        System.out.println("Сумма кредита " + (int)Math.round(1_000_000) + " рублей" + "\n" + "Процентная ставка " + 9.99 + "%" + "\n" + "Срок "+ (int)Math.round(1) + " лет");
        System.out.println("Ежемесячный платеж " + (int)Math.round(service.calculate(1_000_000,1, 9.99)) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита " + (int)Math.round(1_000_000) + " рублей" + "\n" + "Процентная ставка " + 9.99 + "%" + "\n" + "Срок "+ (int)Math.round(2) + " лет");
        System.out.println("Ежемесячный платеж " + (int)Math.round(service.calculate(1_000_000,2, 9.99)) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита " + (int)Math.round(1_000_000) + " рублей" + "\n" + "Процентная ставка " + 9.99 + "%" + "\n" + "Срок "+ (int)Math.round(3) + " лет");
        System.out.println("Ежемесячный платеж " + (int)Math.round(service.calculate(1_000_000,3, 9.99)) + " рублей");
    }
}
