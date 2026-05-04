package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;

    @l
    private android.graphics.Typeface typeface;

    @k
    private final FontWeight weight;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i11, FontVariation.Settings settings, v vVar) {
        this(fontWeight, i11, settings);
    }

    @l
    public abstract android.graphics.Typeface doLoad$ui_text_release(@l Context context);

    @l
    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo4623getStyle_LCdwA() {
        return this.style;
    }

    @l
    public final android.graphics.Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    @k
    public final FontWeight getWeight() {
        return this.weight;
    }

    @l
    public final android.graphics.Typeface loadCached$ui_text_release(@k Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(@l android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i11, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4662getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i11;
    }
}
