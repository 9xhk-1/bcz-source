package ro;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f84475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84476b;

    public m(String rawValue, int radix) {
        this.f84475a = rawValue;
        this.f84476b = radix;
    }

    public static m a(String stringValue) {
        if (stringValue.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char charAt = stringValue.charAt(0);
        int i11 = 16;
        if (stringValue.startsWith("0x") || stringValue.startsWith("0X")) {
            stringValue = stringValue.substring(2);
        } else if (charAt == '#') {
            stringValue = stringValue.substring(1);
        } else if (charAt != '0' || stringValue.length() <= 1) {
            i11 = 10;
        } else {
            stringValue = stringValue.substring(1);
            i11 = 8;
        }
        return new m(stringValue, i11);
    }
}
