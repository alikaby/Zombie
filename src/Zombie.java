public class Zombie extends Monster {

    public Zombie (String name) {
        super(name + " the Zombie",5);
    }

    public void growl(){
        System.out.printf("Raaaauuughhhh ");
        super.growl();
    }

    public void attack() {
        super.attack();
    }
}