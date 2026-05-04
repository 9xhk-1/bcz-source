package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f43992a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f43993b;

    /* renamed from: c, reason: collision with root package name */
    private FloatBuffer f43994c;

    /* renamed from: f, reason: collision with root package name */
    private int f43997f;

    /* renamed from: h, reason: collision with root package name */
    private int f43999h;

    /* renamed from: i, reason: collision with root package name */
    private int f44000i;

    /* renamed from: j, reason: collision with root package name */
    private int f44001j;

    /* renamed from: k, reason: collision with root package name */
    private int f44002k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f44004m;

    /* renamed from: d, reason: collision with root package name */
    private float[] f43995d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    private float[] f43996e = new float[16];

    /* renamed from: g, reason: collision with root package name */
    private int f43998g = -12345;

    /* renamed from: l, reason: collision with root package name */
    private boolean f44003l = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f44005n = false;

    /* renamed from: o, reason: collision with root package name */
    private int f44006o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f44007p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f44008q = 0;

    public c(boolean z11) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f43992a = fArr;
        float[] fArr2 = {1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        this.f43993b = fArr2;
        this.f44004m = z11;
        if (z11) {
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f43994c = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
        } else {
            FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f43994c = asFloatBuffer2;
            asFloatBuffer2.put(fArr2).position(0);
        }
        Matrix.setIdentityM(this.f43996e, 0);
    }

    private void b(int i11, int i12) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        if (this.f44003l) {
            this.f44003l = false;
            return;
        }
        GLES20.glUseProgram(this.f43997f);
        a("glUseProgram");
        GLES20.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
        GLES20.glBindTexture(i11, i12);
        this.f43994c.position(0);
        GLES20.glVertexAttribPointer(this.f44001j, 3, com.badlogic.gdx.graphics.f.f11703z1, false, 20, (Buffer) this.f43994c);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f44001j);
        a("glEnableVertexAttribArray maPositionHandle");
        this.f43994c.position(3);
        GLES20.glVertexAttribPointer(this.f44002k, 2, com.badlogic.gdx.graphics.f.f11703z1, false, 20, (Buffer) this.f43994c);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f44002k);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f43995d, 0);
        GLES20.glUniformMatrix4fv(this.f43999h, 1, false, this.f43995d, 0);
        if (this.f44007p % 8 != 0) {
            Matrix.scaleM(this.f43996e, 0, ((r10 - 1) * 1.0f) / (((r10 + 7) / 8) * 8), 1.0f, 1.0f);
        }
        if (this.f44008q % 8 != 0) {
            Matrix.scaleM(this.f43996e, 0, 1.0f, ((r10 - 1) * 1.0f) / (((r10 + 7) / 8) * 8), 1.0f);
        }
        GLES20.glUniformMatrix4fv(this.f44000i, 1, false, this.f43996e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    private void d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.f43998g = i11;
        GLES20.glBindTexture(36197, i11);
        a("glBindTexture mTextureID");
    }

    public int a() {
        return this.f43998g;
    }

    public void c() {
        int i11 = this.f43997f;
        if (i11 != 0) {
            GLES20.glDeleteProgram(i11);
        }
        GLES20.glDeleteTextures(1, new int[]{this.f43998g}, 0);
        this.f43998g = -1;
    }

    public void a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return;
        }
        a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f43996e);
        b(36197, this.f43998g);
    }

    public void a(int i11, int i12) {
        this.f44007p = i11;
        this.f44008q = i12;
    }

    public void a(int i11, boolean z11, int i12) {
        if (this.f44005n != z11 || this.f44006o != i12) {
            this.f44005n = z11;
            this.f44006o = i12;
            float[] fArr = new float[20];
            for (int i13 = 0; i13 < 20; i13++) {
                fArr[i13] = this.f43993b[i13];
            }
            if (this.f44005n) {
                fArr[0] = -fArr[0];
                fArr[5] = -fArr[5];
                fArr[10] = -fArr[10];
                fArr[15] = -fArr[15];
            }
            int i14 = i12 / 90;
            for (int i15 = 0; i15 < i14; i15++) {
                float f11 = fArr[3];
                float f12 = fArr[4];
                fArr[3] = fArr[8];
                fArr[4] = fArr[9];
                fArr[8] = fArr[18];
                fArr[9] = fArr[19];
                fArr[18] = fArr[13];
                fArr[19] = fArr[14];
                fArr[13] = f11;
                fArr[14] = f12;
            }
            this.f43994c.clear();
            this.f43994c.put(fArr).position(0);
        }
        b(com.badlogic.gdx.graphics.f.f11552a0, i11);
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
        TXCLog.e("TXCOesTextureRender", "Could not compile shader " + i11 + ":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        TXCLog.e("TXCOesTextureRender", sb2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void b() {
        if (this.f44004m) {
            this.f43997f = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f43997f = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i11 = this.f43997f;
        if (i11 == 0) {
            TXCLog.e("TXCOesTextureRender", "failed creating program");
            return;
        }
        this.f44001j = GLES20.glGetAttribLocation(i11, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.f44001j == -1) {
            TXCLog.e("TXCOesTextureRender", "Could not get attrib location for aPosition");
            return;
        }
        this.f44002k = GLES20.glGetAttribLocation(this.f43997f, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.f44002k == -1) {
            TXCLog.e("TXCOesTextureRender", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f43999h = GLES20.glGetUniformLocation(this.f43997f, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.f43999h == -1) {
            TXCLog.e("TXCOesTextureRender", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f44000i = GLES20.glGetUniformLocation(this.f43997f, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.f44000i == -1) {
            TXCLog.e("TXCOesTextureRender", "Could not get attrib location for uSTMatrix");
            return;
        }
        if (this.f44004m) {
            d();
        }
        GLES20.glTexParameterf(36197, com.badlogic.gdx.graphics.f.E2, 9729.0f);
        GLES20.glTexParameterf(36197, com.badlogic.gdx.graphics.f.D2, 9729.0f);
        GLES20.glTexParameteri(36197, com.badlogic.gdx.graphics.f.F2, com.badlogic.gdx.graphics.f.f11705z3);
        GLES20.glTexParameteri(36197, com.badlogic.gdx.graphics.f.G2, com.badlogic.gdx.graphics.f.f11705z3);
        a("glTexParameter");
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
            TXCLog.e("TXCOesTextureRender", "Could not create program");
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
        TXCLog.e("TXCOesTextureRender", "Could not link program: ");
        TXCLog.e("TXCOesTextureRender", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            TXCLog.e("TXCOesTextureRender", str + ": glError " + glGetError);
        }
    }
}
