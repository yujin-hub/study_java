package com.oliveyoung.study.ch13.second;

// generic type
public class Product<T, M> {
	private T kind;	// String? Integer? another object?
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
