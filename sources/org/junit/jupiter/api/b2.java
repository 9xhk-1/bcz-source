package org.junit.jupiter.api;

import java.net.URI;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.3", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public class b2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final Stream<? extends c2> f77937c;

    public b2(String displayName, URI testSourceUri, Stream<? extends c2> children) {
        super(displayName, testSourceUri);
        ba0.c2.r(children, "children must not be null");
        this.f77937c = children;
    }

    public static b2 c(String displayName, Iterable<? extends c2> dynamicNodes) {
        return d(displayName, null, StreamSupport.stream(dynamicNodes.spliterator(), false));
    }

    public static b2 d(String displayName, URI testSourceUri, Stream<? extends c2> dynamicNodes) {
        return new b2(displayName, testSourceUri, dynamicNodes);
    }

    public static b2 e(String displayName, Stream<? extends c2> dynamicNodes) {
        return d(displayName, null, dynamicNodes);
    }

    public Stream<? extends c2> f() {
        return this.f77937c;
    }
}
