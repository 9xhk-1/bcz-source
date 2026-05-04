package androidx.media3.exoplayer.drm;

import android.os.Build;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final UUID uuid;

    static {
        boolean z11;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
                WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z11;
            }
        }
        z11 = false;
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z11;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z11) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z11;
    }
}
