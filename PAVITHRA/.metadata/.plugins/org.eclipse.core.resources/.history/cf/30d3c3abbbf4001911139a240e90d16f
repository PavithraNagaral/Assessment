
public class Student {
	String name;
	int id;
	double per;
	public Student(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(per);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
			return false;
		return true;
	}
	
	
	
	
	

}
