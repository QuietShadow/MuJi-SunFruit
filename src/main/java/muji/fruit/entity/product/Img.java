package muji.fruit.entity.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * 商品图片实体
 * 
 * @author CHW
 *
 */
@Entity
@Table(name="t_Img")
public class Img {

	/**
	 * 主键
	 */
	@Id
	private String img_id;
	/**
	 * 图片URL
	 */
	private String img_url;
	/**
	 * 所属商品实体映射
	 */
	@ManyToOne(targetEntity=Product.class)
	@JoinColumn(name="product_id",referencedColumnName="product_id",nullable=false)
	private Product product;



	public String getImg_id() {
		return img_id;
	}

	public void setImg_id(String img_id) {
		this.img_id = img_id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Img(String img_id, String img_url, Product product) {
		super();
		this.img_id = img_id;
		this.img_url = img_url;
		this.product = product;
	}

	public Img() {
		super();
	}

}
