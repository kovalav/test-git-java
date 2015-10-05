/**
 * Mage_Api_Model_Server_V2_HandlerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v19;

public interface Mage_Api_Model_Server_V2_HandlerPortType extends java.rmi.Remote {

    /**
     * End web service session
     */
    public boolean endSession(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Login user and retrive session id
     */
    public java.lang.String login(java.lang.String username, java.lang.String apiKey) throws java.rmi.RemoteException;

    /**
     * Start web service session
     */
    public java.lang.String startSession() throws java.rmi.RemoteException;

    /**
     * List of available resources
     */
    public test.api.wsdl.v19.ApiEntity[] resources(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * List of global faults
     */
    public test.api.wsdl.v19.ExistsFaltureEntity[] globalFaults(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * List of resource faults
     */
    public test.api.wsdl.v19.ExistsFaltureEntity[] resourceFaults(java.lang.String resourceName, java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * List of stores
     */
    public test.api.wsdl.v19.StoreEntity[] storeList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Store view info
     */
    public test.api.wsdl.v19.StoreEntity storeInfo(java.lang.String sessionId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Info about current Magento installation
     */
    public test.api.wsdl.v19.MagentoInfoEntity magentoInfo(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * List of countries
     */
    public test.api.wsdl.v19.DirectoryCountryEntity[] directoryCountryList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * List of regions in specified country
     */
    public test.api.wsdl.v19.DirectoryRegionEntity[] directoryRegionList(java.lang.String sessionId, java.lang.String country) throws java.rmi.RemoteException;

    /**
     * Retrieve customers
     */
    public test.api.wsdl.v19.CustomerCustomerEntity[] customerCustomerList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters) throws java.rmi.RemoteException;

    /**
     * Create customer
     */
    public int customerCustomerCreate(java.lang.String sessionId, test.api.wsdl.v19.CustomerCustomerEntityToCreate customerData) throws java.rmi.RemoteException;

    /**
     * Retrieve customer data
     */
    public test.api.wsdl.v19.CustomerCustomerEntity customerCustomerInfo(java.lang.String sessionId, int customerId, java.lang.String[] attributes) throws java.rmi.RemoteException;

    /**
     * Update customer data
     */
    public boolean customerCustomerUpdate(java.lang.String sessionId, int customerId, test.api.wsdl.v19.CustomerCustomerEntityToCreate customerData) throws java.rmi.RemoteException;

    /**
     * Delete customer
     */
    public boolean customerCustomerDelete(java.lang.String sessionId, int customerId) throws java.rmi.RemoteException;

    /**
     * Retrieve customer groups
     */
    public test.api.wsdl.v19.CustomerGroupEntity[] customerGroupList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Retrieve customer addresses
     */
    public test.api.wsdl.v19.CustomerAddressEntityItem[] customerAddressList(java.lang.String sessionId, int customerId) throws java.rmi.RemoteException;

    /**
     * Create customer address
     */
    public int customerAddressCreate(java.lang.String sessionId, int customerId, test.api.wsdl.v19.CustomerAddressEntityCreate addressData) throws java.rmi.RemoteException;

    /**
     * Retrieve customer address data
     */
    public test.api.wsdl.v19.CustomerAddressEntityItem customerAddressInfo(java.lang.String sessionId, int addressId) throws java.rmi.RemoteException;

    /**
     * Update customer address data
     */
    public boolean customerAddressUpdate(java.lang.String sessionId, int addressId, test.api.wsdl.v19.CustomerAddressEntityCreate addressData) throws java.rmi.RemoteException;

    /**
     * Delete customer address
     */
    public boolean customerAddressDelete(java.lang.String sessionId, int addressId) throws java.rmi.RemoteException;

    /**
     * Set_Get current store view
     */
    public int catalogCategoryCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public test.api.wsdl.v19.CatalogCategoryTree catalogCategoryTree(java.lang.String sessionId, java.lang.String parentId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public test.api.wsdl.v19.CatalogCategoryEntityNoChildren[] catalogCategoryLevel(java.lang.String sessionId, java.lang.String website, java.lang.String storeView, java.lang.String parentCategory) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public test.api.wsdl.v19.CatalogCategoryInfo catalogCategoryInfo(java.lang.String sessionId, int categoryId, java.lang.String storeView, java.lang.String[] attributes) throws java.rmi.RemoteException;

    /**
     * Create new category and return its id.
     */
    public int catalogCategoryCreate(java.lang.String sessionId, int parentId, test.api.wsdl.v19.CatalogCategoryEntityCreate categoryData, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Update category
     */
    public boolean catalogCategoryUpdate(java.lang.String sessionId, int categoryId, test.api.wsdl.v19.CatalogCategoryEntityCreate categoryData, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Move category in tree
     */
    public boolean catalogCategoryMove(java.lang.String sessionId, int categoryId, int parentId, java.lang.String afterId) throws java.rmi.RemoteException;

    /**
     * Delete category
     */
    public boolean catalogCategoryDelete(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of assigned products
     */
    public test.api.wsdl.v19.CatalogAssignedProduct[] catalogCategoryAssignedProducts(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException;

    /**
     * Assign product to category
     */
    public boolean catalogCategoryAssignProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String position, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Update assigned product
     */
    public boolean catalogCategoryUpdateProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String position, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Remove product assignment from category
     */
    public boolean catalogCategoryRemoveProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public int catalogCategoryAttributeCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve category attributes
     */
    public test.api.wsdl.v19.CatalogAttributeEntity[] catalogCategoryAttributeList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public test.api.wsdl.v19.CatalogAttributeOptionEntity[] catalogCategoryAttributeOptions(java.lang.String sessionId, java.lang.String attributeId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public int catalogProductCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve products list by filters
     */
    public test.api.wsdl.v19.CatalogProductEntity[] catalogProductList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve product
     */
    public test.api.wsdl.v19.CatalogProductReturnEntity catalogProductInfo(java.lang.String sessionId, java.lang.String productId, java.lang.String storeView, test.api.wsdl.v19.CatalogProductRequestAttributes attributes, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Create new product and return product id
     */
    public int catalogProductCreate(java.lang.String sessionId, java.lang.String type, java.lang.String set, java.lang.String sku, test.api.wsdl.v19.CatalogProductCreateEntity productData, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Update product
     */
    public boolean catalogProductUpdate(java.lang.String sessionId, java.lang.String product, test.api.wsdl.v19.CatalogProductCreateEntity productData, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Product multi update
     */
    public boolean catalogProductMultiUpdate(java.lang.String sessionId, java.lang.String[] productIds, test.api.wsdl.v19.CatalogProductCreateEntity[] productData, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Update product special price
     */
    public int catalogProductSetSpecialPrice(java.lang.String sessionId, java.lang.String product, java.lang.String specialPrice, java.lang.String fromDate, java.lang.String toDate, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Get product special price data
     */
    public test.api.wsdl.v19.CatalogProductSpecialPriceReturnEntity catalogProductGetSpecialPrice(java.lang.String sessionId, java.lang.String product, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Delete product
     */
    public int catalogProductDelete(java.lang.String sessionId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public int catalogProductAttributeCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Get list of additional attributes which are not in default
     * create/update list
     */
    public test.api.wsdl.v19.CatalogAttributeEntity[] catalogProductListOfAdditionalAttributes(java.lang.String sessionId, java.lang.String productType, java.lang.String attributeSetId) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute list
     */
    public test.api.wsdl.v19.CatalogAttributeEntity[] catalogProductAttributeList(java.lang.String sessionId, int setId) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public test.api.wsdl.v19.CatalogAttributeOptionEntity[] catalogProductAttributeOptions(java.lang.String sessionId, java.lang.String attributeId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Create product attribute set based on another set
     */
    public int catalogProductAttributeSetCreate(java.lang.String sessionId, java.lang.String attributeSetName, java.lang.String skeletonSetId) throws java.rmi.RemoteException;

    /**
     * Remove product attribute set
     */
    public boolean catalogProductAttributeSetRemove(java.lang.String sessionId, java.lang.String attributeSetId, java.lang.String forceProductsRemove) throws java.rmi.RemoteException;

    /**
     * Retrieve product attribute sets
     */
    public test.api.wsdl.v19.CatalogProductAttributeSetEntity[] catalogProductAttributeSetList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Add attribute into attribute set
     */
    public boolean catalogProductAttributeSetAttributeAdd(java.lang.String sessionId, java.lang.String attributeId, java.lang.String attributeSetId, java.lang.String attributeGroupId, java.lang.String sortOrder) throws java.rmi.RemoteException;

    /**
     * Remove attribute from attribute set
     */
    public boolean catalogProductAttributeSetAttributeRemove(java.lang.String sessionId, java.lang.String attributeId, java.lang.String attributeSetId) throws java.rmi.RemoteException;

    /**
     * Create group within existing attribute set
     */
    public int catalogProductAttributeSetGroupAdd(java.lang.String sessionId, java.lang.String attributeSetId, java.lang.String groupName) throws java.rmi.RemoteException;

    /**
     * Rename existing group
     */
    public boolean catalogProductAttributeSetGroupRename(java.lang.String sessionId, java.lang.String groupId, java.lang.String groupName) throws java.rmi.RemoteException;

    /**
     * Remove group from attribute set
     */
    public boolean catalogProductAttributeSetGroupRemove(java.lang.String sessionId, java.lang.String attributeGroupId) throws java.rmi.RemoteException;

    /**
     * Get list of possible attribute types
     */
    public test.api.wsdl.v19.CatalogAttributeOptionEntity[] catalogProductAttributeTypes(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Create new attribute
     */
    public int catalogProductAttributeCreate(java.lang.String sessionId, test.api.wsdl.v19.CatalogProductAttributeEntityToCreate data) throws java.rmi.RemoteException;

    /**
     * Delete attribute
     */
    public boolean catalogProductAttributeRemove(java.lang.String sessionId, java.lang.String attribute) throws java.rmi.RemoteException;

    /**
     * Get full information about attribute with list of options
     */
    public test.api.wsdl.v19.CatalogProductAttributeEntity catalogProductAttributeInfo(java.lang.String sessionId, java.lang.String attribute) throws java.rmi.RemoteException;

    /**
     * Update attribute
     */
    public boolean catalogProductAttributeUpdate(java.lang.String sessionId, java.lang.String attribute, test.api.wsdl.v19.CatalogProductAttributeEntityToUpdate data) throws java.rmi.RemoteException;

    /**
     * Add option to attribute
     */
    public boolean catalogProductAttributeAddOption(java.lang.String sessionId, java.lang.String attribute, test.api.wsdl.v19.CatalogProductAttributeOptionEntityToAdd data) throws java.rmi.RemoteException;

    /**
     * Remove option from attribute
     */
    public boolean catalogProductAttributeRemoveOption(java.lang.String sessionId, java.lang.String attribute, java.lang.String optionId) throws java.rmi.RemoteException;

    /**
     * Retrieve product types
     */
    public test.api.wsdl.v19.CatalogProductTypeEntity[] catalogProductTypeList(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Retrieve product tier prices
     */
    public test.api.wsdl.v19.CatalogProductTierPriceEntity[] catalogProductAttributeTierPriceInfo(java.lang.String sessionId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Update product tier prices
     */
    public int catalogProductAttributeTierPriceUpdate(java.lang.String sessionId, java.lang.String product, test.api.wsdl.v19.CatalogProductTierPriceEntity[] tier_price, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public int catalogProductAttributeMediaCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException;

    /**
     * Retrieve product image list
     */
    public test.api.wsdl.v19.CatalogProductImageEntity[] catalogProductAttributeMediaList(java.lang.String sessionId, java.lang.String product, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Retrieve product image data
     */
    public test.api.wsdl.v19.CatalogProductImageEntity catalogProductAttributeMediaInfo(java.lang.String sessionId, java.lang.String product, java.lang.String file, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Retrieve product image types
     */
    public test.api.wsdl.v19.CatalogProductAttributeMediaTypeEntity[] catalogProductAttributeMediaTypes(java.lang.String sessionId, java.lang.String setId) throws java.rmi.RemoteException;

    /**
     * Upload new product image
     */
    public java.lang.String catalogProductAttributeMediaCreate(java.lang.String sessionId, java.lang.String product, test.api.wsdl.v19.CatalogProductAttributeMediaCreateEntity data, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Update product image
     */
    public boolean catalogProductAttributeMediaUpdate(java.lang.String sessionId, java.lang.String product, java.lang.String file, test.api.wsdl.v19.CatalogProductAttributeMediaCreateEntity data, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Remove product image
     */
    public boolean catalogProductAttributeMediaRemove(java.lang.String sessionId, java.lang.String product, java.lang.String file, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Retrieve linked products
     */
    public test.api.wsdl.v19.CatalogProductLinkEntity[] catalogProductLinkList(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Assign product link
     */
    public boolean catalogProductLinkAssign(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, test.api.wsdl.v19.CatalogProductLinkEntity data, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Update product link
     */
    public boolean catalogProductLinkUpdate(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, test.api.wsdl.v19.CatalogProductLinkEntity data, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Remove product link
     */
    public boolean catalogProductLinkRemove(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Retrieve product link types
     */
    public java.lang.String[] catalogProductLinkTypes(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Retrieve product link type attributes
     */
    public test.api.wsdl.v19.CatalogProductLinkAttributeEntity[] catalogProductLinkAttributes(java.lang.String sessionId, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * Add new custom option into product
     */
    public boolean catalogProductCustomOptionAdd(java.lang.String sessionId, java.lang.String productId, test.api.wsdl.v19.CatalogProductCustomOptionToAdd data, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Update product custom option
     */
    public boolean catalogProductCustomOptionUpdate(java.lang.String sessionId, java.lang.String optionId, test.api.wsdl.v19.CatalogProductCustomOptionToUpdate data, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Get list of available custom option types
     */
    public test.api.wsdl.v19.CatalogProductCustomOptionTypesEntity[] catalogProductCustomOptionTypes(java.lang.String sessionId) throws java.rmi.RemoteException;

    /**
     * Get full information about custom option in product
     */
    public test.api.wsdl.v19.CatalogProductCustomOptionInfoEntity catalogProductCustomOptionInfo(java.lang.String sessionId, java.lang.String optionId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Retrieve list of product custom options
     */
    public test.api.wsdl.v19.CatalogProductCustomOptionListEntity[] catalogProductCustomOptionList(java.lang.String sessionId, java.lang.String productId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Remove custom option
     */
    public boolean catalogProductCustomOptionRemove(java.lang.String sessionId, java.lang.String optionId) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option value info
     */
    public test.api.wsdl.v19.CatalogProductCustomOptionValueInfoEntity catalogProductCustomOptionValueInfo(java.lang.String sessionId, java.lang.String valueId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option values list
     */
    public test.api.wsdl.v19.CatalogProductCustomOptionValueListEntity[] catalogProductCustomOptionValueList(java.lang.String sessionId, java.lang.String optionId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Add new custom option values
     */
    public boolean catalogProductCustomOptionValueAdd(java.lang.String sessionId, java.lang.String optionId, test.api.wsdl.v19.CatalogProductCustomOptionValueAddEntity[] data, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Update custom option value
     */
    public boolean catalogProductCustomOptionValueUpdate(java.lang.String sessionId, java.lang.String valueId, test.api.wsdl.v19.CatalogProductCustomOptionValueUpdateEntity data, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Remove value from custom option
     */
    public boolean catalogProductCustomOptionValueRemove(java.lang.String sessionId, java.lang.String valueId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of orders by filters
     */
    public test.api.wsdl.v19.SalesOrderListEntity[] salesOrderList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters) throws java.rmi.RemoteException;

    /**
     * Retrieve order information
     */
    public test.api.wsdl.v19.SalesOrderEntity salesOrderInfo(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException;

    /**
     * Add comment to order
     */
    public boolean salesOrderAddComment(java.lang.String sessionId, java.lang.String orderIncrementId, java.lang.String status, java.lang.String comment, java.lang.String notify) throws java.rmi.RemoteException;

    /**
     * Hold order
     */
    public boolean salesOrderHold(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException;

    /**
     * Unhold order
     */
    public boolean salesOrderUnhold(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException;

    /**
     * Cancel order
     */
    public boolean salesOrderCancel(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of shipments by filters
     */
    public test.api.wsdl.v19.SalesOrderShipmentEntity[] salesOrderShipmentList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters) throws java.rmi.RemoteException;

    /**
     * Retrieve shipment information
     */
    public test.api.wsdl.v19.SalesOrderShipmentEntity salesOrderShipmentInfo(java.lang.String sessionId, java.lang.String shipmentIncrementId) throws java.rmi.RemoteException;

    /**
     * Create new shipment for order
     */
    public java.lang.String salesOrderShipmentCreate(java.lang.String sessionId, java.lang.String orderIncrementId, test.api.wsdl.v19.OrderItemIdQty[] itemsQty, java.lang.String comment, int email, int includeComment) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public boolean salesOrderShipmentAddComment(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String comment, java.lang.String email, java.lang.String includeInEmail) throws java.rmi.RemoteException;

    /**
     * Add new tracking number
     */
    public int salesOrderShipmentAddTrack(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String carrier, java.lang.String title, java.lang.String trackNumber) throws java.rmi.RemoteException;

    /**
     * Send shipment info
     */
    public boolean salesOrderShipmentSendInfo(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String comment) throws java.rmi.RemoteException;

    /**
     * Remove tracking number
     */
    public boolean salesOrderShipmentRemoveTrack(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String trackId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of allowed carriers for order
     */
    public test.api.wsdl.v19.AssociativeEntity[] salesOrderShipmentGetCarriers(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of invoices by filters
     */
    public test.api.wsdl.v19.SalesOrderInvoiceEntity[] salesOrderInvoiceList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters) throws java.rmi.RemoteException;

    /**
     * Retrieve invoice information
     */
    public test.api.wsdl.v19.SalesOrderInvoiceEntity salesOrderInvoiceInfo(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException;

    /**
     * Create new invoice for order
     */
    public java.lang.String salesOrderInvoiceCreate(java.lang.String sessionId, java.lang.String invoiceIncrementId, test.api.wsdl.v19.OrderItemIdQty[] itemsQty, java.lang.String comment, java.lang.String email, java.lang.String includeComment) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public boolean salesOrderInvoiceAddComment(java.lang.String sessionId, java.lang.String invoiceIncrementId, java.lang.String comment, java.lang.String email, java.lang.String includeComment) throws java.rmi.RemoteException;

    /**
     * Capture invoice
     */
    public boolean salesOrderInvoiceCapture(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException;

    /**
     * Void invoice
     */
    public boolean salesOrderInvoiceVoid(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException;

    /**
     * Cancel invoice
     */
    public boolean salesOrderInvoiceCancel(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of creditmemos by filters
     */
    public test.api.wsdl.v19.SalesOrderCreditmemoEntity[] salesOrderCreditmemoList(java.lang.String sessionId, test.api.wsdl.v19.Filters filters) throws java.rmi.RemoteException;

    /**
     * Retrieve creditmemo information
     */
    public test.api.wsdl.v19.SalesOrderCreditmemoEntity salesOrderCreditmemoInfo(java.lang.String sessionId, java.lang.String creditmemoIncrementId) throws java.rmi.RemoteException;

    /**
     * Create new creditmemo for order
     */
    public java.lang.String salesOrderCreditmemoCreate(java.lang.String sessionId, java.lang.String orderIncrementId, test.api.wsdl.v19.SalesOrderCreditmemoData creditmemoData, java.lang.String comment, int notifyCustomer, int includeComment, java.lang.String refundToStoreCreditAmount) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public boolean salesOrderCreditmemoAddComment(java.lang.String sessionId, java.lang.String creditmemoIncrementId, java.lang.String comment, int notifyCustomer, int includeComment) throws java.rmi.RemoteException;

    /**
     * Cancel creditmemo
     */
    public boolean salesOrderCreditmemoCancel(java.lang.String sessionId, java.lang.String creditmemoIncrementId) throws java.rmi.RemoteException;

    /**
     * Retrieve stock data by product ids
     */
    public test.api.wsdl.v19.CatalogInventoryStockItemEntity[] catalogInventoryStockItemList(java.lang.String sessionId, java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * Update product stock data
     */
    public int catalogInventoryStockItemUpdate(java.lang.String sessionId, java.lang.String product, test.api.wsdl.v19.CatalogInventoryStockItemUpdateEntity data) throws java.rmi.RemoteException;

    /**
     * Multi stock item update
     */
    public boolean catalogInventoryStockItemMultiUpdate(java.lang.String sessionId, java.lang.String[] productIds, test.api.wsdl.v19.CatalogInventoryStockItemUpdateEntity[] productData) throws java.rmi.RemoteException;

    /**
     * Create shopping cart
     */
    public int shoppingCartCreate(java.lang.String sessionId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Retrieve information about shopping cart
     */
    public test.api.wsdl.v19.ShoppingCartInfoEntity shoppingCartInfo(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Create an order from shopping cart
     */
    public java.lang.String shoppingCartOrder(java.lang.String sessionId, int quoteId, java.lang.String storeId, java.lang.String[] licenses) throws java.rmi.RemoteException;

    /**
     * Get total prices for shopping cart
     */
    public test.api.wsdl.v19.ShoppingCartTotalsEntity[] shoppingCartTotals(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Get terms and conditions
     */
    public test.api.wsdl.v19.ShoppingCartLicenseEntity[] shoppingCartLicense(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Add product(s) to shopping cart
     */
    public boolean shoppingCartProductAdd(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Update product(s) quantities in shopping cart
     */
    public boolean shoppingCartProductUpdate(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Remove product(s) from shopping cart
     */
    public boolean shoppingCartProductRemove(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Get list of products in shopping cart
     */
    public test.api.wsdl.v19.CatalogProductEntity[] shoppingCartProductList(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Move product(s) to customer quote
     */
    public boolean shoppingCartProductMoveToCustomerQuote(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Set customer for shopping cart
     */
    public boolean shoppingCartCustomerSet(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartCustomerEntity customer, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Set customer's addresses in shopping cart
     */
    public boolean shoppingCartCustomerAddresses(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartCustomerAddressEntity[] customer, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Set shipping method
     */
    public boolean shoppingCartShippingMethod(java.lang.String sessionId, int quoteId, java.lang.String method, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Get list of available shipping methods
     */
    public test.api.wsdl.v19.ShoppingCartShippingMethodEntity[] shoppingCartShippingList(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Set payment method
     */
    public boolean shoppingCartPaymentMethod(java.lang.String sessionId, int quoteId, test.api.wsdl.v19.ShoppingCartPaymentMethodEntity method, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Get list of available payment methods
     */
    public test.api.wsdl.v19.ShoppingCartPaymentMethodResponseEntity[] shoppingCartPaymentList(java.lang.String sessionId, int quoteId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Add coupon code for shopping cart
     */
    public boolean shoppingCartCouponAdd(java.lang.String sessionId, int quoteId, java.lang.String couponCode, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Remove coupon code from shopping cart
     */
    public boolean shoppingCartCouponRemove(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Retrieve list of tags by product
     */
    public test.api.wsdl.v19.CatalogProductTagListEntity[] catalogProductTagList(java.lang.String sessionId, java.lang.String productId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Retrieve product tag info
     */
    public test.api.wsdl.v19.CatalogProductTagInfoEntity catalogProductTagInfo(java.lang.String sessionId, java.lang.String tagId, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Add tag(s) to product
     */
    public test.api.wsdl.v19.AssociativeEntity[] catalogProductTagAdd(java.lang.String sessionId, test.api.wsdl.v19.CatalogProductTagAddEntity data) throws java.rmi.RemoteException;

    /**
     * Update product tag
     */
    public boolean catalogProductTagUpdate(java.lang.String sessionId, java.lang.String tagId, test.api.wsdl.v19.CatalogProductTagUpdateEntity data, java.lang.String store) throws java.rmi.RemoteException;

    /**
     * Remove product tag
     */
    public boolean catalogProductTagRemove(java.lang.String sessionId, java.lang.String tagId) throws java.rmi.RemoteException;

    /**
     * Set a gift message to the cart
     */
    public test.api.wsdl.v19.GiftMessageResponse giftMessageSetForQuote(java.lang.String sessionId, java.lang.String quoteId, test.api.wsdl.v19.GiftMessageEntity giftMessage, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote item
     */
    public test.api.wsdl.v19.GiftMessageResponse giftMessageSetForQuoteItem(java.lang.String sessionId, java.lang.String quoteItemId, test.api.wsdl.v19.GiftMessageEntity giftMessage, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote items by products
     */
    public test.api.wsdl.v19.GiftMessageResponse[] giftMessageSetForQuoteProduct(java.lang.String sessionId, java.lang.String quoteId, test.api.wsdl.v19.GiftMessageAssociativeProductsEntity[] productsAndMessages, java.lang.String storeId) throws java.rmi.RemoteException;

    /**
     * Add links to downloadable product
     */
    public int catalogProductDownloadableLinkAdd(java.lang.String sessionId, java.lang.String productId, test.api.wsdl.v19.CatalogProductDownloadableLinkAddEntity resource, java.lang.String resourceType, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Retrieve list of links and samples for downloadable product
     */
    public test.api.wsdl.v19.CatalogProductDownloadableLinkInfoEntity catalogProductDownloadableLinkList(java.lang.String sessionId, java.lang.String productId, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException;

    /**
     * Remove links and samples from downloadable product
     */
    public boolean catalogProductDownloadableLinkRemove(java.lang.String sessionId, java.lang.String linkId, java.lang.String resourceType) throws java.rmi.RemoteException;
}
