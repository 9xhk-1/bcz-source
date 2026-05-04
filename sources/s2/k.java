package s2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k implements Iterable<j> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<j> f87437a = new com.badlogic.gdx.utils.a<>();

    public void a(j jVar) {
        this.f87437a.a(jVar);
    }

    public TiledMapTile b(int i11) {
        for (int i12 = this.f87437a.f13179b - 1; i12 >= 0; i12--) {
            TiledMapTile d11 = this.f87437a.get(i12).d(i11);
            if (d11 != null) {
                return d11;
            }
        }
        return null;
    }

    public j d(int i11) {
        return this.f87437a.get(i11);
    }

    public j f(String str) {
        a.b<j> it = this.f87437a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (str.equals(next.a())) {
                return next;
            }
        }
        return null;
    }

    public void g(int i11) {
        this.f87437a.A(i11);
    }

    public void h(j jVar) {
        this.f87437a.C(jVar, true);
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f87437a.iterator();
    }
}
