package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontFamilyResolver_androidKt {
    @k
    public static final FontFamily.Resolver createFontFamilyResolver(@k Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @k
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(@k Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0), null, 18, null);
    }

    @k
    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m4644resolveAsTypefaceWqqsr6A(@k FontFamily.Resolver resolver, @l FontFamily fontFamily, @k FontWeight fontWeight, int i11, int i12) {
        State mo4643resolveDPcqOEQ = resolver.mo4643resolveDPcqOEQ(fontFamily, fontWeight, i11, i12);
        g0.n(mo4643resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return mo4643resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m4645resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            fontFamily = null;
        }
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i13 & 4) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = FontSynthesis.Companion.m4687getAllGVVA2EU();
        }
        return m4644resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i11, i12);
    }

    @k
    public static final FontFamily.Resolver createFontFamilyResolver(@k Context context, @k kotlin.coroutines.d dVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), dVar), null, 16, null);
    }
}
