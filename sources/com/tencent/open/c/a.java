package com.tencent.open.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44487a = "com.tencent.open.c.a";

    /* renamed from: b, reason: collision with root package name */
    private Rect f44488b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44489c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0524a f44490d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.open.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0524a {
        void a();

        void a(int i11);
    }

    public a(Context context) {
        super(context);
        this.f44488b = null;
        this.f44489c = false;
        this.f44490d = null;
        this.f44488b = new Rect();
    }

    public void a(InterfaceC0524a interfaceC0524a) {
        this.f44490d = interfaceC0524a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i12);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f44488b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.f44488b.top) - size;
        InterfaceC0524a interfaceC0524a = this.f44490d;
        if (interfaceC0524a != null && size != 0) {
            if (height > 100) {
                interfaceC0524a.a((Math.abs(this.f44488b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                interfaceC0524a.a();
            }
        }
        super.onMeasure(i11, i12);
    }
}
