package ba0;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6586a = "org.junit.platform.launcher.";

    /* renamed from: b, reason: collision with root package name */
    public static final Predicate<String> f6587b = w.j("org.junit.*,jdk.internal.reflect.*,sun.reflect.*");

    @API(since = "1.10", status = API.Status.INTERNAL)
    public static List<Throwable> a(Throwable rootThrowable) {
        c2.r(rootThrowable, "Throwable must not be null");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(rootThrowable);
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            if (linkedHashSet.add(th2)) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    arrayDeque.add(cause);
                }
                arrayDeque.addAll(Arrays.asList(th2.getSuppressed()));
            }
        }
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    @API(since = "1.10", status = API.Status.INTERNAL)
    public static void b(Throwable throwable, List<String> classNames) {
        c2.r(throwable, "Throwable must not be null");
        c2.r(classNames, "List of class names must not be null");
        List asList = Arrays.asList(throwable.getStackTrace());
        ArrayList arrayList = new ArrayList();
        Collections.reverse(asList);
        int i11 = 0;
        while (true) {
            if (i11 >= asList.size()) {
                break;
            }
            StackTraceElement stackTraceElement = (StackTraceElement) asList.get(i11);
            String className = stackTraceElement.getClassName();
            if (classNames.contains(className)) {
                arrayList.addAll(asList.subList(i11, asList.size()));
                break;
            }
            if (className.startsWith(f6586a)) {
                arrayList.clear();
            } else if (f6587b.test(className)) {
                arrayList.add(stackTraceElement);
            }
            i11++;
        }
        Collections.reverse(arrayList);
        throwable.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }

    public static String c(Throwable throwable) {
        c2.r(throwable, "Throwable must not be null");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            throwable.printStackTrace(printWriter);
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th2) {
            try {
                printWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static RuntimeException e(Throwable t11) {
        c2.r(t11, "Throwable must not be null");
        return (RuntimeException) d(t11);
    }

    public static <T extends Throwable> T d(Throwable t11) throws Throwable {
        throw t11;
    }
}
