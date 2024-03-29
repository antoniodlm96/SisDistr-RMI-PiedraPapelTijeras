package es.ubu.lsi.common;


import java.io.Serializable;

/**
 * Element in game system.
 * 
 * @author Raúl Marticorena
 * @author Joaquin P. Seco
 * @author Mario Erro
 *
 */
public class GameElement implements Serializable {


	/** Serial version UID. */
	private static final long serialVersionUID = 7467237896682458959L;

	/** Type. */
	private ElementType element;
		
	/** Player id. */
	private int id;
	
	/**
	 * Constructor.
	 * 
	 * @param id client id
	 * @param element element
	 */
	public GameElement(int id, ElementType element) {
		this.setId(id);
		this.setElement(element);
	}
	
	/**
	 * Gets element.
	 * 
	 * @return element
	 */
	public ElementType getElement() {
		return element;
	}
	
	/**
	 * Sets element.
	 * 
	 * @param element element
	 */
	public void setElement(ElementType element) {
		this.element = element;
	}
	
	/**
	 * Gets id.
	 * 
	 * @return sender id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets sender id.
	 * 
	 * @param id sender id
	 * 
	 */
	private void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "GameElement [element=" + element + ", clientId=" + this.id + "]";
	}
}

