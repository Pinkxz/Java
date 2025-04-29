package model;

public class ItemRaro extends Itens{

	private int ridNum;
	private String rdescr;
	private String rdeta1;
	private String rdeta2;
	private String rdeta3;
	
	public ItemRaro(int numSeque, int ridNum, String rdescr, String rdeta1, String rdeta2, String rdeta3) {
		super(numSeque);
		this.setRidNum(ridNum);
		this.setRdescr(rdescr);
		this.setRdeta1(rdeta1);
		this.setRdeta2(rdeta2);
		this.setRdeta3(rdeta3);
	}


	public int getRidNum() {
		return ridNum;
	}

	public void setRidNum(int ridNum) {
		this.ridNum = ridNum;
	}

	public String getRdescr() {
		return rdescr;
	}

	public void setRdescr(String rdescr) {
		this.rdescr = rdescr;
	}

	public String getRdeta1() {
		return rdeta1;
	}

	public void setRdeta1(String rdeta1) {
		this.rdeta1 = rdeta1;
	}

	public String getRdeta2() {
		return rdeta2;
	}

	public void setRdeta2(String rdeta2) {
		this.rdeta2 = rdeta2;
	}
	

	public String getRdeta3() {
		return rdeta3;
	}

	public void setRdeta3(String rdeta3) {
		this.rdeta3 = rdeta3;
	}

	@Override
	public String toString() {
		return "ItemRaro [ridNum=" + ridNum + ", rdescr=" + rdescr + ", rdeta1=" + rdeta1 + ", rdeta2=" + rdeta2 + "rdeta3="+ rdeta3 +"]";
	}
	
	
}
