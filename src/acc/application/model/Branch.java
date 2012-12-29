package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;


/**
 * The persistent class for the Branches database table.
 * 
 */
@Entity
@Table(name="Branches")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Branch_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Branch_GEN")
	private long id;
	
	private String code;

	@Column(name="contact_no")
	private BigInteger contactNo;

	@Column(name="contact_person")
	private String contactPerson;

	@Column(name="Name")
	private String name;

	//bi-directional many-to-one association to Adress
    @OneToOne
	private Adress adress;

	//bi-directional many-to-one association to Company_Detail
    @ManyToOne
	@JoinColumn(name="company_ID")
	private Company_Detail companyDetail;

    public Branch() {
    }
	
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigInteger getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAdress() {
		return this.adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
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