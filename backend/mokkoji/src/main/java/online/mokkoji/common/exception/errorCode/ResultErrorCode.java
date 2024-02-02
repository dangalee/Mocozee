package online.mokkoji.common.exception.errorCode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResultErrorCode implements ErrorCode {

    NO_RESULT_ID(409, "존재하지 않는 결과물입니다"),
    NO_BACKGROUND_ID(409, "존재하지 않는 배경 템플릿입니다"),
    NO_POSTIT_ID(409, "존재하지 않는 포스트잇 템플릿입니다");

    private final Integer errorCode;
    private final String errorMessage;
}

