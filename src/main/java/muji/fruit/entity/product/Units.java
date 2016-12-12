package muji.fruit.entity.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品单位
 * @author CHW
 *
 */
@Entity
@Table(name="t_units")
public class Units {

	/**
	 * 主键
	 */
	@Id
	private String units_id;
	/**
	 * 单位名称
	 */
	private String units_name;
	public String getUnits_id() {
		return units_id;
	}
	public void setUnits_id(String units_id) {
		this.units_id = units_id;
	}
	public String getUnits_name() {
		return units_name;
	}
	public void setUnits_name(String units_name) {
		this.units_name = units_name;
	}
	public Units(String units_id, String units_name) {
		super();
		this.units_id = units_id;
		this.units_name = units_name;
	}
	public Units() {
		super();
	}



}
