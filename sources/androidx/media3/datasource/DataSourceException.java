package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DataSourceException extends IOException {

    @UnstableApi
    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    @UnstableApi
    public DataSourceException(int i11) {
        this.reason = i11;
    }

    @UnstableApi
    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof DataSourceException) && ((DataSourceException) iOException2).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public DataSourceException(@Nullable Throwable th2, int i11) {
        super(th2);
        this.reason = i11;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, int i11) {
        super(str);
        this.reason = i11;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, @Nullable Throwable th2, int i11) {
        super(str, th2);
        this.reason = i11;
    }
}
