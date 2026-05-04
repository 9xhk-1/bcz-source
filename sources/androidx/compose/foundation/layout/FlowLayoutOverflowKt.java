package androidx.compose.foundation.layout;

import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    @m80.k
    public static final c0<Integer> lazyInt(@m80.k String str, @m80.k x00.a<Integer> aVar) {
        return new LazyImpl(aVar, str);
    }

    public static /* synthetic */ c0 lazyInt$default(String str, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, aVar);
    }
}
