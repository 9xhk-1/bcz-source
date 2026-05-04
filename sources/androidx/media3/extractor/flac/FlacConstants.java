package androidx.media3.extractor.flac;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FlacConstants {
    public static final int MAX_FRAME_HEADER_SIZE = 16;
    public static final int METADATA_BLOCK_HEADER_SIZE = 4;
    public static final int METADATA_TYPE_PICTURE = 6;
    public static final int METADATA_TYPE_SEEK_TABLE = 3;
    public static final int METADATA_TYPE_STREAM_INFO = 0;
    public static final int METADATA_TYPE_VORBIS_COMMENT = 4;
    public static final int MIN_FRAME_HEADER_SIZE = 6;
    public static final int STREAM_INFO_BLOCK_SIZE = 38;
    public static final int STREAM_MARKER_SIZE = 4;

    private FlacConstants() {
    }
}
