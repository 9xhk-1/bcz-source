package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {
    private final SubtitleParser subtitleParser;

    public DelegatingSubtitleDecoder(String str, SubtitleParser subtitleParser) {
        super(str);
        this.subtitleParser = subtitleParser;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i11, boolean z11) {
        if (z11) {
            this.subtitleParser.reset();
        }
        return this.subtitleParser.parseToLegacySubtitle(bArr, 0, i11);
    }
}
