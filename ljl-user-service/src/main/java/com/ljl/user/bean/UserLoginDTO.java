package com.ljl.user.bean;

import lombok.Data;

@Data
public class UserLoginDTO {
  private User user;
  private JWT jwt;
}
