package t30;

import a00.r0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<j> f89420a;

    static {
        ServiceLoader load = ServiceLoader.load(j.class);
        kotlin.jvm.internal.g0.o(load, "load(...)");
        f89420a = r0.a6(load);
    }

    @m80.k
    public static final i a() {
        Iterator<j> it = f89420a.iterator();
        while (it.hasNext()) {
            i a11 = it.next().a();
            if (a11 != null) {
                return a11;
            }
        }
        return f0.f89406a;
    }
}
