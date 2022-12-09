
public class Knight extends Player {
	
	private int HP;
	private int ATK;
	private String name;
	
	public Knight( ) { }
	public Knight(int HP, int ATK, String name)
	{
		super();
		this.HP = HP;
		this.ATK = ATK;
		this.name = name;
	}
	@Override
	public int getHP() {
		return this.HP;
	}
	@Override
	public int getATK() {
		return this.ATK;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Name: " + getName() + "\tHP: " + getHP() + "\tATK: " + getATK(); 
	}
	
}
