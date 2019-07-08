package cases.injection.setter;

import cases.Thing;

public class SetterInjection {

    private Thing generic;

    public void setGeneric(Thing generic) {
        this.generic = generic;
    }

    public void doSomething (int toSubstract){
        this.generic.setValue(this.generic.getValue() - toSubstract);
    }
}
