package androidx.compose.ui.text.font;

import a00.h0;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n434#2:445\n435#2,7:448\n434#2:456\n435#2,7:459\n34#3,2:446\n34#3,2:457\n1#4:455\n1#4:466\n1#4:467\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n196#1:445\n196#1:448,7\n213#1:456\n213#1:459,7\n196#1:446,2\n213#1:457,2\n196#1:455\n213#1:467\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object invoke;
        Object obj;
        Object m6308constructorimpl;
        Object obj2;
        int size = list.size();
        List list2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            Font font = list.get(i11);
            int mo4615getLoadingStrategyPKNRLFQ = font.mo4615getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4662getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            obj = asyncTypefaceResult.m4632unboximpl();
                        } else {
                            g2 g2Var = g2.f100423a;
                            try {
                                invoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                invoke = lVar.invoke(typefaceRequest);
                            }
                            Object obj3 = invoke;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj3, false, 8, null);
                            obj = obj3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (obj == null) {
                    obj = lVar.invoke(typefaceRequest);
                }
                return h1.a(list2, FontSynthesis_androidKt.m4691synthesizeTypefaceFxwP2eA(typefaceRequest.m4716getFontSynthesisGVVA2EU(), obj, font, typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4663getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            obj2 = asyncTypefaceResult2.m4632unboximpl();
                        } else {
                            g2 g2Var2 = g2.f100423a;
                            try {
                                Result.a aVar = Result.Companion;
                                m6308constructorimpl = Result.m6308constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th3) {
                                Result.a aVar2 = Result.Companion;
                                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th3));
                            }
                            Object obj4 = Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj4, false, 8, null);
                            obj2 = obj4;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (obj2 != null) {
                    return h1.a(list2, FontSynthesis_androidKt.m4691synthesizeTypefaceFxwP2eA(typefaceRequest.m4716getFontSynthesisGVVA2EU(), obj2, font, typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ, companion.m4661getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult m4624get1ASDuI8 = asyncTypefaceCache.m4624get1ASDuI8(font, platformFontLoader);
                if (m4624get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = h0.U(font);
                    } else {
                        list2.add(font);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m4630isPermanentFailureimpl(m4624get1ASDuI8.m4632unboximpl()) && m4624get1ASDuI8.m4632unboximpl() != null) {
                    return h1.a(list2, FontSynthesis_androidKt.m4691synthesizeTypefaceFxwP2eA(typefaceRequest.m4716getFontSynthesisGVVA2EU(), m4624get1ASDuI8.m4632unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA()));
                }
            }
        }
        return h1.a(list2, lVar.invoke(typefaceRequest));
    }
}
