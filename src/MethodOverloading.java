 class MethodOverloading {
    static void text(int x){
        System.out.println(x);
    }
    static void text (int y, String z){
        System.out.println(y + " and " + z);
    }
    static void text (String a){
        System.out.println(a);
    }
    static void text(double b){
        System.out.println(b);
    }

     public static void main(String[] args) {
        text(12345);
        text(123,"abc");
        text("54abcd");
        text(3.89);
     }
}
