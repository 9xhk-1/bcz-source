package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f35082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35083b;

    public l(float f11, float f12) {
        this.f35082a = f11;
        this.f35083b = f12;
    }

    public static float a(l lVar, l lVar2, l lVar3) {
        float f11 = lVar2.f35082a;
        float f12 = lVar2.f35083b;
        return ((lVar3.f35082a - f11) * (lVar.f35083b - f12)) - ((lVar3.f35083b - f12) * (lVar.f35082a - f11));
    }

    public static float b(l lVar, l lVar2) {
        return lp.a.a(lVar.f35082a, lVar.f35083b, lVar2.f35082a, lVar2.f35083b);
    }

    public static void e(l[] lVarArr) {
        l lVar;
        l lVar2;
        l lVar3;
        float b11 = b(lVarArr[0], lVarArr[1]);
        float b12 = b(lVarArr[1], lVarArr[2]);
        float b13 = b(lVarArr[0], lVarArr[2]);
        if (b12 >= b11 && b12 >= b13) {
            lVar = lVarArr[0];
            lVar2 = lVarArr[1];
            lVar3 = lVarArr[2];
        } else if (b13 < b12 || b13 < b11) {
            lVar = lVarArr[2];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[1];
        } else {
            lVar = lVarArr[1];
            lVar2 = lVarArr[0];
            lVar3 = lVarArr[2];
        }
        if (a(lVar2, lVar, lVar3) < 0.0f) {
            l lVar4 = lVar3;
            lVar3 = lVar2;
            lVar2 = lVar4;
        }
        lVarArr[0] = lVar2;
        lVarArr[1] = lVar;
        lVarArr[2] = lVar3;
    }

    public final float c() {
        return this.f35082a;
    }

    public final float d() {
        return this.f35083b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f35082a == lVar.f35082a && this.f35083b == lVar.f35083b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f35082a) * 31) + Float.floatToIntBits(this.f35083b);
    }

    public final String toString() {
        return pn.j.f81006c + this.f35082a + ',' + this.f35083b + ')';
    }
}
