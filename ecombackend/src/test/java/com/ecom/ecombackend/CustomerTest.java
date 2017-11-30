package com.ecom.ecombackend;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecom.ecombackend.dao.CartDao;
import com.ecom.ecombackend.dao.CustomerDao;
import com.ecom.ecombackend.modclass.Cart;
import com.ecom.ecombackend.modclass.Customer;
import junit.framework.Assert;

public class CustomerTest {
	AnnotationConfigApplicationContext context;
	CustomerDao customerDao;
	CartDao cartDao;
	Customer customer;
	private Cart cart;

	@Before
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecom.ecombackend");
		context.refresh();
		customerDao = (CustomerDao) context.getBean("customerDao");
		cartDao = (CartDao) context.getBean("cartDao");
		customer = new Customer();
		cart = new Cart();

	}

	@Test
	public void createTest() {
		customer.setCustId(101);
		customer.setFirstName("Vaibhav");
		customer.setFirstName("Sangamkar");
		customer.setConfirmPassword("abcd123");
		customer.setConfirmPassword("abcd123");
		customer.setEmail("vaibhav@gmail.com");
		customer.setIs_Active(true);
		customer.setMobileNumber("9876543210");
		customer.setRole("ROLE_CUSTOMER");
		

		Assert.assertEquals("Cart is added", true, customerDao.addCustomer(customer));

	}

	/*@Test
	public void deleteTest() {
		customer.getfirstName();
		customer.setcustId(11);
		Assert.assertEquals("Customer Deleted.!", true, customerDao.deleteCustomer(customer));

	}

	@Test
	public void getTest() {
		customer = customerDao.getCustomer(2);
		Assert.assertNotNull(customer);

	}

	@Test
	public void updateTest() {

		customer = customerDao.getCustomer(2);
		customer.setfirstName("Vaibhav");
		customer.setlastName("Strange");

		Assert.assertEquals("update successful", true, customerDao.updateCustomer(customer));
	}*/

	/*@Test
	public void cartUpdateTest() {
		cart = cartDao.getCart(1);
		cart.setCartQuantity(0);
		Assert.assertEquals("Updated", true, cartDao.updateCart(cart));
	}*/

	/*@Test
	public void test() {

		List<Customer> customers = customerDao.retreiveAllCustomers();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = (Customer) customers.get(i);
			System.out.println(customer.getcustId() + " " + customer.getfirstName() + " " + customer.getlastName());
		}
	}*/
}
