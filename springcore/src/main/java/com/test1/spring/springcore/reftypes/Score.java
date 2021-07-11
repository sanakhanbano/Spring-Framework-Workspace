package com.test1.spring.springcore.reftypes;

public class Score {
	private Double math;
	private Double physics;
	private Double chemistry;
	@Override
	public String toString() {
		return "Score [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	public Double getMath() {
		return math;
	}
	public void setMath(Double math) {
		this.math = math;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getChemistry() {
		return chemistry;
	}
	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

}
