package r00;

import java.io.Closeable;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "CloseableKt")
/* loaded from: classes8.dex */
public final class b {
    @y0(version = "1.1")
    @v0
    public static final void a(@m80.l Closeable closeable, @m80.l Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                yz.r.a(th2, th3);
            }
        }
    }

    @o00.f
    public static final <T extends Closeable, R> R b(T t11, x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        try {
            R invoke = block.invoke(t11);
            d0.d(1);
            a(t11, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }
}
