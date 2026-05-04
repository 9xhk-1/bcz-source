package qs;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f82686e = "Grafika";

    /* renamed from: f, reason: collision with root package name */
    public static final String f82687f = "uniform mat4 uMVPMatrix;attribute vec4 aPosition;void main() {    gl_Position = uMVPMatrix * aPosition;}";

    /* renamed from: g, reason: collision with root package name */
    public static final String f82688g = "precision mediump float;uniform vec4 uColor;void main() {    gl_FragColor = uColor;}";

    /* renamed from: a, reason: collision with root package name */
    public int f82689a;

    /* renamed from: b, reason: collision with root package name */
    public int f82690b;

    /* renamed from: c, reason: collision with root package name */
    public int f82691c;

    /* renamed from: d, reason: collision with root package name */
    public int f82692d;

    public c() {
        this.f82689a = -1;
        this.f82690b = -1;
        this.f82691c = -1;
        this.f82692d = -1;
        int e11 = d.e(f82687f, f82688g);
        this.f82689a = e11;
        if (e11 == 0) {
            throw new RuntimeException("Unable to create program");
        }
        Log.d("Grafika", "Created program " + this.f82689a);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f82689a, "aPosition");
        this.f82692d = glGetAttribLocation;
        d.b(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f82689a, "uMVPMatrix");
        this.f82691c = glGetUniformLocation;
        d.b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f82689a, "uColor");
        this.f82690b = glGetUniformLocation2;
        d.b(glGetUniformLocation2, "uColor");
    }

    public void a(float[] mvpMatrix, float[] color, FloatBuffer vertexBuffer, int firstVertex, int vertexCount, int coordsPerVertex, int vertexStride) {
        d.a("draw start");
        GLES20.glUseProgram(this.f82689a);
        d.a("glUseProgram");
        GLES20.glUniformMatrix4fv(this.f82691c, 1, false, mvpMatrix, 0);
        d.a("glUniformMatrix4fv");
        GLES20.glUniform4fv(this.f82690b, 1, color, 0);
        d.a("glUniform4fv ");
        GLES20.glEnableVertexAttribArray(this.f82692d);
        d.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f82692d, coordsPerVertex, com.badlogic.gdx.graphics.f.f11703z1, false, vertexStride, (Buffer) vertexBuffer);
        d.a("glVertexAttribPointer");
        GLES20.glDrawArrays(5, firstVertex, vertexCount);
        d.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f82692d);
        GLES20.glUseProgram(0);
    }

    public void b() {
        GLES20.glDeleteProgram(this.f82689a);
        this.f82689a = -1;
    }
}
