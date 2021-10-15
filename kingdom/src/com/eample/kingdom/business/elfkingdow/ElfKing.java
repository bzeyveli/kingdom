package com.eample.kingdom.business.elfkingdow;

import com.eample.kingdom.business.interfaces.King;

public class ElfKing implements King{

	@Override
	public void getDescription() {
		System.out.println("elf krallýðý oluþturuldu...");
	}

}
