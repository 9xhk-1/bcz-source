package a3;

import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u0<T> extends com.badlogic.gdx.utils.a<T> {

    /* renamed from: f, reason: collision with root package name */
    public T[] f1636f;

    /* renamed from: g, reason: collision with root package name */
    public T[] f1637g;

    /* renamed from: h, reason: collision with root package name */
    public int f1638h;

    public u0() {
    }

    public static <T> u0<T> X(T... tArr) {
        return new u0<>(tArr);
    }

    @Override // com.badlogic.gdx.utils.a
    public T A(int i11) {
        W();
        return (T) super.A(i11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void B(int i11, int i12) {
        W();
        super.B(i11, i12);
    }

    @Override // com.badlogic.gdx.utils.a
    public boolean C(T t11, boolean z11) {
        W();
        return super.C(t11, z11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void G() {
        W();
        super.G();
    }

    @Override // com.badlogic.gdx.utils.a
    public void K(int i11, T t11) {
        W();
        super.K(i11, t11);
    }

    @Override // com.badlogic.gdx.utils.a
    public T[] L(int i11) {
        W();
        return (T[]) super.L(i11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void N() {
        W();
        super.N();
    }

    @Override // com.badlogic.gdx.utils.a
    public void O() {
        W();
        super.O();
    }

    @Override // com.badlogic.gdx.utils.a
    public void P(int i11, int i12) {
        W();
        super.P(i11, i12);
    }

    @Override // com.badlogic.gdx.utils.a
    public void S(int i11) {
        W();
        super.S(i11);
    }

    public T[] U() {
        W();
        T[] tArr = this.f13178a;
        this.f1636f = tArr;
        this.f1638h++;
        return tArr;
    }

    public void V() {
        int max = Math.max(0, this.f1638h - 1);
        this.f1638h = max;
        T[] tArr = this.f1636f;
        if (tArr == null) {
            return;
        }
        if (tArr != this.f13178a && max == 0) {
            this.f1637g = tArr;
            int length = tArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f1637g[i11] = null;
            }
        }
        this.f1636f = null;
    }

    public final void W() {
        T[] tArr;
        T[] tArr2 = this.f1636f;
        if (tArr2 == null || tArr2 != (tArr = this.f13178a)) {
            return;
        }
        T[] tArr3 = this.f1637g;
        if (tArr3 != null) {
            int length = tArr3.length;
            int i11 = this.f13179b;
            if (length >= i11) {
                System.arraycopy(tArr, 0, tArr3, 0, i11);
                this.f13178a = this.f1637g;
                this.f1637g = null;
                return;
            }
        }
        F(tArr.length);
    }

    @Override // com.badlogic.gdx.utils.a
    public void clear() {
        W();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.a
    public T pop() {
        W();
        return (T) super.pop();
    }

    @Override // com.badlogic.gdx.utils.a
    public void r(int i11, T t11) {
        W();
        super.r(i11, t11);
    }

    @Override // com.badlogic.gdx.utils.a
    public void s(int i11, int i12) {
        W();
        super.s(i11, i12);
    }

    @Override // com.badlogic.gdx.utils.a
    public void sort(Comparator<? super T> comparator) {
        W();
        super.sort(comparator);
    }

    @Override // com.badlogic.gdx.utils.a
    public boolean z(com.badlogic.gdx.utils.a<? extends T> aVar, boolean z11) {
        W();
        return super.z(aVar, z11);
    }

    public u0(com.badlogic.gdx.utils.a aVar) {
        super(aVar);
    }

    public u0(boolean z11, int i11, Class cls) {
        super(z11, i11, cls);
    }

    public u0(boolean z11, int i11) {
        super(z11, i11);
    }

    public u0(boolean z11, T[] tArr, int i11, int i12) {
        super(z11, tArr, i11, i12);
    }

    public u0(Class cls) {
        super(cls);
    }

    public u0(int i11) {
        super(i11);
    }

    public u0(T[] tArr) {
        super(tArr);
    }
}
