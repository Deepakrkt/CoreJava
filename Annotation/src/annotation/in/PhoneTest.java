package annotation.in;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Marker Annotation = Marker annotation that does not take method
// Single Value Annotation
// Multiple Value Annotation


// Meta Annotation = when ever u want to create your own Annotation that you have to specify 2 Annotation on where should you want to like class level or Runtime level.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android",version=6)
class NokiaSeries{
	String model;
	int size;
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
	
	
}

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NokiaSeries obj1 = new NokiaSeries("Fire", 4);
		System.out.println(obj1.model);
		
		Class c = obj1.getClass(); // Reflection API to fetch the value of Annotation
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
		
		

	}

}
