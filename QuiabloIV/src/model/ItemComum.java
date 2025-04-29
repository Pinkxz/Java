package model;

public class ItemComum extends Itens {

	private int idNum;
	private String descr;
	private String deta1;
	private String deta2;
	
	public ItemComum(int numSeque, int idNum, String descr, String deta1, String deta2){
		super(numSeque);
		this.setIdNum(idNum);
		this.setDescr(descr);
		this.setDeta1(deta1);
		this.setDeta2(deta2);
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
			
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDeta1() {
		return deta1;
	}

	public void setDeta1(String deta1) {
		this.deta1 = deta1;
	}

	public String getDeta2() {
		return deta2;
	}

	public void setDeta2(String deta2) {
		this.deta2 = deta2;
	}

	@Override
	public String toString() {
		return "ItemComum [idNum=" + idNum + ", descr=" + descr + ", deta1=" + deta1 + ", deta2=" + deta2 + "]";
	}
	
}
