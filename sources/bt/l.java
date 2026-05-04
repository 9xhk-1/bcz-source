package bt;

import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l extends q {
    public static final boolean Q = false;
    public static final Map<String, ct.c> R;
    public Object N;
    public String O;
    public ct.c P;

    static {
        HashMap hashMap = new HashMap();
        R = hashMap;
        hashMap.put("alpha", m.f7291a);
        hashMap.put("pivotX", m.f7292b);
        hashMap.put("pivotY", m.f7293c);
        hashMap.put("translationX", m.f7294d);
        hashMap.put("translationY", m.f7295e);
        hashMap.put(Key.ROTATION, m.f7296f);
        hashMap.put("rotationX", m.f7297g);
        hashMap.put("rotationY", m.f7298h);
        hashMap.put("scaleX", m.f7299i);
        hashMap.put("scaleY", m.f7300j);
        hashMap.put("scrollX", m.f7301k);
        hashMap.put("scrollY", m.f7302l);
        hashMap.put("x", m.f7303m);
        hashMap.put("y", m.f7304n);
    }

    public l() {
    }

    public static <T> l I0(T t11, ct.c<T, Float> cVar, float... fArr) {
        l lVar = new l(t11, cVar);
        lVar.r0(fArr);
        return lVar;
    }

    public static l J0(Object obj, String str, float... fArr) {
        l lVar = new l(obj, str);
        lVar.r0(fArr);
        return lVar;
    }

    public static <T> l M0(T t11, ct.c<T, Integer> cVar, int... iArr) {
        l lVar = new l(t11, cVar);
        lVar.t0(iArr);
        return lVar;
    }

    public static l N0(Object obj, String str, int... iArr) {
        l lVar = new l(obj, str);
        lVar.t0(iArr);
        return lVar;
    }

    public static <T, V> l O0(T t11, ct.c<T, V> cVar, p<V> pVar, V... vArr) {
        l lVar = new l(t11, cVar);
        lVar.u0(vArr);
        lVar.q0(pVar);
        return lVar;
    }

    public static l P0(Object obj, String str, p pVar, Object... objArr) {
        l lVar = new l(obj, str);
        lVar.u0(objArr);
        lVar.q0(pVar);
        return lVar;
    }

    public static l S0(Object obj, n... nVarArr) {
        l lVar = new l();
        lVar.N = obj;
        lVar.z0(nVarArr);
        return lVar;
    }

    @Override // bt.q
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public l clone() {
        return (l) super.clone();
    }

    public String F0() {
        return this.O;
    }

    public Object G0() {
        return this.N;
    }

    @Override // bt.q
    public void J(float f11) {
        super.J(f11);
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].q(this.N);
        }
    }

    @Override // bt.q
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public l l(long j11) {
        super.l(j11);
        return this;
    }

    public void U0(ct.c cVar) {
        n[] nVarArr = this.f7351s;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String f11 = nVar.f();
            nVar.x(cVar);
            this.f7352t.remove(f11);
            this.f7352t.put(this.O, nVar);
        }
        if (this.P != null) {
            this.O = cVar.b();
        }
        this.P = cVar;
        this.f7344l = false;
    }

    public void V0(String str) {
        n[] nVarArr = this.f7351s;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String f11 = nVar.f();
            nVar.y(str);
            this.f7352t.remove(f11);
            this.f7352t.put(str, nVar);
        }
        this.O = str;
        this.f7344l = false;
    }

    @Override // bt.q
    public void e0() {
        if (this.f7344l) {
            return;
        }
        if (this.P == null && et.a.f50118q && (this.N instanceof View)) {
            Map<String, ct.c> map = R;
            if (map.containsKey(this.O)) {
                U0(map.get(this.O));
            }
        }
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].E(this.N);
        }
        super.e0();
    }

    @Override // bt.a
    public void o(Object obj) {
        Object obj2 = this.N;
        if (obj2 != obj) {
            this.N = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.f7344l = false;
            }
        }
    }

    @Override // bt.a
    public void p() {
        e0();
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].z(this.N);
        }
    }

    @Override // bt.a
    public void q() {
        e0();
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].G(this.N);
        }
    }

    @Override // bt.q
    public void r0(float... fArr) {
        n[] nVarArr = this.f7351s;
        if (nVarArr != null && nVarArr.length != 0) {
            super.r0(fArr);
            return;
        }
        ct.c cVar = this.P;
        if (cVar != null) {
            z0(n.h(cVar, fArr));
        } else {
            z0(n.i(this.O, fArr));
        }
    }

    @Override // bt.q, bt.a
    public void s() {
        super.s();
    }

    @Override // bt.q
    public void t0(int... iArr) {
        n[] nVarArr = this.f7351s;
        if (nVarArr != null && nVarArr.length != 0) {
            super.t0(iArr);
            return;
        }
        ct.c cVar = this.P;
        if (cVar != null) {
            z0(n.j(cVar, iArr));
        } else {
            z0(n.l(this.O, iArr));
        }
    }

    @Override // bt.q
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.N;
        if (this.f7351s == null) {
            return str;
        }
        for (int i11 = 0; i11 < this.f7351s.length; i11++) {
            str = String.valueOf(str) + "\n    " + this.f7351s[i11].toString();
        }
        return str;
    }

    @Override // bt.q
    public void u0(Object... objArr) {
        n[] nVarArr = this.f7351s;
        if (nVarArr != null && nVarArr.length != 0) {
            super.u0(objArr);
            return;
        }
        ct.c cVar = this.P;
        if (cVar != null) {
            z0(n.o(cVar, null, objArr));
        } else {
            z0(n.p(this.O, null, objArr));
        }
    }

    public l(Object obj, String str) {
        this.N = obj;
        V0(str);
    }

    public <T> l(T t11, ct.c<T, ?> cVar) {
        this.N = t11;
        U0(cVar);
    }
}
