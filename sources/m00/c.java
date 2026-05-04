package m00;

import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.j2;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "2.0")
    @j2(markerClass = {kotlin.c.class})
    public static final /* synthetic */ <T extends Enum<T>> a<T> a() {
        throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    @y0(version = "1.8")
    @v0
    @k
    public static final <E extends Enum<E>> a<E> b(@k x00.a<E[]> entriesProvider) {
        g0.p(entriesProvider, "entriesProvider");
        return new d(entriesProvider.invoke());
    }

    @y0(version = "1.8")
    @v0
    @k
    public static final <E extends Enum<E>> a<E> c(@k E[] entries) {
        g0.p(entries, "entries");
        return new d(entries);
    }
}
