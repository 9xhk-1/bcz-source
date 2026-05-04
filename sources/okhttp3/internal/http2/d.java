package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import c60.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.l;
import m80.k;
import okhttp3.internal.http2.a;
import u50.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f77429g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f77430h = Logger.getLogger(c60.b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f77431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77432b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l60.k f77433c;

    /* renamed from: d, reason: collision with root package name */
    public int f77434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77435e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f77436f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public d(@k l sink, boolean z11) {
        g0.p(sink, "sink");
        this.f77431a = sink;
        this.f77432b = z11;
        l60.k kVar = new l60.k();
        this.f77433c = kVar;
        this.f77434d = 16384;
        this.f77436f = new a.b(0, false, kVar, 3, null);
    }

    public final synchronized void C(int i11, int i12, @k List<c60.a> requestHeaders) throws IOException {
        g0.p(requestHeaders, "requestHeaders");
        if (this.f77435e) {
            throw new IOException("closed");
        }
        this.f77436f.g(requestHeaders);
        long size = this.f77433c.size();
        int min = (int) Math.min(this.f77434d - 4, size);
        long j11 = min;
        i(i11, min + 4, 5, size == j11 ? 4 : 0);
        this.f77431a.writeInt(i12 & Integer.MAX_VALUE);
        this.f77431a.y8(this.f77433c, j11);
        if (size > j11) {
            L(i11, size - j11);
        }
    }

    public final synchronized void E(int i11, @k ErrorCode errorCode) throws IOException {
        g0.p(errorCode, "errorCode");
        if (this.f77435e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i11, 4, 3, 0);
        this.f77431a.writeInt(errorCode.getHttpCode());
        this.f77431a.flush();
    }

    public final synchronized void H(@k g settings) throws IOException {
        try {
            g0.p(settings, "settings");
            if (this.f77435e) {
                throw new IOException("closed");
            }
            int i11 = 0;
            i(0, settings.l() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.i(i11)) {
                    this.f77431a.writeShort(i11 != 4 ? i11 != 7 ? i11 : 4 : 3);
                    this.f77431a.writeInt(settings.b(i11));
                }
                i11++;
            }
            this.f77431a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void I(int i11, long j11) throws IOException {
        if (this.f77435e) {
            throw new IOException("closed");
        }
        if (j11 == 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j11).toString());
        }
        i(i11, 4, 8, 0);
        this.f77431a.writeInt((int) j11);
        this.f77431a.flush();
    }

    public final void L(int i11, long j11) throws IOException {
        while (j11 > 0) {
            long min = Math.min(this.f77434d, j11);
            j11 -= min;
            i(i11, (int) min, 9, j11 == 0 ? 4 : 0);
            this.f77431a.y8(this.f77433c, min);
        }
    }

    public final synchronized void a(@k g peerSettings) throws IOException {
        try {
            g0.p(peerSettings, "peerSettings");
            if (this.f77435e) {
                throw new IOException("closed");
            }
            this.f77434d = peerSettings.g(this.f77434d);
            if (peerSettings.d() != -1) {
                this.f77436f.e(peerSettings.d());
            }
            i(0, 0, 4, 1);
            this.f77431a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() throws IOException {
        try {
            if (this.f77435e) {
                throw new IOException("closed");
            }
            if (this.f77432b) {
                Logger logger = f77430h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.y(">> CONNECTION " + c60.b.f8139b.hex(), new Object[0]));
                }
                this.f77431a.X3(c60.b.f8139b);
                this.f77431a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f77435e = true;
        this.f77431a.close();
    }

    public final synchronized void e(boolean z11, int i11, @m80.l l60.k kVar, int i12) throws IOException {
        if (this.f77435e) {
            throw new IOException("closed");
        }
        f(i11, z11 ? 1 : 0, kVar, i12);
    }

    public final void f(int i11, int i12, @m80.l l60.k kVar, int i13) throws IOException {
        i(i11, i13, 0, i12);
        if (i13 > 0) {
            l lVar = this.f77431a;
            g0.m(kVar);
            lVar.y8(kVar, i13);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.f77435e) {
            throw new IOException("closed");
        }
        this.f77431a.flush();
    }

    public final void i(int i11, int i12, int i13, int i14) throws IOException {
        int i15;
        int i16;
        int i17;
        int i18;
        Logger logger = f77430h;
        if (logger.isLoggable(Level.FINE)) {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
            logger.fine(c60.b.f8138a.c(false, i15, i16, i17, i18));
        } else {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        if (i16 > this.f77434d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f77434d + ": " + i16).toString());
        }
        if ((Integer.MIN_VALUE & i15) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i15).toString());
        }
        f.p0(this.f77431a, i16);
        this.f77431a.writeByte(i17 & 255);
        this.f77431a.writeByte(i18 & 255);
        this.f77431a.writeInt(Integer.MAX_VALUE & i15);
    }

    @k
    public final a.b j() {
        return this.f77436f;
    }

    public final synchronized void k(int i11, @k ErrorCode errorCode, @k byte[] debugData) throws IOException {
        try {
            g0.p(errorCode, "errorCode");
            g0.p(debugData, "debugData");
            if (this.f77435e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, debugData.length + 8, 7, 0);
            this.f77431a.writeInt(i11);
            this.f77431a.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f77431a.write(debugData);
            }
            this.f77431a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void q(boolean z11, int i11, @k List<c60.a> headerBlock) throws IOException {
        g0.p(headerBlock, "headerBlock");
        if (this.f77435e) {
            throw new IOException("closed");
        }
        this.f77436f.g(headerBlock);
        long size = this.f77433c.size();
        long min = Math.min(this.f77434d, size);
        int i12 = size == min ? 4 : 0;
        if (z11) {
            i12 |= 1;
        }
        i(i11, (int) min, 1, i12);
        this.f77431a.y8(this.f77433c, min);
        if (size > min) {
            L(i11, size - min);
        }
    }

    public final int r() {
        return this.f77434d;
    }

    public final synchronized void w(boolean z11, int i11, int i12) throws IOException {
        if (this.f77435e) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z11 ? 1 : 0);
        this.f77431a.writeInt(i11);
        this.f77431a.writeInt(i12);
        this.f77431a.flush();
    }
}
