package muji.fruit.entity.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��Ʒ����ʵ��
 * @author CHW
 *
 */
@Entity
@Table(name="t_group")
public class Group {
    /**
     * ����
     */
	@Id
	private String group_id;
	/**
	 * ������
	 */
	private String group_name;
	

	public Group(String group_id, String group_name) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
	}


	public String getGroup_id() {
		return group_id;
	}


	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}


	public String getGroup_name() {
		return group_name;
	}


	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}


	public Group() {
		super();
	}
	
}
