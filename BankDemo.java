
class Bank {
    void interestRate() {
        System.out.println("General bank interest rate");
    }
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI interest rate is 10%");
    }
}

class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC interest rate is 12%");
    }
}

class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI interest rate is 14%");
    }
}

public class BankDemo {
    public static void main(String[] args) {
    
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        sbi.interestRate();
        hdfc.interestRate();
        icici.interestRate();
    }
}
