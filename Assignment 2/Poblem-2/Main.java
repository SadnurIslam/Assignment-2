import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int k=0;

        System.out.println("Press the respective number of a unit you want to select.");
        System.out.print("Convert from: ");
        String unitFrom= in.next();
        System.out.print("Convert to: ");
        String unitTo= in.next();
        System.out.print("value : ");
        double value = in.nextDouble();
        double output=0;
        VolumeConverter volume = new VolumeConverter();
        LengthConverter length = new LengthConverter();
        WeightConverter weight = new WeightConverter();

        if(unitFrom.equals("fl.oz")){
            if(unitTo.equals("l")){
                output= volume.fluidOunceToLiter(value);
            }
            else if(unitTo.equals("ml")){
                output= volume.fluidOunceToLiter(value)*1000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("gal")){
            if(unitTo.equals("l")){
                output= volume.gallonToLiter(value);
            }
            else if(unitTo.equals("ml")){
                output= volume.gallonToLiter(value)*1000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("oz")){
            if(unitTo.equals("kg")){
                output= weight.ounceToKilogram(value);
            }
            else if(unitTo.equals("g")){
                output= weight.ounceToKilogram(value)*1000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("lb")){
            if(unitTo.equals("kg")){
                output= weight.poundToKilogram(value);
            }
            else if(unitTo.equals("g")){
                output= weight.poundToKilogram(value)*1000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("in")){
            if(unitTo.equals("km")){
                output= length.inchToKilometer(value);
            }
            else if(unitTo.equals("m")){
                output= length.inchToKilometer(value)*1000;
            }
            else if(unitTo.equals("cm")){
                output= length.inchToKilometer(value)*100000;
            }
            else if(unitTo.equals("mm")){
                output= length.inchToKilometer(value)*1000000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("ft")){
            if(unitTo.equals("km")){
                output= length.feetToKilometer(value);
            }
            else if(unitTo.equals("m")){
                output= length.feetToKilometer(value)*1000;
            }
            else if(unitTo.equals("cm")){
                output= length.feetToKilometer(value)*100000;
            }
            else if(unitTo.equals("mm")){
                output= length.feetToKilometer(value)*1000000;
            }
            else{
                k=1;
            }
        }

        else if(unitFrom.equals("mi")){
            if(unitTo.equals("km")){
                output= length.mileToKilometer(value);
            }
            else if(unitTo.equals("m")){
                output= length.mileToKilometer(value)*1000;
            }
            else if(unitTo.equals("cm")){
                output= length.mileToKilometer(value)*100000;
            }
            else if(unitTo.equals("mm")){
                output= length.mileToKilometer(value)*1000000;
            }
            else{
                k=1;
            }
        }

        else{
            k=1;
        }

        if(k==0)
            System.out.printf("%.2f %s = %.5f %s\n",value,unitFrom,output,unitTo);
        else
            System.out.println("incompatible conversions!");

    }
}
