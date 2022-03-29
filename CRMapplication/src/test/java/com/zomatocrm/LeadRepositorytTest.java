package com.zomatocrm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.Leadrepositories;



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class LeadRepositorytTest {

	@Autowired
	 private Leadrepositories leadrepo;
	
	@Test
	public void saveonelead(){
		
		Lead l1 = new Lead("sike", "s", "sike@gmail.com", "2345678901", "newspapper");
		Lead l2 = new Lead("rike", "r", "rike@gmail.com", "3456789012", "radio");
		leadrepo.save(l1);
		leadrepo.save(l2);
		assertThat(l1.getId()).isGreaterThanOrEqualTo(0);
		assertThat(l2.getId()).isGreaterThanOrEqualTo(0);
		
		
		
	}
}
