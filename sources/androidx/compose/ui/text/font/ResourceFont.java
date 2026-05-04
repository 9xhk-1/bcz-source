package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;

    @k
    private final FontVariation.Settings variationSettings;

    @k
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i11, FontWeight fontWeight, int i12, @ExperimentalTextApi FontVariation.Settings settings, int i13, v vVar) {
        this(i11, fontWeight, i12, settings, i13);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4706copyF3nL8kk$default(ResourceFont resourceFont, int i11, FontWeight fontWeight, int i12, int i13, FontVariation.Settings settings, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = resourceFont.resId;
        }
        if ((i14 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i14 & 4) != 0) {
            i12 = resourceFont.mo4623getStyle_LCdwA();
        }
        if ((i14 & 8) != 0) {
            i13 = resourceFont.mo4615getLoadingStrategyPKNRLFQ();
        }
        if ((i14 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i15 = i12;
        return resourceFont.m4709copyF3nL8kk(i11, fontWeight, i15, i13, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4707copyRetOiIg$default(ResourceFont resourceFont, int i11, FontWeight fontWeight, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i13 & 4) != 0) {
            i12 = resourceFont.mo4623getStyle_LCdwA();
        }
        return resourceFont.m4710copyRetOiIg(i11, fontWeight, i12);
    }

    @ExperimentalTextApi
    @k
    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m4709copyF3nL8kk(int i11, @k FontWeight fontWeight, int i12, int i13, @k FontVariation.Settings settings) {
        return new ResourceFont(i11, fontWeight, i12, settings, i13, null);
    }

    @k
    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m4710copyRetOiIg(int i11, @k FontWeight fontWeight, int i12) {
        return m4706copyF3nL8kk$default(this, i11, fontWeight, i12, mo4615getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && g0.g(getWeight(), resourceFont.getWeight()) && FontStyle.m4670equalsimpl0(mo4623getStyle_LCdwA(), resourceFont.mo4623getStyle_LCdwA()) && g0.g(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m4657equalsimpl0(mo4615getLoadingStrategyPKNRLFQ(), resourceFont.mo4615getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo4615getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4623getStyle_LCdwA() {
        return this.style;
    }

    @ExperimentalTextApi
    @k
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    @k
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m4671hashCodeimpl(mo4623getStyle_LCdwA())) * 31) + FontLoadingStrategy.m4658hashCodeimpl(mo4615getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    @k
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4672toStringimpl(mo4623getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m4659toStringimpl(mo4615getLoadingStrategyPKNRLFQ())) + ')';
    }

    private ResourceFont(int i11, FontWeight fontWeight, int i12, FontVariation.Settings settings, int i13) {
        this.resId = i11;
        this.weight = fontWeight;
        this.style = i12;
        this.variationSettings = settings;
        this.loadingStrategy = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ResourceFont(int r8, androidx.compose.ui.text.font.FontWeight r9, int r10, androidx.compose.ui.text.font.FontVariation.Settings r11, int r12, int r13, kotlin.jvm.internal.v r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto La
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r9.getNormal()
        La:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L15
            androidx.compose.ui.text.font.FontStyle$Companion r9 = androidx.compose.ui.text.font.FontStyle.Companion
            int r10 = r9.m4677getNormal_LCdwA()
        L15:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L23
            androidx.compose.ui.text.font.FontVariation r9 = androidx.compose.ui.text.font.FontVariation.INSTANCE
            r10 = 0
            androidx.compose.ui.text.font.FontVariation$Setting[] r10 = new androidx.compose.ui.text.font.FontVariation.Setting[r10]
            androidx.compose.ui.text.font.FontVariation$Settings r11 = r9.m4692Settings6EWAqTQ(r2, r3, r10)
        L23:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L2e
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r9 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r12 = r9.m4661getAsyncPKNRLFQ()
        L2e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.ResourceFont.<init>(int, androidx.compose.ui.text.font.FontWeight, int, androidx.compose.ui.text.font.FontVariation$Settings, int, int, kotlin.jvm.internal.v):void");
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m4708getLoadingStrategyPKNRLFQ$annotations() {
    }
}
