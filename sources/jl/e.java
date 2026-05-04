package jl;

import com.esotericsoftware.spine.BoneData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<BoneData> f64320d;

    /* renamed from: e, reason: collision with root package name */
    public BoneData f64321e;

    /* renamed from: f, reason: collision with root package name */
    public int f64322f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64323g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64324h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f64325i;

    /* renamed from: j, reason: collision with root package name */
    public float f64326j;

    /* renamed from: k, reason: collision with root package name */
    public float f64327k;

    public e(String str) {
        super(str);
        this.f64320d = new com.badlogic.gdx.utils.a<>();
    }

    public int f() {
        return this.f64322f;
    }

    public com.badlogic.gdx.utils.a<BoneData> g() {
        return this.f64320d;
    }

    public boolean h() {
        return this.f64323g;
    }

    public float i() {
        return this.f64326j;
    }

    public float j() {
        return this.f64327k;
    }

    public boolean k() {
        return this.f64324h;
    }

    public BoneData l() {
        return this.f64321e;
    }

    public boolean m() {
        return this.f64325i;
    }

    public void n(int i11) {
        this.f64322f = i11;
    }

    public void o(boolean z11) {
        this.f64323g = z11;
    }

    public void p(float f11) {
        this.f64326j = f11;
    }

    public void q(float f11) {
        this.f64327k = f11;
    }

    public void r(boolean z11) {
        this.f64324h = z11;
    }

    public void s(BoneData boneData) {
        if (boneData == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        this.f64321e = boneData;
    }

    public void t(boolean z11) {
        this.f64325i = z11;
    }
}
