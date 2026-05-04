package h5;

import com.baicizhan.app.biz.game.model.SentenceLanguageType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i0 {
    @m80.k
    public static final SentenceLanguageType a(int i11) {
        if (i11 == 1) {
            return SentenceLanguageType.Jp;
        }
        if (i11 == 2) {
            return SentenceLanguageType.En;
        }
        if (i11 == 3) {
            return SentenceLanguageType.Kr;
        }
        if (i11 == 4) {
            return SentenceLanguageType.Fr;
        }
        if (i11 == 5) {
            return SentenceLanguageType.Es;
        }
        SentenceLanguageType sentenceLanguageType = SentenceLanguageType.Unknown;
        z6.b.f(z6.b.f101032b, "LanguageType", "error type " + i11, null, 4, null);
        return sentenceLanguageType;
    }
}
