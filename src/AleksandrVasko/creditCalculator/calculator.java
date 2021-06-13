package AleksandrVasko.creditCalculator;


public class calculator {
    private int sumCredit = 0;
    private float stavka = 0.0F;
    private int month = 0;
    private float dopPlatej=0;


    calculator(int sumCredit, int month, float stavka,float dopPlatej) {
        this.sumCredit = sumCredit;
        this.month = month;
        this.stavka = stavka;
        this.dopPlatej=dopPlatej;
    }

    void podshet() {
        int periodCount = 1;
        float monthStartBalance = sumCredit;//баланс на начало месяца
        float payment =0;//размер платежа за период (месяц)
        float monthlyInterest ;//какую сумму от платежа составляет процент банку
        float monthlyPrincipal ; //сумма которая уходит на погашение тела кредита
        float monthEndBalance = 0;//сумма задолженности, которая остается на конец месяца, после того как был внесен очередной платеж
        float interestAmount = 0.0F;//сумма процентов
        float monthStavka = (float) Math.pow(1 + stavka / 12 / 100, 240);// месячная ставка
        System.out.println("MONTH,  STARING_BALANCE,  PAYMENT,  INTEREST,  PRINCIPAL,  ENDING_BALANCE,  TOTAL_INTEREST,  Доп_платеж");

        for (int i = 1; i <= month; i++) {
            periodCount = i;
            monthStartBalance -= payment;
            payment = (monthStartBalance * (stavka / 12 / 100) * monthStavka / (monthStavka - 1))+dopPlatej;
            monthlyPrincipal = (monthStartBalance * (stavka / 12/100));
            monthlyInterest = payment - monthlyPrincipal;
            monthEndBalance = monthStartBalance - payment;
            interestAmount += monthlyPrincipal;
            System.out.printf("%3d, %13.2f, %14.2f, %8.2f, %9.2f, %12.2f, %14.2f, %14.2f%n",
                    periodCount, monthStartBalance, payment, monthlyInterest, monthlyPrincipal, monthEndBalance, interestAmount,dopPlatej);
            if(monthStartBalance<0){
                break;
            }

        }


    }

}
