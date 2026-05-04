package q60;

import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements n60.g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f81817b = "01360240043788015936020505";

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f81818c = f81817b.toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public static final h f81819d = new h();

    /* renamed from: a, reason: collision with root package name */
    public final char[] f81820a;

    public h() {
        this.f81820a = f81818c;
    }

    @Override // n60.g
    public String a(String str) {
        return d(str);
    }

    public int b(String str, String str2) throws EncoderException {
        return j.b(this, str, str2);
    }

    public char c(char c11) {
        if (Character.isLetter(c11)) {
            return this.f81820a[Character.toUpperCase(c11) - 'A'];
        }
        return (char) 0;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        String a11 = j.a(str);
        if (a11.length() == 0) {
            return a11;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a11.charAt(0));
        char c11 = '*';
        for (int i11 = 0; i11 < a11.length(); i11++) {
            char c12 = c(a11.charAt(i11));
            if (c12 != c11) {
                if (c12 != 0) {
                    stringBuffer.append(c12);
                }
                c11 = c12;
            }
        }
        return stringBuffer.toString();
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return d((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public h(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.f81820a = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public h(String str) {
        this.f81820a = str.toCharArray();
    }
}
