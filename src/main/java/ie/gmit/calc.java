//Darragh Freeley
//Class to add numbers
//date
//email

package ie.gmit;

public class calc {
    private int firstNum;
    private int secondNum;

    public calc(){
        this.firstNum = 0;
        this.secondNum = 0;
    }

    public calc(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
}
