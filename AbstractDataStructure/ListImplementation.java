package abstractDataType;

class Listo{
	int array[];
	int capacity,size;
	
	Listo(int capacity)
	{
		this.capacity=capacity;
		this.size=0;
		array=new int[capacity];
	}
	
	boolean isFull(Listo list)
	{
		return (list.capacity==list.size);
	}
	
	boolean isEmpty(Listo list)
	{
		return (list.size==0);
	}
	
	void add(int element)
	{
		this.array[size]=element;
		this.size++;
	}
	
	void add(int element,int pos)
	{
		if(pos<size)
		{
			for(int i=size-1;i>=pos;i--)
			{
				this.array[i+1]=this.array[i];
			}
			this.array[pos]=element;
		}
		else
		{
			this.array[pos]=element;
		}
		this.size++;
	}
	
	void remove()
	{
		if(isEmpty(this))
		{
			return;
		}
		this.size--;
	}
	
	

}
public class ListImplementation {
	
	static void printlist(Listo list)
	{
		for(int i=0;i<list.size;i++)
		{
			System.out.printf("%d ",list.array[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Listo a1=new Listo(10);

		a1.add(5);
		a1.add(7);
		a1.add(9);
		a1.add(11);
		a1.add(13);
		a1.add(15);
		a1.add(17);
		System.out.println(a1.size);
		printlist(a1);
		
		a1.add(10,3);
		printlist(a1);
		

		
		String a="1234567";
		System.out.println(a.length());
	}
}
