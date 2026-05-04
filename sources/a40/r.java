package a40;

import a40.m;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n f1939a;

    static {
        f1939a = c("kotlinx.atomicfu.trace.thread") != null ? new p() : new n();
    }

    @m80.k
    @o00.f
    public static final m a(int i11, @m80.k n format) {
        g0.p(format, "format");
        return new q(i11, format);
    }

    public static /* synthetic */ m b(int i11, n nVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 32;
        }
        if ((i12 & 2) != 0) {
            nVar = f1939a;
        }
        return a(i11, nVar);
    }

    public static final String c(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    @m80.k
    public static final n d() {
        return f1939a;
    }

    @m80.k
    public static final m e(@m80.k m mVar, @m80.k String name) {
        g0.p(mVar, "<this>");
        g0.p(name, "name");
        return mVar == m.a.f1932a ? mVar : new l(mVar, name);
    }
}
