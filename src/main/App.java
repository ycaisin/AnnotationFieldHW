package main;

import domain.PictureFactory;

public class App {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		PictureFactory pf = new PictureFactory();
		System.out.println(PictureFactory.getPicture());

	}

}
