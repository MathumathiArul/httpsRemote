package example1;

public class DemoCRUD {

	public static void main(String[] args) {
		int ar1[]=new int[10];
		ar1[0]=10;
		ar1[1]=11;
		ar1[2]=12;
		ar1[3]=14;
		ar1[4]=15;
		System.out.println("Printing the array elements: ");
		for(int i:ar1)
		{
			System.out.println(i+" ");
		}
		System.out.println("Inserting element");
		
		int n=5;
		int pos=2;
		int element=66;
		for(int i=n;i<=pos;i--)
		{
			ar1[i]=ar1[i-1];
		}
		ar1[pos-1]=element;
		n++;
		for(int i:ar1)
		{
			System.out.println(i+" ");
		}
		System.out.println("Deleting element");
		int delpos=2;
		for(int i=delpos-1;i<=n;i++)
		{
			ar1[i]=ar1[i+1];
		}
		System.out.println("Printing the array elements: ");
		for(int i:ar1)
		{
			System.out.println(i+" ");
		}
	}

}
