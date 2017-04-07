package metier;

public class PaireGenerique <T> {
	

	private T premier;
	private T second;
	
	public PaireGenerique (T premier, T second) {
		super();
		this.premier = premier;
		this.second = second;
	}
	
	public T getPremier(){
		
		return premier;
	}
	
	public T getSecond(){
		return second;
	}

	@Override
	public String toString() {
		return "PaireGenerique [premier=" + premier + ", second=" + second + "]";
	}

}
