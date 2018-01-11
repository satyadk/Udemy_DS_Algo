
public class Employee {

	private String sFirstName ;
	private String sLastName;
	private int iEmpId ;
	
	public Employee(String sFirstName, String sLastName, int iEmpId) {
		super();
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.iEmpId = iEmpId;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public int getiEmpId() {
		return iEmpId;
	}

	public void setiEmpId(int iEmpId) {
		this.iEmpId = iEmpId;
	}

	@Override
	public String toString() {
		return "Employee [sFirstName=" + sFirstName + ", sLastName=" + sLastName + ", iEmpId=" + iEmpId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iEmpId;
		result = prime * result + ((sFirstName == null) ? 0 : sFirstName.hashCode());
		result = prime * result + ((sLastName == null) ? 0 : sLastName.hashCode());
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
		Employee other = (Employee) obj;
		if (iEmpId != other.iEmpId)
			return false;
		if (sFirstName == null) {
			if (other.sFirstName != null)
				return false;
		} else if (!sFirstName.equals(other.sFirstName))
			return false;
		if (sLastName == null) {
			if (other.sLastName != null)
				return false;
		} else if (!sLastName.equals(other.sLastName))
			return false;
		return true;
	}
	
	
}
