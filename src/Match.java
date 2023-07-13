import java.util.Random;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void start() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                if (isWin() == true) {
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.health);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.health);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.health);
                    if (isWin()) {
                        break;
                    }

                }
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}

