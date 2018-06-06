/* File: CabbageDao.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Professor Stanley Pieda
 */


package dataaccesslayer;

// import java.util.List;
import datatransfer.Cabbage; 

/**
 * Interface with abstract methods for CRUD operations
 * not all parts are implemented
 * @author Stan Pieda
 *
 */
public interface CabbageDao {
 
	Cabbage getCabbageByUUID(String uuid);
	void insertCabbage(Cabbage cabbage);
	 
}
