package t2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import r2.f;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends f {

    /* renamed from: n, reason: collision with root package name */
    public boolean f89207n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89208o;

    /* renamed from: p, reason: collision with root package name */
    public TiledMapTile f89209p;

    public a(TiledMapTile tiledMapTile, boolean z11, boolean z12) {
        this.f89207n = z11;
        this.f89208o = z12;
        this.f89209p = tiledMapTile;
        o oVar = new o(tiledMapTile.b());
        oVar.a(z11, z12);
        w(oVar);
    }

    public boolean A() {
        return this.f89207n;
    }

    public boolean B() {
        return this.f89208o;
    }

    public void C(boolean z11) {
        this.f89207n = z11;
    }

    public void D(boolean z11) {
        this.f89208o = z11;
    }

    public void E(TiledMapTile tiledMapTile) {
        this.f89209p = tiledMapTile;
    }

    public TiledMapTile z() {
        return this.f89209p;
    }
}
