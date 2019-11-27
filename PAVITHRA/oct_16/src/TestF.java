
public class TestF {

	public static void main(String[] args) {
	Card r = new Card();
	Card b = new Card();
	Card o = new Card();
	r.swipe();
	b.swipe();
	o.swipe();
	o.swipe();
	b.swipe();
	b.swipe();
	r.swipe();
	System.out.println("the org count"+Card.orgcount);
	System.out.println("the r count"+r.count);
	System.out.println("the b count"+b.count);
	System.out.println("the o count"+o.count);
	}

}
