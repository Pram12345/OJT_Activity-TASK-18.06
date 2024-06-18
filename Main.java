public class Main{
    public static void main(String[] args){
        // Anonymous obj = new Anonymous(){
        //     public void show(){
        //         System.out.println("Hello Anonymous !!");
                
        //     }

        //     public void adit(int x){
        //         System.out.println(x);
                
        //     }
        // };
        // obj.show();
        // obj.adit(55);


        Anonymous lamda = () -> System.out.println("hay Anonymous !!");
        
        lamda.show();
    }
}