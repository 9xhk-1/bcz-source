package qs;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82693a = "Grafika";

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f82694b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f82695c = 4;

    static {
        float[] fArr = new float[16];
        f82694b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String op2) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("Grafika", op2 + ": glError 0x" + Integer.toHexString(glGetError));
        }
    }

    public static void b(int location, String label) {
        if (location >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + label + "' in program");
    }

    public static FloatBuffer c(float[] coords) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(coords.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(coords);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int d(ByteBuffer data, int width, int height, int format) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        a("glGenTextures");
        GLES20.glBindTexture(com.badlogic.gdx.graphics.f.f11552a0, i11);
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.E2, 9729);
        GLES20.glTexParameteri(com.badlogic.gdx.graphics.f.f11552a0, com.badlogic.gdx.graphics.f.D2, 9729);
        a("loadImageTexture");
        GLES20.glTexImage2D(com.badlogic.gdx.graphics.f.f11552a0, 0, format, width, height, 0, format, com.badlogic.gdx.graphics.f.f11673u1, data);
        a("loadImageTexture");
        return i11;
    }

    public static int e(String vertexSource, String fragmentSource) {
        int f11;
        int f12 = f(com.badlogic.gdx.graphics.f.L1, vertexSource);
        if (f12 == 0 || (f11 = f(com.badlogic.gdx.graphics.f.K1, fragmentSource)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Grafika", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, f12);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, f11);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, com.badlogic.gdx.graphics.f.V1, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("Grafika", "Could not link program: ");
        Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int f(int shaderType, String source) {
        int glCreateShader = GLES20.glCreateShader(shaderType);
        a("glCreateShader type=" + shaderType);
        GLES20.glShaderSource(glCreateShader, source);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, com.badlogic.gdx.graphics.f.Z3, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("Grafika", "Could not compile shader " + shaderType + ":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Grafika", sb2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void g() {
        Log.i("Grafika", "vendor  : " + GLES20.glGetString(com.badlogic.gdx.graphics.f.f11668t2));
        Log.i("Grafika", "renderer: " + GLES20.glGetString(com.badlogic.gdx.graphics.f.f11674u2));
        Log.i("Grafika", "version : " + GLES20.glGetString(com.badlogic.gdx.graphics.f.f11680v2));
    }
}
