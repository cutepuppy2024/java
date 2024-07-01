package p0701;

public class Card {
	// 캡슐화
	private String password;
	private int number;
	private String kind;
	
	Card(){} // 기본생성자
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	public Card(int number, String password, String kind) {
		super();
		this.number = number;
		this.password = password;
		this.kind = kind;
	}
	
	
	public String getPassword(String id) {
		if(!(id.equals("admin"))){
				return "";
			}
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public int getKind() {
		return this.number;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
		
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		if(number>13 || number<0) {
			return;
		}
		this.number = number;
		
	}
	
	@Override
	public String toString() {
		return kind+","+number;
	}
	
}
