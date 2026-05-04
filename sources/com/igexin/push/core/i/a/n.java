package com.igexin.push.core.i.a;

import android.graphics.Bitmap;
import android.util.Log;
import com.igexin.push.core.i.a.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class n implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f38289f = "n";

    /* renamed from: g, reason: collision with root package name */
    private static final int f38290g = 4096;

    /* renamed from: h, reason: collision with root package name */
    private static final int f38291h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f38292i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f38293j = 4;

    /* renamed from: k, reason: collision with root package name */
    private static final int f38294k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f38295l = 0;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private Boolean F;
    private Bitmap.Config G;

    /* renamed from: m, reason: collision with root package name */
    private int[] f38296m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f38297n;

    /* renamed from: o, reason: collision with root package name */
    private final d.a f38298o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f38299p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f38300q;

    /* renamed from: r, reason: collision with root package name */
    private j f38301r;

    /* renamed from: s, reason: collision with root package name */
    private short[] f38302s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f38303t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f38304u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f38305v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f38306w;

    /* renamed from: x, reason: collision with root package name */
    private int f38307x;

    /* renamed from: y, reason: collision with root package name */
    private i f38308y;

    /* renamed from: z, reason: collision with root package name */
    private Bitmap f38309z;

    private n(d.a aVar) {
        this.f38297n = new int[256];
        this.G = Bitmap.Config.ARGB_8888;
        this.f38298o = aVar;
        this.f38308y = new i();
    }

    private j p() {
        if (this.f38301r == null) {
            this.f38301r = new j();
        }
        return this.f38301r;
    }

    private int q() {
        return this.f38299p.get() & 255;
    }

    private int r() {
        int q11 = q();
        if (q11 <= 0) {
            return q11;
        }
        ByteBuffer byteBuffer = this.f38299p;
        byteBuffer.get(this.f38300q, 0, Math.min(q11, byteBuffer.remaining()));
        return q11;
    }

    private Bitmap s() {
        Boolean bool = this.F;
        Bitmap a11 = this.f38298o.a(this.E, this.D, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.G, this.f38307x);
        a11.setHasAlpha(true);
        return a11;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int a() {
        return this.f38308y.f38257h;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int b() {
        return this.f38308y.f38258i;
    }

    @Override // com.igexin.push.core.i.a.d
    public final ByteBuffer c() {
        return this.f38299p;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int d() {
        return this.B;
    }

    @Override // com.igexin.push.core.i.a.d
    public final void e() {
        this.f38307x = (this.f38307x + 1) % this.f38308y.f38254e;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int f() {
        int i11;
        i iVar = this.f38308y;
        int i12 = iVar.f38254e;
        if (i12 <= 0 || (i11 = this.f38307x) < 0) {
            return 0;
        }
        if (i11 < 0 || i11 >= i12) {
            return -1;
        }
        return iVar.f38256g.get(i11).f38225m;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int g() {
        return this.f38308y.f38254e;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int h() {
        return this.f38307x;
    }

    @Override // com.igexin.push.core.i.a.d
    public final void i() {
        this.f38307x = -1;
    }

    @Override // com.igexin.push.core.i.a.d
    @Deprecated
    public final int j() {
        int i11 = this.f38308y.f38264o;
        if (i11 == -1) {
            return 1;
        }
        return i11;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int k() {
        return this.f38308y.f38264o;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int l() {
        int i11 = this.f38308y.f38264o;
        if (i11 == -1) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        return i11 + 1;
    }

    @Override // com.igexin.push.core.i.a.d
    public final int m() {
        return this.f38299p.limit() + this.f38305v.length + (this.f38306w.length * 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0033, B:13:0x003d, B:15:0x0044, B:16:0x004e, B:18:0x005f, B:19:0x006b, B:22:0x0074, B:24:0x0078, B:28:0x0091, B:30:0x0095, B:32:0x00a7, B:34:0x00ab, B:35:0x00af, B:38:0x0070, B:40:0x00b5, B:43:0x0010), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0033, B:13:0x003d, B:15:0x0044, B:16:0x004e, B:18:0x005f, B:19:0x006b, B:22:0x0074, B:24:0x0078, B:28:0x0091, B:30:0x0095, B:32:0x00a7, B:34:0x00ab, B:35:0x00af, B:38:0x0070, B:40:0x00b5, B:43:0x0010), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0033, B:13:0x003d, B:15:0x0044, B:16:0x004e, B:18:0x005f, B:19:0x006b, B:22:0x0074, B:24:0x0078, B:28:0x0091, B:30:0x0095, B:32:0x00a7, B:34:0x00ab, B:35:0x00af, B:38:0x0070, B:40:0x00b5, B:43:0x0010), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0033, B:13:0x003d, B:15:0x0044, B:16:0x004e, B:18:0x005f, B:19:0x006b, B:22:0x0074, B:24:0x0078, B:28:0x0091, B:30:0x0095, B:32:0x00a7, B:34:0x00ab, B:35:0x00af, B:38:0x0070, B:40:0x00b5, B:43:0x0010), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0033, B:13:0x003d, B:15:0x0044, B:16:0x004e, B:18:0x005f, B:19:0x006b, B:22:0x0074, B:24:0x0078, B:28:0x0091, B:30:0x0095, B:32:0x00a7, B:34:0x00ab, B:35:0x00af, B:38:0x0070, B:40:0x00b5, B:43:0x0010), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    @Override // com.igexin.push.core.i.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap n() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.igexin.push.core.i.a.i r0 = r7.f38308y     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.f38254e     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            if (r0 <= 0) goto L10
            int r0 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            if (r0 >= 0) goto L33
            goto L10
        Ld:
            r0 = move-exception
            goto Lcc
        L10:
            java.lang.String r0 = com.igexin.push.core.i.a.n.f38289f     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            com.igexin.push.core.i.a.i r3 = r7.f38308y     // Catch: java.lang.Throwable -> Ld
            int r3 = r3.f38254e     // Catch: java.lang.Throwable -> Ld
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = ", framePointer="
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            int r3 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld
            com.igexin.c.a.c.a.b(r0, r2)     // Catch: java.lang.Throwable -> Ld
            r7.B = r1     // Catch: java.lang.Throwable -> Ld
        L33:
            int r0 = r7.B     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            if (r0 == r1) goto Lb5
            r3 = 2
            if (r0 != r3) goto L3d
            goto Lb5
        L3d:
            r0 = 0
            r7.B = r0     // Catch: java.lang.Throwable -> Ld
            byte[] r4 = r7.f38300q     // Catch: java.lang.Throwable -> Ld
            if (r4 != 0) goto L4e
            com.igexin.push.core.i.a.d$a r4 = r7.f38298o     // Catch: java.lang.Throwable -> Ld
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.a(r5)     // Catch: java.lang.Throwable -> Ld
            r7.f38300q = r4     // Catch: java.lang.Throwable -> Ld
        L4e:
            com.igexin.push.core.i.a.i r4 = r7.f38308y     // Catch: java.lang.Throwable -> Ld
            java.util.List<com.igexin.push.core.i.a.g> r4 = r4.f38256g     // Catch: java.lang.Throwable -> Ld
            int r5 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Ld
            com.igexin.push.core.i.a.g r4 = (com.igexin.push.core.i.a.g) r4     // Catch: java.lang.Throwable -> Ld
            int r5 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            int r5 = r5 - r1
            if (r5 < 0) goto L6a
            com.igexin.push.core.i.a.i r6 = r7.f38308y     // Catch: java.lang.Throwable -> Ld
            java.util.List<com.igexin.push.core.i.a.g> r6 = r6.f38256g     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> Ld
            com.igexin.push.core.i.a.g r5 = (com.igexin.push.core.i.a.g) r5     // Catch: java.lang.Throwable -> Ld
            goto L6b
        L6a:
            r5 = r2
        L6b:
            int[] r6 = r4.f38227o     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L70
            goto L74
        L70:
            com.igexin.push.core.i.a.i r6 = r7.f38308y     // Catch: java.lang.Throwable -> Ld
            int[] r6 = r6.f38252c     // Catch: java.lang.Throwable -> Ld
        L74:
            r7.f38296m = r6     // Catch: java.lang.Throwable -> Ld
            if (r6 != 0) goto L91
            java.lang.String r0 = com.igexin.push.core.i.a.n.f38289f     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "No valid color table found for frame #"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            int r4 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld
            com.igexin.c.a.c.a.b(r0, r3)     // Catch: java.lang.Throwable -> Ld
            r7.B = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r7)
            return r2
        L91:
            boolean r1 = r4.f38222j     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Laf
            int[] r1 = r7.f38297n     // Catch: java.lang.Throwable -> Ld
            int r2 = r6.length     // Catch: java.lang.Throwable -> Ld
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Ld
            int[] r1 = r7.f38297n     // Catch: java.lang.Throwable -> Ld
            r7.f38296m = r1     // Catch: java.lang.Throwable -> Ld
            int r2 = r4.f38224l     // Catch: java.lang.Throwable -> Ld
            r1[r2] = r0     // Catch: java.lang.Throwable -> Ld
            int r0 = r4.f38223k     // Catch: java.lang.Throwable -> Ld
            if (r0 != r3) goto Laf
            int r0 = r7.f38307x     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Laf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld
            r7.F = r0     // Catch: java.lang.Throwable -> Ld
        Laf:
            android.graphics.Bitmap r0 = r7.a(r4, r5)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r7)
            return r0
        Lb5:
            java.lang.String r0 = com.igexin.push.core.i.a.n.f38289f     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Unable to decode frame, status="
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            int r3 = r7.B     // Catch: java.lang.Throwable -> Ld
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            com.igexin.c.a.c.a.b(r0, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r7)
            return r2
        Lcc:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.i.a.n.n():android.graphics.Bitmap");
    }

    @Override // com.igexin.push.core.i.a.d
    public final void o() {
        this.f38308y = null;
        Bitmap bitmap = this.f38309z;
        if (bitmap != null) {
            this.f38298o.a(bitmap);
        }
        this.f38309z = null;
        this.f38299p = null;
        this.F = null;
        this.f38298o.a();
    }

    private n(d.a aVar, i iVar, ByteBuffer byteBuffer) {
        this(aVar, iVar, byteBuffer, 1);
    }

    private void b(g gVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        g gVar2 = gVar;
        int[] iArr = this.f38306w;
        int i16 = gVar2.f38220h;
        int i17 = this.C;
        int i18 = i16 / i17;
        int i19 = gVar2.f38218f / i17;
        int i21 = gVar2.f38219g / i17;
        int i22 = gVar2.f38217e / i17;
        boolean z11 = this.f38307x == 0;
        int i23 = this.E;
        int i24 = this.D;
        byte[] bArr = this.f38305v;
        int[] iArr2 = this.f38296m;
        Boolean bool = this.F;
        int i25 = 8;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1;
        while (i27 < i18) {
            int[] iArr3 = iArr;
            if (gVar2.f38221i) {
                if (i26 >= i18) {
                    int i29 = i28 + 1;
                    i11 = i18;
                    if (i29 == 2) {
                        i28 = i29;
                        i26 = 4;
                    } else if (i29 != 3) {
                        i28 = i29;
                        if (i29 == 4) {
                            i26 = 1;
                            i25 = 2;
                        }
                    } else {
                        i28 = i29;
                        i25 = 4;
                        i26 = 2;
                    }
                } else {
                    i11 = i18;
                }
                i12 = i26 + i25;
            } else {
                i11 = i18;
                i12 = i26;
                i26 = i27;
            }
            int i31 = i26 + i19;
            boolean z12 = i17 == 1;
            if (i31 < i24) {
                int i32 = i31 * i23;
                int i33 = i32 + i22;
                int i34 = i33 + i21;
                int i35 = i32 + i23;
                if (i35 < i34) {
                    i34 = i35;
                }
                i13 = i12;
                int i36 = i27 * i17 * gVar2.f38219g;
                if (z12) {
                    int i37 = i33;
                    while (i37 < i34) {
                        int i38 = i37;
                        int i39 = iArr2[bArr[i36] & 255];
                        if (i39 != 0) {
                            iArr3[i38] = i39;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i36 += i17;
                        i37 = i38 + 1;
                    }
                } else {
                    int i41 = ((i34 - i33) * i17) + i36;
                    i14 = i17;
                    int i42 = i33;
                    while (i42 < i34) {
                        int i43 = i34;
                        int i44 = gVar2.f38219g;
                        int i45 = i36;
                        int i46 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        int i49 = 0;
                        int i51 = 0;
                        while (true) {
                            if (i45 >= this.C + i36) {
                                i15 = i42;
                                break;
                            }
                            byte[] bArr2 = this.f38305v;
                            i15 = i42;
                            if (i45 >= bArr2.length || i45 >= i41) {
                                break;
                            }
                            int i52 = this.f38296m[bArr2[i45] & 255];
                            if (i52 != 0) {
                                i46 += (i52 >> 24) & 255;
                                i47 += (i52 >> 16) & 255;
                                i48 += (i52 >> 8) & 255;
                                i49 += i52 & 255;
                                i51++;
                            }
                            i45++;
                            i42 = i15;
                        }
                        int i53 = i36 + i44;
                        int i54 = i53;
                        while (i54 < this.C + i53) {
                            byte[] bArr3 = this.f38305v;
                            int i55 = i53;
                            if (i54 >= bArr3.length || i54 >= i41) {
                                break;
                            }
                            int i56 = this.f38296m[bArr3[i54] & 255];
                            if (i56 != 0) {
                                i46 += (i56 >> 24) & 255;
                                i47 += (i56 >> 16) & 255;
                                i48 += (i56 >> 8) & 255;
                                i49 += i56 & 255;
                                i51++;
                            }
                            i54++;
                            i53 = i55;
                        }
                        int i57 = i51 == 0 ? 0 : ((i46 / i51) << 24) | ((i47 / i51) << 16) | ((i48 / i51) << 8) | (i49 / i51);
                        if (i57 != 0) {
                            iArr3[i15] = i57;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i36 += i14;
                        i42 = i15 + 1;
                        gVar2 = gVar;
                        i34 = i43;
                    }
                    i27++;
                    gVar2 = gVar;
                    i17 = i14;
                    iArr = iArr3;
                    i18 = i11;
                    i26 = i13;
                }
            } else {
                i13 = i12;
            }
            i14 = i17;
            i27++;
            gVar2 = gVar;
            i17 = i14;
            iArr = iArr3;
            i18 = i11;
            i26 = i13;
        }
        if (this.F == null) {
            this.F = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [short] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void c(g gVar) {
        int i11;
        int i12;
        byte b11;
        short[] sArr;
        int i13;
        short s11;
        n nVar = this;
        if (gVar != null) {
            nVar.f38299p.position(gVar.f38226n);
        }
        if (gVar == null) {
            i iVar = nVar.f38308y;
            i11 = iVar.f38257h;
            i12 = iVar.f38258i;
        } else {
            i11 = gVar.f38219g;
            i12 = gVar.f38220h;
        }
        int i14 = i11 * i12;
        byte[] bArr = nVar.f38305v;
        if (bArr == null || bArr.length < i14) {
            nVar.f38305v = nVar.f38298o.a(i14);
        }
        byte[] bArr2 = nVar.f38305v;
        if (nVar.f38302s == null) {
            nVar.f38302s = new short[4096];
        }
        short[] sArr2 = nVar.f38302s;
        if (nVar.f38303t == null) {
            nVar.f38303t = new byte[4096];
        }
        byte[] bArr3 = nVar.f38303t;
        if (nVar.f38304u == null) {
            nVar.f38304u = new byte[4097];
        }
        byte[] bArr4 = nVar.f38304u;
        int q11 = nVar.q();
        int i15 = 1 << q11;
        int i16 = i15 + 1;
        int i17 = i15 + 2;
        int i18 = q11 + 1;
        int i19 = (1 << i18) - 1;
        byte b12 = 0;
        for (int i21 = 0; i21 < i15; i21++) {
            sArr2[i21] = 0;
            bArr3[i21] = (byte) i21;
        }
        byte[] bArr5 = nVar.f38300q;
        int i22 = i18;
        int i23 = i17;
        int i24 = i19;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = -1;
        while (true) {
            if (i25 >= i14) {
                b11 = b12;
                break;
            }
            if (i26 == 0) {
                int q12 = nVar.q();
                if (q12 <= 0) {
                    sArr = sArr2;
                    i26 = q12;
                    i13 = -1;
                } else {
                    i13 = -1;
                    ByteBuffer byteBuffer = nVar.f38299p;
                    sArr = sArr2;
                    i26 = q12;
                    byteBuffer.get(nVar.f38300q, 0, Math.min(q12, byteBuffer.remaining()));
                }
                if (i26 <= 0) {
                    nVar.B = 3;
                    b11 = 0;
                    break;
                }
                i27 = 0;
            } else {
                sArr = sArr2;
                i13 = -1;
            }
            i29 += (bArr5[i27] & 255) << i28;
            i27++;
            i26--;
            int i35 = i28 + 8;
            int i36 = i23;
            int i37 = i22;
            int i38 = i34;
            int i39 = i32;
            while (true) {
                i28 = i35;
                if (i35 >= i37) {
                    int i41 = i29 & i24;
                    i29 >>= i37;
                    i28 -= i37;
                    if (i41 == i15) {
                        i37 = i18;
                        i36 = i17;
                        i24 = i19;
                        i35 = i28;
                        i38 = i13;
                    } else if (i41 != i16) {
                        byte[] bArr6 = bArr3;
                        int i42 = i13;
                        if (i38 == i42) {
                            bArr2[i31] = bArr6[i41];
                            i31++;
                            i25++;
                            i39 = i41;
                            i38 = i39;
                            i13 = i42;
                            i35 = i28;
                            bArr3 = bArr6;
                        } else {
                            if (i41 >= i36) {
                                bArr4[i33] = (byte) i39;
                                i33++;
                                s11 = i38;
                            } else {
                                s11 = i41;
                            }
                            while (s11 >= i15) {
                                bArr4[i33] = bArr6[s11];
                                i33++;
                                s11 = sArr[s11];
                            }
                            int i43 = bArr6[s11] & 255;
                            byte b13 = (byte) i43;
                            bArr2[i31] = b13;
                            while (true) {
                                i31++;
                                i25++;
                                if (i33 <= 0) {
                                    break;
                                }
                                i33--;
                                bArr2[i31] = bArr4[i33];
                            }
                            if (i36 < 4096) {
                                sArr[i36] = (short) i38;
                                bArr6[i36] = b13;
                                i36++;
                                if ((i36 & i24) == 0 && i36 < 4096) {
                                    i37++;
                                    i24 += i36;
                                }
                            }
                            i38 = i41;
                            i35 = i28;
                            bArr3 = bArr6;
                            i39 = i43;
                            i13 = -1;
                        }
                    }
                }
            }
            int i44 = i39;
            nVar = this;
            i32 = i44;
            i23 = i36;
            i22 = i37;
            i34 = i38;
            sArr2 = sArr;
            b12 = 0;
        }
        Arrays.fill(bArr2, i31, i14, b11);
    }

    @Override // com.igexin.push.core.i.a.d
    public final int a(int i11) {
        if (i11 < 0) {
            return -1;
        }
        i iVar = this.f38308y;
        if (i11 < iVar.f38254e) {
            return iVar.f38256g.get(i11).f38225m;
        }
        return -1;
    }

    public n(d.a aVar, i iVar, ByteBuffer byteBuffer, int i11) {
        this(aVar);
        a(iVar, byteBuffer, i11);
    }

    private int a(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.C + i11; i19++) {
            byte[] bArr = this.f38305v;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f38296m[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.C + i22; i23++) {
            byte[] bArr2 = this.f38305v;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f38296m[bArr2[i23] & 255];
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

    @Override // com.igexin.push.core.i.a.d
    public final int a(InputStream inputStream, int i11) {
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
                a(byteArrayOutputStream.toByteArray());
            } catch (IOException e11) {
                Log.w(f38289f, "Error reading data from stream", e11);
            }
        } else {
            this.B = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                Log.w(f38289f, "Error closing stream", e12);
            }
        }
        return this.B;
    }

    @Override // com.igexin.push.core.i.a.d
    public final synchronized int a(byte[] bArr) {
        try {
            if (this.f38301r == null) {
                this.f38301r = new j();
            }
            j jVar = this.f38301r;
            if (bArr != null) {
                jVar.a(ByteBuffer.wrap(bArr));
            } else {
                jVar.f38285c = null;
                jVar.f38286d.f38253d = 2;
            }
            i b11 = jVar.b();
            this.f38308y = b11;
            if (bArr != null) {
                a(b11, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r4.f38261l == r36.f38224l) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(com.igexin.push.core.i.a.g r36, com.igexin.push.core.i.a.g r37) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.i.a.n.a(com.igexin.push.core.i.a.g, com.igexin.push.core.i.a.g):android.graphics.Bitmap");
    }

    @Override // com.igexin.push.core.i.a.d
    public final void a(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.G = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    private void a(g gVar) {
        g gVar2 = gVar;
        int[] iArr = this.f38306w;
        int i11 = gVar2.f38220h;
        int i12 = gVar2.f38218f;
        int i13 = gVar2.f38219g;
        int i14 = gVar2.f38217e;
        boolean z11 = this.f38307x == 0;
        int i15 = this.E;
        byte[] bArr = this.f38305v;
        int[] iArr2 = this.f38296m;
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
            int i22 = gVar2.f38219g * i16;
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
            gVar2 = gVar;
        }
        Boolean bool = this.F;
        this.F = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.F == null && z11 && b11 != -1));
    }

    @Override // com.igexin.push.core.i.a.d
    public final synchronized void a(i iVar, ByteBuffer byteBuffer) {
        a(iVar, byteBuffer, 1);
    }

    @Override // com.igexin.push.core.i.a.d
    public final synchronized void a(i iVar, ByteBuffer byteBuffer, int i11) {
        try {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: ".concat(String.valueOf(i11)));
            }
            int highestOneBit = Integer.highestOneBit(i11);
            this.B = 0;
            this.f38308y = iVar;
            this.f38307x = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f38299p = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f38299p.order(ByteOrder.LITTLE_ENDIAN);
            this.A = false;
            Iterator<g> it = iVar.f38256g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f38223k == 3) {
                    this.A = true;
                    break;
                }
            }
            this.C = highestOneBit;
            int i12 = iVar.f38257h;
            this.E = i12 / highestOneBit;
            int i13 = iVar.f38258i;
            this.D = i13 / highestOneBit;
            this.f38305v = this.f38298o.a(i12 * i13);
            this.f38306w = this.f38298o.b(this.E * this.D);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.igexin.push.core.i.a.d
    public final synchronized void a(i iVar, byte[] bArr) {
        a(iVar, ByteBuffer.wrap(bArr));
    }
}
