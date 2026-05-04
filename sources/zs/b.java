package zs;

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
/* loaded from: classes7.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f102866a;

    /* renamed from: b, reason: collision with root package name */
    public int f102867b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f102868c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public byte[] f102869a;

        /* renamed from: b, reason: collision with root package name */
        public int f102870b;

        public a() {
            this(0, 1, null);
        }

        @k
        public final byte[] a() {
            return this.f102869a;
        }

        public final int b() {
            return this.f102870b;
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
            this.f102869a = new byte[32];
            this.f102870b = 0;
        }

        public final void e(@k byte[] bArr) {
            g0.p(bArr, "<set-?>");
            this.f102869a = bArr;
        }

        public final void f(int i11) {
            this.f102870b = i11;
        }

        public final void g(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            int i13 = this.f102870b;
            int i14 = i13 + i12;
            byte[] bArr = this.f102869a;
            if (i14 > bArr.length) {
                byte[] copyOf = Arrays.copyOf(bArr, c(i13 + i12));
                g0.o(copyOf, "copyOf(...)");
                this.f102869a = copyOf;
            }
            q.v0(buffer, this.f102869a, this.f102870b, i11, i11 + i12);
            this.f102870b += i12;
        }

        public a(int i11) {
            this.f102869a = new byte[u.u(i11, 32)];
        }

        public /* synthetic */ a(int i11, int i12, v vVar) {
            this((i12 & 1) != 0 ? 32 : i11);
        }
    }

    public b(@k e inner) {
        g0.p(inner, "inner");
        this.f102866a = inner;
    }

    private final void a() {
        byte[] bArr = new byte[4];
        int i11 = 0;
        while (i11 < 4) {
            int read = this.f102866a.read(bArr, i11, 4 - i11);
            if (read == -1) {
                throw new EOFException("FramedTransport Unexpected end of input");
            }
            i11 += read;
        }
        this.f102867b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f102866a.close();
        this.f102868c = null;
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) {
        a aVar = this.f102868c;
        if (aVar == null) {
            return g2.f100423a;
        }
        int b11 = aVar.b();
        if (b11 == 0) {
            return g2.f100423a;
        }
        this.f102866a.write(new byte[]{(byte) ((b11 >> 24) & 255), (byte) ((b11 >> 16) & 255), (byte) ((b11 >> 8) & 255), (byte) (b11 & 255)});
        this.f102866a.write(aVar.a(), 0, b11);
        aVar.d();
        return g2.f100423a;
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        while (true) {
            int i13 = this.f102867b;
            if (i13 > 0) {
                int read = this.f102866a.read(buffer, i11, u.B(i12, i13));
                this.f102867b -= read;
                return read;
            }
            a();
        }
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        if (this.f102868c == null) {
            this.f102868c = new a(i12);
        }
        a aVar = this.f102868c;
        g0.m(aVar);
        aVar.g(buffer, i11, i12);
    }
}
