package v2;

import a3.b1;
import a3.v;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.utils.GdxRuntimeException;
import q2.g;
import q2.h;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements TiledMapTile {

    /* renamed from: h, reason: collision with root package name */
    public static long f92872h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f92873i = b1.a();

    /* renamed from: a, reason: collision with root package name */
    public int f92874a;

    /* renamed from: b, reason: collision with root package name */
    public TiledMapTile.BlendMode f92875b;

    /* renamed from: c, reason: collision with root package name */
    public h f92876c;

    /* renamed from: d, reason: collision with root package name */
    public g f92877d;

    /* renamed from: e, reason: collision with root package name */
    public b[] f92878e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f92879f;

    /* renamed from: g, reason: collision with root package name */
    public int f92880g;

    public a(float f11, com.badlogic.gdx.utils.a<b> aVar) {
        this.f92875b = TiledMapTile.BlendMode.ALPHA;
        int i11 = aVar.f13179b;
        this.f92878e = new b[i11];
        int i12 = (int) (f11 * 1000.0f);
        this.f92880g = i11 * i12;
        this.f92879f = new int[i11];
        for (int i13 = 0; i13 < aVar.f13179b; i13++) {
            this.f92878e[i13] = aVar.get(i13);
            this.f92879f[i13] = i12;
        }
    }

    public static void q() {
        f92872h = b1.a() - f92873i;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public h a() {
        if (this.f92876c == null) {
            this.f92876c = new h();
        }
        return this.f92876c;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public o b() {
        return m().b();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float c() {
        return m().c();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void d(int i11) {
        this.f92874a = i11;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public g e() {
        if (this.f92877d == null) {
            this.f92877d = new g();
        }
        return this.f92877d;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float f() {
        return m().f();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void g(float f11) {
        throw new GdxRuntimeException("Cannot set offset of AnimatedTiledMapTile.");
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public int getId() {
        return this.f92874a;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void h(float f11) {
        throw new GdxRuntimeException("Cannot set offset of AnimatedTiledMapTile.");
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void i(TiledMapTile.BlendMode blendMode) {
        this.f92875b = blendMode;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void j(o oVar) {
        throw new GdxRuntimeException("Cannot set the texture region of AnimatedTiledMapTile.");
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public TiledMapTile.BlendMode k() {
        return this.f92875b;
    }

    public int[] l() {
        return this.f92879f;
    }

    public TiledMapTile m() {
        return this.f92878e[n()];
    }

    public int n() {
        int i11 = (int) (f92872h % this.f92880g);
        int i12 = 0;
        while (true) {
            int[] iArr = this.f92879f;
            if (i12 >= iArr.length) {
                throw new GdxRuntimeException("Could not determine current animation frame in AnimatedTiledMapTile.  This should never happen.");
            }
            int i13 = iArr[i12];
            if (i11 <= i13) {
                return i12;
            }
            i11 -= i13;
            i12++;
        }
    }

    public b[] o() {
        return this.f92878e;
    }

    public void p(int[] iArr) {
        if (iArr.length == this.f92879f.length) {
            this.f92879f = iArr;
            this.f92880g = 0;
            for (int i11 : iArr) {
                this.f92880g += i11;
            }
            return;
        }
        throw new GdxRuntimeException("Cannot set " + iArr.length + " frame intervals. The given int[] must have a size of " + this.f92879f.length + ".");
    }

    public a(v vVar, com.badlogic.gdx.utils.a<b> aVar) {
        this.f92875b = TiledMapTile.BlendMode.ALPHA;
        this.f92878e = new b[aVar.f13179b];
        this.f92879f = vVar.M();
        this.f92880g = 0;
        for (int i11 = 0; i11 < vVar.f1640b; i11++) {
            this.f92878e[i11] = aVar.get(i11);
            this.f92880g += vVar.m(i11);
        }
    }
}
