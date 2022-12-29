package library;

abstract class Item {
	private int id;
	private String Bname;
	private int no;

	public Item(int id, String Bname, int no) {
		this.id = id;
		this.Bname = Bname;
		this.no = no;
	}

	public String toString() {
		System.out.println("Informatiom about the Item");

		return "id=" + id + "\nTitle=" + Bname + "\nnumberof copies=" + no + "\n";

	}

	public void checkIn() {
		no = no + 1;
	}

	public void checkOut() {
		no = no - 1;
	}

	public void addItem(int id, String Bname, int no) {
		setId(id);
		setBname(Bname);
		setNo(no);
	}

	public void print() {
		System.out.println("Title  : " + Bname);
		System.out.println(" Id : " + id);
		System.out.println("Number of Copies : " + no);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}

abstract class WrittenItem extends Item {

	public WrittenItem(int id, String Bname, int no) {
		super(id, Bname, no);

	}

	public String toString() {
		return super.toString();

	}

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id);
	}

	public String getBname() {
		return super.getBname();
	}

	public void setBname(String bname) {
		super.setBname(bname);
	}

	public int getNo() {
		return super.getNo();
	}

	public void setNo(int no) {
		super.setNo(no);
	}

}

class Book extends WrittenItem {

	public Book(int id, String Bname, int no) {
		super(id, Bname, no);

	}

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id);
	}

	public String getBname() {
		return super.getBname();
	}

	public void setBname(String bname) {
		super.setBname(bname);
	}

	public int getNo() {
		return super.getNo();
	}

	public void setNo(int no) {
		super.setNo(no);
	}

}

class JournalPaper extends WrittenItem {
	private int yearofpublished;

	public JournalPaper(int id, String Bname, int no) {
		super(id, Bname, no);

	}

	public String toString() {
		return super.toString() + "nyear of published : " + getYearofpublished() + "\n";

	}

	public int getYearofpublished() {
		return yearofpublished;
	}

	public void setYearofpublished(int yearofpublished) {
		this.yearofpublished = yearofpublished;
	}

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id);
	}

	public String getBname() {
		return super.getBname();
	}

	public void setBname(String bname) {
		super.setBname(bname);
	}

	public int getNo() {
		return super.getNo();
	}

	public void setNo(int no) {
		super.setNo(no);
	}

}

abstract class MediaItem extends Item {
	private String runtime;

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public MediaItem(int id, String Mname, int No) {
		super(id, Mname, No);

	}

	public String toString() {
		return super.toString() + "run time of video : " + getRuntime() + "\n";

	}

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id);
	}

	public String getMname() {
		return super.getBname();
	}

	public void setMname(String Mname) {
		super.setBname(Mname);
	}

	public int getNo() {
		return super.getNo();
	}

	public void setNo(int No) {
		super.setNo(No);
	}

}

class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearreleased;

	public Video(int id, String Mname, int No) {
		super(id, Mname, No);

	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearreleased() {
		return yearreleased;
	}

	public void setYearreleased(int yearreleased) {
		this.yearreleased = yearreleased;
	}

	public String toString() {
		return super.toString() + "Director Name : " + getDirector() + "\ngenre : " + getGenre() + "\nyearreleased : "
				+ getYearreleased() + "\n";
	}
}

class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(int mid, String Medianame, int No) {
		super(mid, Medianame, No);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String toString() {
		return super.toString() + "Artist : " + getArtist() + "\ngenre : " + getGenre() + "\n";
	}

}

public class ModelItems {
	public static void main(String[] args) {
		JournalPaper jp = new JournalPaper(001, "TOI", 10);
		Book b = new Book(002, "Computer", 33);
		Video v = new Video(100, "Bahubali", 43);
		CD c = new CD(200, "Bahubali 2", 20);

		jp.setYearofpublished(1999);
		System.out.println(jp.toString());

		System.out.println(b.toString());

		v.setRuntime("300 minutes");
		v.setDirector("SS.Rajamoli");
		v.setGenre("Action");
		v.setYearreleased(2010);
		System.out.println(v.toString());

		c.setArtist("Prabhas");
		c.setGenre("Drama");
		c.setRuntime("259 minutes");

		System.out.println(c.toString());
		c.addItem(600, "JDK", 80);
		System.out.println(c.toString());
	}
}