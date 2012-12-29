package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the items database table.
 * 
 */
@Entity
@Table(name="items")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Item_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Item_GEN")
	private long id;

	@Column(name="exp_date")
	private String expDate;

	@Column(name="inward_tax_account")
	private String inwardTaxAccount;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_image")
	private String itemImage;

	private String itemcol;

	@Column(name="mfg_date")
	private String mfgDate;

	private String name;

	@Column(name="op_stock_qty")
	private String opStockQty;

	@Column(name="Op_stock_unit")
	private String op_stock_unit;

	@Column(name="outward_tax_account")
	private String outwardTaxAccount;

	@Column(name="req_batch_no")
	private String reqBatchNo;

	private String value;

	//bi-directional many-to-one association to ItmGroup
    @ManyToOne
	@JoinColumn(name="item_belongsto_itemgroup")
	private ItmGroup itmGroup;

	//bi-directional many-to-one association to Company_Detail
    @ManyToOne
	@JoinColumn(name="iem_belongs_to_company")
	private Company_Detail companyDetail;

    public Item() {
    }
	
	public String getExpDate() {
		return this.expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getInwardTaxAccount() {
		return this.inwardTaxAccount;
	}

	public void setInwardTaxAccount(String inwardTaxAccount) {
		this.inwardTaxAccount = inwardTaxAccount;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemImage() {
		return this.itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemcol() {
		return this.itemcol;
	}

	public void setItemcol(String itemcol) {
		this.itemcol = itemcol;
	}

	public String getMfgDate() {
		return this.mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpStockQty() {
		return this.opStockQty;
	}

	public void setOpStockQty(String opStockQty) {
		this.opStockQty = opStockQty;
	}

	public String getOp_stock_unit() {
		return this.op_stock_unit;
	}

	public void setOp_stock_unit(String op_stock_unit) {
		this.op_stock_unit = op_stock_unit;
	}

	public String getOutwardTaxAccount() {
		return this.outwardTaxAccount;
	}

	public void setOutwardTaxAccount(String outwardTaxAccount) {
		this.outwardTaxAccount = outwardTaxAccount;
	}

	public String getReqBatchNo() {
		return this.reqBatchNo;
	}

	public void setReqBatchNo(String reqBatchNo) {
		this.reqBatchNo = reqBatchNo;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ItmGroup getItmGroup() {
		return this.itmGroup;
	}

	public void setItmGroup(ItmGroup itmGroup) {
		this.itmGroup = itmGroup;
	}
	
	public Company_Detail getCompanyDetail() {
		return this.companyDetail;
	}

	public void setCompanyDetail(Company_Detail companyDetail) {
		this.companyDetail = companyDetail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}