public class MainClass {

    public MainClass(){

    }
    public int hcf_calculator(int num1,int num2){
        int temp1 = num1;
        int temp2 = num2;

        while(temp2 != 0){
            int temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        return hcf;
    }
    public int lcm_calculator(int num1,int num2){
        int temp1 = num1;
        int temp2 = num2;

        while(temp2 != 0){
            int temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        int lcm = (num1*num2)/hcf;
        return lcm;
    }

}
