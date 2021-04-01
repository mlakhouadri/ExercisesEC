package Exercise3;

public class PowerUp {

    int restoreHealth = 10;
    int increaseDamage = 4;
    int newHealth;
    int newDamage;

    void apply() {
        Spaceship spaceship = new Spaceship(10, 4);
        newHealth = spaceship.getHealth() + restoreHealth;
        newDamage = spaceship.getDamage() + increaseDamage;
        System.out.println("Health = " + newHealth);
        System.out.println("Damage = " + newDamage);
    }
}
