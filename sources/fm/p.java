package fm;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p extends k<km.i> {
    public p() {
    }

    public km.i Q() {
        return (km.i) this.f52067i.get(0);
    }

    @Override // fm.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public km.i k(int i11) {
        if (i11 == 0) {
            return Q();
        }
        return null;
    }

    @Override // fm.k
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public km.i l(String str, boolean z11) {
        if (z11) {
            if (str.equalsIgnoreCase(((km.i) this.f52067i.get(0)).getLabel())) {
                return (km.i) this.f52067i.get(0);
            }
            return null;
        }
        if (str.equals(((km.i) this.f52067i.get(0)).getLabel())) {
            return (km.i) this.f52067i.get(0);
        }
        return null;
    }

    public float T() {
        float f11 = 0.0f;
        for (int i11 = 0; i11 < Q().l1(); i11++) {
            f11 += Q().m(i11).c();
        }
        return f11;
    }

    public void U(km.i iVar) {
        this.f52067i.clear();
        this.f52067i.add(iVar);
        E();
    }

    @Override // fm.k
    public Entry s(im.d dVar) {
        return Q().m((int) dVar.h());
    }

    public p(km.i iVar) {
        super(iVar);
    }
}
