package f30;

import e30.r0;
import e30.u1;
import java.util.Collection;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class g extends e30.q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f50432a = new a();

        @Override // f30.g
        @m80.l
        public p10.b b(@m80.k n20.b classId) {
            g0.p(classId, "classId");
            return null;
        }

        @Override // f30.g
        @m80.k
        public <S extends x20.k> S c(@m80.k p10.b classDescriptor, @m80.k x00.a<? extends S> compute) {
            g0.p(classDescriptor, "classDescriptor");
            g0.p(compute, "compute");
            return compute.invoke();
        }

        @Override // f30.g
        public boolean d(@m80.k p10.a0 moduleDescriptor) {
            g0.p(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // f30.g
        public boolean e(@m80.k u1 typeConstructor) {
            g0.p(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // f30.g
        @m80.k
        public Collection<r0> g(@m80.k p10.b classDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            Collection<r0> c11 = classDescriptor.o().c();
            g0.o(c11, "getSupertypes(...)");
            return c11;
        }

        @Override // e30.q
        @m80.k
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public r0 a(@m80.k i30.g type) {
            g0.p(type, "type");
            return (r0) type;
        }

        @Override // f30.g
        @m80.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public p10.b f(@m80.k p10.h descriptor) {
            g0.p(descriptor, "descriptor");
            return null;
        }
    }

    @m80.l
    public abstract p10.b b(@m80.k n20.b bVar);

    @m80.k
    public abstract <S extends x20.k> S c(@m80.k p10.b bVar, @m80.k x00.a<? extends S> aVar);

    public abstract boolean d(@m80.k p10.a0 a0Var);

    public abstract boolean e(@m80.k u1 u1Var);

    @m80.l
    public abstract p10.d f(@m80.k p10.h hVar);

    @m80.k
    public abstract Collection<r0> g(@m80.k p10.b bVar);

    @m80.k
    /* renamed from: h */
    public abstract r0 a(@m80.k i30.g gVar);
}
