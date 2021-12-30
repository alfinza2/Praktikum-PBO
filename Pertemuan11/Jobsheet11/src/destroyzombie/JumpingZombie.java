package destroyzombie;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health *= 1.3;
                break;
            case 2:
                health *= 1.4;
                break;
            case 3:
                health *= 1.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 10 / 100;
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}


