package jp.ne.papapa.spring_ai_mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    
    /**
     * 足し算を行うメソッド
     *
     * @param a 加算する数値1
     * @param b 加算する数値2
     * @return a と b の合計
     */
    @Tool(description = "足し算を行う")
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 引き算を行うメソッド
     *
     * @param a 減算する数値1
     * @param b 減算する数値2
     * @return a から b を引いた結果
     */
    @Tool(description = "引き算を行う")
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 掛け算を行うメソッド
     *
     * @param a 乗算する数値1
     * @param b 乗算する数値2
     * @return a と b の積
     */
    @Tool(description = "掛け算を行う")
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 割り算を行うメソッド
     *
     * @param a 被除数
     * @param b 除数
     * @return a を b で割った結果
     * @throws IllegalArgumentException b が 0 の場合に発生
     */
    @Tool(description = "割り算を行う")
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
