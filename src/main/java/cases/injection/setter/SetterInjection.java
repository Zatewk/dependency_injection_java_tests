package cases.injection.setter;

import cases.GenericThing;

public class SetterInjection {

    private GenericThing generic;

    public void setGeneric(GenericThing generic) {
        this.generic = generic;
    }

    public void doSomething (int toSubstract){
        this.generic.setValue(this.generic.getValue() - toSubstract);
    }
}
