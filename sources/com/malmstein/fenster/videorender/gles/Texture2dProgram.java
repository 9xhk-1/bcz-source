package com.malmstein.fenster.videorender.gles;

import android.opengl.GLES20;
import android.util.Log;
import com.badlogic.gdx.graphics.f;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import pn.j;
import qs.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Texture2dProgram {

    /* renamed from: n, reason: collision with root package name */
    public static final String f39243n = "Grafika";

    /* renamed from: o, reason: collision with root package name */
    public static final String f39244o = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: p, reason: collision with root package name */
    public static final String f39245p = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* renamed from: q, reason: collision with root package name */
    public static final String f39246q = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* renamed from: r, reason: collision with root package name */
    public static final String f39247r = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";

    /* renamed from: s, reason: collision with root package name */
    public static final int f39248s = 9;

    /* renamed from: t, reason: collision with root package name */
    public static final String f39249t = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";

    /* renamed from: a, reason: collision with root package name */
    public ProgramType f39250a;

    /* renamed from: b, reason: collision with root package name */
    public int f39251b;

    /* renamed from: c, reason: collision with root package name */
    public int f39252c;

    /* renamed from: d, reason: collision with root package name */
    public int f39253d;

    /* renamed from: e, reason: collision with root package name */
    public int f39254e;

    /* renamed from: f, reason: collision with root package name */
    public int f39255f;

    /* renamed from: g, reason: collision with root package name */
    public int f39256g;

    /* renamed from: h, reason: collision with root package name */
    public int f39257h;

    /* renamed from: i, reason: collision with root package name */
    public int f39258i;

    /* renamed from: j, reason: collision with root package name */
    public int f39259j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f39260k = new float[9];

    /* renamed from: l, reason: collision with root package name */
    public float[] f39261l;

    /* renamed from: m, reason: collision with root package name */
    public float f39262m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ProgramType {
        TEXTURE_2D,
        TEXTURE_EXT,
        TEXTURE_EXT_BW,
        TEXTURE_EXT_FILT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39263a;

        static {
            int[] iArr = new int[ProgramType.values().length];
            f39263a = iArr;
            try {
                iArr[ProgramType.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39263a[ProgramType.TEXTURE_EXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39263a[ProgramType.TEXTURE_EXT_BW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39263a[ProgramType.TEXTURE_EXT_FILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Texture2dProgram(ProgramType programType) {
        this.f39250a = programType;
        int i11 = a.f39263a[programType.ordinal()];
        if (i11 == 1) {
            this.f39259j = f.f11552a0;
            this.f39251b = d.e(f39244o, f39245p);
        } else if (i11 == 2) {
            this.f39259j = 36197;
            this.f39251b = d.e(f39244o, f39246q);
        } else if (i11 == 3) {
            this.f39259j = 36197;
            this.f39251b = d.e(f39244o, f39247r);
        } else {
            if (i11 != 4) {
                throw new RuntimeException("Unhandled type " + programType);
            }
            this.f39259j = 36197;
            this.f39251b = d.e(f39244o, f39249t);
        }
        if (this.f39251b == 0) {
            throw new RuntimeException("Unable to create program");
        }
        Log.d("Grafika", "Created program " + this.f39251b + " (" + programType + j.f81007d);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f39251b, "aPosition");
        this.f39257h = glGetAttribLocation;
        d.b(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f39251b, "aTextureCoord");
        this.f39258i = glGetAttribLocation2;
        d.b(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f39251b, "uMVPMatrix");
        this.f39252c = glGetUniformLocation;
        d.b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f39251b, "uTexMatrix");
        this.f39253d = glGetUniformLocation2;
        d.b(glGetUniformLocation2, "uTexMatrix");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f39251b, "uKernel");
        this.f39254e = glGetUniformLocation3;
        if (glGetUniformLocation3 < 0) {
            this.f39254e = -1;
            this.f39255f = -1;
            this.f39256g = -1;
            return;
        }
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f39251b, "uTexOffset");
        this.f39255f = glGetUniformLocation4;
        d.b(glGetUniformLocation4, "uTexOffset");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.f39251b, "uColorAdjust");
        this.f39256g = glGetUniformLocation5;
        d.b(glGetUniformLocation5, "uColorAdjust");
        e(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0.0f);
        f(256, 256);
    }

    public int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        d.a("glGenTextures");
        int i11 = iArr[0];
        GLES20.glBindTexture(this.f39259j, i11);
        d.a("glBindTexture " + i11);
        GLES20.glTexParameterf(36197, f.E2, 9728.0f);
        GLES20.glTexParameterf(36197, f.D2, 9729.0f);
        GLES20.glTexParameteri(36197, f.F2, f.f11705z3);
        GLES20.glTexParameteri(36197, f.G2, f.f11705z3);
        d.a("glTexParameter");
        return i11;
    }

    public void b(float[] mvpMatrix, FloatBuffer vertexBuffer, int firstVertex, int vertexCount, int coordsPerVertex, int vertexStride, float[] texMatrix, FloatBuffer texBuffer, int textureId, int texStride) {
        d.a("draw start");
        GLES20.glUseProgram(this.f39251b);
        d.a("glUseProgram");
        GLES20.glActiveTexture(f.R2);
        GLES20.glBindTexture(this.f39259j, textureId);
        GLES20.glUniformMatrix4fv(this.f39252c, 1, false, mvpMatrix, 0);
        d.a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.f39253d, 1, false, texMatrix, 0);
        d.a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.f39257h);
        d.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f39257h, coordsPerVertex, f.f11703z1, false, vertexStride, (Buffer) vertexBuffer);
        d.a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f39258i);
        d.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f39258i, 2, f.f11703z1, false, texStride, (Buffer) texBuffer);
        d.a("glVertexAttribPointer");
        int i11 = this.f39254e;
        if (i11 >= 0) {
            GLES20.glUniform1fv(i11, 9, this.f39260k, 0);
            GLES20.glUniform2fv(this.f39255f, 9, this.f39261l, 0);
            GLES20.glUniform1f(this.f39256g, this.f39262m);
        }
        GLES20.glDrawArrays(5, firstVertex, vertexCount);
        d.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f39257h);
        GLES20.glDisableVertexAttribArray(this.f39258i);
        GLES20.glBindTexture(this.f39259j, 0);
        GLES20.glUseProgram(0);
    }

    public ProgramType c() {
        return this.f39250a;
    }

    public void d() {
        Log.d("Grafika", "deleting program " + this.f39251b);
        GLES20.glDeleteProgram(this.f39251b);
        this.f39251b = -1;
    }

    public void e(float[] values, float colorAdj) {
        if (values.length == 9) {
            System.arraycopy(values, 0, this.f39260k, 0, 9);
            this.f39262m = colorAdj;
            return;
        }
        throw new IllegalArgumentException("Kernel size is " + values.length + " vs. 9");
    }

    public void f(int width, int height) {
        float f11 = 1.0f / width;
        float f12 = 1.0f / height;
        float f13 = -f11;
        float f14 = -f12;
        this.f39261l = new float[]{f13, f14, 0.0f, f14, f11, f14, f13, 0.0f, 0.0f, 0.0f, f11, 0.0f, f13, f12, 0.0f, f12, f11, f12};
    }
}
