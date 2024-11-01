package lotto.view;

import lotto.model.Lotto;

import java.util.List;

public class OutputView {

    public static void printMessageInputPaymentAmount() {
        System.out.println("구입 금액을 입력해 주세요.");
    }

    public static void printMessageInputWinningNumber() {
        System.out.println("당첨 번호를 입력해주세요.");
    }

    public static void printMessageInputBonusNumber() {
        System.out.println("보너스 번호를 입력해주세요.");
    }

    public static void printWinningStatus() {
        System.out.println(String.format("총 수익률은 %.1f%%입니다.", null));
    }
}
