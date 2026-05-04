package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(@Nullable Throwable th2) {
        super(th2);
    }

    public SubtitleDecoderException(String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
