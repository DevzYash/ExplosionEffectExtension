package com.yash.explosion;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;
import tyrantgit.explosionfield.*;

public class Explosion extends AndroidNonvisibleComponent {
public Context context;
public Activity activity;
public ExplosionField explosionField;
  public Explosion(ComponentContainer container) {
    super(container.$form());
    this.context = container.$context();
    this.activity = (Activity) context;
    explosionField = ExplosionField.attach2Window(activity);
  }

  @SimpleFunction(description = "Returns the sum of the given list of integers.")
  public void Add(AndroidViewComponent component,int duration) {
    View view = component.getView();

    explosionField.explode(view,duration);


  }
  @SimpleFunction(description = "Returns the sum of the given list of integers.")
  public void Dismiss(AndroidViewComponent component) {
    View view = component.getView();
    view.setScaleX(1);
    view.setScaleY(1);
    view.setAlpha(1);
    view.invalidate();
    view.setVisibility(View.VISIBLE);
  }



}
