package local.conto.backend.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MovimentoEjb
 */
@Stateless
@LocalBean
public class MovimentoEjb implements MovimentoEjbRemote, MovimentoEjbLocal {

    /**
     * Default constructor. 
     */
    public MovimentoEjb() {
        // TODO Auto-generated constructor stub
    }

}
