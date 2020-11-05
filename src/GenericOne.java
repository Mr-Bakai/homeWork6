
public class GenericOne<T extends  Number> implements GetAndIncrement<T>{
    private T justOne;
    private T justOne2;

    @Override
    public void add(T t, T t2) {
        justOne =t;
        justOne2 =t2;
    }

    @Override
    public T getValue(){
        return  justOne;
    }

    @Override
    public T getValue2() {
        return justOne2;
    }
}

/* Дедлайн 5.11.2020 23:59

    Создать обобщенный класс и обобщенный интерфейс и
    реализовать этот интерфейс классом.                     ☑️

    Ограничить параметры типов классом Number.              ☑️

    В главном классе создать несколько
    экземпляров обобщенного класса.                         ☑️
 */



/*  привет
     интерфейс у тебя не совсем обобщенный
     т.е. ты конечно указал, что он обобщенный, но нигде это не используешь
     метод должен либо принимать параметр S, либо возвращать его
     и буква должны быть одинаковыми, либо и в классе, и в интерфесе S, либо T

 */