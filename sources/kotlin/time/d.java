package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.time.m;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {w30.h.class})
/* loaded from: classes8.dex */
public interface d extends m, Comparable<d> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static int a(@m80.k d dVar, @m80.k d other) {
            g0.p(other, "other");
            return e.i(dVar.n(other), e.f67757b.T());
        }

        public static boolean b(@m80.k d dVar) {
            return m.a.a(dVar);
        }

        public static boolean c(@m80.k d dVar) {
            return m.a.b(dVar);
        }

        @m80.k
        public static d d(@m80.k d dVar, long j11) {
            return dVar.h(e.j0(j11));
        }
    }

    /* renamed from: b0 */
    int compareTo(@m80.k d dVar);

    boolean equals(@m80.l Object obj);

    @Override // kotlin.time.m
    @m80.k
    d h(long j11);

    int hashCode();

    @Override // kotlin.time.m
    @m80.k
    d j(long j11);

    long n(@m80.k d dVar);
}
