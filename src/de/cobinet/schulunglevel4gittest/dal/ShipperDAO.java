
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import de.cobinet.schulunglevel4gittest.entities.Shipper;
import java.lang.Integer;

/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JPADAO<Shipper, Integer> {
	public ShipperDAO() {
		super(Shipper.class);
	}
}