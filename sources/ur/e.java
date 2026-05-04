package ur;

import android.annotation.SuppressLint;
import android.os.Build;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f92415b = "RootKeyUtil";

    /* renamed from: a, reason: collision with root package name */
    public byte[] f92416a = null;

    public static e e(String str, String str2, String str3, String str4) {
        e eVar = new e();
        eVar.a(str, str2, str3, str4);
        return eVar;
    }

    public static e f(String str, String str2, String str3, byte[] bArr) {
        e eVar = new e();
        eVar.b(str, str2, str3, bArr);
        return eVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        b(str, str2, str3, d.c(str4));
    }

    @SuppressLint({"NewApi"})
    public final void b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            h.e(f92415b, "initRootKey: sha1");
            this.f92416a = a.i(str, str2, str3, bArr, false);
        } else {
            h.e(f92415b, "initRootKey: sha256");
            this.f92416a = a.i(str, str2, str3, bArr, true);
        }
    }

    public byte[] c() {
        return (byte[]) this.f92416a.clone();
    }

    public String d() {
        return d.b(this.f92416a);
    }
}
