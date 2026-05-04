package ts;

import com.microsoft.thrifty.protocol.SimpleJsonProtocol;
import kotlin.jvm.internal.g0;
import l60.m;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* JADX WARN: Incorrect field signature: TS; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements zs.e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final m f90864a;

        /* JADX WARN: Incorrect types in method signature: (TS;)V */
        public a(m mVar) {
            this.f90864a = mVar;
        }

        @Override // zs.e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void write(@k byte[] data) {
            g0.p(data, "data");
            throw new IllegalStateException("read-only transport");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f90864a.close();
        }

        @Override // zs.e
        @k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new IllegalStateException("read-only transport");
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            return g2.f100423a;
        }

        @Override // zs.e
        public int read(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            return this.f90864a.read(buffer, i11, i12);
        }
    }

    /* JADX WARN: Incorrect field signature: TS; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ts.b$b, reason: collision with other inner class name */
    public static final class C1211b implements zs.e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l60.l f90865a;

        /* JADX WARN: Incorrect types in method signature: (TS;)V */
        public C1211b(l60.l lVar) {
            this.f90865a = lVar;
        }

        @k
        public Void a(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new IllegalStateException("write-only transport");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f90865a.close();
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            this.f90865a.flush();
            return g2.f100423a;
        }

        @Override // zs.e
        public /* bridge */ /* synthetic */ int read(byte[] bArr, int i11, int i12) {
            return ((Number) a(bArr, i11, i12)).intValue();
        }

        @Override // zs.e
        public void write(@k byte[] data) {
            g0.p(data, "data");
            this.f90865a.write(data);
        }

        @Override // zs.e
        public void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            this.f90865a.write(buffer, i11, i12);
        }
    }

    @k
    public static final <T extends zs.e> ws.b a(@k T t11) {
        g0.p(t11, "<this>");
        return new ws.b(t11, 0L, 0L, false, false, 30, null);
    }

    @k
    public static final <T extends zs.e> ws.c b(@k T t11) {
        g0.p(t11, "<this>");
        return new ws.c(t11);
    }

    @k
    public static final <T extends zs.e> ws.e c(@k T t11) {
        g0.p(t11, "<this>");
        return new ws.e(t11, false, 2, null);
    }

    @k
    public static final <T extends zs.e> SimpleJsonProtocol d(@k T t11) {
        g0.p(t11, "<this>");
        return new SimpleJsonProtocol(t11);
    }

    @k
    public static final zs.a e(@k l60.k kVar) {
        g0.p(kVar, "<this>");
        return new zs.a(kVar);
    }

    @k
    public static final <S extends l60.l> zs.e f(@k S s11) {
        g0.p(s11, "<this>");
        return new C1211b(s11);
    }

    @k
    public static final <S extends m> zs.e g(@k S s11) {
        g0.p(s11, "<this>");
        return new a(s11);
    }
}
