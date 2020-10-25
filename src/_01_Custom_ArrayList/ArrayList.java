package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	T[] placeholdArr;
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}
	
	public void add(T val) {
		placeholdArr = (T[]) new Object[arr.length];
		for(int i=0; i<arr.length; i++) {
			placeholdArr[i] = arr[i];
		}
		
		arr = (T[]) new Object[placeholdArr.length + 1];
		for(int i=0; i<placeholdArr.length; i++) {
			arr[i] = placeholdArr[i];
		}
		arr[placeholdArr.length] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		placeholdArr = (T[]) new Object[arr.length];
		for(int i=0; i<arr.length; i++) {
			placeholdArr[i] = arr[i];
		}
		
		arr = (T[]) new Object[placeholdArr.length + 1];
		for(int i=0; i<arr.length; i++) {
			if(i < loc) {
				arr[i] = placeholdArr[i];
			} else if (i > loc) {
				arr[i] = placeholdArr[i-1];
			} else {
				arr[loc] = val;
			}
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		placeholdArr = (T[]) new Object[arr.length];
		for(int i=0; i<arr.length; i++) {
			placeholdArr[i] = arr[i];
		}
		
		arr = (T[]) new Object[placeholdArr.length - 1];
		for(int i=0; i<placeholdArr.length; i++) {
			if(i < loc) {
				arr[i] = placeholdArr[i];
			} else if(i > loc) {
				arr[i-1] = placeholdArr[i];
			}
		}
	}
	
	public boolean contains(T val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return arr.length;
	}
}