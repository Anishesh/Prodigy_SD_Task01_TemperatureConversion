import java.util.Scanner;
class TemperaturInput{
    String choose;
    float temp;
        public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose in which unit you want to enter the temperature C-Celcius/F-Farhenite/K-Kelvin:");
        choose=sc.nextLine().toUpperCase();
        System.out.println("Enter the temperature:");
        temp=sc.nextFloat();

        }
        public void convert(){
        float converted_temp1;
        float converted_temp2;
        switch(choose){
            case "C" : System.out.println("THE GIVEN TEMPERATURE IS IN CELSIUS");
                        System.out.println("==================================");
                        converted_temp1=(1.8f * temp) + 32.0f;
                        System.out.println(String.format("TEMPERATURE IN FARHENITE IS %.2f",converted_temp1));
                        converted_temp2=temp + 273.15f;
                        System.out.println(String.format("TEMPERATURE IN KELVIN IS %.2f",converted_temp2));
            break;

            case "K" : System.out.println("THE GIVEN TEMPERATURE IS IN KELVIN");
                        System.out.println("==================================");
                        converted_temp1 = temp - 273.15f;
                        System.out.println(String.format("TEMPERATURE IN CELSIUS IS %.2f",converted_temp1));
                        converted_temp2 = (temp - 273.15f) * 1.8f + 32.0f;
                        System.out.println(String.format("TEMPERATURE IN FARHENITE IS %.2f",converted_temp2));
            break;

            case "F" : System.out.println("THE GIVEN TEMPERATURE IS IN FARHENITE");
                        System.out.println("==================================");
                        converted_temp1 = (temp - 32.0f) / 1.8f;
                        System.out.println(String.format("TEMPERATURE IN CELSIUS IS %.2f",converted_temp1));
                        converted_temp2 = (temp - 32.0f) / 1.8f + 273.15f;
                        System.out.println(String.format("TEMPERATURE IN FARHENITE IS %.2f",converted_temp2));
            break;
             

            default:
                System.out.println("INAVLID UNIT.PLEASE ENTER C,F OR K");

        }
    }
                        


    }

class TemperatureConversion{
    public static void main(String args[]){
        TemperaturInput t1=new TemperaturInput();
        t1.read();
        t1.convert();
    }
}
   
