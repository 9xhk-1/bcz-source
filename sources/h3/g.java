package h3;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;
import n2.j;
import z2.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f58171a;

    /* renamed from: b, reason: collision with root package name */
    public float f58172b;

    /* renamed from: c, reason: collision with root package name */
    public float f58173c;

    /* renamed from: d, reason: collision with root package name */
    public int f58174d;

    /* renamed from: e, reason: collision with root package name */
    public int f58175e;

    /* renamed from: f, reason: collision with root package name */
    public int f58176f;

    /* renamed from: g, reason: collision with root package name */
    public int f58177g;

    /* renamed from: h, reason: collision with root package name */
    public final Vector3 f58178h = new Vector3();

    public void A(int i11) {
        this.f58175e = i11;
    }

    public void B(float f11) {
        this.f58173c = f11;
    }

    public void C(float f11, float f12) {
        this.f58172b = f11;
        this.f58173c = f12;
    }

    public void D(float f11) {
        this.f58172b = f11;
    }

    public Vector2 E(Vector2 vector2, Matrix4 matrix4) {
        this.f58178h.set(vector2.f12535x, vector2.f12536y, 0.0f);
        this.f58178h.mul(matrix4);
        this.f58171a.g(this.f58178h, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        Vector3 vector3 = this.f58178h;
        float height = q1.g.f81379b.getHeight();
        Vector3 vector32 = this.f58178h;
        vector3.f12538y = height - vector32.f12538y;
        vector2.f12535x = vector32.f12537x;
        vector2.f12536y = vector32.f12538y;
        return vector2;
    }

    public Vector2 F(Vector2 vector2) {
        this.f58178h.set(vector2.f12535x, vector2.f12536y, 1.0f);
        this.f58171a.q(this.f58178h, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        Vector3 vector3 = this.f58178h;
        vector2.set(vector3.f12537x, vector3.f12538y);
        return vector2;
    }

    public Vector3 G(Vector3 vector3) {
        this.f58171a.q(vector3, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        return vector3;
    }

    public final void H(int i11, int i12) {
        I(i11, i12, false);
    }

    public void I(int i11, int i12, boolean z11) {
        b(z11);
    }

    public void a() {
        b(false);
    }

    public void b(boolean z11) {
        j.b(this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        com.badlogic.gdx.graphics.a aVar = this.f58171a;
        float f11 = this.f58172b;
        aVar.f11517j = f11;
        float f12 = this.f58173c;
        aVar.f11518k = f12;
        if (z11) {
            aVar.f11508a.set(f11 / 2.0f, f12 / 2.0f, 0.0f);
        }
        this.f58171a.r();
    }

    public void c(Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        n.a(this.f58171a, this.f58174d, this.f58175e, this.f58176f, this.f58177g, matrix4, rectangle, rectangle2);
    }

    public int d() {
        return this.f58175e;
    }

    public com.badlogic.gdx.graphics.a e() {
        return this.f58171a;
    }

    public int f() {
        return this.f58174d;
    }

    public Ray g(float f11, float f12) {
        return this.f58171a.b(f11, f12, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
    }

    public int h() {
        return q1.g.f81379b.getWidth() - (this.f58174d + this.f58176f);
    }

    public int i() {
        return this.f58174d + this.f58176f;
    }

    public int j() {
        return this.f58177g;
    }

    public int k() {
        return this.f58176f;
    }

    public int l() {
        return this.f58174d;
    }

    public int m() {
        return this.f58175e;
    }

    public int n() {
        return q1.g.f81379b.getHeight() - (this.f58175e + this.f58177g);
    }

    public int o() {
        return this.f58175e + this.f58177g;
    }

    public float p() {
        return this.f58173c;
    }

    public float q() {
        return this.f58172b;
    }

    public Vector2 r(Vector2 vector2) {
        this.f58178h.set(vector2.f12535x, vector2.f12536y, 1.0f);
        this.f58171a.g(this.f58178h, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        Vector3 vector3 = this.f58178h;
        vector2.set(vector3.f12537x, vector3.f12538y);
        return vector2;
    }

    public Vector3 s(Vector3 vector3) {
        this.f58171a.g(vector3, this.f58174d, this.f58175e, this.f58176f, this.f58177g);
        return vector3;
    }

    public void t(com.badlogic.gdx.graphics.a aVar) {
        this.f58171a = aVar;
    }

    public void u(int i11, int i12, int i13, int i14) {
        this.f58174d = i11;
        this.f58175e = i12;
        this.f58176f = i13;
        this.f58177g = i14;
    }

    public void v(int i11) {
        this.f58177g = i11;
    }

    public void w(int i11, int i12) {
        this.f58174d = i11;
        this.f58175e = i12;
    }

    public void x(int i11, int i12) {
        this.f58176f = i11;
        this.f58177g = i12;
    }

    public void y(int i11) {
        this.f58176f = i11;
    }

    public void z(int i11) {
        this.f58174d = i11;
    }
}
