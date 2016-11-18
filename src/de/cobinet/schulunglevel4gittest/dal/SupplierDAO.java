
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import de.cobinet.schulunglevel4gittest.entities.Supplier;
import java.lang.Integer;

/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JPADAO<Supplier, Integer> {
	public SupplierDAO() {
		super(Supplier.class);
	}
}