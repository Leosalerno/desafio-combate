package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armour;

	public Champion(String name, int life, int attack, int armour) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armour = armour;
	}
		
	public int getLife() {
		return life;
	}
	
	public int getAttack() {
		return attack;
	}


	public void takeDamage(int attack) {
		int damage = attack - armour;
		if (damage < 1) {
			damage = 1;
		}
		life = life - damage;
		if (life < 0) {
			life = 0;
		}
	}
	
	
	public String status() {
	    if (life == 0) {
	        return name + ": " + life + " de vida (morreu)";
	    }
	    return name + ": " + life + " de vida";
	}


	}
	
