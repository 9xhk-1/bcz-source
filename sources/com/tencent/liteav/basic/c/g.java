package com.tencent.liteav.basic.c;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static FloatBuffer f43220a;

    /* renamed from: f, reason: collision with root package name */
    private static float[] f43225f;

    /* renamed from: g, reason: collision with root package name */
    private static float[] f43226g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: h, reason: collision with root package name */
    private static float[] f43227h = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: i, reason: collision with root package name */
    private static float[] f43228i = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static float[] f43229j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public static FloatBuffer f43221b = a(f43226g);

    /* renamed from: c, reason: collision with root package name */
    public static FloatBuffer f43222c = a(f43227h);

    /* renamed from: d, reason: collision with root package name */
    public static FloatBuffer f43223d = a(f43228i);

    /* renamed from: e, reason: collision with root package name */
    public static FloatBuffer f43224e = a(f43229j);

    /* renamed from: k, reason: collision with root package name */
    private static int f43230k = 2;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f43225f = fArr;
        f43220a = a(fArr);
    }

    public static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, iArr[0]);
        GLES20.glTexParameterf(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.E2, 9729.0f);
        GLES20.glTexParameterf(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.D2, 9729.0f);
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.F2, com.badlogic.gdx.graphics.f.f11705z3);
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.G2, com.badlogic.gdx.graphics.f.f11705z3);
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, 0);
        return iArr[0];
    }

    public static int c() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static Object d() {
        return EGL14.eglGetCurrentContext();
    }

    public static int a(int i11, int i12, int i13, int i14, IntBuffer intBuffer) {
        int b11 = b();
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, b11);
        GLES20.glTexImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, i13, i11, i12, 0, i14, com.badlogic.gdx.graphics.f.f11673u1, intBuffer);
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, 0);
        return b11;
    }

    public static int a(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, i14, null);
    }

    public static void b(int i11) {
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, i11);
        GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, 0, 0);
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
    }

    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, com.badlogic.gdx.graphics.f.E2, 9729.0f);
        GLES20.glTexParameterf(36197, com.badlogic.gdx.graphics.f.D2, 9729.0f);
        GLES20.glTexParameteri(36197, com.badlogic.gdx.graphics.f.F2, com.badlogic.gdx.graphics.f.f11705z3);
        GLES20.glTexParameteri(36197, com.badlogic.gdx.graphics.f.G2, com.badlogic.gdx.graphics.f.f11705z3);
        return iArr[0];
    }

    public static int a(String str, int i11) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, com.badlogic.gdx.graphics.f.Z3, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        TXCLog.w("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public static int a(String str, String str2) {
        int[] iArr = new int[1];
        int a11 = a(str, com.badlogic.gdx.graphics.f.L1);
        if (a11 == 0) {
            TXCLog.w("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int a12 = a(str2, com.badlogic.gdx.graphics.f.K1);
        if (a12 == 0) {
            TXCLog.w("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glAttachShader(glCreateProgram, a12);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, com.badlogic.gdx.graphics.f.V1, iArr, 0);
        if (iArr[0] <= 0) {
            TXCLog.w("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(a11);
        GLES20.glDeleteShader(a12);
        return glCreateProgram;
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            TXCLog.e("OpenGlUtils", str + ": glError 0x" + Integer.toHexString(glGetError));
        }
    }

    public static void a(int i11) {
        if (i11 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        }
    }

    public static void a(int i11, int i12) {
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, i12);
        GLES20.glFramebufferTexture2D(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, i11, 0);
        GLES20.glBindFramebuffer(com.badlogic.gdx.graphics.f.f11622l4, 0);
    }
}
