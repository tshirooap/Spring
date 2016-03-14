package sample.di.business.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sample.di.business.valueobject.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"../../../../applicationContext.xml"})
public class ProductServiceTest {

	@Autowired
	ProductService service;
	
	@Test
	public void test() {
		Product actual = service.findProduct();

		assertEquals("Book", actual.getName());
		assertEquals(100, actual.getPrice());
	
	}

}
