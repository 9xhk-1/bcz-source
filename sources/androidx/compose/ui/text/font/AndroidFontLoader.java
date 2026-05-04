package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import kotlin.Result;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;

    @l
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(@k Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(@m80.k androidx.compose.ui.text.font.Font r6, @m80.k j00.c<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.e.n(r7)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.e.n(r7)
            return r7
        L40:
            kotlin.e.n(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r7 == 0) goto L59
            androidx.compose.ui.text.font.AndroidFont r6 = (androidx.compose.ui.text.font.AndroidFont) r6
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.context
            r0.label = r4
            java.lang.Object r6 = r7.awaitLoad(r2, r6, r0)
            if (r6 != r1) goto L58
            goto L6e
        L58:
            return r6
        L59:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r7 == 0) goto L7f
            r7 = r6
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r7, r2, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r0 = r5
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.ResourceFont r6 = (androidx.compose.ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.FontVariation$Settings r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r7, r6, r0)
            return r6
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public android.graphics.Typeface loadBlocking(@k Font font) {
        Object m6308constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int mo4615getLoadingStrategyPKNRLFQ = font.mo4615getLoadingStrategyPKNRLFQ();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
        if (FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4662getBlockingPKNRLFQ())) {
            typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else {
            if (!FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4663getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4661getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m4659toStringimpl(font.mo4615getLoadingStrategyPKNRLFQ())));
            }
            try {
                Result.a aVar = Result.Companion;
                load = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
                m6308constructorimpl = Result.m6308constructorimpl(load);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            typeface = (android.graphics.Typeface) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, ((ResourceFont) font).getVariationSettings(), this.context);
    }
}
