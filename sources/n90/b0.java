package n90;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b0 implements a0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public a0 f74969a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f74970b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public NormalizedString[] f74971c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f74972d;

    public abstract String a();

    public NormalizedString[] b() {
        return null;
    }

    public abstract NormalizedString[] c(Object obj);

    public abstract NormalizedString[] d(Map map, Map map2);

    public int[] e() {
        return null;
    }

    public final int f() {
        if (this.f74970b == Integer.MIN_VALUE) {
            this.f74970b = 0;
            if (b() != null) {
                this.f74970b = b().length;
            }
            if (e() != null) {
                for (int i11 : e()) {
                    int i12 = i11 + 1;
                    if (i12 > this.f74970b) {
                        this.f74970b = i12;
                    }
                }
            }
        }
        return this.f74970b;
    }

    public abstract a0<?> h(Object obj);

    public Object[] i(Object obj, String[] strArr, int[] iArr) {
        if (this.f74972d != strArr) {
            this.f74972d = strArr;
            this.f74971c = NormalizedString.toArray(strArr);
        }
        return p(obj, this.f74971c, iArr);
    }

    @Override // n90.a0
    public Object[] p(Object obj, NormalizedString[] normalizedStringArr, int[] iArr) {
        a0<?> h11 = h(obj);
        if (h11 == null) {
            DataProcessingException dataProcessingException = new DataProcessingException("Cannot find switch for input. Headers: {headers}, indices to write: " + Arrays.toString(iArr) + ". " + a());
            dataProcessingException.setValue("headers", Arrays.toString(normalizedStringArr));
            dataProcessingException.setValue(obj);
            throw dataProcessingException;
        }
        a0<?> a0Var = this.f74969a;
        if (h11 != a0Var) {
            g(a0Var, h11);
            this.f74969a = h11;
        }
        NormalizedString[] b11 = b();
        int[] e11 = e();
        if (b11 != null) {
            normalizedStringArr = b11;
        }
        if (e11 != null) {
            iArr = e11;
        }
        return this.f74969a.p(obj, normalizedStringArr, iArr);
    }

    public void g(a0<?> a0Var, a0<?> a0Var2) {
    }
}
