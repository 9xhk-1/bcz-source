package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;
    private static final int MAX_MANUAL_REDIRECTS = 5;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(@Nullable Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static byte[] executePost(DataSource dataSource, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        StatsDataSource statsDataSource = new StatsDataSource(dataSource);
        DataSpec build = new DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i11 = 0;
        DataSpec dataSpec = build;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpec);
                try {
                    byte[] u11 = po.g.u(dataSourceInputStream);
                    Util.closeQuietly(dataSourceInputStream);
                    return u11;
                } catch (HttpDataSource.InvalidResponseCodeException e11) {
                    try {
                        String redirectUrl = getRedirectUrl(e11, i11);
                        if (redirectUrl == null) {
                            throw e11;
                        }
                        i11++;
                        dataSpec = dataSpec.buildUpon().setUri(redirectUrl).build();
                        Util.closeQuietly(dataSourceInputStream);
                    } catch (Throwable th2) {
                        Util.closeQuietly(dataSourceInputStream);
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                throw new MediaDrmCallbackException(build, statsDataSource.getLastOpenedUri(), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e12);
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th2, int i11) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (Util.SDK_INT >= 23 && Api23.isMediaDrmResetException(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th2 instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th2 instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i11 == 1) {
            return 6006;
        }
        if (i11 == 2) {
            return 6004;
        }
        if (i11 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i11) {
        Map<String, List<String>> map;
        List<String> list;
        int i12 = invalidResponseCodeException.responseCode;
        if ((i12 != 307 && i12 != 308) || i11 >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(@Nullable Throwable th2) {
        return Util.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(@Nullable Throwable th2) {
        return Util.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
