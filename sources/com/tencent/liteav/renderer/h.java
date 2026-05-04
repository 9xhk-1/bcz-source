package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f44079a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f44080b = 2;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44093o;

    /* renamed from: p, reason: collision with root package name */
    private final float[] f44094p;

    /* renamed from: q, reason: collision with root package name */
    private FloatBuffer f44095q;

    /* renamed from: t, reason: collision with root package name */
    private int f44098t;

    /* renamed from: w, reason: collision with root package name */
    private int f44101w;

    /* renamed from: x, reason: collision with root package name */
    private int f44102x;

    /* renamed from: y, reason: collision with root package name */
    private int f44103y;

    /* renamed from: z, reason: collision with root package name */
    private int f44104z;

    /* renamed from: c, reason: collision with root package name */
    private int f44081c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f44082d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f44083e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f44084f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f44085g = f44080b;

    /* renamed from: h, reason: collision with root package name */
    private int f44086h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f44087i = false;

    /* renamed from: j, reason: collision with root package name */
    private float[] f44088j = new float[16];

    /* renamed from: k, reason: collision with root package name */
    private float[] f44089k = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private float f44090l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f44091m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    private boolean f44092n = false;

    /* renamed from: r, reason: collision with root package name */
    private float[] f44096r = new float[16];

    /* renamed from: s, reason: collision with root package name */
    private float[] f44097s = new float[16];

    /* renamed from: u, reason: collision with root package name */
    private int f44099u = -12345;

    /* renamed from: v, reason: collision with root package name */
    private int f44100v = -12345;

    public h(Boolean bool) {
        this.f44093o = true;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f44094p = fArr;
        this.f44093o = bool.booleanValue();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f44095q = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f44097s, 0);
    }

    private void e() {
        int i11 = this.f44100v;
        if (i11 != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
            this.f44100v = -12345;
        }
        int i12 = this.f44099u;
        if (i12 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f44099u = -12345;
        }
    }

    public void a(int i11, int i12) {
        if (i11 == this.f44081c && i12 == this.f44082d) {
            return;
        }
        TXCLog.i("TXTweenFilter", "Output resolution change: " + this.f44081c + "*" + this.f44082d + " -> " + i11 + "*" + i12);
        this.f44081c = i11;
        this.f44082d = i12;
        if (i11 > i12) {
            Matrix.orthoM(this.f44088j, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f44090l = 1.0f;
            this.f44091m = 1.0f;
        } else {
            Matrix.orthoM(this.f44088j, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f44090l = 1.0f;
            this.f44091m = 1.0f;
        }
        this.f44092n = true;
    }

    public void b(int i11, int i12) {
        if (i11 == this.f44083e && i12 == this.f44084f) {
            return;
        }
        TXCLog.i("TXTweenFilter", "Input resolution change: " + this.f44083e + "*" + this.f44084f + " -> " + i11 + "*" + i12);
        this.f44083e = i11;
        this.f44084f = i12;
    }

    public void c(int i11) {
        GLES20.glViewport(0, 0, this.f44081c, this.f44082d);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f44098t);
        a("glUseProgram");
        if (this.f44093o) {
            GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
            GLES20.glBindTexture(36197, i11);
        } else {
            GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
            GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, i11);
        }
        this.f44095q.position(0);
        GLES20.glVertexAttribPointer(this.f44103y, 3, com.badlogic.gdx.graphics.f.f11703z1, false, 20, (Buffer) this.f44095q);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f44103y);
        a("glEnableVertexAttribArray maPositionHandle");
        this.f44095q.position(3);
        GLES20.glVertexAttribPointer(this.f44104z, 2, com.badlogic.gdx.graphics.f.f11703z1, false, 20, (Buffer) this.f44095q);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f44104z);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f44096r, 0);
        b(this.f44096r);
        GLES20.glUniformMatrix4fv(this.f44101w, 1, false, this.f44096r, 0);
        GLES20.glUniformMatrix4fv(this.f44102x, 1, false, this.f44097s, 0);
        a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        if (this.f44093o) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, 0);
        }
    }

    public int d(int i11) {
        d();
        int i12 = this.f44100v;
        if (i12 == -12345) {
            TXCLog.d("TXTweenFilter", "invalid frame buffer id");
            return i11;
        }
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, i12);
        c(i11);
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
        return this.f44099u;
    }

    public void b(int i11) {
        this.f44086h = i11;
    }

    private void b(float[] fArr) {
        int i11;
        int i12 = this.f44082d;
        if (i12 == 0 || (i11 = this.f44081c) == 0) {
            return;
        }
        int i13 = this.f44083e;
        int i14 = this.f44084f;
        int i15 = this.f44086h;
        if (i15 == 270 || i15 == 90) {
            i14 = i13;
            i13 = i14;
        }
        float f11 = i13;
        float f12 = (i11 * 1.0f) / f11;
        float f13 = i14;
        float f14 = (i12 * 1.0f) / f13;
        if (this.f44085g != f44079a ? f12 * f13 > i12 : f12 * f13 <= i12) {
            f12 = f14;
        }
        Matrix.setIdentityM(this.f44089k, 0);
        if (this.f44087i) {
            if (this.f44086h % 180 == 0) {
                Matrix.scaleM(this.f44089k, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.f44089k, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.f44089k, 0, ((f11 * f12) / this.f44081c) * 1.0f, ((f13 * f12) / this.f44082d) * 1.0f, 1.0f);
        Matrix.rotateM(this.f44089k, 0, this.f44086h, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.f44088j, 0, this.f44089k, 0);
    }

    private void d() {
        if (this.f44092n) {
            TXCLog.i("TXTweenFilter", "reloadFrameBuffer. size = " + this.f44081c + "*" + this.f44082d);
            e();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f44099u = iArr[0];
            this.f44100v = iArr2[0];
            TXCLog.d("TXTweenFilter", "frameBuffer id = " + this.f44100v + ", texture id = " + this.f44099u);
            GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, this.f44099u);
            a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, 6408, this.f44081c, this.f44082d, 0, 6408, com.badlogic.gdx.graphics.f.f11673u1, null);
            GLES20.glTexParameterf(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.E2, 9729.0f);
            GLES20.glTexParameterf(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.D2, 9729.0f);
            GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.F2, com.badlogic.gdx.graphics.f.f11705z3);
            GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.G2, com.badlogic.gdx.graphics.f.f11705z3);
            a("glTexParameter");
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, this.f44100v);
            GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, this.f44099u, 0);
            GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, 0);
            GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
            this.f44092n = false;
        }
    }

    public boolean a() {
        return this.f44093o;
    }

    public void a(int i11) {
        this.f44085g = i11;
    }

    public void a(boolean z11) {
        this.f44087i = z11;
    }

    public void a(float[] fArr) {
        this.f44097s = fArr;
    }

    private int a(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        a("glCreateShader type=" + i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, com.badlogic.gdx.graphics.f.Z3, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        TXCLog.e("TXTweenFilter", "Could not compile shader " + i11 + ":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        TXCLog.e("TXTweenFilter", sb2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void b() {
        if (this.f44093o) {
            this.f44098t = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f44098t = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i11 = this.f44098t;
        if (i11 == 0) {
            TXCLog.e("TXTweenFilter", "failed creating program");
            return;
        }
        this.f44103y = GLES20.glGetAttribLocation(i11, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.f44103y == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for aPosition");
            return;
        }
        this.f44104z = GLES20.glGetAttribLocation(this.f44098t, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.f44104z == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f44101w = GLES20.glGetUniformLocation(this.f44098t, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.f44101w == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f44102x = GLES20.glGetUniformLocation(this.f44098t, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.f44102x == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for uSTMatrix");
        }
    }

    private int a(String str, String str2) {
        int a11;
        int a12 = a(com.badlogic.gdx.graphics.f.L1, str);
        if (a12 == 0 || (a11 = a(com.badlogic.gdx.graphics.f.K1, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            TXCLog.e("TXTweenFilter", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, a12);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, a11);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, com.badlogic.gdx.graphics.f.V1, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        TXCLog.e("TXTweenFilter", "Could not link program: ");
        TXCLog.e("TXTweenFilter", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public void c() {
        GLES20.glDeleteProgram(this.f44098t);
        e();
    }

    private void a(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            TXCLog.e("TXTweenFilter", str + ": glError " + glGetError);
        }
    }
}
