package com.tencent.liteav.renderer;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private TextureView f44009a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f44010b;

    /* renamed from: c, reason: collision with root package name */
    private int f44011c;

    /* renamed from: d, reason: collision with root package name */
    private int f44012d;

    /* renamed from: e, reason: collision with root package name */
    private int f44013e = 640;

    /* renamed from: f, reason: collision with root package name */
    private int f44014f = 480;

    /* renamed from: g, reason: collision with root package name */
    private int f44015g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f44016h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f44017i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f44018j = 0;

    /* renamed from: k, reason: collision with root package name */
    private float f44019k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private int f44020l = 0;

    public d(TextureView textureView) {
        this.f44011c = 0;
        this.f44012d = 0;
        this.f44009a = textureView;
        this.f44011c = textureView.getWidth();
        this.f44012d = textureView.getHeight();
        this.f44010b = new Handler(textureView.getContext().getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 > r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        if (r2 < r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r8) {
        /*
            r7 = this;
            r7.f44017i = r8
            android.view.TextureView r0 = r7.f44009a
            if (r0 == 0) goto L81
            r1 = 1
            r2 = 90
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r1) goto L37
            int r8 = r7.f44018j
            if (r8 == 0) goto L6b
            if (r8 != r4) goto L18
            goto L6b
        L18:
            if (r8 == r3) goto L1c
            if (r8 != r2) goto L6b
        L1c:
            int r8 = r7.f44015g
            if (r8 == 0) goto L81
            int r1 = r7.f44016h
            if (r1 != 0) goto L25
            goto L81
        L25:
            int r2 = r7.f44012d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f44011c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L35
        L33:
            r5 = r8
            goto L6b
        L35:
            r5 = r2
            goto L6b
        L37:
            if (r8 != 0) goto L6b
            int r8 = r7.f44015g
            if (r8 == 0) goto L81
            int r1 = r7.f44016h
            if (r1 != 0) goto L42
            goto L81
        L42:
            int r6 = r7.f44018j
            if (r6 == 0) goto L5c
            if (r6 != r4) goto L49
            goto L5c
        L49:
            if (r6 == r3) goto L4d
            if (r6 != r2) goto L6b
        L4d:
            int r2 = r7.f44012d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f44011c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L35
            goto L33
        L5c:
            int r2 = r7.f44012d
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r7.f44011c
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 >= 0) goto L35
            r5 = r1
        L6b:
            float r8 = r7.f44019k
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L73
            float r5 = -r5
        L73:
            r0.setScaleX(r5)
            android.view.TextureView r8 = r7.f44009a
            float r0 = java.lang.Math.abs(r5)
            r8.setScaleY(r0)
            r7.f44019k = r5
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.d.b(int):void");
    }

    public void c(final int i11) {
        try {
            this.f44010b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.2
                @Override // java.lang.Runnable
                public void run() {
                    d.this.d(i11);
                }
            });
        } catch (Exception e11) {
            TXCLog.e("TXCTextureViewWrapper", "set render rotation failed.", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r5 > r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r5 < r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r5) {
        /*
            r4 = this;
            int r5 = r5 % 360
            r4.f44018j = r5
            android.view.TextureView r0 = r4.f44009a
            if (r0 == 0) goto L89
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L4b
            r3 = 180(0xb4, float:2.52E-43)
            if (r5 != r3) goto L12
            goto L4b
        L12:
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 == r3) goto L1a
            r3 = 90
            if (r5 != r3) goto L71
        L1a:
            int r3 = r4.f44015g
            if (r3 == 0) goto L89
            int r3 = r4.f44016h
            if (r3 != 0) goto L24
            goto L89
        L24:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f44012d
            float r5 = (float) r5
            int r0 = r4.f44015g
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r4.f44011c
            float r0 = (float) r0
            int r3 = r4.f44016h
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r4.f44017i
            if (r3 != r1) goto L44
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L42
        L40:
            r2 = r0
            goto L71
        L42:
            r2 = r5
            goto L71
        L44:
            if (r3 != 0) goto L71
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L42
            goto L40
        L4b:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f44017i
            if (r5 != r1) goto L56
            goto L71
        L56:
            if (r5 != 0) goto L71
            int r5 = r4.f44015g
            if (r5 == 0) goto L89
            int r0 = r4.f44016h
            if (r0 != 0) goto L61
            goto L89
        L61:
            int r1 = r4.f44012d
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r4.f44011c
            float r0 = (float) r0
            float r5 = (float) r5
            float r0 = r0 / r5
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 >= 0) goto L70
            goto L40
        L70:
            r2 = r1
        L71:
            float r5 = r4.f44019k
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L79
            float r2 = -r2
        L79:
            android.view.TextureView r5 = r4.f44009a
            r5.setScaleX(r2)
            android.view.TextureView r5 = r4.f44009a
            float r0 = java.lang.Math.abs(r2)
            r5.setScaleY(r0)
            r4.f44019k = r2
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.renderer.d.d(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i11, int i12) {
        int i13;
        int i14;
        if (this.f44009a == null || i11 == 0 || i12 == 0 || (i13 = this.f44011c) == 0 || (i14 = this.f44012d) == 0) {
            return;
        }
        double d11 = i12 / i11;
        if (i14 > ((int) (i13 * d11))) {
            this.f44015g = i13;
            this.f44016h = (int) (i13 * d11);
        } else {
            this.f44015g = (int) (i14 / d11);
            this.f44016h = i14;
        }
        int i15 = this.f44015g;
        float f11 = (i13 - i15) / 2.0f;
        float f12 = (i14 - r3) / 2.0f;
        float f13 = i15 / i13;
        float f14 = this.f44016h / i14;
        Matrix matrix = new Matrix();
        this.f44009a.getTransform(matrix);
        matrix.setScale(f13, f14);
        matrix.postTranslate(f11, f12);
        this.f44009a.setTransform(matrix);
        this.f44009a.requestLayout();
    }

    public void a(final int i11) {
        try {
            this.f44010b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.b(i11);
                }
            });
        } catch (Exception e11) {
            TXCLog.e("TXCTextureViewWrapper", "set render mode failed", e11);
        }
    }

    private void a() {
        try {
            a(new Runnable() { // from class: com.tencent.liteav.renderer.d.3
                @Override // java.lang.Runnable
                public void run() {
                    d dVar = d.this;
                    dVar.c(dVar.f44013e, d.this.f44014f);
                    d dVar2 = d.this;
                    dVar2.b(dVar2.f44017i);
                    d dVar3 = d.this;
                    dVar3.d(dVar3.f44018j);
                }
            });
        } catch (Exception e11) {
            TXCLog.e("TXCTextureViewWrapper", "adjust video size failed.", e11);
        }
    }

    public void a(final boolean z11) {
        try {
            this.f44010b.post(new Runnable() { // from class: com.tencent.liteav.renderer.d.4
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.f44009a != null) {
                        d dVar = d.this;
                        dVar.f44019k = Math.abs(dVar.f44019k);
                        if (z11) {
                            d dVar2 = d.this;
                            dVar2.f44019k = -dVar2.f44019k;
                        }
                        d.this.f44009a.setScaleX(d.this.f44019k);
                        d.this.f44009a.setScaleY(Math.abs(d.this.f44019k));
                    }
                }
            });
        } catch (Exception e11) {
            TXCLog.e("TXCTextureViewWrapper", "set mirror failed.", e11);
        }
    }

    public void a(int i11, int i12) {
        TXCLog.w("TXCTextureViewWrapper", "vrender: set view size:" + i11 + "," + i12);
        this.f44011c = i11;
        this.f44012d = i12;
        a();
    }

    private void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f44010b.post(runnable);
        }
    }

    public void b(int i11, int i12) {
        TXCLog.w("TXCTextureViewWrapper", "vrender: set video size:" + i11 + "," + i12);
        this.f44013e = i11;
        this.f44014f = i12;
        a();
    }
}
