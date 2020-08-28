package domain;
import java.lang.reflect.Field;

import annotation.DefaultValue;

public class PictureFactory {

	public static Picture getPicture() throws IllegalArgumentException, IllegalAccessException  {
		Picture picture = new Picture();
		Field[] fld = Picture.class.getDeclaredFields(); 
		
		for(int i = 0 ; i< fld.length ; i++ ) {
			DefaultValue defVal = fld[i].getAnnotation(DefaultValue.class);
			fld[i].setAccessible(true);
			if (fld[i].isAnnotationPresent(DefaultValue.class)) {
				fld[i].set(picture, defVal.value() );
			}
		}
		
		return picture;
	}; 
}
