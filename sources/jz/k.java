package jz;

import java.io.Closeable;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {
    public static final <T extends Closeable, R> R a(T t11, @m80.k x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        try {
            R invoke = block.invoke(t11);
            d0.d(1);
            if (t11 != null) {
                t11.close();
            }
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            try {
                if (t11 != null) {
                    try {
                        t11.close();
                    } finally {
                        throw th2;
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                d0.d(1);
                d0.c(1);
            }
        }
    }
}
