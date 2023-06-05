public class MontlyCCBalance
{
    public static void main(String[] args)
    {
       int initialBalance = 5000;
        double interestRate = 0.17;
        double firstMontlyCCBalance= initialBalance + (initialBalance * interestRate);
                System.out.println("the first month credit card balance is" +" "+firstMontlyCCBalance);
        initialBalance = 5850;
                double secondMonthCCBalance = initialBalance + (initialBalance * interestRate);
        System.out.println("the second month credit card balance is" +" "+ secondMonthCCBalance);
    }
}