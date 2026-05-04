package s2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements Iterable<TiledMapTile> {

    /* renamed from: a, reason: collision with root package name */
    public String f87434a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.d<TiledMapTile> f87435b = new com.badlogic.gdx.utils.d<>();

    /* renamed from: c, reason: collision with root package name */
    public q2.h f87436c = new q2.h();

    public String a() {
        return this.f87434a;
    }

    public q2.h b() {
        return this.f87436c;
    }

    public TiledMapTile d(int i11) {
        return this.f87435b.get(i11);
    }

    public void f(int i11, TiledMapTile tiledMapTile) {
        this.f87435b.p(i11, tiledMapTile);
    }

    public void g(int i11) {
        this.f87435b.remove(i11);
    }

    public void h(String str) {
        this.f87434a = str;
    }

    @Override // java.lang.Iterable
    public Iterator<TiledMapTile> iterator() {
        return this.f87435b.u().iterator();
    }

    public int size() {
        return this.f87435b.f13219a;
    }
}
