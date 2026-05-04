package com.badlogic.gdx.math;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<GridPoint2> f12557a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public final j0<GridPoint2> f12558b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<GridPoint2> {
        public a() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public GridPoint2 g() {
            return new GridPoint2();
        }
    }

    public com.badlogic.gdx.utils.a<GridPoint2> a(int i11, int i12, int i13, int i14) {
        this.f12558b.e(this.f12557a);
        this.f12557a.clear();
        return b(i11, i12, i13, i14, this.f12558b, this.f12557a);
    }

    public com.badlogic.gdx.utils.a<GridPoint2> b(int i11, int i12, int i13, int i14, j0<GridPoint2> j0Var, com.badlogic.gdx.utils.a<GridPoint2> aVar) {
        int i15;
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        int i18 = i16 < 0 ? -1 : i16 > 0 ? 1 : 0;
        int i19 = i18;
        int i21 = i17 < 0 ? -1 : i17 > 0 ? 1 : 0;
        int abs = Math.abs(i16);
        int abs2 = Math.abs(i17);
        if (abs < abs2) {
            abs = Math.abs(i17);
            abs2 = Math.abs(i16);
            i15 = i17 >= 0 ? i17 > 0 ? 1 : 0 : -1;
            i19 = 0;
        } else {
            i15 = 0;
        }
        int i22 = abs2 << 1;
        int i23 = abs << 1;
        int i24 = 0;
        for (int i25 = 0; i25 <= abs; i25++) {
            GridPoint2 h11 = j0Var.h();
            h11.set(i11, i12);
            aVar.a(h11);
            i24 += i22;
            if (i24 > abs) {
                i24 -= i23;
                i11 += i18;
                i12 += i21;
            } else {
                i11 += i19;
                i12 += i15;
            }
        }
        return aVar;
    }

    public com.badlogic.gdx.utils.a<GridPoint2> c(GridPoint2 gridPoint2, GridPoint2 gridPoint22) {
        return a(gridPoint2.f12523x, gridPoint2.f12524y, gridPoint22.f12523x, gridPoint22.f12524y);
    }
}
