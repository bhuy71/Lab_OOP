package hust.soict.dsai.test.cart;
import java.util.Collections;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class CartTest {
	public static void main(String[] args) {
		Cart cart=new Cart();
		DigitalVideoDisc dvd1= new DigitalVideoDisc(1,"The Lion King","Animation","Roger Allers",87,19.95f);
		cart.addMedia(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc(2,"Star Wars","Science Fiction","George Lucas",87,24.95f);
		cart.addMedia(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc(3,"Aladin","Animation",18.99f);
		cart.addMedia(dvd3);
		cart.print();
//		Collections.sort(cart.getItemsOrdered(),Media.COMPARE_BY_COST_TITLE);
//		System.out.println(cart.getItemsOrdered());
		Collections.sort(cart.getItemsOrdered(),Media.COMPARE_BY_TITLE_COST);
		System.out.println(cart.getItemsOrdered());
	}
}
