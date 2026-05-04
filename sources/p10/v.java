package p10;

import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final z<w> f78613a = new z<>("InvalidModuleNotifier");

    public static final void a(@m80.k a0 a0Var) {
        kotlin.jvm.internal.g0.p(a0Var, "<this>");
        w wVar = (w) a0Var.A0(f78613a);
        if (wVar != null) {
            wVar.a(a0Var);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + a0Var);
    }
}
