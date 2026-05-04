package s2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends q2.d {

    /* renamed from: p, reason: collision with root package name */
    public int f87421p;

    /* renamed from: q, reason: collision with root package name */
    public int f87422q;

    /* renamed from: r, reason: collision with root package name */
    public int f87423r;

    /* renamed from: s, reason: collision with root package name */
    public int f87424s;

    /* renamed from: t, reason: collision with root package name */
    public a[][] f87425t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f87426e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f87427f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f87428g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f87429h = 3;

        /* renamed from: a, reason: collision with root package name */
        public TiledMapTile f87430a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f87431b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f87432c;

        /* renamed from: d, reason: collision with root package name */
        public int f87433d;

        public boolean a() {
            return this.f87431b;
        }

        public boolean b() {
            return this.f87432c;
        }

        public int c() {
            return this.f87433d;
        }

        public TiledMapTile d() {
            return this.f87430a;
        }

        public a e(boolean z11) {
            this.f87431b = z11;
            return this;
        }

        public a f(boolean z11) {
            this.f87432c = z11;
            return this;
        }

        public a g(int i11) {
            this.f87433d = i11;
            return this;
        }

        public a h(TiledMapTile tiledMapTile) {
            this.f87430a = tiledMapTile;
            return this;
        }
    }

    public i(int i11, int i12, int i13, int i14) {
        this.f87421p = i11;
        this.f87422q = i12;
        this.f87423r = i13;
        this.f87424s = i14;
        this.f87425t = (a[][]) Array.newInstance((Class<?>) a.class, i11, i12);
    }

    public int A() {
        return this.f87422q;
    }

    public int B() {
        return this.f87424s;
    }

    public int C() {
        return this.f87423r;
    }

    public int D() {
        return this.f87421p;
    }

    public void E(int i11, int i12, a aVar) {
        if (i11 < 0 || i11 >= this.f87421p || i12 < 0 || i12 >= this.f87422q) {
            return;
        }
        this.f87425t[i11][i12] = aVar;
    }

    public a z(int i11, int i12) {
        if (i11 < 0 || i11 >= this.f87421p || i12 < 0 || i12 >= this.f87422q) {
            return null;
        }
        return this.f87425t[i11][i12];
    }
}
