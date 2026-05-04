package s10;

import e30.d2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class z implements p10.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f87371a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final x20.k a(@m80.k p10.b bVar, @m80.k d2 typeSubstitution, @m80.k f30.g kotlinTypeRefiner) {
            x20.k C;
            kotlin.jvm.internal.g0.p(bVar, "<this>");
            kotlin.jvm.internal.g0.p(typeSubstitution, "typeSubstitution");
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = bVar instanceof z ? (z) bVar : null;
            if (zVar != null && (C = zVar.C(typeSubstitution, kotlinTypeRefiner)) != null) {
                return C;
            }
            x20.k K = bVar.K(typeSubstitution);
            kotlin.jvm.internal.g0.o(K, "getMemberScope(...)");
            return K;
        }

        @m80.k
        public final x20.k b(@m80.k p10.b bVar, @m80.k f30.g kotlinTypeRefiner) {
            x20.k V;
            kotlin.jvm.internal.g0.p(bVar, "<this>");
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = bVar instanceof z ? (z) bVar : null;
            if (zVar != null && (V = zVar.V(kotlinTypeRefiner)) != null) {
                return V;
            }
            x20.k J = bVar.J();
            kotlin.jvm.internal.g0.o(J, "getUnsubstitutedMemberScope(...)");
            return J;
        }

        public a() {
        }
    }

    @m80.k
    public abstract x20.k C(@m80.k d2 d2Var, @m80.k f30.g gVar);

    @m80.k
    public abstract x20.k V(@m80.k f30.g gVar);

    @Override // p10.b, p10.h
    @m80.k
    public /* bridge */ /* synthetic */ p10.d a() {
        return a();
    }

    @Override // p10.h
    @m80.k
    public /* bridge */ /* synthetic */ p10.h a() {
        return a();
    }
}
