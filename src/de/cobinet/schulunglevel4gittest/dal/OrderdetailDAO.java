
package de.cobinet.schulunglevel4gittest.dal;

import de.cobinet.schulunglevel4gittest.entities.OrderdetailId;
import de.cobinet.schulunglevel4gittest.entities.Orderdetail;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}