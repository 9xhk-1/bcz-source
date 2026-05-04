package f90;

import ba0.h4;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.jupiter.api.t2;
import org.junit.jupiter.params.provider.CsvParsingException;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n extends b<f0> {

    /* renamed from: d, reason: collision with root package name */
    public static final String f51390d = "\n";

    /* renamed from: b, reason: collision with root package name */
    public Set<String> f51391b;

    /* renamed from: c, reason: collision with root package name */
    public s90.d f51392c;

    public static /* synthetic */ String[] f(int i11) {
        return new String[i11];
    }

    public static /* synthetic */ String g() {
        return "@CsvSource must be declared with either `value` or `textBlock` but not both";
    }

    public static /* synthetic */ String h(AtomicInteger atomicInteger, String str) {
        return "Record at index " + atomicInteger + " contains invalid CSV: \"" + str + "\"";
    }

    public static /* synthetic */ String i(AtomicInteger atomicInteger, String str) {
        return "Record at index " + atomicInteger + " contains invalid CSV: \"\"\"\n" + str + "\n\"\"\"";
    }

    public static String[] j(s90.d csvParser) {
        return (String[]) Arrays.stream(csvParser.m().t()).map(new org.junit.jupiter.api.t1()).toArray(new IntFunction() { // from class: f90.k
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return n.f(i11);
            }
        });
    }

    public static RuntimeException k(Throwable throwable, Annotation annotation) {
        h4.a(throwable);
        if (throwable instanceof PreconditionViolationException) {
            throw ((PreconditionViolationException) throwable);
        }
        throw new CsvParsingException("Failed to parse CSV input configured via " + annotation, throwable);
    }

    public static d n(final Object[] csvRecord, Set<String> nullValues, boolean useHeadersInDisplayName, final String[] headers) {
        if (nullValues.isEmpty() && !useHeadersInDisplayName) {
            return d.of(csvRecord);
        }
        ba0.c2.f(!useHeadersInDisplayName || csvRecord.length <= headers.length, new Supplier() { // from class: f90.i
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The number of columns (%d) exceeds the number of supplied headers (%d) in CSV record: %s", Integer.valueOf(r0.length), Integer.valueOf(headers.length), Arrays.toString(csvRecord));
                return format;
            }
        });
        Object[] objArr = new Object[csvRecord.length];
        for (int i11 = 0; i11 < csvRecord.length; i11++) {
            Object obj = csvRecord[i11];
            if (nullValues.contains(obj)) {
                obj = null;
            }
            if (useHeadersInDisplayName) {
                obj = t2.b(headers[i11] + " = " + obj, obj);
            }
            objArr[i11] = obj;
        }
        return d.of(objArr);
    }

    public final Stream<d> l(f0 csvSource) {
        final String textBlock = csvSource.textBlock();
        boolean useHeadersInDisplayName = csvSource.useHeadersInDisplayName();
        ArrayList arrayList = new ArrayList();
        try {
            List<String[]> h02 = this.f51392c.h0(new StringReader(textBlock));
            String[] j11 = useHeadersInDisplayName ? j(this.f51392c) : null;
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            for (String[] strArr : h02) {
                atomicInteger.incrementAndGet();
                ba0.c2.s(strArr, new Supplier() { // from class: f90.j
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return n.i(atomicInteger, textBlock);
                    }
                });
                arrayList.add(n(strArr, this.f51391b, useHeadersInDisplayName, j11));
            }
            return arrayList.stream();
        } catch (Throwable th2) {
            throw k(th2, csvSource);
        }
    }

    public final Stream<d> m(f0 csvSource) {
        boolean useHeadersInDisplayName = csvSource.useHeadersInDisplayName();
        ArrayList arrayList = new ArrayList();
        try {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            String[] strArr = null;
            for (final String str : csvSource.value()) {
                atomicInteger.incrementAndGet();
                String[] z02 = this.f51392c.z0(str + "\n");
                if (useHeadersInDisplayName && strArr == null) {
                    strArr = j(this.f51392c);
                } else {
                    ba0.c2.s(z02, new Supplier() { // from class: f90.m
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return n.h(atomicInteger, str);
                        }
                    });
                    arrayList.add(n(z02, this.f51391b, useHeadersInDisplayName, strArr));
                }
            }
            return arrayList.stream();
        } catch (Throwable th2) {
            throw k(th2, csvSource);
        }
    }

    @Override // f90.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Stream<? extends d> d(p80.n context, f0 csvSource) {
        this.f51391b = ba0.n1.h(csvSource.nullValues());
        this.f51392c = e0.e(csvSource);
        boolean isEmpty = csvSource.textBlock().isEmpty();
        ba0.c2.f((!isEmpty) ^ (csvSource.value().length > 0), new Supplier() { // from class: f90.l
            @Override // java.util.function.Supplier
            public final Object get() {
                return n.g();
            }
        });
        return !isEmpty ? l(csvSource) : m(csvSource);
    }
}
