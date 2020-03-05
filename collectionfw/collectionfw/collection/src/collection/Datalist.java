package customcollection;

import java.util.Arrays;

public class Datalist <lis> {
	private int size=0;
	private static final int CAPACITY=10;
	private Object list_ele[];
	public Datalist()
	{
        list_ele = new Object[CAPACITY];
    }
	public void add(lis data)
	{
		if (size == list_ele.length) {
            ensureCapacity();
        }
		list_ele[size++]=data;
	}
	public int size()
	{
		return size;
	}
	public lis remove(int i)
	{
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
		 Object list_item = list_ele[i];
	        int num_of_Elts = list_ele.length - ( i + 1 ) ;
	        System.arraycopy( list_ele, i + 1, list_ele, i, num_of_Elts ) ;
	        size--;
	        return (lis) list_item;
	}
	public lis get(int i) {
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (lis) list_ele[i];
    }
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(list_ele[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
	private void ensureCapacity() {
        int newSize = list_ele.length * 2;
        list_ele= Arrays.copyOf(list_elements, newSize);
    }
}
