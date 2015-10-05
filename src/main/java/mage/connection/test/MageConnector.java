package mage.connection.test;

public abstract class MageConnector implements MageConnectorInterface {

	protected String mageVersion;
	public MageConnector(){};
	public String getMageVersion() {
		return mageVersion;
	}

}
