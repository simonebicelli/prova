public class Stregone {
    
    private String name;
		private int health;
		private int power;
		private boolean oggetto;
		
		public Stregone(String name, int health, int power, boolean oggetto){
        this.name = name;
        this.health = health;
        this.oggetto = oggetto;
    }
    public String getname(){
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
