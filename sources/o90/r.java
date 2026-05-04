package o90;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class r<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<T>, u {

    /* renamed from: a, reason: collision with root package name */
    public Map<z, T> f76688a;

    /* renamed from: b, reason: collision with root package name */
    public z f76689b;

    /* renamed from: c, reason: collision with root package name */
    public T f76690c;

    @Override // o90.u
    public boolean a() {
        return true;
    }

    public String[] b() {
        return null;
    }

    public int[] c() {
        return null;
    }

    public void d(z<T> zVar, z<T> zVar2) {
        if (zVar == null) {
            if (zVar2 == null || !(zVar2 instanceof n90.y)) {
                return;
            }
            e((n90.y) zVar, (n90.y) zVar2);
            return;
        }
        if (zVar instanceof n90.y) {
            if (zVar2 == null || (zVar2 instanceof n90.y)) {
                e((n90.y) zVar, (n90.y) zVar2);
            }
        }
    }

    public abstract z<T> f(String[] strArr, T t11);

    @Override // o90.z
    public void h(T t11) {
        this.f76688a = new HashMap();
        this.f76689b = y.f76714a;
    }

    @Override // o90.z
    public void i(T t11) {
        d(this.f76689b, null);
        this.f76689b = y.f76714a;
        for (Map.Entry<z, T> entry : this.f76688a.entrySet()) {
            entry.getKey().i(entry.getValue());
        }
    }

    public abstract T j(T t11);

    @Override // o90.z
    public final void q(String[] strArr, T t11) {
        z<T> f11 = f(strArr, t11);
        if (f11 == null) {
            f11 = y.f76714a;
        }
        z<T> zVar = this.f76689b;
        if (f11 == zVar) {
            zVar.q(strArr, this.f76690c);
            return;
        }
        T t12 = this.f76688a.get(f11);
        this.f76690c = t12;
        if (f11 != y.f76714a) {
            if (t12 == null) {
                T j11 = j(t11);
                this.f76690c = j11;
                f11.h(j11);
                this.f76688a.put(f11, this.f76690c);
            }
            d(this.f76689b, f11);
            this.f76689b = f11;
            if (c() != null) {
                int[] c11 = c();
                String[] strArr2 = new String[c11.length];
                for (int i11 = 0; i11 < c11.length; i11++) {
                    int i12 = c11[i11];
                    if (i12 < strArr.length) {
                        strArr2[i11] = strArr[i12];
                    }
                }
                strArr = strArr2;
            }
            this.f76689b.q(strArr, this.f76690c);
        }
    }

    public void e(n90.y yVar, n90.y yVar2) {
    }
}
