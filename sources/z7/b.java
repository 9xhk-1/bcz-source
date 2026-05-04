package z7;

import a00.q;
import g10.u;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements zs.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final zs.e f101044a;

    /* renamed from: b, reason: collision with root package name */
    public int f101045b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f101046c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public byte[] f101047a;

        /* renamed from: b, reason: collision with root package name */
        public int f101048b;

        public a() {
            this(0, 1, null);
        }

        @k
        public final byte[] a() {
            return this.f101047a;
        }

        public final int b() {
            return this.f101048b;
        }

        public final int c(int i11) {
            int i12 = i11 - 1;
            int i13 = i12 | (i12 >>> 1);
            int i14 = i13 | (i13 >>> 2);
            int i15 = i14 | (i14 >>> 4);
            int i16 = i15 | (i15 >>> 8);
            return (i16 | (i16 >>> 16)) + 1;
        }

        public final void d() {
            this.f101047a = new byte[32];
            this.f101048b = 0;
        }

        public final void e(@k byte[] bArr) {
            g0.p(bArr, "<set-?>");
            this.f101047a = bArr;
        }

        public final void f(int i11) {
            this.f101048b = i11;
        }

        public final void g(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            int i13 = this.f101048b;
            int i14 = i13 + i12;
            byte[] bArr = this.f101047a;
            if (i14 > bArr.length) {
                byte[] copyOf = Arrays.copyOf(bArr, c(i13 + i12));
                g0.o(copyOf, "copyOf(...)");
                this.f101047a = copyOf;
            }
            q.v0(buffer, this.f101047a, this.f101048b, i11, i11 + i12);
            this.f101048b += i12;
        }

        public a(int i11) {
            this.f101047a = new byte[u.u(i11, 32)];
        }

        public /* synthetic */ a(int i11, int i12, v vVar) {
            this((i12 & 1) != 0 ? 32 : i11);
        }
    }

    public b(@k zs.e inner) {
        g0.p(inner, "inner");
        this.f101044a = inner;
    }

    public final void a() {
        byte[] bArr = new byte[4];
        int i11 = 0;
        while (i11 < 4) {
            int read = this.f101044a.read(bArr, i11, 4 - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
        this.f101045b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f101044a.close();
        this.f101046c = null;
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) {
        a aVar = this.f101046c;
        if (aVar == null) {
            return g2.f100423a;
        }
        int b11 = aVar.b();
        if (b11 == 0) {
            return g2.f100423a;
        }
        this.f101044a.write(new byte[]{(byte) ((b11 >> 24) & 255), (byte) ((b11 >> 16) & 255), (byte) ((b11 >> 8) & 255), (byte) (b11 & 255)});
        this.f101044a.write(aVar.a(), 0, b11);
        aVar.d();
        Object g11 = this.f101044a.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        while (true) {
            int i13 = this.f101045b;
            if (i13 > 0) {
                int read = this.f101044a.read(buffer, i11, u.B(i12, i13));
                this.f101045b -= read;
                return read;
            }
            a();
        }
    }

    @Override // zs.e
    public /* bridge */ void write(@k byte[] bArr) {
        super.write(bArr);
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        if (this.f101046c == null) {
            this.f101046c = new a(i12);
        }
        a aVar = this.f101046c;
        g0.m(aVar);
        aVar.g(buffer, i11, i12);
    }
}
