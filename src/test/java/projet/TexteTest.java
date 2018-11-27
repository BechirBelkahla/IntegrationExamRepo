package projet;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TexteTest {
	  @Test
	  public void evaluatesExpression() {
	    Texte text = new Texte();
	    String sum = text.afficher();
	    assertEquals("Welcome to IC", sum);
	  }
	}