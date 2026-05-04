package kw;

import android.util.Log;
import io.github.aakira.napier.Napier;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends kw.a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f68895c = 4000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f68896d = 23;

    /* renamed from: e, reason: collision with root package name */
    public static final int f68897e = 9;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f68898f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f68899a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68900b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(v vVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kw.a
    public void c(@k Napier.Level priority, @l String str, @l Throwable th2, @l String str2) {
        int min;
        g0.p(priority, "priority");
        if (str == null) {
            str = g(this.f68900b);
        }
        if (str2 != null) {
            if (th2 != null) {
                str2 = str2 + '\n' + f(th2);
            }
        } else if (th2 == null || (str2 = f(th2)) == null) {
            return;
        }
        String str3 = str2;
        int length = str3.length();
        if (length <= 4000) {
            if (priority == Napier.Level.ASSERT) {
                Log.wtf(str, str3);
                return;
            } else {
                Log.println(h(priority), str, str3);
                return;
            }
        }
        int i11 = 0;
        while (i11 < length) {
            int I3 = k0.I3(str3, '\n', i11, false, 4, null);
            if (I3 == -1) {
                I3 = length;
            }
            while (true) {
                min = Math.min(I3, i11 + 4000);
                String substring = str3.substring(i11, min);
                g0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (h(priority) == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(h(priority), str, substring);
                }
                if (min >= I3) {
                    break;
                } else {
                    i11 = min;
                }
            }
            i11 = min + 1;
        }
    }

    @k
    public final String e(@k String className) {
        g0.p(className, "className");
        Matcher matcher = this.f68899a.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
            g0.o(className, "m.replaceAll(\"\")");
        }
        String str = className;
        int X3 = k0.X3(str, '.', 0, false, 6, null) + 1;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(X3);
        g0.o(substring, "(this as java.lang.String).substring(startIndex)");
        substring.length();
        return substring;
    }

    public final String f(Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        g0.o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public final String g(String str) {
        Thread currentThread = Thread.currentThread();
        g0.o(currentThread, "Thread.currentThread()");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        if (stackTrace == null || stackTrace.length < 9) {
            return str;
        }
        StackTraceElement stackTraceElement = stackTrace[9];
        StringBuilder sb2 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        g0.o(className, "className");
        sb2.append(e(className));
        sb2.append('$');
        sb2.append(stackTraceElement.getMethodName());
        return sb2.toString();
    }

    public final int h(Napier.Level level) {
        switch (d.f68901a[level.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public c(@k String defaultTag) {
        g0.p(defaultTag, "defaultTag");
        this.f68900b = defaultTag;
        this.f68899a = Pattern.compile("(\\$\\d+)+$");
    }

    public /* synthetic */ c(String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? "app" : str);
    }
}
