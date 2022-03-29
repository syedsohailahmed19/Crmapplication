package com.zomatocrm;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrm.entities.Contact;
import com.zomatocrm.repositories.ContactRepository;




@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class ContactRepositorytTest {

	@Autowired
	 private ContactRepository conrepo;
	
	@Test
	public void saveoneContact(){
		Contact c = new Contact("sike", "s", "sike@gmail.com", "2345678901", "newspapper");
		conrepo.save(c);
		
		

		
		
	}
}
