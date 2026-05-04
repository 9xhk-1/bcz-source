package y50;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.w0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final String b(long j11) {
        String str;
        if (j11 <= -999500000) {
            str = ((j11 - 500000000) / 1000000000) + " s ";
        } else if (j11 <= -999500) {
            str = ((j11 - ch.a.f8619c) / 1000000) + " ms";
        } else if (j11 <= 0) {
            str = ((j11 - 500) / 1000) + " µs";
        } else if (j11 < 999500) {
            str = ((j11 + 500) / 1000) + " µs";
        } else if (j11 < 999500000) {
            str = ((j11 + ch.a.f8619c) / 1000000) + " ms";
        } else {
            str = ((j11 + 500000000) / 1000000000) + " s ";
        }
        w0 w0Var = w0.f67050a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        g0.o(format, "format(format, *args)");
        return format;
    }

    public static final void c(a aVar, c cVar, String str) {
        Logger a11 = d.f99390h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        w0 w0Var = w0.f67050a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        g0.o(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a11.fine(sb2.toString());
    }

    public static final <T> T d(@k a task, @k c queue, @k x00.a<? extends T> block) {
        long j11;
        g0.p(task, "task");
        g0.p(queue, "queue");
        g0.p(block, "block");
        boolean isLoggable = d.f99390h.a().isLoggable(Level.FINE);
        if (isLoggable) {
            j11 = queue.k().h().nanoTime();
            c(task, queue, "starting");
        } else {
            j11 = -1;
        }
        try {
            T invoke = block.invoke();
            d0.d(1);
            if (isLoggable) {
                c(task, queue, "finished run in " + b(queue.k().h().nanoTime() - j11));
            }
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            if (isLoggable) {
                c(task, queue, "failed a run in " + b(queue.k().h().nanoTime() - j11));
            }
            d0.c(1);
            throw th2;
        }
    }

    public static final void e(@k a task, @k c queue, @k x00.a<String> messageBlock) {
        g0.p(task, "task");
        g0.p(queue, "queue");
        g0.p(messageBlock, "messageBlock");
        if (d.f99390h.a().isLoggable(Level.FINE)) {
            c(task, queue, messageBlock.invoke());
        }
    }
}
