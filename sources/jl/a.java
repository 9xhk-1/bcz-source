package jl;

import com.esotericsoftware.spine.Animation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f64297a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.j<C0743a> f64298b = new com.badlogic.gdx.utils.j<>(51, 0.8f);

    /* renamed from: c, reason: collision with root package name */
    public final C0743a f64299c = new C0743a();

    /* renamed from: d, reason: collision with root package name */
    public float f64300d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: jl.a$a, reason: collision with other inner class name */
    public static class C0743a {

        /* renamed from: a, reason: collision with root package name */
        public Animation f64301a;

        /* renamed from: b, reason: collision with root package name */
        public Animation f64302b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            C0743a c0743a = (C0743a) obj;
            Animation animation = this.f64301a;
            if (animation == null) {
                if (c0743a.f64301a != null) {
                    return false;
                }
            } else if (!animation.equals(c0743a.f64301a)) {
                return false;
            }
            Animation animation2 = this.f64302b;
            if (animation2 == null) {
                if (c0743a.f64302b != null) {
                    return false;
                }
            } else if (!animation2.equals(c0743a.f64302b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f64301a.hashCode() + 31) * 31) + this.f64302b.hashCode();
        }

        public String toString() {
            return this.f64301a.f29038a + "->" + this.f64302b.f29038a;
        }
    }

    public a(i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("skeletonData cannot be null.");
        }
        this.f64297a = iVar;
    }

    public float a() {
        return this.f64300d;
    }

    public float b(Animation animation, Animation animation2) {
        if (animation == null) {
            throw new IllegalArgumentException("from cannot be null.");
        }
        if (animation2 == null) {
            throw new IllegalArgumentException("to cannot be null.");
        }
        C0743a c0743a = this.f64299c;
        c0743a.f64301a = animation;
        c0743a.f64302b = animation2;
        return this.f64298b.l(c0743a, this.f64300d);
    }

    public i c() {
        return this.f64297a;
    }

    public void d(float f11) {
        this.f64300d = f11;
    }

    public void e(Animation animation, Animation animation2, float f11) {
        if (animation == null) {
            throw new IllegalArgumentException("from cannot be null.");
        }
        if (animation2 == null) {
            throw new IllegalArgumentException("to cannot be null.");
        }
        C0743a c0743a = new C0743a();
        c0743a.f64301a = animation;
        c0743a.f64302b = animation2;
        this.f64298b.t(c0743a, f11);
    }

    public void f(String str, String str2, float f11) {
        Animation a11 = this.f64297a.a(str);
        if (a11 == null) {
            throw new IllegalArgumentException("Animation not found: " + str);
        }
        Animation a12 = this.f64297a.a(str2);
        if (a12 != null) {
            e(a11, a12, f11);
            return;
        }
        throw new IllegalArgumentException("Animation not found: " + str2);
    }
}
