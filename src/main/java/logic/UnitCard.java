package logic;

import java.util.Objects;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;

    // fields
    public UnitCard(String name, int bloodCost, int power, int health, String flavorText) {
        setName(name);
        setBloodCost(bloodCost);
        setPower(power);
        setHealth(health);
        setFlavorText(flavorText);
    }

    // setter & getter of name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Creature";
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    // setter & getter of bloodCost
    public void setBloodCost(int bloodCost) {
        this.bloodCost = Math.max(0, bloodCost);
    }
    public int getBloodCost() {
        return bloodCost;
    }

    // setter & getter of power
    public void setPower(int power) {
        this.power = Math.max(0, power);
    }
    public int getPower() {
        return power;
    }

    // setter & getter of health
    public void setHealth(int health) {
        this.health = Math.max(1, health);
    }
    public int getHealth() {
        return health;
    }

    //setter & getter flavorText
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }
    public String getFlavorText() {
        return flavorText;
    }

    // check same UnitCard with OtherCard
    public boolean equals(UnitCard other) {
        if(this == other) return true;
        if(Objects.equals(this.name, other.name)) return false;
    }

    public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
}


