package destroyzombie;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health *= 1.1;
                break;
            case 2:
                health *= 1.3;
                break;
            case 3:
                health *= 1.4;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 20 / 100;
    }

    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }

}

