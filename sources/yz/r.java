package yz;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class r {
    @o00.e
    @y0(version = "1.1")
    public static void a(@m80.k Throwable th2, @m80.k Throwable exception) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        kotlin.jvm.internal.g0.p(exception, "exception");
        if (th2 != exception) {
            o00.n.f75505a.a(th2, exception);
        }
    }

    @m80.k
    public static final StackTraceElement[] b(@m80.k Throwable th2) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        kotlin.jvm.internal.g0.m(stackTrace);
        return stackTrace;
    }

    @m80.k
    public static final List<Throwable> d(@m80.k Throwable th2) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        return o00.n.f75505a.d(th2);
    }

    @o00.f
    public static final void f(Throwable th2) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        th2.printStackTrace();
    }

    @o00.f
    public static final void g(Throwable th2, PrintStream stream) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        th2.printStackTrace(stream);
    }

    @o00.f
    public static final void h(Throwable th2, PrintWriter writer) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        kotlin.jvm.internal.g0.p(writer, "writer");
        th2.printStackTrace(writer);
    }

    @y0(version = "1.4")
    @m80.k
    public static String i(@m80.k Throwable th2) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.g0.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static /* synthetic */ void c(Throwable th2) {
    }

    @y0(version = "1.4")
    public static /* synthetic */ void e(Throwable th2) {
    }
}
