package j60;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.k;
import l60.l;
import m80.k;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
/* loaded from: classes8.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63658a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f63659b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Random f63660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63662e;

    /* renamed from: f, reason: collision with root package name */
    public final long f63663f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l60.k f63664g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l60.k f63665h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63666i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public a f63667j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final byte[] f63668k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final k.a f63669l;

    public i(boolean z11, @m80.k l sink, @m80.k Random random, boolean z12, boolean z13, long j11) {
        g0.p(sink, "sink");
        g0.p(random, "random");
        this.f63658a = z11;
        this.f63659b = sink;
        this.f63660c = random;
        this.f63661d = z12;
        this.f63662e = z13;
        this.f63663f = j11;
        this.f63664g = new l60.k();
        this.f63665h = sink.getBuffer();
        this.f63668k = z11 ? new byte[4] : null;
        this.f63669l = z11 ? new k.a() : null;
    }

    @m80.k
    public final Random a() {
        return this.f63660c;
    }

    @m80.k
    public final l c() {
        return this.f63659b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f63667j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int i11, @m80.l ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i11 != 0 || byteString != null) {
            if (i11 != 0) {
                g.f63619a.d(i11);
            }
            l60.k kVar = new l60.k();
            kVar.writeShort(i11);
            if (byteString != null) {
                kVar.X3(byteString);
            }
            byteString2 = kVar.q3();
        }
        try {
            f(8, byteString2);
        } finally {
            this.f63666i = true;
        }
    }

    public final void f(int i11, ByteString byteString) throws IOException {
        if (this.f63666i) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f63665h.writeByte(i11 | 128);
        if (this.f63658a) {
            this.f63665h.writeByte(size | 128);
            Random random = this.f63660c;
            byte[] bArr = this.f63668k;
            g0.m(bArr);
            random.nextBytes(bArr);
            this.f63665h.write(this.f63668k);
            if (size > 0) {
                long size2 = this.f63665h.size();
                this.f63665h.X3(byteString);
                l60.k kVar = this.f63665h;
                k.a aVar = this.f63669l;
                g0.m(aVar);
                kVar.P0(aVar);
                this.f63669l.i(size2);
                g.f63619a.c(this.f63669l, this.f63668k);
                this.f63669l.close();
            }
        } else {
            this.f63665h.writeByte(size);
            this.f63665h.X3(byteString);
        }
        this.f63659b.flush();
    }

    public final void i(int i11, @m80.k ByteString data) throws IOException {
        g0.p(data, "data");
        if (this.f63666i) {
            throw new IOException("closed");
        }
        this.f63664g.X3(data);
        int i12 = i11 | 128;
        if (this.f63661d && data.size() >= this.f63663f) {
            a aVar = this.f63667j;
            if (aVar == null) {
                aVar = new a(this.f63662e);
                this.f63667j = aVar;
            }
            aVar.a(this.f63664g);
            i12 = i11 | 192;
        }
        long size = this.f63664g.size();
        this.f63665h.writeByte(i12);
        int i13 = this.f63658a ? 128 : 0;
        if (size <= 125) {
            this.f63665h.writeByte(i13 | ((int) size));
        } else if (size <= g.f63638t) {
            this.f63665h.writeByte(i13 | 126);
            this.f63665h.writeShort((int) size);
        } else {
            this.f63665h.writeByte(i13 | 127);
            this.f63665h.writeLong(size);
        }
        if (this.f63658a) {
            Random random = this.f63660c;
            byte[] bArr = this.f63668k;
            g0.m(bArr);
            random.nextBytes(bArr);
            this.f63665h.write(this.f63668k);
            if (size > 0) {
                l60.k kVar = this.f63664g;
                k.a aVar2 = this.f63669l;
                g0.m(aVar2);
                kVar.P0(aVar2);
                this.f63669l.i(0L);
                g.f63619a.c(this.f63669l, this.f63668k);
                this.f63669l.close();
            }
        }
        this.f63665h.y8(this.f63664g, size);
        this.f63659b.A();
    }

    public final void j(@m80.k ByteString payload) throws IOException {
        g0.p(payload, "payload");
        f(9, payload);
    }

    public final void k(@m80.k ByteString payload) throws IOException {
        g0.p(payload, "payload");
        f(10, payload);
    }
}
