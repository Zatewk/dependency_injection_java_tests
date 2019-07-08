package cases;

public class GenericThing implements Thing {

    private int value;

    public GenericThing(int value){
        this.value = value;
    }

    public int getValue (){
        return this.value;
    }

    public void setValue (int value){
        this.value = value;
    }
}
