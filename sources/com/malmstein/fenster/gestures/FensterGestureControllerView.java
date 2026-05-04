package com.malmstein.fenster.gestures;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ms.a;
import ms.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class FensterGestureControllerView extends View {

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f39190a;

    /* renamed from: b, reason: collision with root package name */
    public a f39191b;

    public FensterGestureControllerView(Context context) {
        super(context);
    }

    public final void a(MotionEvent event) {
        this.f39190a.onTouchEvent(event);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        a(event);
        return true;
    }

    public void setFensterEventsListener(a listener) {
        this.f39190a = new GestureDetector(getContext(), new b(listener, ViewConfiguration.get(getContext())));
    }

    public FensterGestureControllerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FensterGestureControllerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
