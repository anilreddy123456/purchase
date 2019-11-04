package com.example.demo.entity;



import java.util.Date;

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
@Table(name="PURCHASE_ORDER_LINE_ITEM")
//@Table(name="PURCHASE ORDER LINE ITEM")
@XmlRootElement
public class PLineItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Po_Item_Id;
	private int Po_Id;

	private String Logical_Id;

	private String Material_Category;

	private String Service_Category;

	private String Material_Id;

	private String Service_Id;

	private char Plant;
	
	private int Po_Quantity;
	
	private char Unit_Of_Measure;

	private double Unit_Price;

	@Temporal(TemporalType.TIMESTAMP)
	private Date Required_Date;
	
	

	public PLineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public PLineItem(String po_Item_Id, int po_Id, String logical_Id, String material_Category, String service_Category,
			String material_Id, String service_Id, char plant, int po_Quantity, char unit_Of_Measure, double unit_Price,
			Date required_Date) {
		super();
		Po_Item_Id = po_Item_Id;
		Po_Id = po_Id;
		Logical_Id = logical_Id;
		Material_Category = material_Category;
		Service_Category = service_Category;
		Material_Id = material_Id;
		Service_Id = service_Id;
		Plant = plant;
		Po_Quantity = po_Quantity;
		Unit_Of_Measure = unit_Of_Measure;
		Unit_Price = unit_Price;
		Required_Date = required_Date;
	}





	public String getPo_Item_Id() {
		return Po_Item_Id;
	}



	public void setPo_Item_Id(String po_Item_Id) {
		Po_Item_Id = po_Item_Id;
	}



	public int getPo_Id() {
		return Po_Id;
	}



	public void setPo_Id(int po_Id) {
		Po_Id = po_Id;
	}



	public String getLogical_Id() {
		return Logical_Id;
	}



	public void setLogical_Id(String logical_Id) {
		Logical_Id = logical_Id;
	}



	public String getMaterial_Category() {
		return Material_Category;
	}



	public void setMaterial_Category(String material_Category) {
		Material_Category = material_Category;
	}



	public String getService_Category() {
		return Service_Category;
	}



	public void setService_Category(String service_Category) {
		Service_Category = service_Category;
	}



	public String getMaterial_Id() {
		return Material_Id;
	}



	public void setMaterial_Id(String material_Id) {
		Material_Id = material_Id;
	}



	public String getService_Id() {
		return Service_Id;
	}



	public void setService_Id(String service_Id) {
		Service_Id = service_Id;
	}



	public char getPlant() {
		return Plant;
	}



	public void setPlant(char plant) {
		Plant = plant;
	}



	public int getPo_Quantity() {
		return Po_Quantity;
	}



	public void setPo_Quantity(int po_Quantity) {
		Po_Quantity = po_Quantity;
	}



	public char getUnit_Of_Measure() {
		return Unit_Of_Measure;
	}



	public void setUnit_Of_Measure(char unit_Of_Measure) {
		Unit_Of_Measure = unit_Of_Measure;
	}



	public double getUnit_Price() {
		return Unit_Price;
	}



	public void setUnit_Price(double unit_Price) {
		Unit_Price = unit_Price;
	}



	public Date getRequired_Date() {
		return Required_Date;
	}



	public void setRequired_Date(Date required_Date) {
		Required_Date = required_Date;
	}



	@Override
	public String toString() {
		return "PurchaseOrderLineItem [Po_Id=" + Po_Id + ", Po_Item_Id=" + Po_Item_Id + ", Logical_Id=" + Logical_Id
				+ ", Material_Category=" + Material_Category + ", Service_Category=" + Service_Category
				+ ", Material_Id=" + Material_Id + ", Service_Id=" + Service_Id + ", Plant=" + Plant + ", Po_Quantity="
				+ Po_Quantity + ", Unit_Of_Measure=" + Unit_Of_Measure + ", Unit_Price=" + Unit_Price
				+ ", Required_Date=" + Required_Date + "]";
	}

}
