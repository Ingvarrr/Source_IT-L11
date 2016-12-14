/**
 * Created by vig on 11/7/16.
 */
public class MyNewException extends Exception {
    private String name;
    private long id;

    public MyNewException(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
