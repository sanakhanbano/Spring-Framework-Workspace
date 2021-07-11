package com.test1.spring.springcore.dependencycheck;

import java.util.List;
//Spring's Annotation Type Required is marked as deprecated
//import org.springframework.beans.factory.annotation.Required;
//to mandate dependency check we need required annotation
//The @Required annotation applies to bean property setter methods and 
//it indicates that the affected bean property must be populated in XML configuration file at configuration time. 
//Otherwise, the container throws a BeanInitializationException exception.
public class Prescription {
	private int id;
	private String patientname;
	private List<String> medicines;

	public int getId() {
		return id;
	}
	//@Required //mandate condition
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientname=" + patientname + ", medicines=" + medicines + "]";
	}

}
