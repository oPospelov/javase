public class Task3 {
    public static void main(String[] args){
        int hp = 49;
        if (hp < 100){
            if (hp < 75){
                if (hp < 50){
                    if (hp < 25){
                        System.out.println("Red");
                    }
                else System.out.println("Orange");
                }
            else System.out.println("Yellow");
            }
        else System.out.println("Green");
        }

    }

}
