package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="PURCHASE_ORDER_HEADER")
//@Table(name="PURCHASE HEADER")
@XmlRootElement
public class PHeader implements Serializable  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Po_Id")
	private int PONumber;
	
	
	@Column(name="Logical_Id")
	private String LogicalSystem;
	
	@Column(name="Description")
	private String Description;

	@Column(name="Po_Type")
	private String POType;
	
	@Column(name="Ref_Number")
	private String ReferenceNumber;
	
	@Column(name="Po_Created_By")
	private String POCreatedBy;

	@Column(name="Po_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date POCreationDate;
	
	@Column(name="Required_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date RequiredDate;

	@Column(name="Net_amount")
	private double NetAmount;

	@Column(name="Tax_amount")
	private double TaxAmount;

	@Column(name="Total_Amount")
	private double TotalAmount;

	@Column(name="Currency")
	private double Currency;

	@Column(name="Vendor_Id")
	private int VendorNumber;

	@Column(name="Vendor_Name")
	private String VendorName;

	@Column(name="Payment_Term")
	private String PaymentTerms;

	@Column(name="Inco_Terms")
	private String IncoTerms;

	@Column(name="Billing_Adrs_Id")
	private int BillingAddressId;

	@Column(name="Delivery_Adrs_Id")
	private int DeliveryAddressId;

	@Column(name="Supplier_Adrs_Id")
	private int SupplierAddressId;
	
	

	public PHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public PHeader(int pONumber, @NotNull String logicalSystem, @NotNull String description, @NotNull String pOType,
			@NotNull String referenceNumber, @NotNull String pOCreatedBy, @NotNull Date pOCreationDate,
			@NotNull Date requiredDate, @NotNull double netAmount, @NotNull double taxAmount,
			@NotNull double totalAmount, @NotNull double currency, @NotNull int vendorNumber,
			@NotNull String vendorName, @NotNull String paymentTerms, @NotNull String incoTerms,
			@NotNull int billingAddressId, @NotNull int deliveryAddressId, @NotNull int supplierAddressId) {
		super();
		PONumber = pONumber;
		LogicalSystem = logicalSystem;
		Description = description;
		POType = pOType;
		ReferenceNumber = referenceNumber;
		POCreatedBy = pOCreatedBy;
		POCreationDate = pOCreationDate;
		RequiredDate = requiredDate;
		NetAmount = netAmount;
		TaxAmount = taxAmount;
		TotalAmount = totalAmount;
		Currency = currency;
		VendorNumber = vendorNumber;
		VendorName = vendorName;
		PaymentTerms = paymentTerms;
		IncoTerms = incoTerms;
		BillingAddressId = billingAddressId;
		DeliveryAddressId = deliveryAddressId;
		SupplierAddressId = supplierAddressId;
	}





	@Override
	public String toString() {
		return "PurchageOrderHeader [PONumber=" + PONumber + ", LogicalSystem=" + LogicalSystem + ", Description="
				+ Description + ", POType=" + POType + ", ReferenceNumber=" + ReferenceNumber + ", POCreatedBy="
				+ POCreatedBy + ", POCreationDate=" + POCreationDate + ", RequiredDate=" + RequiredDate + ", NetAmount="
				+ NetAmount + ", TaxAmount=" + TaxAmount + ", TotalAmount=" + TotalAmount + ", Currency=" + Currency
				+ ", VendorNumber=" + VendorNumber + ", VendorName=" + VendorName + ", PaymentTerms=" + PaymentTerms
				+ ", IncoTerms=" + IncoTerms + ", BillingAddressId=" + BillingAddressId + ", DeliveryAddressId="
				+ DeliveryAddressId + ", SupplierAddressId=" + SupplierAddressId + "]";
	}
}



	

	

