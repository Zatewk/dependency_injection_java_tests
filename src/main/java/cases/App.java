package cases;

import cases.injection.constructor.ConstructorInjection;

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
        System.out.println( "The value of this thing is: "+thing.getValue() );

    }
}
