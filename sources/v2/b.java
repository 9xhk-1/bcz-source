package v2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import q2.g;
import q2.h;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements TiledMapTile {

    /* renamed from: a, reason: collision with root package name */
    public int f92881a;

    /* renamed from: b, reason: collision with root package name */
    public TiledMapTile.BlendMode f92882b = TiledMapTile.BlendMode.ALPHA;

    /* renamed from: c, reason: collision with root package name */
    public h f92883c;

    /* renamed from: d, reason: collision with root package name */
    public g f92884d;

    /* renamed from: e, reason: collision with root package name */
    public o f92885e;

    /* renamed from: f, reason: collision with root package name */
    public float f92886f;

    /* renamed from: g, reason: collision with root package name */
    public float f92887g;

    public b(o oVar) {
        this.f92885e = oVar;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public h a() {
        if (this.f92883c == null) {
            this.f92883c = new h();
        }
        return this.f92883c;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public o b() {
        return this.f92885e;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float c() {
        return this.f92886f;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void d(int i11) {
        this.f92881a = i11;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public g e() {
        if (this.f92884d == null) {
            this.f92884d = new g();
        }
        return this.f92884d;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float f() {
        return this.f92887g;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void g(float f11) {
        this.f92886f = f11;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public int getId() {
        return this.f92881a;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void h(float f11) {
        this.f92887g = f11;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void i(TiledMapTile.BlendMode blendMode) {
        this.f92882b = blendMode;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void j(o oVar) {
        this.f92885e = oVar;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public TiledMapTile.BlendMode k() {
        return this.f92882b;
    }

    public b(b bVar) {
        if (bVar.f92883c != null) {
            a().i(bVar.f92883c);
        }
        this.f92884d = bVar.f92884d;
        this.f92885e = bVar.f92885e;
        this.f92881a = bVar.f92881a;
    }
}
