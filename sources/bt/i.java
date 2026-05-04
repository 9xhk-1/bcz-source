package bt;

import android.view.animation.Interpolator;
import bt.j;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends k {

    /* renamed from: g, reason: collision with root package name */
    public int f7274g;

    /* renamed from: h, reason: collision with root package name */
    public int f7275h;

    /* renamed from: i, reason: collision with root package name */
    public int f7276i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7277j;

    public i(j.b... bVarArr) {
        super(bVarArr);
        this.f7277j = true;
    }

    @Override // bt.k
    public Object b(float f11) {
        return Integer.valueOf(i(f11));
    }

    @Override // bt.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public i clone() {
        ArrayList<j> arrayList = this.f7289e;
        int size = arrayList.size();
        j.b[] bVarArr = new j.b[size];
        for (int i11 = 0; i11 < size; i11++) {
            bVarArr[i11] = (j.b) arrayList.get(i11).clone();
        }
        return new i(bVarArr);
    }

    public int i(float f11) {
        int s11;
        int i11;
        int s12;
        int s13;
        float f12;
        int i12 = this.f7285a;
        if (i12 != 2) {
            if (f11 <= 0.0f) {
                j.b bVar = (j.b) this.f7289e.get(0);
                j.b bVar2 = (j.b) this.f7289e.get(1);
                s12 = bVar.s();
                s13 = bVar2.s();
                float b11 = bVar.b();
                float b12 = bVar2.b();
                Interpolator c11 = bVar2.c();
                if (c11 != null) {
                    f11 = c11.getInterpolation(f11);
                }
                f12 = (f11 - b11) / (b12 - b11);
                p pVar = this.f7290f;
                if (pVar != null) {
                    return ((Number) pVar.evaluate(f12, Integer.valueOf(s12), Integer.valueOf(s13))).intValue();
                }
            } else if (f11 >= 1.0f) {
                j.b bVar3 = (j.b) this.f7289e.get(i12 - 2);
                j.b bVar4 = (j.b) this.f7289e.get(this.f7285a - 1);
                s12 = bVar3.s();
                s13 = bVar4.s();
                float b13 = bVar3.b();
                float b14 = bVar4.b();
                Interpolator c12 = bVar4.c();
                if (c12 != null) {
                    f11 = c12.getInterpolation(f11);
                }
                f12 = (f11 - b13) / (b14 - b13);
                p pVar2 = this.f7290f;
                if (pVar2 != null) {
                    return ((Number) pVar2.evaluate(f12, Integer.valueOf(s12), Integer.valueOf(s13))).intValue();
                }
            } else {
                j.b bVar5 = (j.b) this.f7289e.get(0);
                int i13 = 1;
                while (true) {
                    int i14 = this.f7285a;
                    if (i13 >= i14) {
                        return ((Number) this.f7289e.get(i14 - 1).e()).intValue();
                    }
                    j.b bVar6 = (j.b) this.f7289e.get(i13);
                    if (f11 < bVar6.b()) {
                        Interpolator c13 = bVar6.c();
                        if (c13 != null) {
                            f11 = c13.getInterpolation(f11);
                        }
                        f11 = (f11 - bVar5.b()) / (bVar6.b() - bVar5.b());
                        s11 = bVar5.s();
                        int s14 = bVar6.s();
                        p pVar3 = this.f7290f;
                        if (pVar3 != null) {
                            return ((Number) pVar3.evaluate(f11, Integer.valueOf(s11), Integer.valueOf(s14))).intValue();
                        }
                        i11 = s14 - s11;
                    } else {
                        i13++;
                        bVar5 = bVar6;
                    }
                }
            }
            return s12 + ((int) (f12 * (s13 - s12)));
        }
        if (this.f7277j) {
            this.f7277j = false;
            this.f7274g = ((j.b) this.f7289e.get(0)).s();
            int s15 = ((j.b) this.f7289e.get(1)).s();
            this.f7275h = s15;
            this.f7276i = s15 - this.f7274g;
        }
        Interpolator interpolator = this.f7288d;
        if (interpolator != null) {
            f11 = interpolator.getInterpolation(f11);
        }
        p pVar4 = this.f7290f;
        if (pVar4 != null) {
            return ((Number) pVar4.evaluate(f11, Integer.valueOf(this.f7274g), Integer.valueOf(this.f7275h))).intValue();
        }
        s11 = this.f7274g;
        i11 = this.f7276i;
        return s11 + ((int) (f11 * i11));
    }
}
