package r90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w implements g<String, String> {

    /* renamed from: a, reason: collision with root package name */
    public final String f83878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83879b;

    public w(String str, String str2) {
        this.f83878a = str;
        this.f83879b = str2;
    }

    @Override // r90.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(this.f83878a, this.f83879b);
    }

    @Override // r90.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        return b(str);
    }
}
