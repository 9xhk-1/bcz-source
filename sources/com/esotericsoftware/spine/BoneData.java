package com.esotericsoftware.spine;

import a3.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BoneData {

    /* renamed from: a, reason: collision with root package name */
    public final int f29164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29165b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    public final BoneData f29166c;

    /* renamed from: d, reason: collision with root package name */
    public float f29167d;

    /* renamed from: e, reason: collision with root package name */
    public float f29168e;

    /* renamed from: f, reason: collision with root package name */
    public float f29169f;

    /* renamed from: g, reason: collision with root package name */
    public float f29170g;

    /* renamed from: h, reason: collision with root package name */
    public float f29171h;

    /* renamed from: i, reason: collision with root package name */
    public float f29172i;

    /* renamed from: j, reason: collision with root package name */
    public float f29173j;

    /* renamed from: k, reason: collision with root package name */
    public float f29174k;

    /* renamed from: l, reason: collision with root package name */
    public Inherit f29175l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29176m;

    /* renamed from: n, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f29177n;

    /* renamed from: o, reason: collision with root package name */
    @d0
    public String f29178o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29179p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Inherit {
        normal,
        onlyTranslation,
        noRotationOrReflection,
        noScale,
        noScaleOrReflection;

        public static final Inherit[] values = values();
    }

    public BoneData(int i11, String str, @d0 BoneData boneData) {
        this.f29171h = 1.0f;
        this.f29172i = 1.0f;
        this.f29175l = Inherit.normal;
        this.f29177n = new com.badlogic.gdx.graphics.b(0.61f, 0.61f, 0.61f, 1.0f);
        if (i11 < 0) {
            throw new IllegalArgumentException("index must be >= 0.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f29164a = i11;
        this.f29165b = str;
        this.f29166c = boneData;
    }

    public void A(boolean z11) {
        this.f29176m = z11;
    }

    public void B(boolean z11) {
        this.f29179p = z11;
    }

    public void C(float f11) {
        this.f29168e = f11;
    }

    public void D(float f11) {
        this.f29169f = f11;
    }

    public com.badlogic.gdx.graphics.b a() {
        return this.f29177n;
    }

    @d0
    public String b() {
        return this.f29178o;
    }

    public int c() {
        return this.f29164a;
    }

    public Inherit d() {
        return this.f29175l;
    }

    public float e() {
        return this.f29167d;
    }

    public String f() {
        return this.f29165b;
    }

    @d0
    public BoneData g() {
        return this.f29166c;
    }

    public float h() {
        return this.f29170g;
    }

    public float i() {
        return this.f29171h;
    }

    public float j() {
        return this.f29172i;
    }

    public float k() {
        return this.f29173j;
    }

    public float l() {
        return this.f29174k;
    }

    public boolean m() {
        return this.f29176m;
    }

    public boolean n() {
        return this.f29179p;
    }

    public float o() {
        return this.f29168e;
    }

    public float p() {
        return this.f29169f;
    }

    public void q(@d0 String str) {
        this.f29178o = str;
    }

    public void r(Inherit inherit) {
        if (inherit == null) {
            throw new IllegalArgumentException("inherit cannot be null.");
        }
        this.f29175l = inherit;
    }

    public void s(float f11) {
        this.f29167d = f11;
    }

    public void t(float f11, float f12) {
        this.f29168e = f11;
        this.f29169f = f12;
    }

    public String toString() {
        return this.f29165b;
    }

    public void u(float f11) {
        this.f29170g = f11;
    }

    public void v(float f11, float f12) {
        this.f29171h = f11;
        this.f29172i = f12;
    }

    public void w(float f11) {
        this.f29171h = f11;
    }

    public void x(float f11) {
        this.f29172i = f11;
    }

    public void y(float f11) {
        this.f29173j = f11;
    }

    public void z(float f11) {
        this.f29174k = f11;
    }

    public BoneData(BoneData boneData, @d0 BoneData boneData2) {
        this.f29171h = 1.0f;
        this.f29172i = 1.0f;
        this.f29175l = Inherit.normal;
        this.f29177n = new com.badlogic.gdx.graphics.b(0.61f, 0.61f, 0.61f, 1.0f);
        if (boneData != null) {
            this.f29164a = boneData.f29164a;
            this.f29165b = boneData.f29165b;
            this.f29166c = boneData2;
            this.f29167d = boneData.f29167d;
            this.f29168e = boneData.f29168e;
            this.f29169f = boneData.f29169f;
            this.f29170g = boneData.f29170g;
            this.f29171h = boneData.f29171h;
            this.f29172i = boneData.f29172i;
            this.f29173j = boneData.f29173j;
            this.f29174k = boneData.f29174k;
            return;
        }
        throw new IllegalArgumentException("bone cannot be null.");
    }
}
