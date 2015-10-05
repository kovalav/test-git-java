package test.anatoly.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import test.api.wsdl.v17.CommerceMagentoInfoEntity;
import test.api.wsdl.v17.CommerceUpdatedOrderEntity;
import test.api.wsdl.v17.UpdatedOrderEntity;
import test.api.wsdl.v19.CatalogProductEntity;
import test.api.wsdl.v19.CatalogProductImageEntity;
import test.api.wsdl.v19.CatalogProductReturnEntity;
//import test.anatoly.wsdl.CommerceTaxRateInfoEntity;
import anatoly.util.MagentoSoapConnector;
import anatoly.util.MagentoSoapConnector17;
import anatoly.util.MagentoSoapConnector19;


/**
 * @author 
 */
public class TaxRatesTest
{
	private static SimpleDateFormat SDF = new SimpleDateFormat( "yyyy.MM.dd hh:mm" );
	
	private static MagentoSoapConnector19 connector_19;
	private static MagentoSoapConnector17 connector_17;
	
	// Connection Anatoly
	/* local duomo  magento 1.7.0.1 */	
	private static String MAGE_URL_17 = "http://local.duomo.gr/live/index.php/api/v2_soap?wsdl=1";
	private static String MAGE_SOAP_USER_17 = "test_api_user";
	private static String MAGE_SOAP_KEY_17 = "test_api_123";
	/* hubdev magento 1.9.02	*/
	private static String MAGE_URL_19 = "http://fishbowlstaging.com/hubdev/index.php/api/v2_soap/index/?wsdl=1";
	private static String MAGE_SOAP_USER_19 = "ecommercehub";
	private static String MAGE_SOAP_KEY_19 = "123456789";
//	private static String MAGE_URL = "http://www.duomo.gr/new/index.php/api/v2_soap?wsdl=1";
//	private static String MAGE_URL = "http://local.buybest.com/index.php/api/v2_soap?wsdl=1";

