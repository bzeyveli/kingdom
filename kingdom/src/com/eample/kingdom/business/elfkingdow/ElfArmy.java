package com.eample.kingdom.business.elfkingdow;

import com.eample.kingdom.business.interfaces.Army;

public class ElfArmy implements Army {

	@Override
	public void getDescription() {
		System.out.println("Elf ordusu oluşturuldu.");
	}

	@Override
	public void getAmmo() {
		
	}

}
