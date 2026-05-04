package z7;

import a00.a0;
import a00.l1;
import a00.q;
import java.net.ProtocolException;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements zs.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final y7.c f101049a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f101050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x00.a<Map<String, String>> f101051c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f101052d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public zs.e f101053e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l60.k f101054f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<String, String> f101055g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements zs.e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final byte[] f101056a;

        /* renamed from: b, reason: collision with root package name */
        public int f101057b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f101058c;

        public a(@k c cVar, byte[] _inner) {
            g0.p(_inner, "_inner");
            this.f101058c = cVar;
            this.f101056a = _inner;
        }

        @k
        public final byte[] a() {
            return this.f101056a;
        }

        public final int c() {
            return this.f101057b;
        }

        public final void e(int i11) {
            this.f101057b = i11;
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            throw new ProtocolException("currently in reading state");
        }

        @Override // zs.e
        public int read(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            if (this.f101057b >= this.f101056a.length) {
                throw new ProtocolException("No more data available.");
            }
            int intValue = ((Number) a0.Qn(new Integer[]{Integer.valueOf(buffer.length - i11), Integer.valueOf(i12), Integer.valueOf(this.f101056a.length - this.f101057b)})).intValue();
            byte[] bArr = this.f101056a;
            int i13 = this.f101057b;
            q.v0(bArr, buffer, i11, i13, i13 + intValue);
            this.f101057b += intValue;
            return intValue;
        }

        @Override // zs.e
        public /* bridge */ void write(@k byte[] bArr) {
            super.write(bArr);
        }

        @Override // zs.e
        public void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new ProtocolException("currently in reading state");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements zs.e {
        public b() {
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            byte[] w22 = c.this.f101054f.w2();
            c.this.f101054f.e();
            Object k11 = c.this.k(w22, cVar);
            return k11 == kotlin.coroutines.intrinsics.b.l() ? k11 : g2.f100423a;
        }

        @Override // zs.e
        public int read(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new ProtocolException("Currently in writing state");
        }

        @Override // zs.e
        public /* bridge */ void write(@k byte[] bArr) {
            super.write(bArr);
        }

        @Override // zs.e
        public void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            c.this.f101054f.write(buffer, i11, i12);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.net.thrift.BczHttpTransport$send$2", f = "BczHttpTransport.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$this$run"}, s = {"L$0"}, v = 1)
    /* renamed from: z7.c$c, reason: collision with other inner class name */
    public static final class C1384c extends SuspendLambda implements p<y7.g, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f101060a;

        /* renamed from: b, reason: collision with root package name */
        public Object f101061b;

        /* renamed from: c, reason: collision with root package name */
        public int f101062c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f101063d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ byte[] f101065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1384c(byte[] bArr, j00.c<? super C1384c> cVar) {
            super(2, cVar);
            this.f101065f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C1384c c1384c = c.this.new C1384c(this.f101065f, cVar);
            c1384c.f101063d = obj;
            return c1384c;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y7.g gVar, j00.c<? super g2> cVar) {
            return ((C1384c) create(gVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            c cVar2;
            y7.g gVar = (y7.g) this.f101063d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f101062c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c cVar3 = c.this;
                g gVar2 = cVar3.f101050b;
                String a11 = c.this.f101052d.a(gVar.h());
                long f11 = gVar.f();
                long g11 = gVar.g();
                byte[] bArr = this.f101065f;
                Map<String, String> n02 = l1.n0(c.this.f101055g, (Map) c.this.f101051c.invoke());
                this.f101063d = l00.k.a(gVar);
                this.f101060a = cVar3;
                this.f101061b = cVar3;
                this.f101062c = 1;
                Object a12 = gVar2.a(a11, f11, g11, bArr, n02, this);
                if (a12 == l11) {
                    return l11;
                }
                cVar = cVar3;
                obj = a12;
                cVar2 = cVar;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = (c) this.f101061b;
                cVar = (c) this.f101060a;
                kotlin.e.n(obj);
            }
            cVar.f101053e = new a(cVar2, (byte[]) obj);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k y7.c retry, @k g transporter, @k x00.a<? extends Map<String, String>> customHeaders, @k d urlMaker) {
        g0.p(retry, "retry");
        g0.p(transporter, "transporter");
        g0.p(customHeaders, "customHeaders");
        g0.p(urlMaker, "urlMaker");
        this.f101049a = retry;
        this.f101050b = transporter;
        this.f101051c = customHeaders;
        this.f101052d = urlMaker;
        this.f101053e = new b();
        this.f101054f = new l60.k();
        this.f101055g = l1.W(h1.a("Accept", "application/x-thrift"), h1.a("Content-Type", "application/x-thrift"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f101053e.close();
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) {
        Object g11 = this.f101053e.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @l
    public final Object k(@k byte[] bArr, @k j00.c<? super g2> cVar) {
        Object a11 = this.f101049a.a(new C1384c(bArr, null), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        return this.f101053e.read(buffer, i11, i12);
    }

    @Override // zs.e
    public /* bridge */ void write(@k byte[] bArr) {
        super.write(bArr);
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        zs.e eVar = this.f101053e;
        if (eVar instanceof a) {
            eVar.close();
            this.f101053e = new b();
        }
        this.f101053e.write(buffer, i11, i12);
    }
}
