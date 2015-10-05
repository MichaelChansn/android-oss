package com.kickstarter.ui.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.kickstarter.KSApplication;
import com.kickstarter.libs.Font;

import javax.inject.Inject;

public class TiemposTextView extends TextView {
  @Inject Font font;

  public TiemposTextView(@NonNull final Context context) {
    super(context);
    initialize(context, null, 0, 0);
  }

  public TiemposTextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
    super(context, attrs);
    initialize(context, attrs, 0, 0);
  }

  public TiemposTextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    initialize(context, attrs, defStyleAttr, 0);
  }

  @SuppressWarnings("deprecation")
  public TiemposTextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr,
    final int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    initialize(context, attrs, defStyleAttr, defStyleRes);
  }

  void initialize(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr,
    final int defStyleRes) {
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();

    if (isInEditMode()) {
      return;
    }

    ((KSApplication) getContext().getApplicationContext()).component().inject(this);
    setTypeface(font.tiemposTypeface());
  }
}
