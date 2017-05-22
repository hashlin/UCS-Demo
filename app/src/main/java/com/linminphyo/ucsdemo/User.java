package com.linminphyo.ucsdemo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by lin on 5/21/17.
 */

public class User implements Serializable {
  @SerializedName("tvName")
  String name ;

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }
}
