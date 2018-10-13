public class Task4 {
    public static void main(String[] args){
        String Enemy = "ZOMBIE";
        int damage = 265;
        switch (Enemy){
            case "UNDEAD":
                System.out.println(damage * 1.5);
                break;
            case "ZOMBIE":
                System.out.println(damage * 1.5);
                break;
            case "SAINT":
                System.out.println(damage / 2);
                break;
            case "ANIMAL":
                System.out.println(damage);
                break;
            case "HUMANOID":
                System.out.println(damage);
                break;
            case "PLANT":
                System.out.println(damage);
                break;
            case "GHOST":
                System.out.println(damage);
                break;
            default:
                System.out.println("I don't know what it is, so just run");

        }
    }
}
