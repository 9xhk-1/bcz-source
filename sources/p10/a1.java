package p10;

import e30.u1;
import java.util.Collection;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f78552a = new a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p10.a1
        @m80.k
        public Collection<e30.r0> a(@m80.k u1 currentTypeConstructor, @m80.k Collection<? extends e30.r0> superTypes, @m80.k x00.l<? super u1, ? extends Iterable<? extends e30.r0>> neighbors, @m80.k x00.l<? super e30.r0, g2> reportLoop) {
            kotlin.jvm.internal.g0.p(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.g0.p(superTypes, "superTypes");
            kotlin.jvm.internal.g0.p(neighbors, "neighbors");
            kotlin.jvm.internal.g0.p(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @m80.k
    Collection<e30.r0> a(@m80.k u1 u1Var, @m80.k Collection<? extends e30.r0> collection, @m80.k x00.l<? super u1, ? extends Iterable<? extends e30.r0>> lVar, @m80.k x00.l<? super e30.r0, g2> lVar2);
}
