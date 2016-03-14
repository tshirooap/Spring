package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.di.business.service.ProductService;
import sample.di.business.service.ProductServiceImpl;
import sample.di.business.valueobject.Product;

public class ProductSampleRun {
	
	public static void main(String[] args){
		ProductSampleRun sample = new ProductSampleRun();
		sample.execute();
	}
	
	public void execute(){
		System.out.println(System.getProperty("user.dir"));
		//src/main/resources/applicationContext.xml をPathに設定する必要はない。xmlファイルそのものだけでよい。
		//java.io.FileNotFoundException: class path resource [src/main/resources/applicationContext.xml]
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService service = context.getBean(ProductServiceImpl.class);
		Product prod = service.findProduct();
		System.out.println(prod);
	}

}
