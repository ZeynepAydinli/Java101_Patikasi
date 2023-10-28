public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int hit(Fighter competitor) {
        if(competitor.isDodge()){
            System.out.println(competitor.name + " dodge!!!");
            return competitor.health;
        }
        if(competitor.health - this.damage < 0){
            return 0;
        }
        return competitor.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
    boolean onSet() {
        double randomNum = Math.random() * 100;
        return randomNum > 50;
    }
}
