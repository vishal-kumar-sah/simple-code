public class Break_InLoop {
    public static void main(String[] args) {
        int a=1;
        while (a<=10){
            System.out.println(a);
            System.out.println("test");
            if (a==3){
                System.out.println("ending the loop");
                break;
            }
            a++;
        }
        System.out.println("finish your loop");
    }
}
