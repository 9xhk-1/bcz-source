package x20;

import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nResolutionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionScope.kt\norg/jetbrains/kotlin/resolve/scopes/ResolutionScope$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(n nVar, d dVar, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i11 & 1) != 0) {
                dVar = d.f97090o;
            }
            if ((i11 & 2) != 0) {
                lVar = k.f97116a.c();
            }
            return nVar.f(dVar, lVar);
        }

        public static void b(@m80.k n nVar, @m80.k n20.f name, @m80.k x10.b location) {
            g0.p(name, "name");
            g0.p(location, "location");
            nVar.a(name, location);
        }
    }

    @m80.k
    Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> a(@m80.k n20.f fVar, @m80.k x10.b bVar);

    void e(@m80.k n20.f fVar, @m80.k x10.b bVar);

    @m80.k
    Collection<p10.h> f(@m80.k d dVar, @m80.k x00.l<? super n20.f, Boolean> lVar);

    @m80.l
    p10.d h(@m80.k n20.f fVar, @m80.k x10.b bVar);
}
