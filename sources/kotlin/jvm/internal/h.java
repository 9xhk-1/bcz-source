package kotlin.jvm.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @m80.k
    public static final <T> Iterator<T> a(@m80.k T[] array) {
        g0.p(array, "array");
        return new g(array);
    }
}
