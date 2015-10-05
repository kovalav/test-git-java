package test.anatoly.api;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import test.api.wsdl.v17.CommerceUpdatedProductEntity;
import anatoly.util.MagentoSoapConnector17;
import anatoly.util.MagentoSoapConnector19;

public class TestProductUpdates {
	
	private static MagentoSoapConnector17 connector_17;
	/* local duomo  magento 1.7.0.1 */	
	private static String MAGE_URL_17 = "http://local.duomo.gr/live/index.php/api/v2_soap?wsdl=1";
	private static String MAGE_SOAP_USER_17 = "test_api_user";
	private static String MAGE_SOAP_KEY_17 = "test_api_123";

	private static String session_id_17;
	@BeforeClass
	public static void beforeClass() throws Exception
	{
		connector_17 = new MagentoSoapConnector17();
		session_id_17 = connector_17.connectToMagento( MAGE_URL_17, MAGE_SOAP_USER_17, MAGE_SOAP_KEY_17 );
	}
	@AfterClass
	public static void afterClass() throws RemoteException{
		connector_17.getObjRcx().endSession(session_id_17);
	}
	@Test
	public void testProducts() throws RemoteException{
		CommerceUpdatedProductEntity[] products = connector_17.getObjRcx().commerceApiextGetUpdatedProducts(session_id_17, null, null);
		
		for(CommerceUpdatedProductEntity product : products){
			if(!product.getAction().equals("unregistered"))
				System.out.println("Product "+product.getProduct_id()+" action:"+product.getAction()+" updated id:"+product.getUpdated_id());
		}
		
		System.out.println("Returned "+products.length+" products");
	}
	@Ignore
	@Test
	public void test() throws RemoteException {
		String updated_ids = "1,2,3,4";
		
		connector_17.getObjRcx().commerceApiextConfirmUpdatedOrdersProcess(session_id_17, updated_ids);
	}

}
