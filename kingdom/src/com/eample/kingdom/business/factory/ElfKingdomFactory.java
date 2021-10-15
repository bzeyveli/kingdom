package com.eample.kingdom.business.factory;

import com.eample.kingdom.business.elfkingdow.ElfArmy;
import com.eample.kingdom.business.elfkingdow.ElfCastle;
import com.eample.kingdom.business.elfkingdow.ElfKing;
import com.eample.kingdom.business.interfaces.Army;
import com.eample.kingdom.business.interfaces.Castle;
import com.eample.kingdom.business.interfaces.King;
import com.eample.kingdom.business.interfaces.KingDomFactory;

public class ElfKingdomFactory implements KingDomFactory{

	@Override
	public Castle createCastle() {
			return new ElfCastle();
					}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

	@Override
	public King createKing() {
		return new ElfKing(); 
	}

}
