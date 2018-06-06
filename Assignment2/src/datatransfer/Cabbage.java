/* File: Cabbage.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Description:This is a class which returns all the entries for the cabbage
 * Professor Stanley Pieda
 */


package datatransfer;
import java.io.Serializable;
 
public class Cabbage implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int lineNumber;
	private String alpha;
	private String beta;
	private String charlie;
	private String delta;
	private String uuid;
	
	/**
	 * constructor
	 */
	public Cabbage() {
		this(0,0,"","","","");
	}
	
	/**
	 * 
	 * @param id
	 * @param lineNumber
	 * @param alpha
	 * @param beta
	 * @param charlie
	 * @param delta
	 */
	public Cabbage(Integer id, int lineNumber, String alpha, String beta, String charlie, String delta) {
		this.id = id;
		this.lineNumber = lineNumber;
		this.alpha = alpha;
		this.beta = beta;
		this.charlie = charlie;
		this.delta = delta;
	}
	
	/**
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
/**
 *  setting the  value of id in  cabbage
 * @param id
 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return line number
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	
	/**
	 *  setting the  value of line number in  cabbage
	 * @param lineNumber
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	/**
	 * 
	 * @return alpha cabbage
	 */
	public String getAlpha() {
		return alpha;
	}
	
	/**
	 *  setting the  value of alpha cabbage
	 * @param alpha
	 */
	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}
	
	/**
	 * 
	 * @return beta cabbage
	 */
	public String getBeta() {
		return beta;
	}
	
	/**
	 *  setting the  value of beta cabbage
	 * @param beta
	 */
	public void setBeta(String beta) {
		this.beta = beta;
	}
	
	/**
	 * 
	 * @return charlie cabbage
	 */
	public String getCharlie() {
		return charlie;
	}
	
	/**
	 * setting the  value of charlie cabbage
	 * @param charlie
	 */
	public void setCharlie(String charlie) {
		this.charlie = charlie;
	}
	
	/**
	 * 
	 * @return delta
	 */
	public String getDelta() {
		return delta;
	}
	
	/**
	 *  setting the  value of delta cabbage
	 * @param delta
	 */
	public void setDelta(String delta) {
		this.delta = delta;
	}
	
	/**
	 *  
	 * @return uuid(Universal Unique Identifier)
	 */
	public String getUUID() {
		return uuid;
	}
	
	/**
	 * setting the uuid
	 * @param uuid
	 */
	public void setUUID(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * printing the values for the cabbage
	 */
	@Override
	public String toString() {
		return String.format("Command: success Returned Cabbage: %d,%d,%s,%s,%s,%s,%s",id, lineNumber, alpha, beta, charlie, delta,uuid);
	}
}
