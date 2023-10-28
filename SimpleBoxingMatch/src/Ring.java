public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run() {
        if(isCheckWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                if(f1.onSet()){
                    System.out.println("===========Raunt===========");
                    System.out.println(f1.name + " punched");
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(f2.name + " has " + f2.health + " health left");
                    if(isWin()){
                        break;

                    }
                    System.out.println("--------------------------");
                    System.out.println(f2.name + " punched");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(f1.name + " has " + f1.health + " health left");
                    if(isWin()){
                        break;
                    }
                }else{
                    System.out.println("===========Raunt===========");
                    System.out.println(f2.name + " punched");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(f1.name + " has " + f1.health + " health left");
                    if(isWin()){
                        break;
                    }
                    System.out.println("--------------------------");
                    System.out.println(f1.name + " punched");
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(f2.name + " has " + f2.health + " health left");
                    if(isWin()){
                        break;
                    }
                }
            }
        }else {
            System.out.println("Invalid fighter division");
        }
    }
    boolean isCheckWeight(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if(this.f1.health == 0) {
            System.out.println(f2.name + " Won");
            return true;
        }
        if(this.f2.health == 0) {
            System.out.println(f1.name + " Won");
            return true;
        }
        return false;
    }
}
