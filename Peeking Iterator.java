// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    int cur=0;
    boolean flag=false;
    Iterator<Integer> iterator=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
	    if(iterator.hasNext())
	    {
	        flag=true;
	        cur=iterator.next();
	    }
	    
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       return cur; 
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int tmp=cur;
	    if(iterator.hasNext())
	        cur=iterator.next();
	    else
	        flag=false;
	    return tmp;
	}

	@Override
	public boolean hasNext() {
	   if(flag)
	    return true;
	   return false;
	}
}