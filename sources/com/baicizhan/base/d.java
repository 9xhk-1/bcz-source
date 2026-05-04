package com.baicizhan.base;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f15912a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final float f15913b = 1.2f;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15914c = 0;

    @o
    @k
    public static final Context a(@k Context context) {
        g0.p(context, "context");
        return !a.a(context) ? context : f15912a.f(context);
    }

    @o
    public static final void b(@k Paint paint, @k Context context) {
        g0.p(paint, "paint");
        g0.p(context, "context");
        if (a.a(context)) {
            paint.setTextSize(paint.getTextSize() * 1.2f);
        }
    }

    @o
    public static final void c(@k TextView textView, @k Context context) {
        g0.p(textView, "textView");
        g0.p(context, "context");
        if (a.a(context)) {
            textView.setTextSize(2, (textView.getTextSize() / context.getResources().getDisplayMetrics().scaledDensity) * 1.2f);
        }
    }

    @o
    public static final void d(@k ViewGroup viewGroup, @k Context context) {
        g0.p(viewGroup, "viewGroup");
        g0.p(context, "context");
        if (a.a(context)) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof TextView) {
                    c((TextView) childAt, context);
                } else if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, context);
                }
            }
        }
    }

    @o
    public static final float g() {
        return 1.2f;
    }

    @o
    public static final float h(float f11, @k Context context) {
        g0.p(context, "context");
        return !a.a(context) ? f11 : f11 * 1.2f;
    }

    @o
    public static final boolean i(@k Context context) {
        g0.p(context, "context");
        return a.a(context);
    }

    public final float e(Context context) {
        return context.getResources().getConfiguration().fontScale * 1.2f;
    }

    public final Context f(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.fontScale = e(context);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        g0.o(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }
}
