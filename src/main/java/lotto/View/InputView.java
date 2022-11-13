package lotto.View;

import lotto.Utils.Util;

public class InputView {

    public static final String PRINT_ASK_AMOUT = "구입금액을 입력해주세요.";
    public static final String PRINT_ASK_WINNING_LOTTO = "당첨금액을 입력해주세요.";
    public static String purchaseAmountInput(){
        System.out.println(PRINT_ASK_AMOUT);
        return Util.getInput();
    }

    public static String WinningLottoInput(){
        System.out.println(PRINT_ASK_WINNING_LOTTO);
        return Util.getInput();
    }


}
