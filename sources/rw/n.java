package rw;

import c40.l2;
import ix.k;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v.e {

        /* renamed from: b, reason: collision with root package name */
        public final Long f84724b;

        /* renamed from: c, reason: collision with root package name */
        public final ix.k f84725c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f84726d;

        public a(cx.y yVar, ix.k kVar, Object obj) {
            this.f84726d = obj;
            String str = yVar.a().get(ix.y0.f63006a.z());
            this.f84724b = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            this.f84725c = kVar == null ? k.a.f62847a.j() : kVar;
        }

        @Override // mx.v
        public Long a() {
            return this.f84724b;
        }

        @Override // mx.v
        public ix.k b() {
            return this.f84725c;
        }

        @Override // mx.v.e
        public io.ktor.utils.io.g m() {
            return mz.c.d((InputStream) this.f84726d, null, null, 3, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84727a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84728b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84729c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends InputStream {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InputStream f84730a;

            public a(InputStream inputStream) {
                this.f84730a = inputStream;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f84730a.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                this.f84730a.close();
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f84730a.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b11, int i11, int i12) {
                kotlin.jvm.internal.g0.p(b11, "b");
                return this.f84730a.read(b11, i11, i12);
            }
        }

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
            b bVar = new b(cVar);
            bVar.f84728b = dVar;
            bVar.f84729c = dVar2;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84727a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f84728b;
                ex.d dVar2 = (ex.d) this.f84729c;
                gz.a a11 = dVar2.a();
                Object b11 = dVar2.b();
                if (!(b11 instanceof io.ktor.utils.io.g)) {
                    return g2.f100423a;
                }
                if (kotlin.jvm.internal.g0.g(a11.b(), kotlin.jvm.internal.o0.d(InputStream.class))) {
                    ex.d dVar3 = new ex.d(a11, new a(mz.a.a((io.ktor.utils.io.g) b11, (l2) ((mw.a) dVar.d()).getCoroutineContext().get(l2.f7886e0))));
                    this.f84728b = null;
                    this.f84727a = 1;
                    if (dVar.i(dVar3, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    @m80.l
    public static final mx.v a(@m80.l ix.k kVar, @m80.k cx.y context, @m80.k Object body) {
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(body, "body");
        if (body instanceof InputStream) {
            return new a(context, kVar, body);
        }
        return null;
    }

    public static final void b(@m80.k lw.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        cVar.o0().C(ex.f.f50195h.b(), new b(null));
    }
}
