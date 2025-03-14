package model;

public class Games {
	private String gsynopse;
	private String empresa;
	private String gname;
	private float score;
	
	public Games(String gsynopse, String empresa, String gname, float score) {
		super();
		this.setGsynopse(gsynopse);
		this.setEmpresa(empresa);
		this.setGname(gname);
		this.setScore(score);
	}
	public String getGsynopse() {
		return gsynopse;
	}
	public void setGsynopse(String gsynopse) {
		this.gsynopse = gsynopse;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Games synopse = " + gsynopse + ", empresa = " + empresa + ", name = " + gname + ", score = " + score;
	}
	
	
}
