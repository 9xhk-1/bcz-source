package zr;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public String f102858a;

    /* renamed from: b, reason: collision with root package name */
    public Character f102859b;

    /* renamed from: c, reason: collision with root package name */
    public Character f102860c;

    /* renamed from: d, reason: collision with root package name */
    public int f102861d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f102862e = 0;

    public n(String str) {
        this.f102858a = str;
    }

    public static boolean e(Character ch2) {
        if (ch2 == null) {
            return false;
        }
        char charValue = ch2.charValue();
        if (charValue >= '0' && charValue <= '9') {
            return true;
        }
        if (charValue < 'a' || charValue > 'f') {
            return charValue >= 'A' && charValue <= 'F';
        }
        return true;
    }

    public static boolean g(Character ch2) {
        char charValue;
        return ch2 != null && (charValue = ch2.charValue()) >= '0' && charValue <= '7';
    }

    public void a(Character ch2) {
        this.f102859b = ch2;
    }

    public boolean b() {
        if (this.f102859b != null) {
            return true;
        }
        String str = this.f102858a;
        return (str == null || str.length() == 0 || this.f102861d >= this.f102858a.length()) ? false : true;
    }

    public boolean c(char c11) {
        Character ch2 = this.f102859b;
        if (ch2 != null && ch2.charValue() == c11) {
            return true;
        }
        String str = this.f102858a;
        return str != null && str.length() != 0 && this.f102861d < this.f102858a.length() && this.f102858a.charAt(this.f102861d) == c11;
    }

    public int d() {
        return this.f102861d;
    }

    public void f() {
        this.f102860c = this.f102859b;
        this.f102862e = this.f102861d;
    }

    public Character h() {
        Character ch2 = this.f102859b;
        if (ch2 != null) {
            this.f102859b = null;
            return ch2;
        }
        String str = this.f102858a;
        if (str == null || str.length() == 0 || this.f102861d >= this.f102858a.length()) {
            return null;
        }
        String str2 = this.f102858a;
        int i11 = this.f102861d;
        this.f102861d = i11 + 1;
        return Character.valueOf(str2.charAt(i11));
    }

    public Character i() {
        Character h11 = h();
        if (h11 != null && e(h11)) {
            return h11;
        }
        return null;
    }

    public Character j() {
        Character h11 = h();
        if (h11 != null && g(h11)) {
            return h11;
        }
        return null;
    }

    public Character k() {
        Character ch2 = this.f102859b;
        if (ch2 != null) {
            return ch2;
        }
        String str = this.f102858a;
        if (str == null || str.length() == 0 || this.f102861d >= this.f102858a.length()) {
            return null;
        }
        return Character.valueOf(this.f102858a.charAt(this.f102861d));
    }

    public String l() {
        String substring = this.f102858a.substring(this.f102861d);
        if (this.f102859b == null) {
            return substring;
        }
        return this.f102859b + substring;
    }

    public void m() {
        this.f102859b = this.f102860c;
        this.f102861d = this.f102862e;
    }
}
