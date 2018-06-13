
public class Ninja extends Human{
	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human jacked) {
		jacked.setHealth(jacked.getHealth()- this.getStealth());
		jacked.displayHealth();
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
		this.displayHealth();
	}
	
	
}
