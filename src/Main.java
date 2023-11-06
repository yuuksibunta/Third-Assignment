import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // String型の要素を持つArrayListを作成
        List<String> stringList = new ArrayList<>();

        // リストに要素を追加
        stringList.add("りんご");
        stringList.add("バナナ");
        stringList.add("オレンジ");

        // リストの要素を表示
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}