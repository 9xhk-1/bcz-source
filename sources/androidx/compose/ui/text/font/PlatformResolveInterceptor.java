package androidx.compose.ui.text.font;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PlatformResolveInterceptor {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        private Companion() {
        }

        @k
        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }

    @l
    default FontFamily interceptFontFamily(@l FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    default int m4695interceptFontStyleT2F_aPo(int i11) {
        return i11;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    default int m4696interceptFontSynthesisMscr08Y(int i11) {
        return i11;
    }

    @k
    default FontWeight interceptFontWeight(@k FontWeight fontWeight) {
        return fontWeight;
    }
}
