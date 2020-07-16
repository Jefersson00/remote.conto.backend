package local.conto.backend.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ContoEjb
 */
@Stateless
@LocalBean
public class ContoEjb implements ContoEjbRemote, ContoEjbLocal {

    /**
     * Default constructor. 
     */
    public ContoEjb() {
        // TODO Auto-generated constructor stub
    }

}
