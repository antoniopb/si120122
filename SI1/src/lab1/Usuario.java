package lab1;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	
	List<Link> links;
	String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
		links = new LinkedList<Link>();
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLink(Link link) {
		links.add(link);	
	}

	public double getMediaPosts() {
		return -1;
	}

	public Calendar getDataUltimoPost() {
		return links.get(links.size() - 1).dataPostada();
	}

	public String getLinkMaisPostado() {
		return null;
	}

}
