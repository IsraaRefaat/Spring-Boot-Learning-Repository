import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="programmers_table")
public class Alien {
	
	@Id
	@Column(name="programmer_id")
	private int id;
	@Column(name="programmer_name")
	private String name;
	@Transient
	private String tech;
	@OneToOne
	private Laptop laptop;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + ", laptop=" + laptop + "]";
	}
	
	
	
	
	
	

}
