package c3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: o, reason: collision with root package name */
        public static final int f7663o = 0;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7664p = 1;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7665q = 2;

        /* renamed from: a, reason: collision with root package name */
        public int f7666a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f7667b = 10;

        /* renamed from: c, reason: collision with root package name */
        public int f7668c = 8388608;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7669d = false;

        /* renamed from: e, reason: collision with root package name */
        public int f7670e = 3;

        /* renamed from: f, reason: collision with root package name */
        public int f7671f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f7672g = 2;

        /* renamed from: h, reason: collision with root package name */
        public int f7673h = 128;

        /* renamed from: i, reason: collision with root package name */
        public boolean f7674i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f7675j = false;

        /* renamed from: k, reason: collision with root package name */
        public int f7676k = 2;

        /* renamed from: l, reason: collision with root package name */
        public int f7677l = 1;

        /* renamed from: m, reason: collision with root package name */
        public String f7678m;

        /* renamed from: n, reason: collision with root package name */
        public String f7679n;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        a aVar = new a();
        boolean z11 = aVar.f7675j;
        e3.c cVar = new e3.c();
        if (!cVar.w(aVar.f7676k)) {
            throw new RuntimeException("Incorrect compression mode");
        }
        if (!cVar.x(aVar.f7668c)) {
            throw new RuntimeException("Incorrect dictionary size");
        }
        if (!cVar.B(aVar.f7673h)) {
            throw new RuntimeException("Incorrect -fb value");
        }
        if (!cVar.A(aVar.f7677l)) {
            throw new RuntimeException("Incorrect -mf value");
        }
        if (!cVar.z(aVar.f7670e, aVar.f7671f, aVar.f7672g)) {
            throw new RuntimeException("Incorrect -lc or -lp or -pb value");
        }
        cVar.y(z11);
        cVar.F(outputStream);
        long j11 = -1;
        if (!z11) {
            long available = inputStream.available();
            if (available != 0) {
                j11 = available;
            }
        }
        for (int i11 = 0; i11 < 8; i11++) {
            outputStream.write(((int) (j11 >>> (i11 * 8))) & 255);
        }
        cVar.d(inputStream, outputStream, -1L, -1L, null);
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[5];
        if (inputStream.read(bArr, 0, 5) != 5) {
            throw new RuntimeException("input .lzma file is too short");
        }
        e3.b bVar = new e3.b();
        if (!bVar.c(bArr)) {
            throw new RuntimeException("Incorrect stream properties");
        }
        long j11 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int read = inputStream.read();
            if (read < 0) {
                throw new RuntimeException("Can't read stream size");
            }
            j11 |= read << (i11 * 8);
        }
        if (!bVar.a(inputStream, outputStream, j11)) {
            throw new RuntimeException("Error in data stream");
        }
    }
}
