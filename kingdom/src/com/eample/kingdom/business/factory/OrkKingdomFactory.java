package com.eample.kingdom.business.factory;

import com.eample.kingdom.business.interfaces.Army;
import com.eample.kingdom.business.interfaces.Castle;
import com.eample.kingdom.business.interfaces.King;
import com.eample.kingdom.business.interfaces.KingDomFactory;
import com.eample.kingdom.business.orkkingdow.OrkArmy;
import com.eample.kingdom.business.orkkingdow.OrkCastle;
import com.eample.kingdom.business.orkkingdow.OrkKing;

public class OrkKingdomFactory implements KingDomFactory{

	@Override
	public Castle createCastle() {
		return new OrkCastle();
	}

	@Override
	public Army createArmy() {
		return new OrkArmy();
	}

	@Override
	public King createKing() {
		return new OrkKing();
	}


}
