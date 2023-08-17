package bridge.View;

import bridge.Error.ArgumentError;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final ArgumentError argumentError;

    public InputView() {
        this.argumentError = new ArgumentError();
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String bridgeSizeString = Console.readLine();
        argumentError.sizeCheck(bridgeSizeString);
        int bridgeSizeInt = Integer.parseInt(bridgeSizeString);
        return bridgeSizeInt;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String moving = Console.readLine();
        argumentError.movingCheck(moving);
        return moving;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String gameCommand = Console.readLine();
        argumentError.gameCommandCheck(gameCommand);
        return gameCommand;
    }
}