package com.aman.selenium.enumsPractice;

public enum Severity {

	CRITICAL {
		@Override
		public String asLowerCase() {
			return Severity.CRITICAL.toString().toLowerCase();
		}
	}, HIGH {
		@Override
		public String asLowerCase() {
			return Severity.HIGH.toString().toLowerCase();
		}
	}, MEDIUM {
		@Override
		public String asLowerCase() {
			return Severity.MEDIUM.toString().toLowerCase();
		}
	}, LOW {
		@Override
		public String asLowerCase() {
			return Severity.LOW.toString().toLowerCase();
		}
	} ;
	
	public abstract String asLowerCase() ;
}
