package xy;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class d0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1", f = "CryptoJvm.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98494a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super String> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98494a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            e40.o<String> f11 = l1.f();
            this.f98494a = 1;
            Object H = f11.H(this);
            return H == l11 ? l11 : H;
        }
    }

    @m80.k
    public static final k0 b(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance(name);
        kotlin.jvm.internal.g0.o(messageDigest, "getInstance(...)");
        return l0.c(l0.e(messageDigest));
    }

    @m80.k
    public static final String c() {
        String str = (String) e40.s.h(l1.f().O());
        return str != null ? str : d();
    }

    public static final String d() {
        Object b11;
        l1.b();
        b11 = c40.j.b(null, new a(null), 1, null);
        return (String) b11;
    }

    public static final byte[] e(String str, String str2, x00.l<? super String, String> lVar) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        String invoke = lVar.invoke(str);
        Charset charset = u30.d.f91599b;
        byte[] bytes = invoke.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes2, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes2);
        kotlin.jvm.internal.g0.o(digest, "with(...)");
        return digest;
    }

    @m80.k
    public static final x00.l<String, byte[]> f(@m80.k final String algorithm, @m80.k final x00.l<? super String, String> salt) {
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(salt, "salt");
        return new x00.l() { // from class: xy.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                byte[] g11;
                g11 = d0.g(algorithm, salt, (String) obj);
                return g11;
            }
        };
    }

    public static final byte[] g(String str, x00.l lVar, String e11) {
        kotlin.jvm.internal.g0.p(e11, "e");
        return e(e11, str, lVar);
    }

    @m80.k
    public static final byte[] h(@m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        byte[] digest = MessageDigest.getInstance("SHA1").digest(bytes);
        kotlin.jvm.internal.g0.o(digest, "digest(...)");
        return digest;
    }
}
