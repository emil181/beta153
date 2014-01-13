package MMC;

public class AlgorithmicComposition extends Composition {
	
	private int num;
	public AlgorithmicComposition(String compName, String composer,int num) {
		super(compName, composer);
		this.setNum(num);
		
	}

	public AlgorithmicComposition(String compName, String composer,String instrument,int num) {
		super(compName, composer, instrument);
		this.setNum(num);
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	void compose() {
		// TODO Auto-generated method stub

	}

}
