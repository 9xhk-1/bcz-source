package io.ktor.websocket;

import c40.x0;
import io.ktor.websocket.j0;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a extends j0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.websocket.a$a, reason: collision with other inner class name */
    public static final class C0726a {
        @m80.l
        public static Object a(@m80.k a aVar, @m80.k d dVar, @m80.k j00.c<? super g2> cVar) {
            Object a11 = j0.a.a(aVar, dVar, cVar);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, List list, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                list = a00.h0.J();
            }
            aVar.N0(list);
        }
    }

    void L0(long j11);

    @io.ktor.utils.io.b0
    void N0(@m80.k List<? extends z<?>> list);

    long a0();

    @m80.k
    x0<CloseReason> h0();

    void k0(long j11);

    long x0();
}
