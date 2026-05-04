package com.tencent.liteav.basic.c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected int f43194a;

    /* renamed from: b, reason: collision with root package name */
    protected int f43195b;

    /* renamed from: c, reason: collision with root package name */
    protected int f43196c;

    /* renamed from: d, reason: collision with root package name */
    protected int f43197d;

    /* renamed from: e, reason: collision with root package name */
    protected int f43198e;

    /* renamed from: f, reason: collision with root package name */
    protected int f43199f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f43200g;

    /* renamed from: h, reason: collision with root package name */
    protected FloatBuffer f43201h;

    /* renamed from: i, reason: collision with root package name */
    protected FloatBuffer f43202i;

    /* renamed from: j, reason: collision with root package name */
    protected float[] f43203j;

    /* renamed from: k, reason: collision with root package name */
    protected float[] f43204k;

    /* renamed from: l, reason: collision with root package name */
    protected a f43205l;

    /* renamed from: m, reason: collision with root package name */
    protected int f43206m;

    /* renamed from: n, reason: collision with root package name */
    protected int f43207n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f43208o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f43209p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f43210q;

    /* renamed from: r, reason: collision with root package name */
    private final LinkedList<Runnable> f43211r;

    /* renamed from: s, reason: collision with root package name */
    private final String f43212s;

    /* renamed from: t, reason: collision with root package name */
    private final String f43213t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43214u;

    /* renamed from: v, reason: collision with root package name */
    private int f43215v;

    /* renamed from: w, reason: collision with root package name */
    private float[] f43216w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(int i11);
    }

    public f() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    public boolean a() {
        int a11 = g.a(this.f43212s, this.f43213t);
        this.f43194a = a11;
        if (a11 == 0 || !b()) {
            this.f43200g = false;
        } else {
            this.f43200g = true;
        }
        c();
        return this.f43200g;
    }

    public boolean b() {
        this.f43195b = GLES20.glGetAttribLocation(this.f43194a, "position");
        this.f43196c = GLES20.glGetUniformLocation(this.f43194a, "inputImageTexture");
        this.f43215v = GLES20.glGetUniformLocation(this.f43194a, "textureTransform");
        this.f43197d = GLES20.glGetAttribLocation(this.f43194a, "inputTextureCoordinate");
        return true;
    }

    public void d() {
        GLES20.glDeleteProgram(this.f43194a);
        e();
        this.f43200g = false;
    }

    public void e() {
        f();
        this.f43199f = -1;
        this.f43198e = -1;
    }

    public void f() {
        int i11 = this.f43206m;
        if (i11 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
            this.f43206m = -1;
        }
        int i12 = this.f43207n;
        if (i12 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f43207n = -1;
        }
    }

    public void g() {
        if (this.f43204k != null) {
            for (int i11 = 0; i11 < 8; i11 += 2) {
                float[] fArr = this.f43204k;
                fArr[i11] = 1.0f - fArr[i11];
            }
            a(this.f43203j, this.f43204k);
        }
    }

    public void h() {
        if (this.f43204k != null) {
            for (int i11 = 1; i11 < 8; i11 += 2) {
                float[] fArr = this.f43204k;
                fArr[i11] = 1.0f - fArr[i11];
            }
            a(this.f43203j, this.f43204k);
        }
    }

    public void k() {
        while (!this.f43211r.isEmpty()) {
            this.f43211r.removeFirst().run();
        }
    }

    public int l() {
        return this.f43207n;
    }

    public int m() {
        return this.f43206m;
    }

    public f(String str, String str2) {
        this(str, str2, false);
    }

    public f(String str, String str2, boolean z11) {
        this.f43214u = false;
        this.f43215v = -1;
        this.f43216w = null;
        this.f43206m = -1;
        this.f43207n = -1;
        this.f43208o = false;
        this.f43209p = false;
        this.f43210q = false;
        this.f43211r = new LinkedList<>();
        this.f43212s = str;
        this.f43213t = str2;
        this.f43210q = z11;
        if (true == z11) {
            TXCLog.i("TXCGPUFilter", "set Oes fileter");
        }
        float[] fArr = i.f43240e;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f43201h = asFloatBuffer;
        this.f43203j = fArr;
        asFloatBuffer.put(fArr).position(0);
        this.f43202i = ByteBuffer.allocateDirect(i.f43236a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] a11 = i.a(h.NORMAL, false, true);
        this.f43204k = a11;
        this.f43202i.put(a11).position(0);
    }

    public int b(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f43200g) {
            return -1;
        }
        a(i11, floatBuffer, floatBuffer2);
        if (this.f43205l == null) {
            return 1;
        }
        this.f43205l.a(i11);
        return 1;
    }

    public void a(boolean z11) {
        this.f43208o = z11;
    }

    public void a(a aVar) {
        this.f43214u = aVar != null;
        this.f43205l = aVar;
    }

    public int b(int i11) {
        return a(i11, this.f43206m, this.f43207n);
    }

    public void a(int i11, int i12) {
        if (this.f43199f == i12 && this.f43198e == i11) {
            return;
        }
        this.f43198e = i11;
        this.f43199f = i12;
        if (this.f43208o) {
            if (this.f43206m != -1) {
                f();
            }
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f43206m = iArr[0];
            this.f43207n = g.a(i11, i12, 6408, 6408);
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, this.f43206m);
            GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, this.f43207n, 0);
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
        }
    }

    public void c() {
    }

    public void i() {
    }

    public void j() {
    }

    public void a(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        float[] fArr;
        GLES20.glUseProgram(this.f43194a);
        k();
        if (this.f43200g) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f43195b, 2, com.badlogic.gdx.graphics.f.f11703z1, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f43195b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f43197d, 2, com.badlogic.gdx.graphics.f.f11703z1, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f43197d);
            int i12 = this.f43215v;
            if (i12 >= 0 && (fArr = this.f43216w) != null) {
                GLES20.glUniformMatrix4fv(i12, 1, false, fArr, 0);
            }
            if (i11 != -1) {
                GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
                if (true == this.f43210q) {
                    GLES20.glBindTexture(36197, i11);
                } else {
                    GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, i11);
                }
                GLES20.glUniform1i(this.f43196c, 0);
            }
            i();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f43195b);
            GLES20.glDisableVertexAttribArray(this.f43197d);
            j();
            if (true == this.f43210q) {
                GLES20.glBindTexture(36197, 0);
            } else {
                GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, 0);
            }
        }
    }

    public int a(int i11) {
        return b(i11, this.f43201h, this.f43202i);
    }

    public int a(int i11, int i12, int i13) {
        if (!this.f43200g) {
            return -1;
        }
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, i12);
        a(i11, this.f43201h, this.f43202i);
        if (this.f43205l != null) {
            this.f43205l.a(i13);
        }
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
        return i13;
    }

    public void a(float[] fArr, float[] fArr2) {
        this.f43203j = fArr;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i.f43240e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f43201h = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f43204k = fArr2;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(i.f43236a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f43202i = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
    }

    public void a(int i11, int i12, int i13, float[] fArr, float f11, boolean z11, boolean z12) {
        float[] a11 = fArr == null ? i.a(h.NORMAL, false, true) : fArr;
        int i14 = i11;
        float f12 = i14;
        int i15 = i12;
        float f13 = i15;
        float f14 = f12 / f13;
        if (f14 > f11) {
            i14 = (int) (f13 * f11);
        } else if (f14 < f11) {
            i15 = (int) (f12 / f11);
        }
        float f15 = (1.0f - (i14 / f12)) / 2.0f;
        float f16 = (1.0f - (i15 / f13)) / 2.0f;
        for (int i16 = 0; i16 < a11.length / 2; i16++) {
            int i17 = i16 * 2;
            float f17 = a11[i17];
            if (f17 < 0.5f) {
                a11[i17] = f17 + f15;
            } else {
                a11[i17] = f17 - f15;
            }
            int i18 = i17 + 1;
            float f18 = a11[i18];
            if (f18 < 0.5f) {
                a11[i18] = f18 + f16;
            } else {
                a11[i18] = f18 - f16;
            }
        }
        int i19 = i13 / 90;
        for (int i21 = 0; i21 < i19; i21++) {
            float f19 = a11[0];
            float f21 = a11[1];
            a11[0] = a11[2];
            a11[1] = a11[3];
            a11[2] = a11[6];
            a11[3] = a11[7];
            a11[6] = a11[4];
            a11[7] = a11[5];
            a11[4] = f19;
            a11[5] = f21;
        }
        if (i19 == 0 || i19 == 2) {
            if (z11) {
                a11[0] = 1.0f - a11[0];
                a11[2] = 1.0f - a11[2];
                a11[4] = 1.0f - a11[4];
                a11[6] = 1.0f - a11[6];
            }
            if (z12) {
                a11[1] = 1.0f - a11[1];
                a11[3] = 1.0f - a11[3];
                a11[5] = 1.0f - a11[5];
                a11[7] = 1.0f - a11[7];
            }
        } else {
            if (z12) {
                a11[0] = 1.0f - a11[0];
                a11[2] = 1.0f - a11[2];
                a11[4] = 1.0f - a11[4];
                a11[6] = 1.0f - a11[6];
            }
            if (z11) {
                a11[1] = 1.0f - a11[1];
                a11[3] = 1.0f - a11[3];
                a11[5] = 1.0f - a11[5];
                a11[7] = 1.0f - a11[7];
            }
        }
        a((float[]) i.f43240e.clone(), a11);
    }

    public void a(final int i11, final float f11) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.c.f.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1f(i11, f11);
            }
        });
    }

    public void a(Runnable runnable) {
        synchronized (this.f43211r) {
            this.f43211r.addLast(runnable);
        }
    }
}
