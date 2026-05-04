package y90;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<d> f99720a = ConcurrentHashMap.newKeySet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements e {

        /* renamed from: c, reason: collision with root package name */
        public static final String f99721c = "y90.g$a";

        /* renamed from: a, reason: collision with root package name */
        public final String f99722a;

        /* renamed from: b, reason: collision with root package name */
        public final Logger f99723b;

        public a(String name) {
            this.f99722a = name;
            this.f99723b = Logger.getLogger(name);
        }

        public static String p(Supplier<String> messageSupplier) {
            if (messageSupplier != null) {
                return messageSupplier.get();
            }
            return null;
        }

        @Override // y90.e
        public void a(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.FINE, throwable, messageSupplier);
        }

        @Override // y90.e
        public void b(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.WARNING, throwable, messageSupplier);
        }

        @Override // y90.e
        public void c(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.FINER, throwable, messageSupplier);
        }

        @Override // y90.e
        public void d(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.CONFIG, throwable, messageSupplier);
        }

        @Override // y90.e
        public void e(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.INFO, throwable, messageSupplier);
        }

        @Override // y90.e
        public void f(Supplier<String> messageSupplier) {
            o(Level.WARNING, null, messageSupplier);
        }

        @Override // y90.e
        public void g(Supplier<String> messageSupplier) {
            o(Level.INFO, null, messageSupplier);
        }

        @Override // y90.e
        public void h(Supplier<String> messageSupplier) {
            o(Level.FINE, null, messageSupplier);
        }

        @Override // y90.e
        public void i(Throwable throwable, Supplier<String> messageSupplier) {
            o(Level.SEVERE, throwable, messageSupplier);
        }

        @Override // y90.e
        public void j(Supplier<String> messageSupplier) {
            o(Level.CONFIG, null, messageSupplier);
        }

        @Override // y90.e
        public void k(Supplier<String> messageSupplier) {
            o(Level.SEVERE, null, messageSupplier);
        }

        @Override // y90.e
        public void l(Supplier<String> messageSupplier) {
            o(Level.FINER, null, messageSupplier);
        }

        public final LogRecord n(Level level, Throwable throwable, String message) {
            String str;
            String str2;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int length = stackTrace.length;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 >= length) {
                    str = null;
                    str2 = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                str = stackTraceElement.getClassName();
                if (f99721c.equals(str)) {
                    z11 = true;
                } else if (z11) {
                    str2 = stackTraceElement.getMethodName();
                    break;
                }
                i11++;
            }
            LogRecord logRecord = new LogRecord(level, message);
            logRecord.setLoggerName(this.f99722a);
            logRecord.setThrown(throwable);
            logRecord.setSourceClassName(str);
            logRecord.setSourceMethodName(str2);
            logRecord.setResourceBundleName(this.f99723b.getResourceBundleName());
            logRecord.setResourceBundle(this.f99723b.getResourceBundle());
            return logRecord;
        }

        public final void o(Level level, Throwable throwable, Supplier<String> messageSupplier) {
            boolean isLoggable = this.f99723b.isLoggable(level);
            if (isLoggable || !g.f99720a.isEmpty()) {
                final LogRecord n11 = n(level, throwable, p(messageSupplier));
                if (isLoggable) {
                    this.f99723b.log(n11);
                }
                g.f99720a.forEach(new Consumer() { // from class: y90.f
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((d) obj).e(n11);
                    }
                });
            }
        }
    }

    public static void b(d listener) {
        f99720a.add(listener);
    }

    public static e c(Class<?> clazz) {
        if (clazz != null) {
            return new a(clazz.getName());
        }
        throw new JUnitException("Class must not be null");
    }

    public static void d(d listener) {
        f99720a.remove(listener);
    }
}
