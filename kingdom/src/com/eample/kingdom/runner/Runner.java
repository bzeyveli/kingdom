package com.eample.kingdom.runner;

import com.eample.kingdom.business.factory.ElfKingdomFactory;
import com.eample.kingdom.business.factory.OrkKingdomFactory;

public class Runner {

	public static void main(String[] args) {
		
		OrkKingdomFactory factory = new OrkKingdomFactory();
		factory.createArmy().getDescription();
		factory.createCastle().getDescription();
		factory.createKing().getDescription();

		System.out.println("****************************");

		ElfKingdomFactory factory2 = new ElfKingdomFactory();
		factory2.createArmy().getDescription();
		factory2.createCastle().getDescription();
		factory2.createKing().getDescription();
	}
}
