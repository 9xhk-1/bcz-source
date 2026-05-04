package c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f7467d = "\r";

    /* renamed from: a, reason: collision with root package name */
    public final String f7468a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7469b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7470c;

    public g(String str, float f11, float f12) {
        this.f7468a = str;
        this.f7470c = f12;
        this.f7469b = f11;
    }

    public float a() {
        return this.f7470c;
    }

    public String b() {
        return this.f7468a;
    }

    public float c() {
        return this.f7469b;
    }

    public boolean d(String str) {
        if (this.f7468a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f7468a.endsWith(f7467d)) {
            String str2 = this.f7468a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
