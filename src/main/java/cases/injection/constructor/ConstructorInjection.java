package cases.injection.constructor;

import cases.GenericThing;

public class ConstructorInjection {

    private GenericThing generic;

    public ConstructorInjection (GenericThing thing){
        this.generic = thing;
    }

}
