package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public static final IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new IncorrectFragmentationSniffFailure(true);
    public static final IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z11) {
        this.fileIsFragmented = z11;
    }
}
