
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import java.lang.Integer;
import de.cobinet.schulunglevel4gittest.entities.Product;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}