package a3;

import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p<T> extends com.badlogic.gdx.utils.a<T> {

    /* renamed from: f, reason: collision with root package name */
    public int f1611f;

    /* renamed from: g, reason: collision with root package name */
    public v f1612g;

    /* renamed from: h, reason: collision with root package name */
    public int f1613h;

    public p() {
        this.f1612g = new v(0);
    }

    public static <T> p<T> X(T... tArr) {
        return new p<>(tArr);
    }

    @Override // com.badlogic.gdx.utils.a
    public T A(int i11) {
        if (this.f1611f <= 0) {
            return (T) super.A(i11);
        }
        W(i11);
        return get(i11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void B(int i11, int i12) {
        if (this.f1611f <= 0) {
            super.B(i11, i12);
            return;
        }
        while (i12 >= i11) {
            W(i12);
            i12--;
        }
    }

    @Override // com.badlogic.gdx.utils.a
    public boolean C(T t11, boolean z11) {
        if (this.f1611f <= 0) {
            return super.C(t11, z11);
        }
        int q11 = q(t11, z11);
        if (q11 == -1) {
            return false;
        }
        W(q11);
        return true;
    }

    @Override // com.badlogic.gdx.utils.a
    public void G() {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.G();
    }

    @Override // com.badlogic.gdx.utils.a
    public void K(int i11, T t11) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.K(i11, t11);
    }

    @Override // com.badlogic.gdx.utils.a
    public T[] L(int i11) {
        if (this.f1611f <= 0) {
            return (T[]) super.L(i11);
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.a
    public void N() {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.N();
    }

    @Override // com.badlogic.gdx.utils.a
    public void O() {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.O();
    }

    @Override // com.badlogic.gdx.utils.a
    public void P(int i11, int i12) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.P(i11, i12);
    }

    @Override // com.badlogic.gdx.utils.a
    public void S(int i11) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.S(i11);
    }

    public void U() {
        this.f1611f++;
    }

    public void V() {
        int i11 = this.f1611f;
        if (i11 == 0) {
            throw new IllegalStateException("begin must be called before end.");
        }
        int i12 = i11 - 1;
        this.f1611f = i12;
        if (i12 == 0) {
            int i13 = this.f1613h;
            if (i13 <= 0 || i13 != this.f13179b) {
                int i14 = this.f1612g.f1640b;
                for (int i15 = 0; i15 < i14; i15++) {
                    int y11 = this.f1612g.y();
                    if (y11 >= this.f1613h) {
                        A(y11);
                    }
                }
                for (int i16 = this.f1613h - 1; i16 >= 0; i16--) {
                    A(i16);
                }
            } else {
                this.f1612g.i();
                clear();
            }
            this.f1613h = 0;
        }
    }

    public final void W(int i11) {
        if (i11 < this.f1613h) {
            return;
        }
        int i12 = this.f1612g.f1640b;
        for (int i13 = 0; i13 < i12; i13++) {
            int m11 = this.f1612g.m(i13);
            if (i11 == m11) {
                return;
            }
            if (i11 < m11) {
                this.f1612g.q(i13, i11);
                return;
            }
        }
        this.f1612g.a(i11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void clear() {
        if (this.f1611f > 0) {
            this.f1613h = this.f13179b;
        } else {
            super.clear();
        }
    }

    @Override // com.badlogic.gdx.utils.a
    public T pop() {
        if (this.f1611f <= 0) {
            return (T) super.pop();
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.a
    public void r(int i11, T t11) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.r(i11, t11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void s(int i11, int i12) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.s(i11, i12);
    }

    @Override // com.badlogic.gdx.utils.a
    public void sort(Comparator<? super T> comparator) {
        if (this.f1611f > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.sort(comparator);
    }

    public p(com.badlogic.gdx.utils.a aVar) {
        super(aVar);
        this.f1612g = new v(0);
    }

    public p(boolean z11, int i11, Class cls) {
        super(z11, i11, cls);
        this.f1612g = new v(0);
    }

    public p(boolean z11, int i11) {
        super(z11, i11);
        this.f1612g = new v(0);
    }

    public p(boolean z11, T[] tArr, int i11, int i12) {
        super(z11, tArr, i11, i12);
        this.f1612g = new v(0);
    }

    public p(Class cls) {
        super(cls);
        this.f1612g = new v(0);
    }

    public p(int i11) {
        super(i11);
        this.f1612g = new v(0);
    }

    public p(T[] tArr) {
        super(tArr);
        this.f1612g = new v(0);
    }
}
