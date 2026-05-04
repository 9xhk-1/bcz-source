package u00;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import o00.f;
import w00.j;
import yz.g2;
import yz.r;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "AutoCloseableKt")
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAutoCloseableJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloseableJVM.kt\nkotlin/jdk7/AutoCloseableKt$AutoCloseable$1\n*L\n1#1,49:1\n*E\n"})
    /* renamed from: u00.a$a, reason: collision with other inner class name */
    public static final class C1219a implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f91506a;

        public C1219a(x00.a<g2> aVar) {
            this.f91506a = aVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f91506a.invoke();
        }
    }

    @y0(version = "2.0")
    @f
    public static final AutoCloseable a(x00.a<g2> closeAction) {
        g0.p(closeAction, "closeAction");
        return new C1219a(closeAction);
    }

    @y0(version = "1.2")
    @v0
    public static final void c(@l AutoCloseable autoCloseable, @l Throwable th2) {
        if (autoCloseable != null) {
            if (th2 == null) {
                androidx.documentfile.provider.a.a(autoCloseable);
                return;
            }
            try {
                androidx.documentfile.provider.a.a(autoCloseable);
            } catch (Throwable th3) {
                r.a(th2, th3);
            }
        }
    }

    @y0(version = "1.2")
    @f
    public static final <T extends AutoCloseable, R> R d(T t11, x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        try {
            R invoke = block.invoke(t11);
            d0.d(1);
            c(t11, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }

    @y0(version = "2.0")
    public static /* synthetic */ void b() {
    }
}
