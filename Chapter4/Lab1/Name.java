package Lab1;

public class Name {
	
	String first;
	String middle;
	String last;
	public Name(String first, String middle, String last){
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	public String getFirst(){
		return this.first;
	}
	public String getMiddle(){
		return this.middle;
	}
	public String getLast(){
		return this.last;
	}
	public String firstMiddleLast(){
		return this.first + " " + this.middle + " " + this.last;
	}
	public String lastMiddleFirst(){
		return this.last + ", " + this.middle + " " + this.first;
	}
	public boolean equals(Name othername){
		return (this.firstMiddleLast() == othername.firstMiddleLast());
	}
	public String initials(){
		return "" + this.first.charAt(0) + this.middle.charAt(0) + this.last.charAt(0);
		
	}
	public int length(){
		return (this.first.length() + this.middle.length() + this.last.length());
	}
}
