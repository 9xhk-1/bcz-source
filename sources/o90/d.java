package o90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d<T, C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends t<T> implements z<C> {
    public d(Class<T> cls, MethodFilter methodFilter) {
        super(cls, methodFilter);
    }

    public void h(C c11) {
        super.T(NormalizedString.toArray(c11.a()));
    }

    public abstract void l0(T t11, C c11);

    @Override // o90.z
    public final void q(String[] strArr, C c11) {
        T J = J(strArr, c11);
        if (J != null) {
            l0(J, c11);
        }
    }

    public void i(C c11) {
    }
}
