package muji.fruit.entity.product;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * ��Ʒʵ��
 * 
 * @author CHW
 *
 */
@Entity
@Table(name="t_product")
public class Product {

	/**
	 * ����
	 */
	@Id
	private String product_id;
	/**
	 * ��Ʒ���¼�״̬��0���¼ܣ�1���ϼܣ�
	 */
	private String status;
	/**
	 * ��Ʒ����
	 */
	@OneToOne(targetEntity=Group.class)
	@JoinColumn(name="group_id",referencedColumnName="group_id")
	private Group group;
	/**
	 * ��Ʒ����
	 */
	private String product_no;
	/**
	 * ��Ʒ����
	 */
	@OneToOne(targetEntity=Type.class)
	@JoinColumn(name="type_id",referencedColumnName="type_id")
	private Type type;
	/**
	 * ��ƷͼƬ
	 */
	@OneToMany(targetEntity=Img.class,mappedBy="product")
	private Set<Img> img=new HashSet<Img>();
	/**
	 * ��Ʒ�۸�
	 */
	private double price;
	/**
	 * ��Ʒ���۵�λ
	 */
	@OneToOne(targetEntity=Units.class)
	@JoinColumn(name="units_id",referencedColumnName="units_id")
	private Units units;
	/**
	 * ��Ʒ����
	 */
	private String product_describe;
	/**
	 * ��Ʒ���
	 */
	private int inventory;



	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}



	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}



	public Set<Img> getImg() {
		return img;
	}

	public void setImg(Set<Img> img) {
		this.img = img;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}

	public String getProduct_describe() {
		return product_describe;
	}

	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}


	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}
	
	public Product(String product_id, String status, Group group, String product_no, Type type, Set<Img> img,
			double price, Units units, String product_describe, int inventory) {
		super();
		this.product_id = product_id;
		this.status = status;
		this.group = group;
		this.product_no = product_no;
		this.type = type;
		this.img = img;
		this.price = price;
		this.units = units;
		this.product_describe = product_describe;
		this.inventory = inventory;
	}

	public Product() {
		super();
	}

}
