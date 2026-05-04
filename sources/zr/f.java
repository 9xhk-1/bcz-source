package zr;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f102836a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: b, reason: collision with root package name */
    public static final char f102837b = '*';

    /* renamed from: c, reason: collision with root package name */
    public static final int f102838c = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Throwable {

        /* renamed from: d, reason: collision with root package name */
        public static final long f102839d = 7129050843360571879L;

        /* renamed from: a, reason: collision with root package name */
        public String f102840a;

        /* renamed from: b, reason: collision with root package name */
        public Throwable f102841b;

        /* renamed from: c, reason: collision with root package name */
        public Throwable f102842c;

        public a(Throwable th2) {
            this.f102842c = th2;
        }

        public void a(String str) {
            this.f102840a = str;
        }

        public void b(Throwable th2) {
            this.f102841b = th2;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th2;
            th2 = this.f102841b;
            if (th2 == this) {
                th2 = null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f102840a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f102842c;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f102840a == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f102840a.startsWith(str)) {
                return this.f102840a;
            }
            return str + this.f102840a;
        }
    }

    public static void A(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, c(str2, false), q(th2));
    }

    public static void B(String str, String str2, Throwable th2, boolean z11) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, c(str2, z11), q(th2));
    }

    public static void C(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, c(str2, z11));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i11 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (f102836a.matcher(String.valueOf(charAt)).matches()) {
                if (i11 % 2 == 0) {
                    charAt = '*';
                }
                i11++;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(a(str2));
        }
        return sb2.toString();
    }

    public static String c(String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z11) {
                sb2.append(a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            if (i11 % 2 == 0) {
                charArray[i11] = '*';
            }
        }
        return new String(charArray);
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, false));
    }

    public static void f(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, b(str2, str3));
    }

    public static void g(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, b(str2, str3), q(th2));
    }

    public static void h(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.d(str, c(str2, false), q(th2));
    }

    public static void i(String str, String str2, Throwable th2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, z11), q(th2));
    }

    public static void j(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, z11));
    }

    public static void k(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, c(str2, false));
    }

    public static void l(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, b(str2, str3));
    }

    public static void m(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, b(str2, str3), q(th2));
    }

    public static void n(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, c(str2, false), q(th2));
    }

    public static void o(String str, String str2, Throwable th2, boolean z11) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, c(str2, z11), q(th2));
    }

    public static void p(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, c(str2, z11));
    }

    public static Throwable q(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        a aVar = new a(th2);
        aVar.setStackTrace(th2.getStackTrace());
        aVar.a(d(th2.getMessage()));
        Throwable cause = th2.getCause();
        a aVar2 = aVar;
        while (cause != null) {
            a aVar3 = new a(cause);
            aVar3.setStackTrace(cause.getStackTrace());
            aVar3.a(d(cause.getMessage()));
            aVar2.b(aVar3);
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    public static void r(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, c(str2, false));
    }

    public static void s(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, b(str2, str3));
    }

    public static void t(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, b(str2, str3), q(th2));
    }

    public static void u(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, c(str2, false), q(th2));
    }

    public static void v(String str, String str2, Throwable th2, boolean z11) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, c(str2, z11), q(th2));
    }

    public static void w(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, c(str2, z11));
    }

    public static void x(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, c(str2, false));
    }

    public static void y(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, b(str2, str3));
    }

    public static void z(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, b(str2, str3), q(th2));
    }
}
