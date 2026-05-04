package r10;

import a00.h0;
import e30.r0;
import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import m80.k;
import n20.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r10.a$a, reason: collision with other inner class name */
    public static final class C1026a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1026a f82855a = new C1026a();

        @Override // r10.a
        @k
        public Collection<g> a(@k f name, @k p10.b classDescriptor) {
            g0.p(name, "name");
            g0.p(classDescriptor, "classDescriptor");
            return h0.J();
        }

        @Override // r10.a
        @k
        public Collection<f> b(@k p10.b classDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            return h0.J();
        }

        @Override // r10.a
        @k
        public Collection<r0> d(@k p10.b classDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            return h0.J();
        }

        @Override // r10.a
        @k
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e(@k p10.b classDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            return h0.J();
        }
    }

    @k
    Collection<g> a(@k f fVar, @k p10.b bVar);

    @k
    Collection<f> b(@k p10.b bVar);

    @k
    Collection<r0> d(@k p10.b bVar);

    @k
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e(@k p10.b bVar);
}
