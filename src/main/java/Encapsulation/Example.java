package Encapsulation;

public class Example {
    public static void main(String[] args) {
        Amazon customer=new Amazon();
        float payableAmount=customer.Transaction(1000);
        System.out.println("Your total payable amount is: "+payableAmount);
    }
}
class Amazon {
    float Transaction(float amt) {
        GPay gpayObj=new GPay();
        gpayObj.setTxnCharge(0.05f);
        float totalAmt=amt+(amt*gpayObj.getTxnCharge());
        return totalAmt;
    }
}
class GPay {
    private float txnCharge=0.05f;
    public void setTxnCharge(float newCharge) {
        if (newCharge<=0.-5f) {
            System.out.println("Invalid TxnCharge");
            return;
        }
        txnCharge=newCharge;
    }
    public float getTxnCharge() {
        return txnCharge;
    }
}
