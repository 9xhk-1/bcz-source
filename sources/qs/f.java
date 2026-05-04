package qs;

import android.opengl.Matrix;
import com.malmstein.fenster.videorender.gles.Drawable2d;
import com.malmstein.fenster.videorender.gles.Texture2dProgram;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: l, reason: collision with root package name */
    public static final String f82696l = "Grafika";

    /* renamed from: a, reason: collision with root package name */
    public Drawable2d f82697a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f82698b;

    /* renamed from: c, reason: collision with root package name */
    public int f82699c;

    /* renamed from: d, reason: collision with root package name */
    public float f82700d;

    /* renamed from: e, reason: collision with root package name */
    public float f82701e;

    /* renamed from: f, reason: collision with root package name */
    public float f82702f;

    /* renamed from: g, reason: collision with root package name */
    public float f82703g;

    /* renamed from: h, reason: collision with root package name */
    public float f82704h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f82705i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f82706j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f82707k = new float[16];

    public f(Drawable2d drawable) {
        this.f82697a = drawable;
        float[] fArr = new float[4];
        this.f82698b = fArr;
        fArr[3] = 1.0f;
        this.f82699c = -1;
        this.f82705i = new float[16];
        this.f82706j = false;
    }

    public void a(Texture2dProgram program, float[] projectionMatrix) {
        Matrix.multiplyMM(this.f82707k, 0, projectionMatrix, 0, d(), 0);
        program.b(this.f82707k, this.f82697a.d(), 0, this.f82697a.e(), this.f82697a.a(), this.f82697a.f(), d.f82694b, this.f82697a.b(), this.f82699c, this.f82697a.c());
    }

    public void b(c program, float[] projectionMatrix) {
        Matrix.multiplyMM(this.f82707k, 0, projectionMatrix, 0, d(), 0);
        program.a(this.f82707k, this.f82698b, this.f82697a.d(), 0, this.f82697a.e(), this.f82697a.a(), this.f82697a.f());
    }

    public float[] c() {
        return this.f82698b;
    }

    public float[] d() {
        if (!this.f82706j) {
            j();
        }
        return this.f82705i;
    }

    public float e() {
        return this.f82703g;
    }

    public float f() {
        return this.f82704h;
    }

    public float g() {
        return this.f82700d;
    }

    public float h() {
        return this.f82701e;
    }

    public float i() {
        return this.f82702f;
    }

    public final void j() {
        float[] fArr = this.f82705i;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.f82703g, this.f82704h, 0.0f);
        float f11 = this.f82700d;
        if (f11 != 0.0f) {
            Matrix.rotateM(fArr, 0, f11, 0.0f, 0.0f, 1.0f);
        }
        Matrix.scaleM(fArr, 0, this.f82701e, this.f82702f, 1.0f);
        this.f82706j = true;
    }

    public void k(float red, float green, float blue) {
        float[] fArr = this.f82698b;
        fArr[0] = red;
        fArr[1] = green;
        fArr[2] = blue;
    }

    public void l(float posX, float posY) {
        this.f82703g = posX;
        this.f82704h = posY;
        this.f82706j = false;
    }

    public void m(float angle) {
        while (angle >= 360.0f) {
            angle -= 360.0f;
        }
        while (angle <= -360.0f) {
            angle += 360.0f;
        }
        this.f82700d = angle;
        this.f82706j = false;
    }

    public void n(float scaleX, float scaleY) {
        this.f82701e = scaleX;
        this.f82702f = scaleY;
        this.f82706j = false;
    }

    public void o(int textureId) {
        this.f82699c = textureId;
    }

    public String toString() {
        return "[Sprite2d pos=" + this.f82703g + "," + this.f82704h + " scale=" + this.f82701e + "," + this.f82702f + " angle=" + this.f82700d + " color={" + this.f82698b[0] + "," + this.f82698b[1] + "," + this.f82698b[2] + "} drawable=" + this.f82697a + "]";
    }
}
