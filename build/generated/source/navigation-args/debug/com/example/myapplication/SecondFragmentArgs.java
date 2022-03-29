package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SecondFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SecondFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SecondFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SecondFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SecondFragmentArgs __result = new SecondFragmentArgs();
    bundle.setClassLoader(SecondFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("mArg")) {
      int mArg;
      mArg = bundle.getInt("mArg");
      __result.arguments.put("mArg", mArg);
    } else {
      throw new IllegalArgumentException("Required argument \"mArg\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getMArg() {
    return (int) arguments.get("mArg");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("mArg")) {
      int mArg = (int) arguments.get("mArg");
      __result.putInt("mArg", mArg);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SecondFragmentArgs that = (SecondFragmentArgs) object;
    if (arguments.containsKey("mArg") != that.arguments.containsKey("mArg")) {
      return false;
    }
    if (getMArg() != that.getMArg()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getMArg();
    return result;
  }

  @Override
  public String toString() {
    return "SecondFragmentArgs{"
        + "mArg=" + getMArg()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(SecondFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int mArg) {
      this.arguments.put("mArg", mArg);
    }

    @NonNull
    public SecondFragmentArgs build() {
      SecondFragmentArgs result = new SecondFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setMArg(int mArg) {
      this.arguments.put("mArg", mArg);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getMArg() {
      return (int) arguments.get("mArg");
    }
  }
}
