package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f9921a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final LottieAnimationView f9922b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final o0 f9923c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9924d;

    @VisibleForTesting
    public a1() {
        this.f9921a = new HashMap();
        this.f9924d = true;
        this.f9922b = null;
        this.f9923c = null;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f9924d && this.f9921a.containsKey(str2)) {
            return this.f9921a.get(str2);
        }
        String b11 = b(str, str2);
        if (this.f9924d) {
            this.f9921a.put(str2, b11);
        }
        return b11;
    }

    public final void d() {
        LottieAnimationView lottieAnimationView = this.f9922b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        o0 o0Var = this.f9923c;
        if (o0Var != null) {
            o0Var.invalidateSelf();
        }
    }

    public void e() {
        this.f9921a.clear();
        d();
    }

    public void f(String str) {
        this.f9921a.remove(str);
        d();
    }

    public void g(boolean z11) {
        this.f9924d = z11;
    }

    public void h(String str, String str2) {
        this.f9921a.put(str, str2);
        d();
    }

    public a1(LottieAnimationView lottieAnimationView) {
        this.f9921a = new HashMap();
        this.f9924d = true;
        this.f9922b = lottieAnimationView;
        this.f9923c = null;
    }

    public a1(o0 o0Var) {
        this.f9921a = new HashMap();
        this.f9924d = true;
        this.f9923c = o0Var;
        this.f9922b = null;
    }

    public String a(String str) {
        return str;
    }
}
