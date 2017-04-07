package metier;

public class Paire {

	private Object premier;
	private Object second;
	
	public Paire(Object premier, Object second) {
		super();
		this.premier = premier;
		this.second = second;
	}
	
	public Object getPremier(){
		
		return premier;
	}
	
	public Object getSecond(){
		return second;
	}
	
}
