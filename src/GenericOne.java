import org.w3c.dom.ls.LSOutput;

public class GenericOne<T extends  Number> implements GetAndIncrement<T>{
    private T justOne;
    private T justOne1;

    public void GenericOne(T justOne, T justOne1){
        this.justOne=justOne;
        this.justOne1=justOne1;
    }

    public void setJustOne(T justOne){
        this.justOne=justOne;
    }

    public T getJustOne(){
        return justOne;
    }

    public T getJustOne1() {
        return justOne1;
    }

    public void setJustOne1(T justOne1) {
        this.justOne1 = justOne1;
    }

    @Override
    public void addAndIncr() {
        System.out.println("\n--------------------------------------------");
        System.out.println(justOne.doubleValue() + justOne1.doubleValue());
    }
}

/* Дедлайн 5.11.2020 23:59

    Создать обобщенный класс и обобщенный интерфейс и
    реализовать этот интерфейс классом.                     ☑️

    Ограничить параметры типов классом Number.              ☑️

    В главном классе создать несколько
    экземпляров обобщенного класса.                         ☑️
 */
