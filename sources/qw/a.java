package qw;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTimeoutExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutExceptions.kt\nio/ktor/client/network/sockets/TimeoutExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final SocketTimeoutException a(@k String message, @l Throwable th2) {
        g0.p(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(th2);
        return socketTimeoutException;
    }

    public static /* synthetic */ SocketTimeoutException b(String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return a(str, th2);
    }
}
