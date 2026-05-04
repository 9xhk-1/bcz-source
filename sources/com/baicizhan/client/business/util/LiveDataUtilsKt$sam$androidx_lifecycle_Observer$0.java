package com.baicizhan.client.business.util;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LiveDataUtilsKt$sam$androidx_lifecycle_Observer$0 implements Observer, kotlin.jvm.internal.b0 {
    private final /* synthetic */ x00.l function;

    public LiveDataUtilsKt$sam$androidx_lifecycle_Observer$0(x00.l function) {
        g0.p(function, "function");
        this.function = function;
    }

    public final boolean equals(@m80.l Object obj) {
        if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
            return g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b0
    @m80.k
    public final yz.w<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
