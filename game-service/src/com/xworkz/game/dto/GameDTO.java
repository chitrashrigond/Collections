package com.xworkz.game.dto;

import java.io.Serializable;

public class GameDTO implements Serializable{



private String name;
private String version;
private String developedBy;
private int maxPlayer;
private double memoryRequired;
private boolean online;

public GameDTO() {
	super();
}
	
public GameDTO(String name, String version, String developedBy, int maxPlayer, double memoryRequired, boolean online) {
	super();
	this.name = name;
	this.version = version;
	this.developedBy = developedBy;
	this.maxPlayer = maxPlayer;
	this.memoryRequired = memoryRequired;
	this.online = online;
}
@Override
public String toString() {
	return "GameDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", maxPlayer="
			+ maxPlayer + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((developedBy == null) ? 0 : developedBy.hashCode());
	result = prime * result + maxPlayer;
	long temp;
	temp = Double.doubleToLongBits(memoryRequired);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (online ? 1231 : 1237);
	result = prime * result + ((version == null) ? 0 : version.hashCode());
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
	GameDTO other = (GameDTO) obj;
	if (developedBy == null) {
		if (other.developedBy != null)
			return false;
	} else if (!developedBy.equals(other.developedBy))
		return false;
	if (maxPlayer != other.maxPlayer)
		return false;
	if (Double.doubleToLongBits(memoryRequired) != Double.doubleToLongBits(other.memoryRequired))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (online != other.online)
		return false;
	if (version == null) {
		if (other.version != null)
			return false;
	} else if (!version.equals(other.version))
		return false;
	return true;
}
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public int getMaxPlayer() {
		return maxPlayer;
	}
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	public double getMemoryRequired() {
		return memoryRequired;
	}
	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}

}
