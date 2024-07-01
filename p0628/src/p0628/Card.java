package p0628;

public class Card {
	
	enum Kind{ SPADE,  DIAMOND, HEART, CLOVER } // 한정시킴 
	

	private int number;
	private Kind kind;
	// spade, SPADE, Spade - 모두 다른 문자로 인식됨 
	
	Card(){}
	Card(int number, Kind kind){
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public Kind getKind() {
		return kind;
	}
	
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	@ Override // annotation
	public String toString() {
		return String.format("%d,%s",number,kind);
	}
}
