public class Monster {
    private final String name;
    private final int damage;

    public Monster (String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public void growl(){
        System.out.printf("%s growled\n", this.name);

    }
    public void attack() {
        System.out.printf("Monster %s attacked with damage %d\n", this.name, this.damage);
    }
}
