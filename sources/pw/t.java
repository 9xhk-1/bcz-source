package pw;

import c40.l2;
import cx.z;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import ix.f1;
import ix.q0;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.Protocol;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkUtils.kt\nio/ktor/client/engine/okhttp/OkUtilsKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,89:1\n351#2,11:90\n*S KotlinDebug\n*F\n+ 1 OkUtils.kt\nio/ktor/client/engine/okhttp/OkUtilsKt\n*L\n22#1:90,11\n*E\n"})
/* loaded from: classes8.dex */
public final class t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81290a;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.SPDY_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f81290a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t50.b f81291a;

        public b(t50.b bVar) {
            this.f81291a = bVar;
        }

        public final void a(Throwable th2) {
            this.f81291a.cancel();
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nOkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkUtils.kt\nio/ktor/client/engine/okhttp/OkUtilsKt$fromOkHttp$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
    public static final class c implements q0 {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f81292d = true;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ okhttp3.h f81293e;

        public c(okhttp3.h hVar) {
            this.f81293e = hVar;
        }

        @Override // xy.u1
        public List<String> a(String name) {
            g0.p(name, "name");
            List<String> p11 = this.f81293e.p(name);
            if (p11.isEmpty()) {
                return null;
            }
            return p11;
        }

        @Override // xy.u1
        public boolean b() {
            return this.f81292d;
        }

        @Override // xy.u1
        public boolean c(String str, String str2) {
            return q0.b.b(this, str, str2);
        }

        @Override // xy.u1
        public boolean contains(String str) {
            return q0.b.a(this, str);
        }

        @Override // xy.u1
        public void d(x00.p<? super String, ? super List<String>, g2> pVar) {
            q0.b.c(this, pVar);
        }

        @Override // xy.u1
        public Set<Map.Entry<String, List<String>>> entries() {
            return this.f81293e.n().entrySet();
        }

        @Override // xy.u1
        public String get(String str) {
            return q0.b.d(this, str);
        }

        @Override // xy.u1
        public boolean isEmpty() {
            return this.f81293e.size() == 0;
        }

        @Override // xy.u1
        public Set<String> names() {
            return this.f81293e.j();
        }
    }

    @m80.l
    public static final Object b(@m80.k t50.q qVar, @m80.k okhttp3.l lVar, @m80.k z zVar, @m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super okhttp3.n> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        t50.b b11 = qVar.b(lVar);
        d.b bVar = dVar.get(l2.f7886e0);
        g0.m(bVar);
        l2.a.g((l2) bVar, true, false, new b(b11), 2, null);
        b11.U(new pw.b(zVar, pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @m80.k
    public static final q0 c(@m80.k okhttp3.h hVar) {
        g0.p(hVar, "<this>");
        return new c(hVar);
    }

    @m80.k
    public static final f1 d(@m80.k Protocol protocol) {
        g0.p(protocol, "<this>");
        switch (a.f81290a[protocol.ordinal()]) {
            case 1:
                return f1.f62772d.b();
            case 2:
                return f1.f62772d.c();
            case 3:
                return f1.f62772d.f();
            case 4:
                return f1.f62772d.d();
            case 5:
                return f1.f62772d.d();
            case 6:
                return f1.f62772d.e();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean e(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && k0.k3(message, "connect", true);
    }

    public static final Throwable f(z zVar, IOException iOException) {
        if (!(iOException instanceof StreamAdapterIOException)) {
            return iOException instanceof SocketTimeoutException ? e(iOException) ? rw.f1.b(zVar, iOException) : rw.f1.h(zVar, iOException) : iOException;
        }
        Throwable cause = iOException.getCause();
        return cause == null ? iOException : cause;
    }
}
