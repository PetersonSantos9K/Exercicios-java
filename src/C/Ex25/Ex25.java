package C.Ex25;

public class Ex25 {

    static void main(String[] args) {

        Box<String> caixa = new Box<>();

        caixa.setObject("Segredo");
        System.out.println(caixa.getObject());

    }


}


class Box<T>{

    private T object;

    public Box(T t){
        this.object = t;
    }

    public Box(){}

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

