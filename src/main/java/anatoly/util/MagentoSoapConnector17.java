/**
 *
 */
package anatoly.util;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceFactory;

import test.api.wsdl.v17.Mage_Api_Model_Server_V2_HandlerPortType;



/**
 * @author user
 */
public class MagentoSoapConnector17
{
	private ServiceFactory factory; // = ServiceFactory.newInstance();
	private Mage_Api_Model_Server_V2_HandlerPortType objRcx; // = (Mage_Api_Model_Server_V2_HandlerPortType)service.getPort(portName, Mage_Api_Model_Server_V2_HandlerPortType.class);
	private QName portName; // = new QName("urn:Magento", "Mage_Api_Model_Server_V2_HandlerPort");
	private Service service; // = factory.createService(wsdlLocation,serviceName);
	private QName serviceName; // = new QName( "urn:Magento", "MagentoService" );
	private String sessId;
	private URL wsdlLocation; // = new URL("http://local.duomo.gr/live/index.php/api/v2_soap?wsdl=1");

	/**
	 * Connect to Magento SOAP API
	 *
	 * @return
	 */
	public String connectToMagento( String mageUrl, String mageUser, String mageKey ) throws Exception
	{
		this.serviceName = new QName( "urn:Magento", "MagentoService" );

		this.wsdlLocation = new URL( mageUrl );

		this.factory = ServiceFactory.newInstance();
		this.service = this.factory.createService( this.wsdlLocation, this.serviceName );

		this.portName = new QName( "urn:Magento", "Mage_Api_Model_Server_V2_HandlerPort" );

		this.setObjRcx( (Mage_Api_Model_Server_V2_HandlerPortType)this.service.getPort( this.portName, Mage_Api_Model_Server_V2_HandlerPortType.class ) );

		this.setSessId( this.getObjRcx().login( mageUser, mageKey ) );
		
		return this.sessId;
	}

	/**
	 * Return the service-object
	 *
	 * @return
	 */
	public Mage_Api_Model_Server_V2_HandlerPortType getObjRcx()
	{
		return this.objRcx;
	}

	/**
	 * get Magento session id
	 *
	 * @return
	 */
	public String getSessId()
	{
		return this.sessId;
	}

	/**
	 * Set the service-object
	 *
	 * @param objRcx
	 */
	public void setObjRcx( Mage_Api_Model_Server_V2_HandlerPortType objRcx )
	{
		this.objRcx = objRcx;
	}

	/**
	 * Return Magento session id
	 *
	 * @param sessId
	 */
	public void setSessId( String sessId )
	{
		this.sessId = sessId;
	}
}
