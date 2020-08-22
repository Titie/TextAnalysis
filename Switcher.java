public class Switcher {

    String Manufacturers;
    String PowerTypes;
    String Pricing;
    String Quality;
    int Voltage;

    public Switcher( String Manufacturers, String PowerTypes, String Pricing, String Quality,  int Voltage) {

             this.Manufacturers=Manufacturers;
             this.PowerTypes=PowerTypes;
             this.Pricing=Pricing;
             this.Quality=Quality;
             this.Voltage=Voltage;
    }

    public void TurnOn() {
        System.out.println("ON");
    }
    public void TurnOff() {
        System.out.println("OFF");
    }

   public static void main (String[] args) 
    { 
        // this would invoke default constructor. 
        Switcher obj = new Switcher(); 
  
        // Default constructor provides the default values to the object like 0, null
        System.out.println("Manufacturers "+obj.Manufacturers);
        System.out.println("PowerTypes "+obj.PowerTypes);
        System.out.println("Pricing "+obj.Pricing);
        System.out.println("Quality "+obj.Quality);
        System.out.println("Port "+obj.Manufacturers);
    }
}