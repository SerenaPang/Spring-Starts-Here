package com.ch4.app.example2;

public class DilveryDetailsPrinter {
	private SorterByAddress sorter;
	
	public DilveryDetailsPrinter(SorterByAddress sorter) {
		this.sorter = sorter;
	}

	public void printDetails() {
		sorter.sortDetails();
	}
}
