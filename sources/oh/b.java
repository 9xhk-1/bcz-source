package oh;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f76974b = "PreDownloadService";

    /* renamed from: c, reason: collision with root package name */
    public static b f76975c;

    /* renamed from: a, reason: collision with root package name */
    public a f76976a = new a();

    public static void c(Context context, ArrayList<Integer> integers, int bookId) {
        d().a(integers, bookId);
    }

    public static b d() {
        if (f76975c == null) {
            synchronized (b.class) {
                try {
                    if (f76975c == null) {
                        f76975c = new b();
                    }
                } finally {
                }
            }
        }
        return f76975c;
    }

    public static void e(Context context) {
        d().b();
    }

    public final void a(ArrayList<Integer> ids, int bookid) {
        if (ids == null || ids.isEmpty()) {
            return;
        }
        this.f76976a.c(ids, bookid);
    }

    public final void b() {
        this.f76976a.b();
    }
}
