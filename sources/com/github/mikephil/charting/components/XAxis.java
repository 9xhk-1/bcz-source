package com.github.mikephil.charting.components;

import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class XAxis extends em.a {
    public int J = 1;
    public int K = 1;
    public int L = 1;
    public int M = 1;
    public float N = 0.0f;
    public boolean O = false;
    public XAxisPosition P = XAxisPosition.TOP;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.f49902c = k.e(4.0f);
    }

    public void A0(XAxisPosition xAxisPosition) {
        this.P = xAxisPosition;
    }

    public float v0() {
        return this.N;
    }

    public XAxisPosition w0() {
        return this.P;
    }

    public boolean x0() {
        return this.O;
    }

    public void y0(boolean z11) {
        this.O = z11;
    }

    public void z0(float f11) {
        this.N = f11;
    }
}
