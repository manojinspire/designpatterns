package Adapter;

public class PhonePay {

    private BankAdapter bankAdapter ;

    public PhonePay(BankAdapter bankAdapter){
        this.bankAdapter = bankAdapter ;
    }
}
