public class MarriedPersonTax {
    public double incomeTax(double income){
        if(income<=16000)
            return income*0.1;
        else if(income>16000 && income<=64000)
            return 1600+income*0.15;
        else
            return 8800+income*0.25;
    }
}
