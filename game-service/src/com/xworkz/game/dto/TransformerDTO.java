package com.xworkz.game.dto;

public class TransformerDTO {
	


private String name;
private String place;
private String happy;
private String sad;
private String likeToDo;

public TransformerDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public TransformerDTO(String name, String place, String happy, String sad, String likeToDo) {
	super();
	this.name = name;
	this.place = place;
	this.happy = happy;
	this.sad = sad;
	this.likeToDo = likeToDo;
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((happy == null) ? 0 : happy.hashCode());
		result = prime * result + ((likeToDo == null) ? 0 : likeToDo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((sad == null) ? 0 : sad.hashCode());
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
		TransformerDTO other = (TransformerDTO) obj;
		if (happy == null) {
			if (other.happy != null)
				return false;
		} else if (!happy.equals(other.happy))
			return false;
		if (likeToDo == null) {
			if (other.likeToDo != null)
				return false;
		} else if (!likeToDo.equals(other.likeToDo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (sad == null) {
			if (other.sad != null)
				return false;
		} else if (!sad.equals(other.sad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", happy=" + happy + ", sad=" + sad + ", likeToDo="
				+ likeToDo + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public String getLikeToDo() {
		return likeToDo;
	}

	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}
}
