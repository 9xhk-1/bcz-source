package jl;

import a3.d0;
import com.esotericsoftware.spine.BlendMode;
import com.esotericsoftware.spine.BoneData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f64415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64416b;

    /* renamed from: c, reason: collision with root package name */
    public final BoneData f64417c;

    /* renamed from: e, reason: collision with root package name */
    @d0
    public com.badlogic.gdx.graphics.b f64419e;

    /* renamed from: f, reason: collision with root package name */
    @d0
    public String f64420f;

    /* renamed from: g, reason: collision with root package name */
    public BlendMode f64421g;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f64418d = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    public boolean f64422h = true;

    public n(int i11, String str, BoneData boneData) {
        if (i11 < 0) {
            throw new IllegalArgumentException("index must be >= 0.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (boneData == null) {
            throw new IllegalArgumentException("boneData cannot be null.");
        }
        this.f64415a = i11;
        this.f64416b = str;
        this.f64417c = boneData;
    }

    @d0
    public String a() {
        return this.f64420f;
    }

    public BlendMode b() {
        return this.f64421g;
    }

    public BoneData c() {
        return this.f64417c;
    }

    public com.badlogic.gdx.graphics.b d() {
        return this.f64418d;
    }

    @d0
    public com.badlogic.gdx.graphics.b e() {
        return this.f64419e;
    }

    public int f() {
        return this.f64415a;
    }

    public String g() {
        return this.f64416b;
    }

    public boolean h() {
        return this.f64422h;
    }

    public void i(@d0 String str) {
        this.f64420f = str;
    }

    public void j(BlendMode blendMode) {
        if (blendMode == null) {
            throw new IllegalArgumentException("blendMode cannot be null.");
        }
        this.f64421g = blendMode;
    }

    public void k(@d0 com.badlogic.gdx.graphics.b bVar) {
        this.f64419e = bVar;
    }

    public void l(boolean z11) {
        this.f64422h = z11;
    }

    public String toString() {
        return this.f64416b;
    }
}
