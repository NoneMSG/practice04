package prob02;

public class Book {
	private int num;
	private String title;
	private String author;
	private int stateCode;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public Book(int num , String title, String author ){
		this.num =num;
		this.title=title;
		this.author=author;
		this.stateCode=1;
	}
	public void rent(){
		//this.stateCode = 0;
		this.setStateCode(0);
		System.out.println(this.title+"이(가) 대여 됐습니다.");
	}
	public void print(){
		String temp="";
		if(this.stateCode==0){temp="대여중";}else {temp="재고있음";}
		System.out.println("책 제목:"+this.title+", 작가: "+this.author
				+", 대여 유무 :"+temp);
	}
}
