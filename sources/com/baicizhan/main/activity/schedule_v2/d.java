package com.baicizhan.main.activity.schedule_v2;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f19250a = "top_all_index";

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f19251b = "PositionedBooksFragment";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f19252a;

        public a(l function) {
            g0.p(function, "function");
            this.f19252a = function;
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
            return this.f19252a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19252a.invoke(obj);
        }
    }
}
