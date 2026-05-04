package h3;

import a3.q0;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: i, reason: collision with root package name */
    public float f58164i;

    /* renamed from: j, reason: collision with root package name */
    public float f58165j;

    /* renamed from: k, reason: collision with root package name */
    public float f58166k;

    /* renamed from: l, reason: collision with root package name */
    public float f58167l;

    /* renamed from: m, reason: collision with root package name */
    public q0 f58168m;

    public a(float f11, float f12) {
        this(f11, f12, 0.0f, 0.0f, new k());
    }

    @Override // h3.g
    public void I(int i11, int i12, boolean z11) {
        float f11 = this.f58164i;
        float f12 = this.f58165j;
        Vector2 a11 = this.f58168m.a(f11, f12, i11, i12);
        int round = Math.round(a11.f12535x);
        int round2 = Math.round(a11.f12536y);
        if (round < i11) {
            float f13 = round2;
            float f14 = f13 / f12;
            float f15 = (i11 - round) * (f12 / f13);
            float f16 = this.f58166k;
            if (f16 > 0.0f) {
                f15 = Math.min(f15, f16 - this.f58164i);
            }
            f11 += f15;
            round += Math.round(f15 * f14);
        }
        if (round2 < i12) {
            float f17 = round;
            float f18 = f17 / f11;
            float f19 = (i12 - round2) * (f11 / f17);
            float f21 = this.f58167l;
            if (f21 > 0.0f) {
                f19 = Math.min(f19, f21 - this.f58165j);
            }
            f12 += f19;
            round2 += Math.round(f19 * f18);
        }
        C(f11, f12);
        u((i11 - round) / 2, (i12 - round2) / 2, round, round2);
        b(z11);
    }

    public float J() {
        return this.f58167l;
    }

    public float K() {
        return this.f58166k;
    }

    public float L() {
        return this.f58165j;
    }

    public float M() {
        return this.f58164i;
    }

    public void N(float f11) {
        this.f58167l = f11;
    }

    public void O(float f11) {
        this.f58166k = f11;
    }

    public void P(float f11) {
        this.f58165j = f11;
    }

    public void Q(float f11) {
        this.f58164i = f11;
    }

    public void R(q0 q0Var) {
        this.f58168m = q0Var;
    }

    public a(float f11, float f12, com.badlogic.gdx.graphics.a aVar) {
        this(f11, f12, 0.0f, 0.0f, aVar);
    }

    public a(float f11, float f12, float f13, float f14) {
        this(f11, f12, f13, f14, new k());
    }

    public a(float f11, float f12, float f13, float f14, com.badlogic.gdx.graphics.a aVar) {
        this.f58168m = q0.f1616b;
        this.f58164i = f11;
        this.f58165j = f12;
        this.f58166k = f13;
        this.f58167l = f14;
        t(aVar);
    }
}
