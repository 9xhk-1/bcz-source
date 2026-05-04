package ll;

import a3.r;
import com.badlogic.gdx.math.Vector2;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public double f71497a;

    /* renamed from: b, reason: collision with root package name */
    public double f71498b;

    /* renamed from: c, reason: collision with root package name */
    public double f71499c;

    /* renamed from: d, reason: collision with root package name */
    public double f71500d;

    public a() {
        this.f71497a = 0.0d;
        this.f71498b = 0.0d;
        this.f71499c = 0.0d;
        this.f71500d = 0.0d;
    }

    public double a() {
        return this.f71500d;
    }

    public double b() {
        return this.f71499c;
    }

    public double c() {
        return this.f71497a;
    }

    public double d() {
        return this.f71498b;
    }

    public void e(double d11) {
        this.f71500d = d11;
    }

    public void f(double d11) {
        this.f71499c = d11;
    }

    public void g(double d11) {
        this.f71497a = d11;
    }

    public void h(double d11) {
        this.f71498b = d11;
    }

    public a(double d11, double d12, double d13, double d14) {
        this.f71497a = d11;
        this.f71498b = d12;
        this.f71499c = d13;
        this.f71500d = d14;
    }

    public a(Skeleton skeleton) {
        skeleton.j(new Vector2(0.0f, 0.0f), new Vector2(0.0f, 0.0f), new r());
        this.f71497a = r0.f12535x;
        this.f71498b = r0.f12536y;
        this.f71499c = r2.f12535x;
        this.f71500d = r2.f12536y;
    }
}
