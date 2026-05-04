package n90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f<T> extends o90.t<T> implements a0<T> {

    /* renamed from: y, reason: collision with root package name */
    public NormalizedString[] f74973y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f74974z;

    public f(Class<T> cls) {
        super(cls, MethodFilter.ONLY_GETTERS);
    }

    @Override // o90.t
    public j90.i I() {
        return null;
    }

    public Object[] l0(T t11, String[] strArr, int[] iArr) {
        if (this.f74974z != strArr) {
            this.f74974z = strArr;
            this.f74973y = NormalizedString.toArray(strArr);
        }
        return p(t11, this.f74973y, iArr);
    }

    @Override // n90.a0
    public Object[] p(T t11, NormalizedString[] normalizedStringArr, int[] iArr) {
        if (!this.f76698p) {
            super.T(normalizedStringArr);
        }
        return f0(t11, normalizedStringArr, iArr);
    }
}
