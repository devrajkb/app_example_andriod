package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FirstFragmentDirections {
  private FirstFragmentDirections() {
  }

  @NonNull
  public static ActionFirstFragmentToSecondFragment actionFirstFragmentToSecondFragment(int mArg) {
    return new ActionFirstFragmentToSecondFragment(mArg);
  }

  public static class ActionFirstFragmentToSecondFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionFirstFragmentToSecondFragment(int mArg) {
      this.arguments.put("mArg", mArg);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFirstFragmentToSecondFragment setMArg(int mArg) {
      this.arguments.put("mArg", mArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("mArg")) {
        int mArg = (int) arguments.get("mArg");
        __result.putInt("mArg", mArg);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_FirstFragment_to_SecondFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMArg() {
      return (int) arguments.get("mArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFirstFragmentToSecondFragment that = (ActionFirstFragmentToSecondFragment) object;
      if (arguments.containsKey("mArg") != that.arguments.containsKey("mArg")) {
        return false;
      }
      if (getMArg() != that.getMArg()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMArg();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFirstFragmentToSecondFragment(actionId=" + getActionId() + "){"
          + "mArg=" + getMArg()
          + "}";
    }
  }
}
