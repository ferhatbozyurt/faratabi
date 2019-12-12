package org.medipol.yazilimaraclari.finalders4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.medipol.yazilimaraclari.finalders4.OgrenciRestServisi.Ogrenci;

class OgrenciRestServisiTest {

	@Test
	void testAll() {
		
	}

	@Test
	void testNewEmployee() {
		OgrenciRestServisi servis1 = new OgrenciRestServisi();
		String adsoyad = "adsoyad1";
		
		Ogrenci sonuc = servis1.newEmployee(adsoyad);
		
		assertNotNull(sonuc);
		assertEquals(adsoyad,sonuc.getAdSoyad());
	}

	@Test
	void testNewEmployee2() {
		
	}

}
