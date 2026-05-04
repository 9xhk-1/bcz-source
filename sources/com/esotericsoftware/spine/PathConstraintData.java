package com.esotericsoftware.spine;

import jl.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PathConstraintData extends jl.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<BoneData> f29180d;

    /* renamed from: e, reason: collision with root package name */
    public n f29181e;

    /* renamed from: f, reason: collision with root package name */
    public PositionMode f29182f;

    /* renamed from: g, reason: collision with root package name */
    public SpacingMode f29183g;

    /* renamed from: h, reason: collision with root package name */
    public RotateMode f29184h;

    /* renamed from: i, reason: collision with root package name */
    public float f29185i;

    /* renamed from: j, reason: collision with root package name */
    public float f29186j;

    /* renamed from: k, reason: collision with root package name */
    public float f29187k;

    /* renamed from: l, reason: collision with root package name */
    public float f29188l;

    /* renamed from: m, reason: collision with root package name */
    public float f29189m;

    /* renamed from: n, reason: collision with root package name */
    public float f29190n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum PositionMode {
        fixed,
        percent;

        public static final PositionMode[] values = values();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum RotateMode {
        tangent,
        chain,
        chainScale;

        public static final RotateMode[] values = values();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SpacingMode {
        length,
        fixed,
        percent,
        proportional;

        public static final SpacingMode[] values = values();
    }

    public PathConstraintData(String str) {
        super(str);
        this.f29180d = new com.badlogic.gdx.utils.a<>();
    }

    public com.badlogic.gdx.utils.a<BoneData> f() {
        return this.f29180d;
    }

    public float g() {
        return this.f29188l;
    }

    public float h() {
        return this.f29189m;
    }

    public float i() {
        return this.f29190n;
    }

    public float j() {
        return this.f29185i;
    }

    public float k() {
        return this.f29186j;
    }

    public PositionMode l() {
        return this.f29182f;
    }

    public RotateMode m() {
        return this.f29184h;
    }

    public float n() {
        return this.f29187k;
    }

    public SpacingMode o() {
        return this.f29183g;
    }

    public n p() {
        return this.f29181e;
    }

    public void q(float f11) {
        this.f29188l = f11;
    }

    public void r(float f11) {
        this.f29189m = f11;
    }

    public void s(float f11) {
        this.f29190n = f11;
    }

    public void t(float f11) {
        this.f29185i = f11;
    }

    public void u(float f11) {
        this.f29186j = f11;
    }

    public void v(PositionMode positionMode) {
        if (positionMode == null) {
            throw new IllegalArgumentException("positionMode cannot be null.");
        }
        this.f29182f = positionMode;
    }

    public void w(RotateMode rotateMode) {
        if (rotateMode == null) {
            throw new IllegalArgumentException("rotateMode cannot be null.");
        }
        this.f29184h = rotateMode;
    }

    public void x(float f11) {
        this.f29187k = f11;
    }

    public void y(SpacingMode spacingMode) {
        if (spacingMode == null) {
            throw new IllegalArgumentException("spacingMode cannot be null.");
        }
        this.f29183g = spacingMode;
    }

    public void z(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        this.f29181e = nVar;
    }
}
