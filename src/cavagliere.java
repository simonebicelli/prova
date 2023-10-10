public class cavagliere {
    private String name;
		private int health;
		private int power;
		private boolean oggetto;

	public cavagliere(String name, int health, int power, boolean oggetto) {
		System.out.println("personaggio cavagliere");
		this.name = name;
		this.health = health;
		this.power = power;
		this.oggetto = oggetto;
	}
public String gatname(){
    return name;
}
public int gethealth(){
    return health;
}
public int getpower(){
    return power;
}
public boolean getoggetto(){
    return oggetto;
}
}
