package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public interface Font {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    public interface ResourceLoader {
        @n(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @w0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @k
        Object load(@k Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo4615getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m4662getBlockingPKNRLFQ();
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo4623getStyle_LCdwA();

    @k
    FontWeight getWeight();
}
