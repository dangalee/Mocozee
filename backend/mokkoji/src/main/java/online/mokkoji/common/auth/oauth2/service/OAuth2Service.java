package online.mokkoji.common.auth.oauth2.service;

import online.mokkoji.common.auth.oauth2.dto.response.UserInfoResDto;
import org.springframework.http.ResponseEntity;

public interface OAuth2Service {
    UserInfoResDto getNaverUserInfo(String accessToken) throws Exception;
}
