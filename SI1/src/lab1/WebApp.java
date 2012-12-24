package lab1;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class WebApp implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3740180119601517229L;
	Usuario usuario;
	
	public WebApp(Usuario usuario){
		this.usuario = usuario;
	}

	public void postaLink(String link) throws LinkInvalidoException {
		usuario.setLink(new Link(link));
	}

	public List<Link> getLinks() {
		return usuario.getLinks();
	}

	public double getMediaPosts() {
		return usuario.getMediaPosts();
	}

	public Calendar getDataUltimoPost() {
		return usuario.getDataUltimoPost();
	}

	public String getLinkMaisPostado() {
		return usuario.getLinkMaisPostado();
	}


}
