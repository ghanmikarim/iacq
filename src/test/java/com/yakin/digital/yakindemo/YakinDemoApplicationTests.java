package com.yakin.digital.yakindemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YakinDemoApplicationTests {

	@Test
	/**
	this method test the context loader
	*/
	public void contextLoads() {
		/**faire un boucle */
		Integer a=5;
		for(int i=0;i<a;i++)System.out.printLn("i="+i);
	}

}
