package n90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.n implements a0<Object[]> {

    /* renamed from: i, reason: collision with root package name */
    public NormalizedString[] f74982i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f74983j;

    public Object[] G(Object[] objArr, String[] strArr, int[] iArr) {
        if (this.f74983j != strArr) {
            this.f74983j = strArr;
            this.f74982i = NormalizedString.toArray(strArr);
        }
        return p(objArr, this.f74982i, iArr);
    }

    @Override // n90.a0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Object[] p(Object[] objArr, NormalizedString[] normalizedStringArr, int[] iArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (D(false, objArr2, normalizedStringArr, iArr)) {
            return objArr2;
        }
        return null;
    }
}
