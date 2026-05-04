package org.junit.platform.engine;

import ba0.c2;
import ba0.e4;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public final class TestTag implements Serializable {
    public static final Set<String> RESERVED_CHARACTERS = Collections.unmodifiableSet(new HashSet(Arrays.asList(",", j.f81006c, j.f81007d, "&", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "!")));
    private static final long serialVersionUID = 1;
    private final String name;

    private TestTag(final String name) {
        c2.f(isValid(name), new Supplier() { // from class: ca0.d0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Tag name [%s] must be syntactically valid", name);
                return format;
            }
        });
        this.name = name.trim();
    }

    public static TestTag create(String name) throws PreconditionViolationException {
        return new TestTag(name);
    }

    private static boolean doesNotContainReservedCharacter(final String str) {
        Stream<String> stream = RESERVED_CHARACTERS.stream();
        Objects.requireNonNull(str);
        return stream.noneMatch(new Predicate() { // from class: ca0.e0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.contains((String) obj);
            }
        });
    }

    public static boolean isValid(String name) {
        if (name == null) {
            return false;
        }
        String trim = name.trim();
        return !trim.isEmpty() && e4.f(trim) && e4.e(trim) && doesNotContainReservedCharacter(trim);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TestTag) {
            return Objects.equals(this.name, ((TestTag) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
