package testes;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.*;


public class TestesSistema {
	
	List<Link> linkTest;
	Usuario usuario;
	WebApp webApp;
	String nome;
	String link1;
	String link2;

	
	@Before public void setUp(){
		
		linkTest = new LinkedList<Link>();
		nome = "Default";
		usuario = new Usuario(nome);
		webApp = new WebApp(usuario);
		link1 = "http://www.default.com";
		link2 = "https://www.default.com";
		
	}
	
	@Test public void testaPostaLink() throws LinkInvalidoException{
		
		linkTest.add(new Link(link1));
		
		webApp.postaLink(link1);
		
		Assert.assertEquals(linkTest.get(0).getLink(), webApp.getLinks().get(0).getLink());
		
	}
	
	@Test public void testaHorarioUltimoLink() throws LinkInvalidoException{
		
		linkTest.add(new Link(link1));
		linkTest.add(new Link(link2));
		
		webApp.postaLink(link1);
		webApp.postaLink(link2);
		
		Assert.assertEquals(Calendar.getInstance(), webApp.getDataUltimoPost());
		
	}
	
	@Test public void testaMediaEntreLinks() throws LinkInvalidoException{
		
		linkTest.add(new Link(link1));
		linkTest.add(new Link(link2));
		
		webApp.postaLink(link1);
		webApp.postaLink(link2);
		
		Assert.assertEquals(0.0, webApp.getMediaPosts(), 0.1);
		
	}
	
	@Test public void testaLinksMaisPostados() throws LinkInvalidoException{
		
		linkTest.add(new Link(link1));
		linkTest.add(new Link(link2));
		
		webApp.postaLink(link1);
		webApp.postaLink(link2);
		
		Assert.assertEquals("default", webApp.getLinkMaisPostado());
		
	}
	
	
	
	

}
