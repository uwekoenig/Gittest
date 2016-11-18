
package de.cobinet.schulunglevel4gittest.dal;

import com.xdev.dal.JPADAO;
import de.cobinet.schulunglevel4gittest.entities.Employee;
import java.lang.Integer;

/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends JPADAO<Employee, Integer> {
	public EmployeeDAO() {
		super(Employee.class);
	}
}