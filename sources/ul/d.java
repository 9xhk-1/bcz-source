package ul;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, e eVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        String a(String str);

        String[] b();

        void c(String str);

        String d(String str);

        void loadLibrary(String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(Throwable th2);

        void b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ul.d$d, reason: collision with other inner class name */
    public interface InterfaceC1241d {
        void log(String str);
    }

    public static e a() {
        return new e().c();
    }

    public static void b(Context context, String str) {
        d(context, str, null, null);
    }

    public static void c(Context context, String str, String str2) {
        d(context, str, str2, null);
    }

    public static void d(Context context, String str, String str2, c cVar) {
        new e().h(context, str, str2, cVar);
    }

    public static void e(Context context, String str, c cVar) {
        d(context, str, null, cVar);
    }

    public static e f(InterfaceC1241d interfaceC1241d) {
        return new e().k(interfaceC1241d);
    }

    public static e g() {
        return new e().n();
    }
}
