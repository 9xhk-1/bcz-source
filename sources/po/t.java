package po;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f81092a = Logger.getLogger(t.class.getName());

    public static void a(Flushable flushable, boolean swallowIOException) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e11) {
            if (!swallowIOException) {
                throw e11;
            }
            f81092a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e11);
        }
    }

    @go.a
    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e11) {
            f81092a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e11);
        }
    }
}
