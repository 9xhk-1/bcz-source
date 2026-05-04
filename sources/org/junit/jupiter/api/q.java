package org.junit.jupiter.api;

import java.util.ArrayDeque;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f77985a = 21;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f77986a;

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f77987b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f77988c;

        public a(List<String> expectedLines, List<String> actualLines, Object messageOrSupplier) {
            this.f77986a = expectedLines;
            this.f77987b = actualLines;
            this.f77988c = messageOrSupplier;
        }

        public void b() {
            int size = this.f77986a.size();
            int size2 = this.f77987b.size();
            if (size > size2) {
                d("expected %d lines, but only got %d", Integer.valueOf(size), Integer.valueOf(size2));
            }
            if (size == size2 && IntStream.range(0, size).allMatch(new IntPredicate() { // from class: org.junit.jupiter.api.p
                @Override // java.util.function.IntPredicate
                public final boolean test(int i11) {
                    boolean i12;
                    i12 = q.i(r0.f77986a.get(i11), q.a.this.f77987b.get(i11));
                    return i12;
                }
            })) {
                return;
            }
            c();
        }

        public void c() {
            ArrayDeque arrayDeque = new ArrayDeque(this.f77986a);
            ArrayDeque arrayDeque2 = new ArrayDeque(this.f77987b);
            while (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.pop();
                int size = this.f77986a.size() - arrayDeque.size();
                if (arrayDeque2.isEmpty()) {
                    d("expected line #%d:`%s` not found - actual lines depleted", Integer.valueOf(size), e(str));
                }
                String str2 = (String) arrayDeque2.peek();
                if (q.i(str, str2)) {
                    arrayDeque2.pop();
                } else if (q.h(str)) {
                    int j11 = q.j(str);
                    int size2 = arrayDeque2.size();
                    if (arrayDeque.isEmpty()) {
                        if (j11 == Integer.MAX_VALUE || j11 == size2) {
                            return;
                        } else {
                            d("terminal fast-forward(%d) error: fast-forward(%d) expected", Integer.valueOf(j11), Integer.valueOf(size2));
                        }
                    }
                    if (j11 != Integer.MAX_VALUE) {
                        if (size2 < j11) {
                            d("fast-forward(%d) error: not enough actual lines remaining (%s)", Integer.valueOf(j11), Integer.valueOf(size2));
                        }
                        for (int i11 = 0; i11 < j11; i11++) {
                            arrayDeque2.pop();
                        }
                    } else {
                        String str3 = (String) arrayDeque.peek();
                        while (true) {
                            if (arrayDeque2.isEmpty()) {
                                d("fast-forward(∞) didn't find: `%s`", e(str3));
                            }
                            if (q.i(str3, (String) arrayDeque2.peek())) {
                                break;
                            } else {
                                arrayDeque2.pop();
                            }
                        }
                    }
                } else {
                    d("expected line #%d doesn't match actual line #%d%n\texpected: `%s`%n\t  actual: `%s`", Integer.valueOf(size), Integer.valueOf((this.f77987b.size() - arrayDeque2.size()) + 1), str, str2);
                }
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            d("more actual lines than expected: %d", Integer.valueOf(arrayDeque2.size()));
        }

        public void d(String format, Object... args) {
            String lineSeparator = System.lineSeparator();
            j0.b().l(this.f77988c).n(String.format(format, args)).g(androidx.camera.core.impl.u.a(lineSeparator, this.f77986a)).a(androidx.camera.core.impl.u.a(lineSeparator, this.f77987b)).k(false).d();
        }

        public String e(String line) {
            if (line.length() <= 21) {
                return line;
            }
            return line.substring(0, 16) + "[...]";
        }
    }

    public static void b(List<String> expectedLines, List<String> actualLines) {
        c(expectedLines, actualLines, null);
    }

    public static void c(List<String> expectedLines, List<String> actualLines, Object messageOrSupplier) {
        ba0.c2.r(expectedLines, "expectedLines must not be null");
        ba0.c2.r(actualLines, "actualLines must not be null");
        if (expectedLines == actualLines) {
            return;
        }
        new a(expectedLines, actualLines, messageOrSupplier).b();
    }

    public static void d(List<String> expectedLines, List<String> actualLines, String message) {
        c(expectedLines, actualLines, message);
    }

    public static void e(Stream<String> expectedLines, Stream<String> actualLines) {
        f(expectedLines, actualLines, null);
    }

    public static void f(Stream<String> expectedLines, Stream<String> actualLines, Object messageOrSupplier) {
        ba0.c2.r(expectedLines, "expectedLines must not be null");
        ba0.c2.r(actualLines, "actualLines must not be null");
        if (expectedLines == actualLines) {
            return;
        }
        c((List) expectedLines.collect(Collectors.toList()), (List) actualLines.collect(Collectors.toList()), messageOrSupplier);
    }

    public static void g(Stream<String> expectedLines, Stream<String> actualLines, String message) {
        f(expectedLines, actualLines, message);
    }

    public static boolean h(String line) {
        String trim = line.trim();
        return trim.length() >= 4 && trim.startsWith(">>") && trim.endsWith(">>");
    }

    public static boolean i(String expectedLine, String actualLine) {
        ba0.c2.r(expectedLine, "expected line must not be null");
        ba0.c2.r(actualLine, "actual line must not be null");
        if (expectedLine.equals(actualLine)) {
            return true;
        }
        try {
            return actualLine.matches(expectedLine);
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int j(String fastForwardLine) {
        String trim = fastForwardLine.trim();
        try {
            final int parseInt = Integer.parseInt(trim.substring(2, trim.length() - 2).trim());
            ba0.c2.f(parseInt > 0, new Supplier() { // from class: org.junit.jupiter.api.o
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("fast-forward(%d) limit must be greater than zero", Integer.valueOf(parseInt));
                    return format;
                }
            });
            return parseInt;
        } catch (NumberFormatException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
