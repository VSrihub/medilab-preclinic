package com.nareshit.medilab.utility;

public enum Status {
	
	ACTIVE("Active",1),
	INACTIVE("InActive",0);
	
	private String status;
	private int val;
	
	Status(String status, int val) {
		this.status = status;
		this.val = val;
		
	}
	
	public static int getCodeByName(String name) {
		for(Status st: Status.values()) {
			if(st.status.equals(name)) {
				return st.val;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(Status.getCodeByName("active"));
	}
}
