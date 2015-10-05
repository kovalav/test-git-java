package test.anatoly.api;

import static org.junit.Assert.*;
import mage.connection.test.MageConnector;
import mage.connection.test.MageConnectorFarm;

import org.junit.Test;

public class TestConnectorFactory {

	@Test
	public void test() {
		
		MageConnector mage17 = (MageConnector) MageConnectorFarm.valueOf("V17").factory.get();
		
		System.out.println("Connector for version "+mage17.getMageVersion());
		
		MageConnector mage19 = (MageConnector) MageConnectorFarm.valueOf("V19").factory.get();
		
		System.out.println("Connector for version "+mage17.getMageVersion());
	}

}
