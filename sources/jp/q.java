package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final ParsedResultType f64594a;

    public q(ParsedResultType parsedResultType) {
        this.f64594a = parsedResultType;
    }

    public static void c(String str, StringBuilder sb2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(str);
    }

    public static void d(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                c(str, sb2);
            }
        }
    }

    public abstract String a();

    public final ParsedResultType b() {
        return this.f64594a;
    }

    public final String toString() {
        return a();
    }
}
