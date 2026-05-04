package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class CompositeTestSource implements TestSource {
    private static final long serialVersionUID = 1;
    private final List<TestSource> sources;

    private CompositeTestSource(Collection<? extends TestSource> sources) {
        c2.m(sources, "TestSource collection must not be null or empty");
        c2.g(sources, "individual TestSources must not be null");
        this.sources = Collections.unmodifiableList(new ArrayList(sources));
    }

    public static CompositeTestSource from(Collection<? extends TestSource> sources) {
        return new CompositeTestSource(sources);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.sources.equals(((CompositeTestSource) obj).sources);
    }

    public final List<TestSource> getSources() {
        return this.sources;
    }

    public int hashCode() {
        return this.sources.hashCode();
    }

    public String toString() {
        return new g4(this).a("sources", this.sources).toString();
    }
}
