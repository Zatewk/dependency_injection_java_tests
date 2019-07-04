package cases;

import cases.injection.constructor.ConstructorInjection;
import cases.injection.setter.SetterInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GenericThing thing = new GenericThing(10);
        System.out.println( "The value of this thing is: "+thing.getValue() );

        ConstructorInjection ci = new ConstructorInjection(thing);
        ci.doSomething(5);
        System.out.println( "The value of this thing is: "+thing.getValue() );

        SetterInjection si = new SetterInjection();
        si.setGeneric(thing);
        si.doSomething(10);
        System.out.println( "The value of this thing is: "+thing.getValue() );
    }
}
