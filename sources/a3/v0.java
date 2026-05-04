package a3;

import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v0 {

    /* renamed from: c, reason: collision with root package name */
    public static v0 f1642c;

    /* renamed from: a, reason: collision with root package name */
    public a1 f1643a;

    /* renamed from: b, reason: collision with root package name */
    public l f1644b;

    public static v0 a() {
        if (f1642c == null) {
            f1642c = new v0();
        }
        return f1642c;
    }

    public <T extends Comparable> void b(com.badlogic.gdx.utils.a<T> aVar) {
        if (this.f1644b == null) {
            this.f1644b = new l();
        }
        this.f1644b.c(aVar.f13178a, 0, aVar.f13179b);
    }

    public <T> void c(com.badlogic.gdx.utils.a<T> aVar, Comparator<? super T> comparator) {
        if (this.f1643a == null) {
            this.f1643a = new a1();
        }
        this.f1643a.c(aVar.f13178a, comparator, 0, aVar.f13179b);
    }

    public void d(Object[] objArr) {
        if (this.f1644b == null) {
            this.f1644b = new l();
        }
        this.f1644b.c(objArr, 0, objArr.length);
    }

    public void e(Object[] objArr, int i11, int i12) {
        if (this.f1644b == null) {
            this.f1644b = new l();
        }
        this.f1644b.c(objArr, i11, i12);
    }

    public <T> void f(T[] tArr, Comparator<? super T> comparator) {
        if (this.f1643a == null) {
            this.f1643a = new a1();
        }
        this.f1643a.c(tArr, comparator, 0, tArr.length);
    }

    public <T> void g(T[] tArr, Comparator<? super T> comparator, int i11, int i12) {
        if (this.f1643a == null) {
            this.f1643a = new a1();
        }
        this.f1643a.c(tArr, comparator, i11, i12);
    }
}
