package p0625;

public class Card {
	
	Card(){	}
	
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	int number;
	String kind;
	
	@Override
	public String toString() { // obj가 가지고 있는 메서드 중 하나
		return "["+kind+","+number+"]";
	}
	
	
}
