
public class Wizard extends Human{
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human healed) {
		healed.setHealth(healed.getHealth() + this.getIntelligence());
		healed.displayHealth();
	}
	
	public void fireball(Human fireballed) {
		fireballed.setHealth(fireballed.getHealth() - (this.getIntelligence()*3));
		fireballed.displayHealth();
	}
	
	
	
	
}
