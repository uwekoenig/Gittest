
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import de.cobinet.schulunglevel4gittest.entities.Territory;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}