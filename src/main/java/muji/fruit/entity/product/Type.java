package muji.fruit.entity.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品类型实体
 * @author CHW
 *
 */
@Entity
@Table(name="t_type")
public class Type {
	/**
	 * 主键
	 */
	@Id
	private String type_id;
	/**
	 * 类型名
	 */
	private String type_name;

   

	public String getType_id() {
		return type_id;
	}



	public void setType_id(String type_id) {
		this.type_id = type_id;
	}



	public String getType_name() {
		return type_name;
	}



	public void setType_name(String type_name) {
		this.type_name = type_name;
	}



	public Type(String type_id, String type_name) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
	}



	public Type() {
		super();
	}

}
