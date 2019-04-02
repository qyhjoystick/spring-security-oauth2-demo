package com.ljl.user.client;

import com.ljl.user.bean.JWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthServiceHystrix implements AuthServiceClient {
  @Override
  public JWT getToken(String authorization, String grantType, String username, String password) {
    log.error("获取JWT Token失败, authorization: {}, grantType: {}, username: {}, password: {}",
        authorization, grantType, username, password);
    return null;
  }

  @Override
  public JWT refreshToken(String authorization, String grantType, String token) {
    log.error("刷新JWT Token失败, authorization: {}, grantType: {}, refresh_token: {}",
            authorization, grantType, token);
    return null;
  }
}
