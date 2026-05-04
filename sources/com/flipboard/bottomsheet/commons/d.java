package com.flipboard.bottomsheet.commons;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(21)
    public static class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public int f29589a;

        /* renamed from: b, reason: collision with root package name */
        public int f29590b;

        public a(int width, int height) {
            this.f29589a = width;
            this.f29590b = height;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, this.f29589a, this.f29590b);
        }
    }

    public d() {
        throw new AssertionError("No Instances");
    }

    public static int a(Context context, float dp2) {
        return Math.round(TypedValue.applyDimension(1, dp2, context.getResources().getDisplayMetrics()));
    }
}
