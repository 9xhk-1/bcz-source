package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {

    @UnstableApi
    public static final int TYPE_REMOTE = 3;

    @UnstableApi
    public static final int TYPE_RENDERER = 1;

    @UnstableApi
    public static final int TYPE_SOURCE = 0;

    @UnstableApi
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;

    @Nullable
    @UnstableApi
    public final MediaSource.MediaPeriodId mediaPeriodId;

    @Nullable
    @UnstableApi
    public final Format rendererFormat;

    @UnstableApi
    public final int rendererFormatSupport;

    @UnstableApi
    public final int rendererIndex;

    @Nullable
    @UnstableApi
    public final String rendererName;

    @UnstableApi
    public final int type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface Type {
    }

    private ExoPlaybackException(int i11, Throwable th2, int i12) {
        this(i11, th2, null, i12, null, -1, null, 4, false);
    }

    @UnstableApi
    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    @UnstableApi
    public static ExoPlaybackException createForRenderer(Throwable th2, String str, int i11, @Nullable Format format, int i12, boolean z11, int i13) {
        if (format == null) {
            i12 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i13, str, i11, format, i12, z11);
    }

    @UnstableApi
    public static ExoPlaybackException createForSource(IOException iOException, int i11) {
        return new ExoPlaybackException(0, iOException, i11);
    }

    @UnstableApi
    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i11, @Nullable String str, @Nullable String str2, int i12, @Nullable Format format, int i13) {
        String str3;
        if (i11 == 0) {
            str3 = "Source error";
        } else if (i11 != 1) {
            str3 = i11 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i12 + ", format=" + format + ", format_supported=" + Util.getFormatSupportString(i13);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @CheckResult
    public ExoPlaybackException copyWithMediaPeriodId(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    @UnstableApi
    public Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) Assertions.checkNotNull(getCause());
    }

    @UnstableApi
    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(getCause());
    }

    @UnstableApi
    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(getCause());
    }

    private ExoPlaybackException(int i11, @Nullable Throwable th2, @Nullable String str, int i12, @Nullable String str2, int i13, @Nullable Format format, int i14, boolean z11) {
        this(deriveMessage(i11, str, str2, i13, format, i14), th2, i12, i11, str2, i13, format, i14, null, SystemClock.elapsedRealtime(), z11);
    }

    @UnstableApi
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i11) {
        return new ExoPlaybackException(2, runtimeException, i11);
    }

    private ExoPlaybackException(String str, @Nullable Throwable th2, int i11, int i12, @Nullable String str2, int i13, @Nullable Format format, int i14, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j11, boolean z11) {
        super(str, th2, i11, Bundle.EMPTY, j11);
        Assertions.checkArgument(!z11 || i12 == 1);
        Assertions.checkArgument(th2 != null || i12 == 3);
        this.type = i12;
        this.rendererName = str2;
        this.rendererIndex = i13;
        this.rendererFormat = format;
        this.rendererFormatSupport = i14;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z11;
    }
}
