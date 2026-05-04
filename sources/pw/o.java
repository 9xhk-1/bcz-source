package pw;

import c40.b2;
import c40.n2;
import com.jiongji.andriod.card.R;
import cx.z;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.io.m0;
import ix.y0;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import okhttp3.l;
import rw.d1;
import rw.f1;
import t50.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", i = {}, l = {R.styleable.Theme_drawable_sound1}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f81254a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f81256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f81256c = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f81256c, cVar);
            aVar.f81255b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81254a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f81255b;
                v.f fVar = (v.f) this.f81256c;
                io.ktor.utils.io.m a11 = m0Var.a();
                this.f81254a = 1;
                if (fVar.m(a11, this) == l11) {
                    return l11;
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {171, 180}, m = "invokeSuspend", n = {"$this$writer", "$this$use$iv", "source", "lastRead", "$this$writer", "$this$use$iv", "source", "lastRead"}, s = {"L$0", "L$1", "L$4", "L$5", "L$0", "L$1", "L$4", "L$5"})
    @u0({"SMAP\nOkHttpEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpEngine.kt\nio/ktor/client/engine/okhttp/OkHttpEngineKt$toChannel$1\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n66#2:249\n52#2,22:250\n1#3:272\n*S KotlinDebug\n*F\n+ 1 OkHttpEngine.kt\nio/ktor/client/engine/okhttp/OkHttpEngineKt$toChannel$1\n*L\n168#1:249\n168#1:250,22\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81257a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81258b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81259c;

        /* renamed from: d, reason: collision with root package name */
        public Object f81260d;

        /* renamed from: e, reason: collision with root package name */
        public Object f81261e;

        /* renamed from: f, reason: collision with root package name */
        public int f81262f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f81263g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l60.m f81264h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f81265i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ z f81266j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l60.m mVar, kotlin.coroutines.d dVar, z zVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f81264h = mVar;
            this.f81265i = dVar;
            this.f81266j = zVar;
        }

        public static final g2 k(Ref.IntRef intRef, l60.m mVar, z zVar, kotlin.coroutines.d dVar, ByteBuffer byteBuffer) {
            Object m6308constructorimpl;
            try {
                intRef.element = mVar.read(byteBuffer);
                return g2.f100423a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(n2.A(dVar).y0());
                } catch (Throwable th3) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th3));
                }
                if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                    m6308constructorimpl = null;
                }
                CancellationException cancellationException = (CancellationException) m6308constructorimpl;
                if (cancellationException != null) {
                    th = cancellationException;
                }
                throw o.m(th, zVar);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f81264h, this.f81265i, this.f81266j, cVar);
            bVar.f81263g = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
        
            if (r10.g(r15) != r6) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00bc -> B:8:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pw.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((b) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @m80.k
    public static final okhttp3.m h(@m80.k final v vVar, @m80.k final kotlin.coroutines.d callContext) {
        g0.p(vVar, "<this>");
        g0.p(callContext, "callContext");
        if (vVar instanceof v.a) {
            byte[] m11 = ((v.a) vVar).m();
            return okhttp3.m.f77487a.m(m11, okhttp3.j.f77447e.d(String.valueOf(vVar.b())), 0, m11.length);
        }
        if (vVar instanceof v.e) {
            return new u(vVar.a(), new x00.a() { // from class: pw.m
                @Override // x00.a
                public final Object invoke() {
                    io.ktor.utils.io.g i11;
                    i11 = o.i(v.this);
                    return i11;
                }
            });
        }
        if (vVar instanceof v.f) {
            return new u(vVar.a(), new x00.a() { // from class: pw.n
                @Override // x00.a
                public final Object invoke() {
                    io.ktor.utils.io.g j11;
                    j11 = o.j(kotlin.coroutines.d.this, vVar);
                    return j11;
                }
            });
        }
        if (vVar instanceof v.c) {
            return okhttp3.m.f77487a.m(new byte[0], null, 0, 0);
        }
        if (vVar instanceof v.b) {
            return h(((v.b) vVar).n(), callContext);
        }
        if (vVar instanceof v.d) {
            throw new UnsupportedContentTypeException(vVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final io.ktor.utils.io.g i(v vVar) {
        return ((v.e) vVar).m();
    }

    public static final io.ktor.utils.io.g j(kotlin.coroutines.d dVar, v vVar) {
        return io.ktor.utils.io.q.E(b2.f7824a, dVar, false, new a(vVar, null), 2, null).b();
    }

    public static final okhttp3.l k(z zVar, kotlin.coroutines.d dVar) {
        final l.a aVar = new l.a();
        aVar.B(zVar.h().toString());
        ow.u.h(zVar.e(), zVar.b(), new x00.p() { // from class: pw.l
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 l11;
                l11 = o.l(l.a.this, (String) obj, (String) obj2);
                return l11;
            }
        });
        aVar.p(zVar.f().l(), a60.f.b(zVar.f().l()) ? h(zVar.b(), dVar) : null);
        return aVar.b();
    }

    public static final g2 l(l.a aVar, String key, String value) {
        g0.p(key, "key");
        g0.p(value, "value");
        if (g0.g(key, y0.f63006a.z())) {
            return g2.f100423a;
        }
        aVar.a(key, value);
        return g2.f100423a;
    }

    public static final Throwable m(Throwable th2, z zVar) {
        return th2 instanceof SocketTimeoutException ? f1.h(zVar, th2) : th2;
    }

    public static final q.a n(q.a aVar, d1 d1Var) {
        Long c11 = d1Var.c();
        if (c11 != null) {
            aVar.k(f1.m(c11.longValue()), TimeUnit.MILLISECONDS);
        }
        Long e11 = d1Var.e();
        if (e11 != null) {
            long longValue = e11.longValue();
            long m11 = f1.m(longValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.j0(m11, timeUnit);
            aVar.R0(f1.m(longValue), timeUnit);
        }
        return aVar;
    }

    public static final io.ktor.utils.io.g o(l60.m mVar, kotlin.coroutines.d dVar, z zVar) {
        return io.ktor.utils.io.q.E(b2.f7824a, dVar, false, new b(mVar, dVar, zVar, null), 2, null).b();
    }
}
