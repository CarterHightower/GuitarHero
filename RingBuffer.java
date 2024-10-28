import java.util.*;
public class RingBuffer {
	
	private double[] arr;
	int first;//front of the line
	int last; //one beyond the most recently inserted index
	public RingBuffer(int capacity){
		first = 0;
		last = 0;
		arr = new double[capacity];
	}
	public int size() 
	{
		int count =0;
		for(double s: arr)
		{
			if(s!=0.0)
			{
				count++;
			}
		}
		return count;
	}
	public boolean isEmpty() 
	{
		int count = 0; 
	}
	public boolean isFull()
	{
		
	}
	public void enqueue(double x) {
		
	}
	public double dequeue() {
		
	}
	public double peek() {
		
	}
	public String toString() {
		
	}
	
}
