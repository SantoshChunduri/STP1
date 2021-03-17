public class MainClass {

    public MainClass(){

    }
    public int distace_converter(int km){
        double miles = km*1.6;
        return (int) miles;
    }
    public int weight_converter(int kg){
        double pound = 2.2 * kg;
        return (int)pound;
    }
    public int temperature_converter(int centi){
        double fahranheit = (centi*1.8) + 32;
        return (int) fahranheit;
    }
    public int volume_converter(int lt){
        double gallons = lt/3.78541;
        return (int) gallons;
    }
}
