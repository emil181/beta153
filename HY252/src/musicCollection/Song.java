package musicCollection;

public class Song {
	private String compName;
	private String composer;
	private String filePath;
	
	Song(String filePath){
		this.setFilePath(filePath);
	}

	Song(String filePath,String compName,String composer){
		this.setFilePath(filePath);
		this.setCompName(compName);
		this.setComposer(composer);
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
