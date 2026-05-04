package com.baicizhan.main.activity.schedule_v2;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.media3.common.C;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.schedule_v2.a$a, reason: collision with other inner class name */
    public static final class C0292a implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f18956a;

        public C0292a(l function) {
            g0.p(function, "function");
            this.f18956a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f18956a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18956a.invoke(obj);
        }
    }

    public static final void a(@k SmartTabLayout smartTabLayout, int i11, boolean z11) {
        g0.p(smartTabLayout, "<this>");
        View f11 = smartTabLayout.f(i11);
        if (f11 != null) {
            ((TextView) f11).setTypeface(Typeface.create(!z11 ? C.SANS_SERIF_NAME : "sans-serif-medium", 0));
        }
    }
}
