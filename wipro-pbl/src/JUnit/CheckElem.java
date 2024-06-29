package JUnit;

public class CheckElem {

	public boolean  present(int a[],int k)
	{
		int l=0;
		int r=a.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(a[mid]==k)
				return true;
			else if(a[mid]>k)
				l=mid+1;
			else
				r=mid-1;
		}
		return false;
	}
}
