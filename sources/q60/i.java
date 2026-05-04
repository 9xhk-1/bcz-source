package q60;

import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements n60.g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f81821c = "01230120022455012623010202";

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f81822d = f81821c.toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final i f81823e = new i();

    /* renamed from: a, reason: collision with root package name */
    public int f81824a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f81825b;

    public i() {
        this.f81824a = 4;
        this.f81825b = f81822d;
    }

    @Override // n60.g
    public String a(String str) {
        return h(str);
    }

    public int b(String str, String str2) throws EncoderException {
        return j.b(this, str, str2);
    }

    public final char c(String str, int i11) {
        char charAt;
        char f11 = f(str.charAt(i11));
        if (i11 > 1 && f11 != '0' && ('H' == (charAt = str.charAt(i11 - 1)) || 'W' == charAt)) {
            char charAt2 = str.charAt(i11 - 2);
            if (f(charAt2) == f11 || 'H' == charAt2 || 'W' == charAt2) {
                return (char) 0;
            }
        }
        return f11;
    }

    public int d() {
        return this.f81824a;
    }

    public final char[] e() {
        return this.f81825b;
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    public final char f(char c11) {
        int i11 = c11 - 'A';
        if (i11 >= 0 && i11 < e().length) {
            return e()[i11];
        }
        throw new IllegalArgumentException("The character is not mapped: " + c11);
    }

    public void g(int i11) {
        this.f81824a = i11;
    }

    public String h(String str) {
        if (str == null) {
            return null;
        }
        String a11 = j.a(str);
        if (a11.length() == 0) {
            return a11;
        }
        int i11 = 1;
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = a11.charAt(0);
        char c11 = c(a11, 0);
        int i12 = 1;
        while (i11 < a11.length() && i12 < 4) {
            int i13 = i11 + 1;
            char c12 = c(a11, i11);
            if (c12 != 0) {
                if (c12 != '0' && c12 != c11) {
                    cArr[i12] = c12;
                    i12++;
                }
                c11 = c12;
            }
            i11 = i13;
        }
        return new String(cArr);
    }

    public i(char[] cArr) {
        this.f81824a = 4;
        char[] cArr2 = new char[cArr.length];
        this.f81825b = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public i(String str) {
        this.f81824a = 4;
        this.f81825b = str.toCharArray();
    }
}
