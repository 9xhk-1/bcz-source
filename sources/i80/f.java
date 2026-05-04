package i80;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements f {

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f60307b;

        /* renamed from: a, reason: collision with root package name */
        public final String f60308a;

        static {
            boolean z11;
            try {
                Class.forName("android.util.Log");
                z11 = true;
            } catch (ClassNotFoundException unused) {
                z11 = false;
            }
            f60307b = z11;
        }

        public a(String str) {
            this.f60308a = str;
        }

        public static boolean c() {
            return f60307b;
        }

        @Override // i80.f
        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f60308a, str);
            }
        }

        @Override // i80.f
        public void b(Level level, String str, Throwable th2) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f60308a, str + "\n" + Log.getStackTraceString(th2));
            }
        }

        public int d(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final Logger f60309a;

        public b(String str) {
            this.f60309a = Logger.getLogger(str);
        }

        @Override // i80.f
        public void a(Level level, String str) {
            this.f60309a.log(level, str);
        }

        @Override // i80.f
        public void b(Level level, String str, Throwable th2) {
            this.f60309a.log(level, str, th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements f {
        @Override // i80.f
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // i80.f
        public void b(Level level, String str, Throwable th2) {
            System.out.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th2);
}
