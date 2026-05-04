package androidx.media3.extractor.metadata;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MetadataInputBuffer extends DecoderInputBuffer {
    public long subsampleOffsetUs;

    public MetadataInputBuffer() {
        super(1);
    }
}
