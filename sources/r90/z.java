package r90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class z implements g<String, String> {

    /* renamed from: a, reason: collision with root package name */
    public final int f83880a;

    public z() {
        this.f83880a = -1;
    }

    @Override // r90.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        if (this.f83880a == -1) {
            return str.trim();
        }
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) <= ' ') {
            i11++;
        }
        if (i11 == str.length()) {
            return "";
        }
        int length = ((this.f83880a < str.length() ? this.f83880a : str.length()) + i11) - 1;
        if (length >= str.length()) {
            length = str.length() - 1;
        }
        while (str.charAt(length) <= ' ') {
            length--;
        }
        return str.substring(i11, length + 1);
    }

    @Override // r90.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        return b(str);
    }

    public z(int i11) {
        if (i11 >= 0) {
            this.f83880a = i11;
            return;
        }
        throw new IllegalArgumentException("Maximum trim length must be positive");
    }
}
