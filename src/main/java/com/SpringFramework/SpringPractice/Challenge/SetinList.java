package com.SpringFramework.SpringPractice.Challenge;
import java.util.*;
public class SetinList {
	
	private Set<List<List<Integer>>> number;

	public Set<List<List<Integer>>> getNumber() {
		return number;
	}

	public void setNumber(Set<List<List<Integer>>> number) {
		this.number = number;
	}

	public SetinList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SetinList [number=" + number + "]";
	}
	
}
