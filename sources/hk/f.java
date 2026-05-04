package hk;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import hk.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements a {
    public static final String A = "f";
    public static final int B = 4096;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = 4;
    public static final int F = 255;

    @ColorInt
    public static final int G = 0;

    /* renamed from: f, reason: collision with root package name */
    @ColorInt
    public int[] f59467f;

    /* renamed from: g, reason: collision with root package name */
    @ColorInt
    public final int[] f59468g;

    /* renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0675a f59469h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f59470i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f59471j;

    /* renamed from: k, reason: collision with root package name */
    public d f59472k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f59473l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f59474m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f59475n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f59476o;

    /* renamed from: p, reason: collision with root package name */
    @ColorInt
    public int[] f59477p;

    /* renamed from: q, reason: collision with root package name */
    public int f59478q;

    /* renamed from: r, reason: collision with root package name */
    public c f59479r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f59480s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f59481t;

    /* renamed from: u, reason: collision with root package name */
    public int f59482u;

    /* renamed from: v, reason: collision with root package name */
    public int f59483v;

    /* renamed from: w, reason: collision with root package name */
    public int f59484w;

    /* renamed from: x, reason: collision with root package name */
    public int f59485x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public Boolean f59486y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f59487z;

    public f(@NonNull a.InterfaceC0675a interfaceC0675a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0675a, cVar, byteBuffer, 1);
    }

    @Override // hk.a
    public synchronized void a(@NonNull c cVar, @NonNull byte[] bArr) {
        m(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // hk.a
    public void b(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f59487z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // hk.a
    @Deprecated
    public int c() {
        int i11 = this.f59479r.f59442m;
        if (i11 == -1) {
            return 1;
        }
        return i11;
    }

    @Override // hk.a
    public void clear() {
        this.f59479r = null;
        byte[] bArr = this.f59476o;
        if (bArr != null) {
            this.f59469h.e(bArr);
        }
        int[] iArr = this.f59477p;
        if (iArr != null) {
            this.f59469h.f(iArr);
        }
        Bitmap bitmap = this.f59480s;
        if (bitmap != null) {
            this.f59469h.c(bitmap);
        }
        this.f59480s = null;
        this.f59470i = null;
        this.f59486y = null;
        byte[] bArr2 = this.f59471j;
        if (bArr2 != null) {
            this.f59469h.e(bArr2);
        }
    }

    @Override // hk.a
    public synchronized void d(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i11) {
        try {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
            }
            int highestOneBit = Integer.highestOneBit(i11);
            this.f59482u = 0;
            this.f59479r = cVar;
            this.f59478q = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f59470i = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f59470i.order(ByteOrder.LITTLE_ENDIAN);
            this.f59481t = false;
            Iterator<b> it = cVar.f59434e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f59423g == 3) {
                    this.f59481t = true;
                    break;
                }
            }
            this.f59483v = highestOneBit;
            int i12 = cVar.f59435f;
            this.f59485x = i12 / highestOneBit;
            int i13 = cVar.f59436g;
            this.f59484w = i13 / highestOneBit;
            this.f59476o = this.f59469h.a(i12 * i13);
            this.f59477p = this.f59469h.d(this.f59485x * this.f59484w);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // hk.a
    public void e() {
        this.f59478q = -1;
    }

    @Override // hk.a
    public int f() {
        return this.f59478q;
    }

    @Override // hk.a
    public int g(@Nullable InputStream inputStream, int i11) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11 > 0 ? i11 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e11) {
                Log.w(A, "Error reading data from stream", e11);
            }
        } else {
            this.f59482u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                Log.w(A, "Error closing stream", e12);
            }
        }
        return this.f59482u;
    }

    @Override // hk.a
    @NonNull
    public ByteBuffer getData() {
        return this.f59470i;
    }

    @Override // hk.a
    public int getHeight() {
        return this.f59479r.f59436g;
    }

    @Override // hk.a
    public int getStatus() {
        return this.f59482u;
    }

    @Override // hk.a
    public int getWidth() {
        return this.f59479r.f59435f;
    }

    @Override // hk.a
    public int h() {
        return this.f59470i.limit() + this.f59476o.length + (this.f59477p.length * 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    @Override // hk.a
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap i() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.f.i():android.graphics.Bitmap");
    }

    @Override // hk.a
    public void j() {
        this.f59478q = (this.f59478q + 1) % this.f59479r.f59432c;
    }

    @Override // hk.a
    public int k() {
        return this.f59479r.f59432c;
    }

    @Override // hk.a
    public int l(int i11) {
        if (i11 < 0) {
            return -1;
        }
        c cVar = this.f59479r;
        if (i11 < cVar.f59432c) {
            return cVar.f59434e.get(i11).f59425i;
        }
        return -1;
    }

    @Override // hk.a
    public synchronized void m(@NonNull c cVar, @NonNull ByteBuffer byteBuffer) {
        d(cVar, byteBuffer, 1);
    }

    @Override // hk.a
    public int n() {
        int i11 = this.f59479r.f59442m;
        if (i11 == -1) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        return i11 + 1;
    }

    @Override // hk.a
    public int o() {
        int i11;
        if (this.f59479r.f59432c <= 0 || (i11 = this.f59478q) < 0) {
            return 0;
        }
        return l(i11);
    }

    @Override // hk.a
    public int p() {
        return this.f59479r.f59442m;
    }

    @ColorInt
    public final int q(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.f59483v + i11; i19++) {
            byte[] bArr = this.f59476o;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f59467f[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.f59483v + i22; i23++) {
            byte[] bArr2 = this.f59476o;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f59467f[bArr2[i23] & 255];
            if (i24 != 0) {
                i14 += (i24 >> 24) & 255;
                i15 += (i24 >> 16) & 255;
                i16 += (i24 >> 8) & 255;
                i17 += i24 & 255;
                i18++;
            }
        }
        if (i18 == 0) {
            return 0;
        }
        return ((i14 / i18) << 24) | ((i15 / i18) << 16) | ((i16 / i18) << 8) | (i17 / i18);
    }

    public final void r(b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f59477p;
        int i15 = bVar.f59420d;
        int i16 = this.f59483v;
        int i17 = i15 / i16;
        int i18 = bVar.f59418b / i16;
        int i19 = bVar.f59419c / i16;
        int i21 = bVar.f59417a / i16;
        boolean z11 = this.f59478q == 0;
        int i22 = this.f59485x;
        int i23 = this.f59484w;
        byte[] bArr = this.f59476o;
        int[] iArr2 = this.f59467f;
        Boolean bool = this.f59486y;
        int i24 = 8;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (i26 < i17) {
            int[] iArr3 = iArr;
            if (bVar.f59421e) {
                if (i25 >= i17) {
                    int i28 = i27 + 1;
                    i11 = i17;
                    if (i28 == 2) {
                        i27 = i28;
                        i25 = 4;
                    } else if (i28 == 3) {
                        i27 = i28;
                        i24 = 4;
                        i25 = 2;
                    } else if (i28 != 4) {
                        i27 = i28;
                    } else {
                        i27 = i28;
                        i25 = 1;
                        i24 = 2;
                    }
                } else {
                    i11 = i17;
                }
                i12 = i25 + i24;
            } else {
                i11 = i17;
                i12 = i25;
                i25 = i26;
            }
            int i29 = i25 + i18;
            boolean z12 = i16 == 1;
            if (i29 < i23) {
                int i31 = i29 * i22;
                int i32 = i31 + i21;
                int i33 = i32 + i19;
                int i34 = i31 + i22;
                if (i34 < i33) {
                    i33 = i34;
                }
                i13 = i12;
                int i35 = i26 * i16 * bVar.f59419c;
                if (z12) {
                    int i36 = i32;
                    while (i36 < i33) {
                        int i37 = i36;
                        int i38 = iArr2[bArr[i35] & 255];
                        if (i38 != 0) {
                            iArr3[i37] = i38;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i16;
                        i36 = i37 + 1;
                    }
                } else {
                    int i39 = ((i33 - i32) * i16) + i35;
                    i14 = i16;
                    int i41 = i32;
                    while (i41 < i33) {
                        int i42 = i33;
                        int q11 = q(i35, i39, bVar.f59419c);
                        if (q11 != 0) {
                            iArr3[i41] = q11;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i14;
                        i41++;
                        i33 = i42;
                    }
                    i26++;
                    i16 = i14;
                    iArr = iArr3;
                    i17 = i11;
                    i25 = i13;
                }
            } else {
                i13 = i12;
            }
            i14 = i16;
            i26++;
            i16 = i14;
            iArr = iArr3;
            i17 = i11;
            i25 = i13;
        }
        if (this.f59486y == null) {
            this.f59486y = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    @Override // hk.a
    public synchronized int read(@Nullable byte[] bArr) {
        try {
            c d11 = u().r(bArr).d();
            this.f59479r = d11;
            if (bArr != null) {
                a(d11, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f59482u;
    }

    public final void s(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f59477p;
        int i11 = bVar2.f59420d;
        int i12 = bVar2.f59418b;
        int i13 = bVar2.f59419c;
        int i14 = bVar2.f59417a;
        boolean z11 = this.f59478q == 0;
        int i15 = this.f59485x;
        byte[] bArr = this.f59476o;
        int[] iArr2 = this.f59467f;
        int i16 = 0;
        byte b11 = -1;
        while (i16 < i11) {
            int i17 = (i16 + i12) * i15;
            int i18 = i17 + i14;
            int i19 = i18 + i13;
            int i21 = i17 + i15;
            if (i21 < i19) {
                i19 = i21;
            }
            int i22 = bVar2.f59419c * i16;
            int i23 = i18;
            while (i23 < i19) {
                byte b12 = bArr[i22];
                int[] iArr3 = iArr;
                int i24 = b12 & 255;
                if (i24 != b11) {
                    int i25 = iArr2[i24];
                    if (i25 != 0) {
                        iArr3[i23] = i25;
                    } else {
                        b11 = b12;
                    }
                }
                i22++;
                i23++;
                iArr = iArr3;
            }
            i16++;
            bVar2 = bVar;
        }
        Boolean bool = this.f59486y;
        this.f59486y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f59486y == null && z11 && b11 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void t(b bVar) {
        int i11;
        int i12;
        byte[] bArr;
        short s11;
        f fVar = this;
        if (bVar != null) {
            fVar.f59470i.position(bVar.f59426j);
        }
        if (bVar == null) {
            c cVar = fVar.f59479r;
            i11 = cVar.f59435f;
            i12 = cVar.f59436g;
        } else {
            i11 = bVar.f59419c;
            i12 = bVar.f59420d;
        }
        int i13 = i11 * i12;
        byte[] bArr2 = fVar.f59476o;
        if (bArr2 == null || bArr2.length < i13) {
            fVar.f59476o = fVar.f59469h.a(i13);
        }
        byte[] bArr3 = fVar.f59476o;
        if (fVar.f59473l == null) {
            fVar.f59473l = new short[4096];
        }
        short[] sArr = fVar.f59473l;
        if (fVar.f59474m == null) {
            fVar.f59474m = new byte[4096];
        }
        byte[] bArr4 = fVar.f59474m;
        if (fVar.f59475n == null) {
            fVar.f59475n = new byte[4097];
        }
        byte[] bArr5 = fVar.f59475n;
        int x11 = fVar.x();
        int i14 = 1 << x11;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = x11 + 1;
        int i18 = (1 << i17) - 1;
        byte b11 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            sArr[i19] = 0;
            bArr4[i19] = (byte) i19;
        }
        byte[] bArr6 = fVar.f59471j;
        int i21 = i17;
        int i22 = i16;
        int i23 = i18;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = -1;
        while (true) {
            if (i24 >= i13) {
                break;
            }
            if (i25 == 0) {
                i25 = fVar.w();
                if (i25 <= 0) {
                    fVar.f59482u = 3;
                    break;
                }
                i26 = b11;
            }
            i28 += (bArr6[i26] & 255) << i27;
            i26++;
            i25--;
            int i34 = i27 + 8;
            int i35 = i22;
            int i36 = i21;
            int i37 = i33;
            short[] sArr2 = sArr;
            int i38 = i31;
            while (true) {
                bArr = bArr4;
                if (i34 < i36) {
                    i22 = i35;
                    i31 = i38;
                    break;
                }
                int i39 = i28 & i23;
                i28 >>= i36;
                i34 -= i36;
                if (i39 == i14) {
                    i36 = i17;
                    i35 = i16;
                    i23 = i18;
                    bArr4 = bArr;
                    i37 = -1;
                } else {
                    if (i39 == i15) {
                        i31 = i38;
                        i22 = i35;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i37 == -1) {
                        bArr3[i29] = bArr[i39];
                        i29++;
                        i24++;
                        i37 = i39;
                        i38 = i37;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i39 >= i35) {
                            bArr7[i32] = (byte) i38;
                            i32++;
                            s11 = i37;
                        } else {
                            s11 = i39;
                        }
                        while (s11 >= i14) {
                            bArr7[i32] = bArr[s11];
                            i32++;
                            s11 = sArr2[s11];
                        }
                        int i41 = bArr[s11] & 255;
                        byte b12 = (byte) i41;
                        bArr3[i29] = b12;
                        while (true) {
                            i29++;
                            i24++;
                            if (i32 <= 0) {
                                break;
                            }
                            i32--;
                            bArr3[i29] = bArr7[i32];
                        }
                        if (i35 < 4096) {
                            sArr2[i35] = (short) i37;
                            bArr[i35] = b12;
                            i35++;
                            if ((i35 & i23) == 0 && i35 < 4096) {
                                i36++;
                                i23 += i35;
                            }
                        }
                        i37 = i39;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i38 = i41;
                    }
                }
            }
            i27 = i34;
            sArr = sArr2;
            bArr4 = bArr;
            b11 = 0;
            i33 = i37;
            i21 = i36;
            fVar = this;
        }
        Arrays.fill(bArr3, i29, i13, b11);
    }

    @NonNull
    public final d u() {
        if (this.f59472k == null) {
            this.f59472k = new d();
        }
        return this.f59472k;
    }

    public final Bitmap v() {
        Boolean bool = this.f59486y;
        Bitmap b11 = this.f59469h.b(this.f59485x, this.f59484w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f59487z);
        b11.setHasAlpha(true);
        return b11;
    }

    public final int w() {
        int x11 = x();
        if (x11 <= 0) {
            return x11;
        }
        ByteBuffer byteBuffer = this.f59470i;
        byteBuffer.get(this.f59471j, 0, Math.min(x11, byteBuffer.remaining()));
        return x11;
    }

    public final int x() {
        return this.f59470i.get() & 255;
    }

    public final Bitmap y(b bVar, b bVar2) {
        int i11;
        int i12;
        Bitmap bitmap;
        int[] iArr = this.f59477p;
        int i13 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f59480s;
            if (bitmap2 != null) {
                this.f59469h.c(bitmap2);
            }
            this.f59480s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f59423g == 3 && this.f59480s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i12 = bVar2.f59423g) > 0) {
            if (i12 == 2) {
                if (!bVar.f59422f) {
                    c cVar = this.f59479r;
                    int i14 = cVar.f59441l;
                    if (bVar.f59427k == null || cVar.f59439j != bVar.f59424h) {
                        i13 = i14;
                    }
                }
                int i15 = bVar2.f59420d;
                int i16 = this.f59483v;
                int i17 = i15 / i16;
                int i18 = bVar2.f59418b / i16;
                int i19 = bVar2.f59419c / i16;
                int i21 = bVar2.f59417a / i16;
                int i22 = this.f59485x;
                int i23 = (i18 * i22) + i21;
                int i24 = (i17 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i19;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr[i26] = i13;
                    }
                    i23 += this.f59485x;
                }
            } else if (i12 == 3 && (bitmap = this.f59480s) != null) {
                int i27 = this.f59485x;
                bitmap.getPixels(iArr, 0, i27, 0, 0, i27, this.f59484w);
            }
        }
        t(bVar);
        if (bVar.f59421e || this.f59483v != 1) {
            r(bVar);
        } else {
            s(bVar);
        }
        if (this.f59481t && ((i11 = bVar.f59423g) == 0 || i11 == 1)) {
            if (this.f59480s == null) {
                this.f59480s = v();
            }
            Bitmap bitmap3 = this.f59480s;
            int i28 = this.f59485x;
            bitmap3.setPixels(iArr, 0, i28, 0, 0, i28, this.f59484w);
        }
        Bitmap v11 = v();
        int i29 = this.f59485x;
        v11.setPixels(iArr, 0, i29, 0, 0, i29, this.f59484w);
        return v11;
    }

    public f(@NonNull a.InterfaceC0675a interfaceC0675a, c cVar, ByteBuffer byteBuffer, int i11) {
        this(interfaceC0675a);
        d(cVar, byteBuffer, i11);
    }

    public f(@NonNull a.InterfaceC0675a interfaceC0675a) {
        this.f59468g = new int[256];
        this.f59487z = Bitmap.Config.ARGB_8888;
        this.f59469h = interfaceC0675a;
        this.f59479r = new c();
    }
}
