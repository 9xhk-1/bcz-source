package f60;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f51120a = new f();

    @Override // java.util.logging.Handler
    public void publish(@m80.k LogRecord record) {
        int b11;
        g0.p(record, "record");
        e eVar = e.f51116a;
        String loggerName = record.getLoggerName();
        g0.o(loggerName, "record.loggerName");
        b11 = g.b(record);
        String message = record.getMessage();
        g0.o(message, "record.message");
        eVar.a(loggerName, b11, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
