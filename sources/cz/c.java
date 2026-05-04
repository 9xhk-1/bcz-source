package cz;

import java.lang.management.ManagementFactory;
import m80.k;
import u30.k0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f46983a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c0 f46984b = e0.c(new x00.a() { // from class: cz.b
        @Override // x00.a
        public final Object invoke() {
            boolean c11;
            c11 = c.c();
            return Boolean.valueOf(c11);
        }
    });

    public static final boolean c() {
        try {
            return k0.n3(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false, 2, null);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b() {
        return ((Boolean) f46984b.getValue()).booleanValue();
    }
}
