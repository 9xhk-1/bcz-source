package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<f<T>.a> f12573a = new com.badlogic.gdx.utils.a<>(false, 10, a.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public T f12574a;

        /* renamed from: b, reason: collision with root package name */
        public float f12575b;

        /* renamed from: c, reason: collision with root package name */
        public float f12576c;

        public a(T t11, float f11, float f12) {
            this.f12574a = t11;
            this.f12575b = f11;
            this.f12576c = f12;
        }
    }

    public void a(T t11) {
        this.f12573a.a(new a(t11, 0.0f, 0.0f));
    }

    public void b(T t11, float f11) {
        this.f12573a.a(new a(t11, 0.0f, f11));
    }

    public void c() {
        this.f12573a.clear();
    }

    public void d() {
        float f11 = 0.0f;
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<f<T>.a> aVar = this.f12573a;
            if (i11 >= aVar.f13179b) {
                return;
            }
            f<T>.a[] aVarArr = aVar.f13178a;
            f11 += aVarArr[i11].f12576c;
            aVarArr[i11].f12575b = f11;
            i11++;
        }
    }

    public void e() {
        float f11 = 0.0f;
        int i11 = 0;
        float f12 = 0.0f;
        int i12 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<f<T>.a> aVar = this.f12573a;
            if (i12 >= aVar.f13179b) {
                break;
            }
            f12 += aVar.f13178a[i12].f12576c;
            i12++;
        }
        while (true) {
            com.badlogic.gdx.utils.a<f<T>.a> aVar2 = this.f12573a;
            if (i11 >= aVar2.f13179b) {
                return;
            }
            f<T>.a[] aVarArr = aVar2.f13178a;
            f11 += aVarArr[i11].f12576c / f12;
            aVarArr[i11].f12575b = f11;
            i11++;
        }
    }

    public void f() {
        float f11 = 1.0f / this.f12573a.f13179b;
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<f<T>.a> aVar = this.f12573a;
            if (i11 >= aVar.f13179b) {
                return;
            }
            f<T>.a[] aVarArr = aVar.f13178a;
            aVarArr[i11].f12576c = f11;
            f<T>.a aVar2 = aVarArr[i11];
            i11++;
            aVar2.f12575b = i11 * f11;
        }
    }

    public float g(int i11) {
        return this.f12573a.f13178a[i11].f12576c;
    }

    public T h(int i11) {
        return this.f12573a.f13178a[i11].f12574a;
    }

    public void i(int i11, float f11) {
        this.f12573a.f13178a[i11].f12576c = f11;
    }

    public void j(T t11, float f11) {
        a.b<f<T>.a> it = this.f12573a.iterator();
        while (it.hasNext()) {
            f<T>.a next = it.next();
            if (next.f12574a == t11) {
                next.f12576c = f11;
                return;
            }
        }
    }

    public int k() {
        return this.f12573a.f13179b;
    }

    public T l() {
        return m(n.J());
    }

    public T m(float f11) {
        int i11 = this.f12573a.f13179b - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            float f12 = this.f12573a.f13178a[i13].f12575b;
            if (f11 >= f12) {
                if (f11 <= f12) {
                    break;
                }
                i12 = i13 + 1;
            } else {
                i11 = i13 - 1;
            }
        }
        return this.f12573a.f13178a[i12].f12574a;
    }
}
