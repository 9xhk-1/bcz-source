package androidx.lifecycle;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 implements Observer, b0 {
    private final /* synthetic */ l function;

    public CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(l function) {
        g0.p(function, "function");
        this.function = function;
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
