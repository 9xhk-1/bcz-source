package r90;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataValidationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b0 implements g<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final String f83842a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83843b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83844c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f83845d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<String> f83846e;

    /* renamed from: f, reason: collision with root package name */
    public final Matcher f83847f;

    /* renamed from: g, reason: collision with root package name */
    public final c0[] f83848g;

    public b0() {
        this(false, false, null, null, null);
    }

    @Override // r90.g
    public Object a(Object obj) {
        d(obj);
        return obj;
    }

    @Override // r90.g
    public Object b(Object obj) {
        d(obj);
        return obj;
    }

    public final c0[] c(Class[] clsArr) {
        c0[] c0VarArr = new c0[clsArr.length];
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            c0VarArr[i11] = (c0) h90.a.Q(c0.class, clsArr[i11], org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78085a);
        }
        return c0VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(Object obj) {
        DataValidationException dataValidationException;
        boolean matches;
        Set<String> set;
        DataValidationException dataValidationException2 = null;
        if (obj != null) {
            String valueOf = String.valueOf(obj);
            if (valueOf.trim().isEmpty()) {
                if (this.f83844c) {
                    Set<String> set2 = this.f83846e;
                    if (set2 == null || !set2.contains(valueOf)) {
                        return;
                    } else {
                        dataValidationException2 = new DataValidationException("Value '{value}' is not allowed.");
                    }
                } else {
                    Set<String> set3 = this.f83845d;
                    if (set3 != null && set3.contains(valueOf)) {
                        return;
                    } else {
                        dataValidationException2 = new DataValidationException("Blanks are not allowed. '{value}' is blank.");
                    }
                }
            }
            Matcher matcher = this.f83847f;
            if (matcher != null && dataValidationException2 == null) {
                synchronized (matcher) {
                    matches = this.f83847f.reset(valueOf).matches();
                }
                if (!matches) {
                    dataValidationException2 = new DataValidationException("Value '{value}' does not match expected pattern: '" + this.f83842a + "'");
                }
            }
            dataValidationException = dataValidationException2;
            dataValidationException2 = valueOf;
        } else if (this.f83843b) {
            Set<String> set4 = this.f83846e;
            if (set4 == null || !set4.contains(null)) {
                return;
            } else {
                dataValidationException = new DataValidationException("Value '{value}' is not allowed.");
            }
        } else {
            Set<String> set5 = this.f83845d;
            if (set5 != null && set5.contains(null)) {
                return;
            } else {
                dataValidationException = new DataValidationException("Null values not allowed.");
            }
        }
        Set<String> set6 = this.f83845d;
        if (set6 != null && !set6.contains(dataValidationException2)) {
            dataValidationException = new DataValidationException("Value '{value}' is not allowed. Expecting one of: " + this.f83845d);
        }
        if (dataValidationException == null && (set = this.f83846e) != null && set.contains(dataValidationException2)) {
            dataValidationException = new DataValidationException("Value '{value}' is not allowed.");
        }
        int i11 = 0;
        while (dataValidationException == null) {
            c0[] c0VarArr = this.f83848g;
            if (i11 >= c0VarArr.length) {
                break;
            }
            String a11 = c0VarArr[i11].a(obj);
            if (a11 != null && !a11.trim().isEmpty()) {
                dataValidationException = new DataValidationException("Value '{value}' didn't pass validation: " + a11);
            }
            i11++;
        }
        if (dataValidationException == null) {
            return;
        }
        dataValidationException.setValue(obj);
        throw dataValidationException;
    }

    public b0(String str) {
        this(false, false, null, null, str);
    }

    public b0(boolean z11, boolean z12) {
        this(z11, z12, null, null, null);
    }

    public b0(boolean z11, boolean z12, String[] strArr, String[] strArr2, String str) {
        this(z11, z12, strArr, strArr2, str, null);
    }

    public b0(boolean z11, boolean z12, String[] strArr, String[] strArr2, String str, Class[] clsArr) {
        this.f83842a = str;
        HashSet hashSet = null;
        this.f83847f = (str == null || str.isEmpty()) ? null : Pattern.compile(str).matcher("");
        this.f83843b = z11;
        this.f83844c = z12;
        this.f83845d = (strArr == null || strArr.length == 0) ? null : new HashSet(Arrays.asList(strArr));
        if (strArr2 != null && strArr2.length != 0) {
            hashSet = new HashSet(Arrays.asList(strArr2));
        }
        this.f83846e = hashSet;
        this.f83848g = (clsArr == null || clsArr.length == 0) ? new c0[0] : c(clsArr);
    }
}
