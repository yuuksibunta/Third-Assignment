import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // String型の要素を持つArrayListを作成
        List<String> stringList = new ArrayList<>();
        //差分作りました//
        // リストに要素を追加
        stringList.add("りんご");
        stringList.add("バナナ");
        stringList.add("オレンジ");

        // 特定の条件をチェック
        if (stringList.isEmpty()) {
            // 条件が満たされた場合、独自の例外をスロー
            throw new CustomException("リストが空です。");
        }

        // リストの要素を表示
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}