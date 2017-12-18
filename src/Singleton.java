/**
 * Created by flallard on 18/12/2017.
 */
public class Singleton {
    private volatile Singleton instance ;

    private Singleton () {} // C o n s t r u c t e u r p r i v e . . .

    public Singleton getInstance () {
        Singleton result = instance;
        if (result == null) { // 1 e r e v e r i f ( pa s de v e r r o u )
            synchronized (this) {
                result = instance;
                if (result == null) { // 2eme v e r i f ( a v e c v e r r o u )
                    instance = result = new Singleton();
                }
            }
        }
        return instance;
    }
}