	private static String session_id_17;
	private static String session_id_19;
	@BeforeClass
	public static void beforeClass() throws Exception
	{
		connector_17 = new MagentoSoapConnector17();
		session_id_17 = connector_17.connectToMagento( MAGE_URL_17, MAGE_SOAP_USER_17, MAGE_SOAP_KEY_17 );
		connector_19 = new MagentoSoapConnector19();
		session_id_19 = connector_19.connectToMagento( MAGE_URL_19, MAGE_SOAP_USER_19, MAGE_SOAP_KEY_19 );
	}
	@AfterClass
	public static void afterClass() throws RemoteException{
		connector_17.getObjRcx().endSession(session_id_17);
		connector_19.getObjRcx().endSession(session_id_19);
	}
	@Test
	public void testUpdatedOrders() throws RemoteException{
		CommerceUpdatedOrderEntity[] updated_orders = connector_17.getObjRcx().commerceApiextGetUpdatedOrders(session_id_17, null, null);

		System.out.println("Received "+updated_orders.length+" orders");
		for(CommerceUpdatedOrderEntity order : updated_orders){
			System.out.println("Order:"+order.getIncrement_id()+" updated:"+order.getUpdated_id()+" action:"+order.getAction());
		}
	}
	@Ignore
	@Test
	public void testMagentoVersion() throws RemoteException{
		CommerceMagentoInfoEntity info = connector_17.getObjRcx().commerceApiextMagentoInfo(session_id_17);
		
		System.out.println("Magento edition "+info.getMagento_edition());
		System.out.println("Magento version "+info.getMagento_version());
	}
	@Ignore
	@Test
	public void testProductBySku(){
		
//		String sku = "MAM059WHT";
		String sku = "124259";	// duomo-local
		test.api.wsdl.v17.CatalogProductReturnEntity prod_17;
		try {
			prod_17 = connector_17.getObjRcx().catalogProductInfo(session_id_17, 
					sku, null, null, null);
			
			System.out.println("Found product "+prod_17.getSku()+"-"+prod_17.getName());
			sku = "111";	// hubdev
			
			CatalogProductReturnEntity prod_19 = connector_19.getObjRcx().catalogProductInfo(session_id_19, 
					sku, null, null, null);
			
			System.out.println("Found product "+prod_19.getSku()+"-"+prod_19.getName());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test main image thumbnail
	 * @throws RemoteException 
	 */
/*	
	@Ignore
	@Test
	public void testImageThumbnail() throws RemoteException{
//		if(true)
//			return;
		
		String product_id = "142219";
		
		String thumb_url = connector.getObjRcx().commerceApiextGetProductThumbnailUrl(session_id, product_id);

		System.out.println("Thumbnal url is:"+thumb_url);
//		if(true)
//			return;
		CatalogProductImageEntity[] media_list = connector.getObjRcx().catalogProductAttributeMediaList(session_id, product_id, null, null);
			
		for(CatalogProductImageEntity media : media_list){
			StringBuffer buf = new StringBuffer();
			for(String mtype : media.getTypes()){
				if(buf.length()>0)
					buf.append(",");
				buf.append(mtype);
			}
			if(buf.toString().contains("thumbnail"))
				System.out.println("Media: file:"+media.getFile()+" label:'"+media.getLabel()+
					"' position:"+media.getPosition()+" URL:"+media.getUrl()+"\n"+
					"Types:"+buf.toString());
		}
		
	}
*/	
	/*
	 * Fetch all products from magento
	 */
/*	
	@Ignore
	@Test
	public void fetchAllProducts(){
		if(true)
			return;
		checkMemory();
		CatalogProductEntity[] list;
		try {
			list = connector.getObjRcx().catalogProductList(session_id, null, null);
			
			System.out.println("Returned "+list.length+" products");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkMemory();
		
	}
*/	
	/**
	 * Fetch existing order's Tax rate info using SOAP API
	 */
/*	
	@Ignore
	@Test
	public void fetchTaxRateExistingOrder(){
		if(true)
			return;
		String order_id = "1800000068";
		
		CommerceTaxRateInfoEntity tax_rate = this.getOrderTaxRate(order_id);
		
		assertNotNull(tax_rate);
		
		System.out.println("Tax rate code:'"+tax_rate.getTax_rate_code()+"' percent:"+tax_rate.getTax_rate_percent());
		
		order_id = "1100006127";
		
		tax_rate = this.getOrderTaxRate(order_id);
		
		assertNotNull(tax_rate);
		
		System.out.println("Tax rate code:'"+tax_rate.getTax_rate_code()+"' percent:"+tax_rate.getTax_rate_percent());
	}
*/	
	/**
	 * Fetch not existing order's Tax rate info using SOAP API
	 */
/*	
	@Ignore
	@Test
	public void fetchTaxRateNotExistingOrder(){
		if(true)
			return;
		String order_id = "9999999999";
		
		CommerceTaxRateInfoEntity tax_rate = this.getOrderTaxRate(order_id);
		
		assertNull(tax_rate);
		
	}
	private CommerceTaxRateInfoEntity getOrderTaxRate(String order_id){
		CommerceTaxRateInfoEntity tax_rate = null;
		try {
			tax_rate = connector.getObjRcx().commerceApiextGetTaxRates(session_id, order_id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return tax_rate;
	}
	private void checkMemory(){
		int mb = 1024 * 1024; 
		 
		// get Runtime instance
		Runtime instance = Runtime.getRuntime();
 
		System.out.println("***** Heap utilization statistics [MB] *****\n");
 
		// available memory
		System.out.println("Total Memory: " + instance.totalMemory() / mb);
 
		// free memory
		System.out.println("Free Memory: " + instance.freeMemory() / mb);
 
		// used memory
		System.out.println("Used Memory: "
				+ (instance.totalMemory() - instance.freeMemory()) / mb);
 
		// Maximum available memory
		System.out.println("Max Memory: " + instance.maxMemory() / mb);
		
	}
	*/
}