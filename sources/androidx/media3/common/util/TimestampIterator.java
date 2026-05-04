package androidx.media3.common.util;

import androidx.media3.common.C;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface TimestampIterator {
    TimestampIterator copyOf();

    default long getLastTimestampUs() {
        return C.TIME_UNSET;
    }

    boolean hasNext();

    long next();
}
