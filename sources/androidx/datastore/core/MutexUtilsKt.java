package androidx.datastore.core;

import i00.f;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MutexUtilsKt {
    @f
    public static final <R> R withTryLock(@k n40.a aVar, @l Object obj, @k x00.l<? super Boolean, ? extends R> block) {
        g0.p(aVar, "<this>");
        g0.p(block, "block");
        boolean tryLock = aVar.tryLock(obj);
        try {
            return block.invoke(Boolean.valueOf(tryLock));
        } finally {
            d0.d(1);
            if (tryLock) {
                aVar.unlock(obj);
            }
            d0.c(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(n40.a aVar, Object obj, x00.l block, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        g0.p(aVar, "<this>");
        g0.p(block, "block");
        boolean tryLock = aVar.tryLock(obj);
        try {
            return block.invoke(Boolean.valueOf(tryLock));
        } finally {
            d0.d(1);
            if (tryLock) {
                aVar.unlock(obj);
            }
            d0.c(1);
        }
    }
}
