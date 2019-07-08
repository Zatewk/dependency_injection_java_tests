package cases.injection.constructor;

import cases.Thing;

public class ConstructorInjection {

    private Thing generic;

    public ConstructorInjection (Thing thing){
        this.generic = thing;
    }

    public void doSomething (int toAdd){
        this.generic.setValue(this.generic.getValue() + toAdd);
    }
}
