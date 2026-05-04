package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface Decoder<I, O, E extends DecoderException> {
    @Nullable
    I dequeueInputBuffer() throws DecoderException;

    @Nullable
    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    String getName();

    void queueInputBuffer(I i11) throws DecoderException;

    void release();

    void setOutputStartTimeUs(long j11);
}
