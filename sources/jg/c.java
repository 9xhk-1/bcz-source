package jg;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f64073d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f64074a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f64075b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dc0.c<Boolean> f64076c;

    public c(@k View mGuideView, @k View clickView) {
        g0.p(mGuideView, "mGuideView");
        g0.p(clickView, "clickView");
        this.f64074a = mGuideView;
        this.f64075b = clickView;
        dc0.c<Boolean> y72 = dc0.c.y7();
        g0.o(y72, "create(...)");
        this.f64076c = y72;
        mGuideView.setOnClickListener(new View.OnClickListener() { // from class: jg.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.c(view);
            }
        });
        clickView.setOnClickListener(new View.OnClickListener() { // from class: jg.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.d(c.this, view);
            }
        });
    }

    public static final void d(c cVar, View view) {
        cVar.f64076c.onNext(Boolean.TRUE);
    }

    @k
    public final View e() {
        return this.f64075b;
    }

    @k
    public final View f() {
        return this.f64074a;
    }

    @k
    public final dc0.c<Boolean> g() {
        return this.f64076c;
    }

    public static final void c(View view) {
    }
}
