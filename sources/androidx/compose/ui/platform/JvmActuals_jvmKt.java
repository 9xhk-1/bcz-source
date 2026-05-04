package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class JvmActuals_jvmKt {
    @m80.k
    public static final Object nativeClass(@m80.k Object obj) {
        return obj.getClass();
    }

    @m80.k
    public static final String simpleIdentityToString(@m80.k Object obj, @m80.l String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        sb2.append(format);
        return sb2.toString();
    }

    @w00.j(name = "synchronized")
    @yz.v0
    @yz.n(level = DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m4268synchronized(Object obj, x00.a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.d0.c(1);
        return invoke;
    }

    public static /* synthetic */ void AtomicInt$annotations() {
    }
}
