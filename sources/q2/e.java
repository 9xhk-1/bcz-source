package q2;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements Iterable<d> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<d> f81452a = new com.badlogic.gdx.utils.a<>();

    public void a(d dVar) {
        this.f81452a.a(dVar);
    }

    public d b(int i11) {
        return this.f81452a.get(i11);
    }

    public d d(String str) {
        int i11 = this.f81452a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            d dVar = this.f81452a.get(i12);
            if (str.equals(dVar.c())) {
                return dVar;
            }
        }
        return null;
    }

    public <T extends d> com.badlogic.gdx.utils.a<T> f(Class<T> cls) {
        return g(cls, new com.badlogic.gdx.utils.a<>());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends d> com.badlogic.gdx.utils.a<T> g(Class<T> cls, com.badlogic.gdx.utils.a<T> aVar) {
        aVar.clear();
        int i11 = this.f81452a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            d dVar = this.f81452a.get(i12);
            if (g3.c.A(cls, dVar)) {
                aVar.a(dVar);
            }
        }
        return aVar;
    }

    public int getCount() {
        return this.f81452a.f13179b;
    }

    public int h(String str) {
        return j(d(str));
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return this.f81452a.iterator();
    }

    public int j(d dVar) {
        return this.f81452a.q(dVar, true);
    }

    public void k(int i11) {
        this.f81452a.A(i11);
    }

    public void l(d dVar) {
        this.f81452a.C(dVar, true);
    }

    public int size() {
        return this.f81452a.f13179b;
    }
}
