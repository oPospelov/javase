public class Task2 {
    public static void main(String[] args){
        int countKillTanksFirstGamer1 = 8;
        int countKillTanksFirstGamer2 = 7;
        int point1 = countKillTanksFirstGamer1 * 100;
        int point2 = countKillTanksFirstGamer2 * 100;
        if (point1 > point2) {
            point1 = point1 + 1000;
            System.out.println("Первый игрок уничтожил больше танков, и получает бонус +1000, было - " + countKillTanksFirstGamer1 * 100 + " Стало - " + point1 + " У второго игрока - " + point2);}
        if (point2 > point1){
            point2 = point2 +1000;
            System.out.println("Второй игрок уничтожил больше танков, и получает бонус +1000, было - " + countKillTanksFirstGamer2 * 100 + " Стало - " + point2 + " У пераого игрока - " + point1);}
    }

}
