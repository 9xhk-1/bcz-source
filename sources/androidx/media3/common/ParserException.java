package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@Nullable String str, @Nullable Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.contentIsMalformed = z11;
        this.dataType = i11;
    }

    public static ParserException createForMalformedContainer(@Nullable String str, @Nullable Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(@Nullable String str, @Nullable Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException createForMalformedManifest(@Nullable String str, @Nullable Throwable th2) {
        return new ParserException(str, th2, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(@Nullable String str, @Nullable Throwable th2) {
        return new ParserException(str, th2, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(@Nullable String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.contentIsMalformed);
        sb2.append(", dataType=");
        sb2.append(this.dataType);
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }
}
