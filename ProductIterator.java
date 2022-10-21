import java.util.Iterator;

public class ProductIterator {

	private ClassProductList classProductList;


	public boolean hasNext(Iterator itr) {
		return itr.hasNext();
	}

	public Object Next(Iterator itr) {
       if(this.hasNext(itr)){
		   return itr.next();
	   }
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
