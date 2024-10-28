package com.ch6.app.enumeration;

enum Operation {
	ADD, SUBSTRACT, MULTIPLY, DIVIDE
};


public class OperationMain {

	public static int eval(Operation op, int arg1, int arg2) {
		int result = 0;
		switch (op) {
		case ADD:
			result = arg1 + arg2;
			break;
		case SUBSTRACT:
			result = arg1 - arg2;
			break;
		case MULTIPLY:
			result = arg1 * arg2;
			break;
		case DIVIDE:
			result = arg1 / arg2;
			break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int res = OperationMain.eval(Operation.ADD, 43, 34);
		System.out.println("Result " + res);
	}
	
}