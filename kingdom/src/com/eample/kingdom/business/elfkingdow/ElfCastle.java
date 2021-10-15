package com.eample.kingdom.business.elfkingdow;

import com.eample.kingdom.business.interfaces.Castle;

public class ElfCastle implements Castle {

	@Override
	public void getDescription() {
		System.out.println("elf kalesi oluþturuldu.");
	}

}
