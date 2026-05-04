package q2;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements Iterable<f> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<f> f81458a = new com.badlogic.gdx.utils.a<>();

    public void a(f fVar) {
        this.f81458a.a(fVar);
    }

    public f b(int i11) {
        return this.f81458a.get(i11);
    }

    public f d(String str) {
        int i11 = this.f81458a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            f fVar = this.f81458a.get(i12);
            if (str.equals(fVar.b())) {
                return fVar;
            }
        }
        return null;
    }

    public <T extends f> com.badlogic.gdx.utils.a<T> f(Class<T> cls) {
        return g(cls, new com.badlogic.gdx.utils.a<>());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends f> com.badlogic.gdx.utils.a<T> g(Class<T> cls, com.badlogic.gdx.utils.a<T> aVar) {
        aVar.clear();
        int i11 = this.f81458a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            f fVar = this.f81458a.get(i12);
            if (g3.c.A(cls, fVar)) {
                aVar.a(fVar);
            }
        }
        return aVar;
    }

    public int getCount() {
        return this.f81458a.f13179b;
    }

    public int h(String str) {
        return j(d(str));
    }

    @Override // java.lang.Iterable
    public Iterator<f> iterator() {
        return this.f81458a.iterator();
    }

    public int j(f fVar) {
        return this.f81458a.q(fVar, true);
    }

    public void k(int i11) {
        this.f81458a.A(i11);
    }

    public void l(f fVar) {
        this.f81458a.C(fVar, true);
    }
}
