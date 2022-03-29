package com.zomatocrm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrm.entities.Bills;
import com.zomatocrm.repositories.BillsRepositories;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BillsRepositoryTest {

	@Autowired
	private BillsRepositories billrepo;
	
	@Test
	public void  savebill() {
		Bills b = new Bills("sohail", "ahmed", "sohail@gmail.com", "9972006785", "shaper", 123456);
		billrepo.save(b);
	}
}
