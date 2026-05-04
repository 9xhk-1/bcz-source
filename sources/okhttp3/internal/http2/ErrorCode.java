package okhttp3.internal.http2;

import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    @k
    public static final a Companion = new a(null);
    private final int httpCode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final ErrorCode a(int i11) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.getHttpCode() == i11) {
                    return errorCode;
                }
            }
            return null;
        }

        public a() {
        }
    }

    ErrorCode(int i11) {
        this.httpCode = i11;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
