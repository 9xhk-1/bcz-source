package ul;

import android.os.Build;
import ul.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f implements d.b {
    @Override // ul.d.b
    public String a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // ul.d.b
    public String[] b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !g.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // ul.d.b
    public void c(String str) {
        System.load(str);
    }

    @Override // ul.d.b
    public String d(String str) {
        return (str.startsWith(e.f92290g) && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // ul.d.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
