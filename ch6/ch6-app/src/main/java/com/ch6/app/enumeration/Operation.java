package com.ch6.app.enumeration;

public enum Operation {
	ADD, SUBSTRACT, MULTIPLY, DIVIDE
};

public static int eval(Operation op, int arg1, int arg2) {
	int result = 0;
	switch(op) {
	case ADD: result = arg1 + arg2; break;		
	case SUBSTRACT: result = arg1 - arg2; break;
	case MULTIPLY: result = arg1 * arg2; break;
	case DIVIDE: result = arg1 / arg2; break;
	}
	return result;
}
}