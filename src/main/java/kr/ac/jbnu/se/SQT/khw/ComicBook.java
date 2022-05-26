package kr.ac.jbnu.se.SQT.khw;

public class ComicBook implements BookIF {
	private String name;
	private boolean isBorrowed;
	
	public ComicBook(String name) {
		this.name = name;
		isBorrowed = false;
	}
	
	@Override
	public String getName() { return name; }

	@Override
	public boolean isBorrowed() { return isBorrowed; }

	@Override
	public void setBorrowed(boolean isBorrowed) { this.isBorrowed = isBorrowed; }
}
