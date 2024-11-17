public class NPE {
 //NullPointerException
    public static void main(String[] args){

        String str = null;

        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println("null cannot be casted to uppercase");
        }

    }
    
}
