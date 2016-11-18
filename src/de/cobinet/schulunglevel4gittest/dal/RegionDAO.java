
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import de.cobinet.schulunglevel4gittest.entities.Region;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}