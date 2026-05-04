package l60;

import java.io.Closeable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class t0 {
    @w00.j(name = "blackhole")
    @m80.k
    public static final e1 a() {
        return new j();
    }

    @m80.k
    public static final l b(@m80.k e1 e1Var) {
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        return new a1(e1Var);
    }

    @m80.k
    public static final m c(@m80.k g1 g1Var) {
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        return new b1(g1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final <T extends Closeable, R> R d(T t11, @m80.k x00.l<? super T, ? extends R> block) {
        ?? r42;
        kotlin.jvm.internal.g0.p(block, "block");
        R th2 = null;
        try {
            R invoke = block.invoke(t11);
            kotlin.jvm.internal.d0.d(1);
            if (t11 != null) {
                try {
                    t11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.d0.c(1);
            R r11 = th2;
            th2 = invoke;
            r42 = r11;
        } catch (Throwable th4) {
            kotlin.jvm.internal.d0.d(1);
            if (t11 != null) {
                try {
                    t11.close();
                } catch (Throwable th5) {
                    yz.r.a(th4, th5);
                }
            }
            kotlin.jvm.internal.d0.c(1);
            r42 = th4;
        }
        if (r42 == 0) {
            return th2;
        }
        throw r42;
    }
}
