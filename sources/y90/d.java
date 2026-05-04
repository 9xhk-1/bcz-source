package y90;

import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.1", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<List<LogRecord>> f99718a = new androidx.emoji2.text.flatbuffer.b(new x80.e());

    public static /* synthetic */ boolean a(Level level, LogRecord logRecord) {
        return logRecord.getLevel() == level;
    }

    public static /* synthetic */ boolean c(Level level, LogRecord logRecord) {
        return logRecord.getLevel() == level;
    }

    public void d() {
        this.f99718a.get().clear();
    }

    public void e(LogRecord logRecord) {
        this.f99718a.get().add(logRecord);
    }

    public Stream<LogRecord> f() {
        return this.f99718a.get().stream();
    }

    public Stream<LogRecord> g(final Class<?> clazz) {
        if (clazz != null) {
            return f().filter(new Predicate() { // from class: y90.b
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean equals;
                    equals = ((LogRecord) obj).getLoggerName().equals(clazz.getName());
                    return equals;
                }
            });
        }
        throw new JUnitException("Class must not be null");
    }

    public Stream<LogRecord> h(Class<?> clazz, final Level level) {
        if (level != null) {
            return g(clazz).filter(new Predicate() { // from class: y90.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return d.c(level, (LogRecord) obj);
                }
            });
        }
        throw new JUnitException("Level must not be null");
    }

    public Stream<LogRecord> i(final Level level) {
        if (level != null) {
            return f().filter(new Predicate() { // from class: y90.c
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return d.a(level, (LogRecord) obj);
                }
            });
        }
        throw new JUnitException("Level must not be null");
    }
}
