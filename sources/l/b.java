package l;

import java.io.Closeable;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static final <T extends Closeable, R> R a(T t11, @k l<? super T, ? extends R> body) {
        g0.p(body, "body");
        try {
            R invoke = body.invoke(t11);
            d0.d(1);
            r00.b.a(t11, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }
}
