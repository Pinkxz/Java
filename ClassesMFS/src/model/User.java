package model;

import java.io.FileInputStream;

public class User {
	//Nome de Usuario
	private String nick_Name;
	
	//Informacoes sobre os recursos
	private short total_Dropped;
	private short total_Watched;
	private short total_Played;
	
	//Informacoes de Usuario
	private String about_Me;
	private String dT_Ingressao;
	
	//Para armazenar a imagem em bytes(BLOB em SQL)
//	private FileInputStream fis;
//	private int tamanho; 
	
	
	public User(String nick_Name, short total_Dropped, short total_Watched, short total_Played, String about_Me,
			String dT_Ingressao) {
		super();
		this.setNick_Name(nick_Name);
		this.setTotal_Dropped(total_Dropped);
		this.setTotal_Watched(total_Watched);
		this.setTotal_Played(total_Played);
		this.setAbout_Me(about_Me);
		this.setDT_Ingressao(dT_Ingressao);
	}
	
	//Metodos acessores
	public String getNick_Name() {
		return nick_Name;
	}
	public void setNick_Name(String nick_Name) {
		this.nick_Name = nick_Name;
	}
	
	public short getTotal_Dropped() {
		return total_Dropped;
	}
	public void setTotal_Dropped(short total_Dropped) {
		this.total_Dropped = total_Dropped;
	}
	
	public short getTotal_Watched() {
		return total_Watched;
	}
	public void setTotal_Watched(short total_Watched) {
		this.total_Watched = total_Watched;
	}
	
	public short getTotal_Played() {
		return total_Played;
	}
	public void setTotal_Played(short total_Played) {
		this.total_Played = total_Played;
	}
	
	public String getAbout_Me() {
		return about_Me;
	}
	public void setAbout_Me(String about_Me) {
		this.about_Me = about_Me;
	}
	
	public String getDT_Ingressao() {
		return dT_Ingressao;
	}
	public void setDT_Ingressao(String dT_Ingressao) {
		this.dT_Ingressao = dT_Ingressao;
	}
	
}
