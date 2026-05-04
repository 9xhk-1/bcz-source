package bt;

import android.view.animation.Interpolator;
import bt.j;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends k {

    /* renamed from: g, reason: collision with root package name */
    public float f7270g;

    /* renamed from: h, reason: collision with root package name */
    public float f7271h;

    /* renamed from: i, reason: collision with root package name */
    public float f7272i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7273j;

    public g(j.a... aVarArr) {
        super(aVarArr);
        this.f7273j = true;
    }

    @Override // bt.k
    public Object b(float f11) {
        return Float.valueOf(i(f11));
    }

    @Override // bt.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public g clone() {
        ArrayList<j> arrayList = this.f7289e;
        int size = arrayList.size();
        j.a[] aVarArr = new j.a[size];
        for (int i11 = 0; i11 < size; i11++) {
            aVarArr[i11] = (j.a) arrayList.get(i11).clone();
        }
        return new g(aVarArr);
    }

    public float i(float f11) {
        float s11;
        float f12;
        float s12;
        float s13;
        float f13;
        int i11 = this.f7285a;
        if (i11 != 2) {
            if (f11 <= 0.0f) {
                j.a aVar = (j.a) this.f7289e.get(0);
                j.a aVar2 = (j.a) this.f7289e.get(1);
                s12 = aVar.s();
                s13 = aVar2.s();
                float b11 = aVar.b();
                float b12 = aVar2.b();
                Interpolator c11 = aVar2.c();
                if (c11 != null) {
                    f11 = c11.getInterpolation(f11);
                }
                f13 = (f11 - b11) / (b12 - b11);
                p pVar = this.f7290f;
                if (pVar != null) {
                    return ((Number) pVar.evaluate(f13, Float.valueOf(s12), Float.valueOf(s13))).floatValue();
                }
            } else if (f11 >= 1.0f) {
                j.a aVar3 = (j.a) this.f7289e.get(i11 - 2);
                j.a aVar4 = (j.a) this.f7289e.get(this.f7285a - 1);
                s12 = aVar3.s();
                s13 = aVar4.s();
                float b13 = aVar3.b();
                float b14 = aVar4.b();
                Interpolator c12 = aVar4.c();
                if (c12 != null) {
                    f11 = c12.getInterpolation(f11);
                }
                f13 = (f11 - b13) / (b14 - b13);
                p pVar2 = this.f7290f;
                if (pVar2 != null) {
                    return ((Number) pVar2.evaluate(f13, Float.valueOf(s12), Float.valueOf(s13))).floatValue();
                }
            } else {
                j.a aVar5 = (j.a) this.f7289e.get(0);
                int i12 = 1;
                while (true) {
                    int i13 = this.f7285a;
                    if (i12 >= i13) {
                        return ((Number) this.f7289e.get(i13 - 1).e()).floatValue();
                    }
                    j.a aVar6 = (j.a) this.f7289e.get(i12);
                    if (f11 < aVar6.b()) {
                        Interpolator c13 = aVar6.c();
                        if (c13 != null) {
                            f11 = c13.getInterpolation(f11);
                        }
                        f11 = (f11 - aVar5.b()) / (aVar6.b() - aVar5.b());
                        s11 = aVar5.s();
                        float s14 = aVar6.s();
                        p pVar3 = this.f7290f;
                        if (pVar3 != null) {
                            return ((Number) pVar3.evaluate(f11, Float.valueOf(s11), Float.valueOf(s14))).floatValue();
                        }
                        f12 = s14 - s11;
                    } else {
                        i12++;
                        aVar5 = aVar6;
                    }
                }
            }
            return s12 + (f13 * (s13 - s12));
        }
        if (this.f7273j) {
            this.f7273j = false;
            this.f7270g = ((j.a) this.f7289e.get(0)).s();
            float s15 = ((j.a) this.f7289e.get(1)).s();
            this.f7271h = s15;
            this.f7272i = s15 - this.f7270g;
        }
        Interpolator interpolator = this.f7288d;
        if (interpolator != null) {
            f11 = interpolator.getInterpolation(f11);
        }
        p pVar4 = this.f7290f;
        if (pVar4 != null) {
            return ((Number) pVar4.evaluate(f11, Float.valueOf(this.f7270g), Float.valueOf(this.f7271h))).floatValue();
        }
        s11 = this.f7270g;
        f12 = this.f7272i;
        return s11 + (f11 * f12);
    }
}
