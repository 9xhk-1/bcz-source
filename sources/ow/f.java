package ow;

import c40.m0;
import c40.v1;
import java.io.Closeable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m0 m0Var) {
        try {
            if (m0Var instanceof v1) {
                ((v1) m0Var).close();
            } else if (m0Var instanceof Closeable) {
                ((Closeable) m0Var).close();
            }
        } catch (Throwable unused) {
        }
    }
}
