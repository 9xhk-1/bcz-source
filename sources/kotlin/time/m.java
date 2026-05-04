package kotlin.time;

import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {w30.h.class})
/* loaded from: classes8.dex */
public interface m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static boolean a(@m80.k m mVar) {
            return e.P(mVar.a());
        }

        public static boolean b(@m80.k m mVar) {
            return !e.P(mVar.a());
        }

        @m80.k
        public static m c(@m80.k m mVar, long j11) {
            return mVar.h(e.j0(j11));
        }

        @m80.k
        public static m d(@m80.k m mVar, long j11) {
            return new c(mVar, j11, null);
        }
    }

    long a();

    boolean b();

    boolean c();

    @m80.k
    m h(long j11);

    @m80.k
    m j(long j11);
}
