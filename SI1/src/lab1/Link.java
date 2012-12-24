package lab1;

import java.util.Calendar;

public class Link {
	
	private String link;
	private Calendar data;
	private long tempo;

	public Link(String link) throws LinkInvalidoException{
		if(link.startsWith("http://") || link.startsWith("https://")) this.link = link;
		else throw new LinkInvalidoException("Não é um Link Web");
		
		data = Calendar.getInstance();
	}
	
	public String getLink(){
		return link;
	}
	
	public void setLink(String link){
		this.link = link;
	}
	
	public Calendar dataPostada(){
		return data;
	}
	
	public long getTempo(){
		return tempo;
	}
	
	

}
