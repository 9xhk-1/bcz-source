package xy;

import c40.l2;
import c40.x2;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import org.junit.jupiter.api.j2;
import org.slf4j.LoggerFactory;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nNonce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nonce.kt\nio/ktor/util/NonceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes8.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f98585a = "SHA1PRNG";

    /* renamed from: c, reason: collision with root package name */
    public static final int f98587c = 30000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f98588d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f98589e = 4;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c40.q0 f98591g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final l2 f98592h;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final List<String> f98586b = a00.h0.Q("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final e40.o<String> f98590f = e40.r.d(1024, null, null, 6, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98593a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98594b;

        /* renamed from: c, reason: collision with root package name */
        public Object f98595c;

        /* renamed from: d, reason: collision with root package name */
        public Object f98596d;

        /* renamed from: e, reason: collision with root package name */
        public Object f98597e;

        /* renamed from: f, reason: collision with root package name */
        public Object f98598f;

        /* renamed from: g, reason: collision with root package name */
        public Object f98599g;

        /* renamed from: h, reason: collision with root package name */
        public long f98600h;

        /* renamed from: i, reason: collision with root package name */
        public int f98601i;

        /* renamed from: j, reason: collision with root package name */
        public int f98602j;

        /* renamed from: k, reason: collision with root package name */
        public int f98603k;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00d4 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00f5, B:10:0x00d4, B:14:0x00f7, B:16:0x0106, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00f7 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00f5, B:10:0x00d4, B:14:0x00f7, B:16:0x0106, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x0040, LOOP:1: B:21:0x007c->B:22:0x007e, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00f5, B:10:0x00d4, B:14:0x00f7, B:16:0x0106, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00f5, B:10:0x00d4, B:14:0x00f7, B:16:0x0106, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00f5, B:10:0x00d4, B:14:0x00f7, B:16:0x0106, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00f2 -> B:8:0x00f5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xy.l1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        c40.q0 q0Var = new c40.q0("nonce-generator");
        f98591g = q0Var;
        f98592h = c40.i.d(c40.b2.f7824a, c40.h1.c().plus(x2.f8011a).plus(q0Var), CoroutineStart.LAZY, new a(null));
    }

    public static final void b() {
        f98592h.start();
    }

    public static final SecureRandom c(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static /* synthetic */ SecureRandom d(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return c(str);
    }

    @m80.k
    public static final e40.o<String> f() {
        return f98590f;
    }

    public static final SecureRandom g() {
        SecureRandom c11;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (c11 = c(property)) != null) {
            return c11;
        }
        Iterator<String> it = f98586b.iterator();
        while (it.hasNext()) {
            SecureRandom c12 = c(it.next());
            if (c12 != null) {
                return c12;
            }
        }
        LoggerFactory.getLogger("io.ktor.util.random").warn("None of the " + a00.r0.r3(f98586b, j2.O, null, null, 0, null, null, 62, null) + " found, fallback to default");
        SecureRandom d11 = d(null, 1, null);
        if (d11 != null) {
            return d11;
        }
        throw new IllegalStateException("No SecureRandom implementation found");
    }

    public static /* synthetic */ void e() {
    }
}
