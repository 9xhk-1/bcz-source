package sb;

import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static String f88254b = "OkSyncDownloader";

    /* renamed from: c, reason: collision with root package name */
    public static final int f88255c = 102400;

    /* renamed from: d, reason: collision with root package name */
    public static volatile k f88256d;

    /* renamed from: a, reason: collision with root package name */
    public a f88257a;

    public h(a context) {
        this.f88257a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [okhttp3.n] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r18, java.lang.String r19, android.os.Handler r20, int r21, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.h.a(java.lang.String, java.lang.String, android.os.Handler, int, int):boolean");
    }

    public final File b(String name, String url) throws FileNotFoundException {
        File o11 = name == null ? xb.j.o(xb.f.o(url.toString())) : xb.j.o(name);
        if (qb.d.b() && qb.d.a()) {
            qb.c.i(f88254b, "trace download, dest file: %s", o11 == null ? "null" : o11.toString());
        }
        if (o11 == null) {
            throw new FileNotFoundException();
        }
        if (!o11.isDirectory()) {
            this.f88257a.b().e(o11.getAbsolutePath());
            return o11;
        }
        boolean s11 = xb.j.s(o11);
        if (qb.d.b() && qb.d.a()) {
            qb.c.i(f88254b, "delete dir? %b", Boolean.valueOf(s11));
        }
        throw new FileNotFoundException(o11 + " is a directory. Network data cannot be downloaded to a directory.");
    }
}
