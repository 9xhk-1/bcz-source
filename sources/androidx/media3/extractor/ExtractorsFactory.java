package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: androidx.media3.extractor.c
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return ExtractorsFactory.a();
        }
    };

    static /* synthetic */ Extractor[] a() {
        return new Extractor[0];
    }

    Extractor[] createExtractors();

    default Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }

    @uo.a
    default ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i11) {
        return this;
    }

    @Deprecated
    @uo.a
    default ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z11) {
        return this;
    }

    default ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }
}
