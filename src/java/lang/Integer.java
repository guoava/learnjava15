package java.lang;

/**
 * 捣乱的类。包名和类名跟 Java 平台的一样.
 * <p>
 * 委托模型(Delegation Model)。一个类加载器
 * 将把对类的加载任务委托给它的上层（Parent）去做。具体来说，一个类加载器自己先不
 * 加载，而是交给它的上层去处理，而上层又再交给它的上层去处理，一层层委托上去一直
 * 到根类加载器，如果上层发现自己加载不了这个的类，才会反交给下层加载。
 */
public class Integer {
    public Integer() {

    }

    public static void main(String[] args) {
        System.out.println("I am a fake Integer class. Hah Hah!");
    }

}
