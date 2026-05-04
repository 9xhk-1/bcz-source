package hk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final String f59443e = "GifHeaderParser";

    /* renamed from: f, reason: collision with root package name */
    public static final int f59444f = 255;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59445g = 44;

    /* renamed from: h, reason: collision with root package name */
    public static final int f59446h = 33;

    /* renamed from: i, reason: collision with root package name */
    public static final int f59447i = 59;

    /* renamed from: j, reason: collision with root package name */
    public static final int f59448j = 249;

    /* renamed from: k, reason: collision with root package name */
    public static final int f59449k = 255;

    /* renamed from: l, reason: collision with root package name */
    public static final int f59450l = 254;

    /* renamed from: m, reason: collision with root package name */
    public static final int f59451m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f59452n = 28;

    /* renamed from: o, reason: collision with root package name */
    public static final int f59453o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f59454p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f59455q = 128;

    /* renamed from: r, reason: collision with root package name */
    public static final int f59456r = 64;

    /* renamed from: s, reason: collision with root package name */
    public static final int f59457s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static final int f59458t = 128;

    /* renamed from: u, reason: collision with root package name */
    public static final int f59459u = 7;

    /* renamed from: v, reason: collision with root package name */
    public static final int f59460v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f59461w = 10;

    /* renamed from: x, reason: collision with root package name */
    public static final int f59462x = 256;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f59464b;

    /* renamed from: c, reason: collision with root package name */
    public c f59465c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f59463a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f59466d = 0;

    public void a() {
        this.f59464b = null;
        this.f59465c = null;
    }

    public final boolean b() {
        return this.f59465c.f59431b != 0;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f59465c.f59432c > 1;
    }

    @NonNull
    public c d() {
        if (this.f59464b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f59465c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f59465c;
            if (cVar.f59432c < 0) {
                cVar.f59431b = 1;
            }
        }
        return this.f59465c;
    }

    public final int e() {
        try {
            return this.f59464b.get() & 255;
        } catch (Exception unused) {
            this.f59465c.f59431b = 1;
            return 0;
        }
    }

    public final void f() {
        this.f59465c.f59433d.f59417a = o();
        this.f59465c.f59433d.f59418b = o();
        this.f59465c.f59433d.f59419c = o();
        this.f59465c.f59433d.f59420d = o();
        int e11 = e();
        boolean z11 = (e11 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (e11 & 7) + 1);
        b bVar = this.f59465c.f59433d;
        bVar.f59421e = (e11 & 64) != 0;
        if (z11) {
            bVar.f59427k = h(pow);
        } else {
            bVar.f59427k = null;
        }
        this.f59465c.f59433d.f59426j = this.f59464b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f59465c;
        cVar.f59432c++;
        cVar.f59434e.add(cVar.f59433d);
    }

    public final void g() {
        int e11 = e();
        this.f59466d = e11;
        if (e11 <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                i12 = this.f59466d;
                if (i11 >= i12) {
                    return;
                }
                i12 -= i11;
                this.f59464b.get(this.f59463a, i11, i12);
                i11 += i12;
            } catch (Exception e12) {
                if (Log.isLoggable(f59443e, 3)) {
                    Log.d(f59443e, "Error Reading Block n: " + i11 + " count: " + i12 + " blockSize: " + this.f59466d, e12);
                }
                this.f59465c.f59431b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] h(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f59464b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException e11) {
            if (Log.isLoggable(f59443e, 3)) {
                Log.d(f59443e, "Format Error Reading Color Table", e11);
            }
            this.f59465c.f59431b = 1;
            return iArr;
        }
    }

    public final void i() {
        j(Integer.MAX_VALUE);
    }

    public final void j(int i11) {
        boolean z11 = false;
        while (!z11 && !b() && this.f59465c.f59432c <= i11) {
            int e11 = e();
            if (e11 == 33) {
                int e12 = e();
                if (e12 == 1) {
                    s();
                } else if (e12 == 249) {
                    this.f59465c.f59433d = new b();
                    k();
                } else if (e12 == 254) {
                    s();
                } else if (e12 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < 11; i12++) {
                        sb2.append((char) this.f59463a[i12]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (e11 == 44) {
                c cVar = this.f59465c;
                if (cVar.f59433d == null) {
                    cVar.f59433d = new b();
                }
                f();
            } else if (e11 != 59) {
                this.f59465c.f59431b = 1;
            } else {
                z11 = true;
            }
        }
    }

    public final void k() {
        e();
        int e11 = e();
        b bVar = this.f59465c.f59433d;
        int i11 = (e11 & 28) >> 2;
        bVar.f59423g = i11;
        if (i11 == 0) {
            bVar.f59423g = 1;
        }
        bVar.f59422f = (e11 & 1) != 0;
        int o11 = o();
        if (o11 < 2) {
            o11 = 10;
        }
        b bVar2 = this.f59465c.f59433d;
        bVar2.f59425i = o11 * 10;
        bVar2.f59424h = e();
        e();
    }

    public final void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f59465c.f59431b = 1;
            return;
        }
        m();
        if (!this.f59465c.f59437h || b()) {
            return;
        }
        c cVar = this.f59465c;
        cVar.f59430a = h(cVar.f59438i);
        c cVar2 = this.f59465c;
        cVar2.f59441l = cVar2.f59430a[cVar2.f59439j];
    }

    public final void m() {
        this.f59465c.f59435f = o();
        this.f59465c.f59436g = o();
        int e11 = e();
        c cVar = this.f59465c;
        cVar.f59437h = (e11 & 128) != 0;
        cVar.f59438i = (int) Math.pow(2.0d, (e11 & 7) + 1);
        this.f59465c.f59439j = e();
        this.f59465c.f59440k = e();
    }

    public final void n() {
        do {
            g();
            byte[] bArr = this.f59463a;
            if (bArr[0] == 1) {
                this.f59465c.f59442m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f59466d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int o() {
        return this.f59464b.getShort();
    }

    public final void p() {
        this.f59464b = null;
        Arrays.fill(this.f59463a, (byte) 0);
        this.f59465c = new c();
        this.f59466d = 0;
    }

    public d q(@NonNull ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f59464b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f59464b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@Nullable byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f59464b = null;
        this.f59465c.f59431b = 2;
        return this;
    }

    public final void s() {
        int e11;
        do {
            e11 = e();
            this.f59464b.position(Math.min(this.f59464b.position() + e11, this.f59464b.limit()));
        } while (e11 > 0);
    }

    public final void t() {
        e();
        s();
    }
}
