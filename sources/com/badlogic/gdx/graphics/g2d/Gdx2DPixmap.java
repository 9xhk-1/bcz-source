package com.badlogic.gdx.graphics.g2d;

import a3.q;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Gdx2DPixmap implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final int f11870g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11871h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11872i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11873j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11874k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11875l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11876m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11877n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11878o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11879p = 1;

    /* renamed from: a, reason: collision with root package name */
    public long f11880a;

    /* renamed from: b, reason: collision with root package name */
    public int f11881b;

    /* renamed from: c, reason: collision with root package name */
    public int f11882c;

    /* renamed from: d, reason: collision with root package name */
    public int f11883d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f11884e;

    /* renamed from: f, reason: collision with root package name */
    public long[] f11885f;

    public Gdx2DPixmap(byte[] bArr, int i11, int i12, int i13) throws IOException {
        long[] jArr = new long[4];
        this.f11885f = jArr;
        ByteBuffer load = load(jArr, bArr, i11, i12);
        this.f11884e = load;
        if (load == null) {
            throw new IOException("Error loading pixmap: " + getFailureReason());
        }
        long[] jArr2 = this.f11885f;
        this.f11880a = jArr2[0];
        this.f11881b = (int) jArr2[1];
        this.f11882c = (int) jArr2[2];
        int i14 = (int) jArr2[3];
        this.f11883d = i14;
        if (i13 == 0 || i13 == i14) {
            return;
        }
        o(i13);
    }

    public static String J0(int i11) {
        switch (i11) {
            case 1:
                return "alpha";
            case 2:
                return "luminance alpha";
            case 3:
                return "rgb888";
            case 4:
                return "rgba8888";
            case 5:
                return "rgb565";
            case 6:
                return "rgba4444";
            default:
                return "unknown";
        }
    }

    private static native void clear(long j11, int i11);

    private static native void drawCircle(long j11, int i11, int i12, int i13, int i14);

    private static native void drawLine(long j11, int i11, int i12, int i13, int i14, int i15);

    private static native void drawPixmap(long j11, long j12, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native void drawRect(long j11, int i11, int i12, int i13, int i14, int i15);

    public static Gdx2DPixmap f1(int i11, int i12, int i13) {
        try {
            return new Gdx2DPixmap(i11, i12, i13);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static native void fillCircle(long j11, int i11, int i12, int i13, int i14);

    private static native void fillRect(long j11, int i11, int i12, int i13, int i14, int i15);

    private static native void fillTriangle(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native void free(long j11);

    public static Gdx2DPixmap g1(InputStream inputStream, int i11) {
        try {
            return new Gdx2DPixmap(inputStream, i11);
        } catch (IOException unused) {
            return null;
        }
    }

    public static native String getFailureReason();

    private static native int getPixel(long j11, int i11, int i12);

    public static int k1(int i11) {
        switch (i11) {
            case 1:
                return f.C1;
            case 2:
                return f.G1;
            case 3:
            case 5:
                return f.D1;
            case 4:
            case 6:
                return 6408;
            default:
                throw new GdxRuntimeException("unknown format: " + i11);
        }
    }

    public static int l1(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                return f.f11673u1;
            case 5:
                return f.J1;
            case 6:
                return f.H1;
            default:
                throw new GdxRuntimeException("unknown format: " + i11);
        }
    }

    private static native ByteBuffer load(long[] jArr, byte[] bArr, int i11, int i12);

    private static native ByteBuffer loadByteBuffer(long[] jArr, ByteBuffer byteBuffer, int i11, int i12);

    private static native ByteBuffer newPixmap(long[] jArr, int i11, int i12, int i13);

    private static native void setBlend(long j11, int i11);

    private static native void setPixel(long j11, int i11, int i12, int i13);

    private static native void setScale(long j11, int i11);

    public String C0() {
        return J0(this.f11883d);
    }

    public void D(int i11, int i12, int i13, int i14, int i15) {
        drawLine(this.f11880a, i11, i12, i13, i14, i15);
    }

    public void I(Gdx2DPixmap gdx2DPixmap, int i11, int i12, int i13, int i14, int i15, int i16) {
        drawPixmap(gdx2DPixmap.f11880a, this.f11880a, i11, i12, i15, i16, i13, i14, i15, i16);
    }

    public int Q0() {
        return V0();
    }

    public void R(Gdx2DPixmap gdx2DPixmap, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        drawPixmap(gdx2DPixmap.f11880a, this.f11880a, i11, i12, i13, i14, i15, i16, i17, i18);
    }

    public int V0() {
        return k1(this.f11883d);
    }

    public void X(int i11, int i12, int i13, int i14, int i15) {
        drawRect(this.f11880a, i11, i12, i13, i14, i15);
    }

    public void Z(int i11, int i12, int i13, int i14) {
        fillCircle(this.f11880a, i11, i12, i13, i14);
    }

    public int a1() {
        return l1(this.f11883d);
    }

    public void b(int i11) {
        clear(this.f11880a, i11);
    }

    public int b1() {
        return this.f11882c;
    }

    public int c1(int i11, int i12) {
        return getPixel(this.f11880a, i11, i12);
    }

    public ByteBuffer d1() {
        return this.f11884e;
    }

    @Override // a3.q
    public void dispose() {
        free(this.f11880a);
    }

    public int e1() {
        return this.f11881b;
    }

    public void h1(int i11) {
        setBlend(this.f11880a, i11);
    }

    public void i0(int i11, int i12, int i13, int i14, int i15) {
        fillRect(this.f11880a, i11, i12, i13, i14, i15);
    }

    public void i1(int i11, int i12, int i13) {
        setPixel(this.f11880a, i11, i12, i13);
    }

    public void j1(int i11) {
        setScale(this.f11880a, i11);
    }

    public void n0(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fillTriangle(this.f11880a, i11, i12, i13, i14, i15, i16, i17);
    }

    public final void o(int i11) {
        Gdx2DPixmap gdx2DPixmap = new Gdx2DPixmap(this.f11881b, this.f11882c, i11);
        gdx2DPixmap.h1(0);
        gdx2DPixmap.I(this, 0, 0, 0, 0, this.f11881b, this.f11882c);
        dispose();
        this.f11880a = gdx2DPixmap.f11880a;
        this.f11883d = gdx2DPixmap.f11883d;
        this.f11882c = gdx2DPixmap.f11882c;
        this.f11885f = gdx2DPixmap.f11885f;
        this.f11884e = gdx2DPixmap.f11884e;
        this.f11881b = gdx2DPixmap.f11881b;
    }

    public int w0() {
        return this.f11883d;
    }

    public void z(int i11, int i12, int i13, int i14) {
        drawCircle(this.f11880a, i11, i12, i13, i14);
    }

    public Gdx2DPixmap(ByteBuffer byteBuffer, int i11, int i12, int i13) throws IOException {
        this.f11885f = new long[4];
        if (byteBuffer.isDirect()) {
            ByteBuffer loadByteBuffer = loadByteBuffer(this.f11885f, byteBuffer, i11, i12);
            this.f11884e = loadByteBuffer;
            if (loadByteBuffer != null) {
                long[] jArr = this.f11885f;
                this.f11880a = jArr[0];
                this.f11881b = (int) jArr[1];
                this.f11882c = (int) jArr[2];
                int i14 = (int) jArr[3];
                this.f11883d = i14;
                if (i13 == 0 || i13 == i14) {
                    return;
                }
                o(i13);
                return;
            }
            throw new IOException("Error loading pixmap: " + getFailureReason());
        }
        throw new IOException("Couldn't load pixmap from non-direct ByteBuffer");
    }

    public Gdx2DPixmap(InputStream inputStream, int i11) throws IOException {
        this.f11885f = new long[4];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            } else {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteBuffer load = load(this.f11885f, byteArray, 0, byteArray.length);
        this.f11884e = load;
        if (load != null) {
            long[] jArr = this.f11885f;
            this.f11880a = jArr[0];
            this.f11881b = (int) jArr[1];
            this.f11882c = (int) jArr[2];
            int i12 = (int) jArr[3];
            this.f11883d = i12;
            if (i11 == 0 || i11 == i12) {
                return;
            }
            o(i11);
            return;
        }
        throw new IOException("Error loading pixmap: " + getFailureReason());
    }

    public Gdx2DPixmap(int i11, int i12, int i13) throws GdxRuntimeException {
        long[] jArr = new long[4];
        this.f11885f = jArr;
        ByteBuffer newPixmap = newPixmap(jArr, i11, i12, i13);
        this.f11884e = newPixmap;
        if (newPixmap != null) {
            long[] jArr2 = this.f11885f;
            this.f11880a = jArr2[0];
            this.f11881b = (int) jArr2[1];
            this.f11882c = (int) jArr2[2];
            this.f11883d = (int) jArr2[3];
            return;
        }
        throw new GdxRuntimeException("Unable to allocate memory for pixmap: " + i11 + "x" + i12 + j2.O + J0(i13));
    }

    public Gdx2DPixmap(ByteBuffer byteBuffer, long[] jArr) {
        this.f11885f = new long[4];
        this.f11884e = byteBuffer;
        this.f11880a = jArr[0];
        this.f11881b = (int) jArr[1];
        this.f11882c = (int) jArr[2];
        this.f11883d = (int) jArr[3];
    }
}
