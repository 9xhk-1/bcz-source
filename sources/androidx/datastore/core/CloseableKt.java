package androidx.datastore.core;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(@k T t11, @k l<? super T, ? extends R> block) {
        g0.p(t11, "<this>");
        g0.p(block, "block");
        try {
            R invoke = block.invoke(t11);
            d0.d(1);
            try {
                t11.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                throw th;
            }
            d0.c(1);
            return invoke;
        } catch (Throwable th3) {
            d0.d(1);
            try {
                t11.close();
            } catch (Throwable th4) {
                r.a(th3, th4);
            }
            throw th3;
        }
    }
}
