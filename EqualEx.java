public class EqualEx{
    static class dog {
        String name;

        dog(String name) {
            this.name = name;
        } 
    }
    public static void main(String[] args) {
    dog d1 = new dog("Rex");
    dog d2 = new dog("Rex");

   System.out.println("dog equals" + d1.equals(d2));
    
    }

}


