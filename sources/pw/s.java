package pw;

import io.ktor.websocket.CloseReason;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final CloseReason f81289a = new CloseReason(CloseReason.Codes.INTERNAL_ERROR, "Client failure");

    public static final boolean c(CloseReason closeReason) {
        CloseReason.Codes a11 = CloseReason.Codes.Companion.a(closeReason.e());
        return a11 == null || a11 == CloseReason.Codes.CLOSED_ABNORMALLY;
    }
}
