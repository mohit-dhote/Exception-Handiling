public class NumberFE {
    public static void main(String[] args) {
        String str = "mohit";

        try {
            int a = Integer.parseInt(str);
         System.out.println(a);
        }
        catch(NumberFormatException e){
            
            System.out.println(str + " cannot be converted to integer");
        }
       
    }
    
}
