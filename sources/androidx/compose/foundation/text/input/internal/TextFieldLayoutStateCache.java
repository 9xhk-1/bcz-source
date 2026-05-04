package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@kotlin.jvm.internal.u0({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n246#1,4:520\n251#1:531\n85#2:506\n113#2,2:507\n85#2:509\n113#2,2:510\n70#3,7:512\n2475#4:519\n2355#4:524\n1894#4,2:525\n2356#4:529\n2355#4:532\n1894#4,2:533\n2356#4:537\n33#5,2:527\n33#5,2:535\n1#6:530\n1#6:538\n1#6:539\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n*L\n226#1:520,4\n226#1:531\n71#1:506\n71#1:507,2\n73#1:509\n73#1:510,2\n147#1:512,7\n163#1:519\n226#1:524\n226#1:525,2\n226#1:529\n249#1:532\n249#1:533,2\n249#1:537\n226#1:527,2\n249#1:535,2\n226#1:530\n249#1:538\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;

    @m80.l
    private TextMeasurer textMeasurer;

    @m80.k
    private final MutableState nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());

    @m80.k
    private final MutableState measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());

    @m80.k
    private CacheRecord record = new CacheRecord();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CacheRecord extends StateRecord {

        @m80.l
        private List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;

        @m80.l
        private TextRange composition;

        @m80.l
        private FontFamily.Resolver fontFamilyResolver;

        @m80.l
        private LayoutDirection layoutDirection;

        @m80.l
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;

        @m80.l
        private TextStyle textStyle;

        @m80.l
        private CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@m80.k StateRecord stateRecord) {
            kotlin.jvm.internal.g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.composingAnnotations = cacheRecord.composingAnnotations;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @m80.k
        public StateRecord create() {
            return new CacheRecord();
        }

        @m80.l
        public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
            return this.composingAnnotations;
        }

        @m80.l
        /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final TextRange m1292getCompositionMzsxiRA() {
            return this.composition;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1293getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        @m80.l
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        @m80.l
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @m80.l
        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @m80.l
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        @m80.l
        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setComposingAnnotations(@m80.l List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
            this.composingAnnotations = list;
        }

        /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m1294setCompositionOEnZFl4(@m80.l TextRange textRange) {
            this.composition = textRange;
        }

        /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1295setConstraintsBRTryo0(long j11) {
            this.constraints = j11;
        }

        public final void setDensityValue(float f11) {
            this.densityValue = f11;
        }

        public final void setFontFamilyResolver(@m80.l FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        public final void setFontScale(float f11) {
            this.fontScale = f11;
        }

        public final void setLayoutDirection(@m80.l LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setLayoutResult(@m80.l TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        public final void setSingleLine(boolean z11) {
            this.singleLine = z11;
        }

        public final void setSoftWrap(boolean z11) {
            this.softWrap = z11;
        }

        public final void setTextStyle(@m80.l TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final void setVisualText(@m80.l CharSequence charSequence) {
            this.visualText = charSequence;
        }

        @m80.k
        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", composingAnnotations=" + this.composingAnnotations + ", composition=" + this.composition + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m5073toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MeasureInputs {

        @m80.k
        public static final Companion Companion = new Companion(null);

        @m80.k
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.MeasureInputs measureInputs, TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
                if (measureInputs == null || measureInputs2 == null) {
                    return !((measureInputs == null) ^ (measureInputs2 == null));
                }
                return measureInputs.getDensityValue() == measureInputs2.getDensityValue() && measureInputs.getFontScale() == measureInputs2.getFontScale() && measureInputs.getLayoutDirection() == measureInputs2.getLayoutDirection() && kotlin.jvm.internal.g0.g(measureInputs.getFontFamilyResolver(), measureInputs2.getFontFamilyResolver()) && Constraints.m5061equalsimpl0(measureInputs.m1296getConstraintsmsEJaDk(), measureInputs2.m1296getConstraintsmsEJaDk());
            }
        };
        private final long constraints;

        @m80.k
        private final Density density;
        private final float densityValue;

        @m80.k
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;

        @m80.k
        private final LayoutDirection layoutDirection;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j11, kotlin.jvm.internal.v vVar) {
            this(density, layoutDirection, resolver, j11);
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1296getConstraintsmsEJaDk() {
            return this.constraints;
        }

        @m80.k
        public final Density getDensity() {
            return this.density;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        @m80.k
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        @m80.k
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @m80.k
        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m5073toStringimpl(this.constraints)) + ')';
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j11) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j11;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NonMeasureInputs {

        @m80.k
        public static final Companion Companion = new Companion(null);

        @m80.k
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    return !((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null));
                }
                return nonMeasureInputs.getTextFieldState() == nonMeasureInputs2.getTextFieldState() && kotlin.jvm.internal.g0.g(nonMeasureInputs.getTextStyle(), nonMeasureInputs2.getTextStyle()) && nonMeasureInputs.getSingleLine() == nonMeasureInputs2.getSingleLine() && nonMeasureInputs.getSoftWrap() == nonMeasureInputs2.getSoftWrap() && nonMeasureInputs.isKeyboardTypePhone() == nonMeasureInputs2.isKeyboardTypePhone();
            }
        };
        private final boolean isKeyboardTypePhone;
        private final boolean singleLine;
        private final boolean softWrap;

        @m80.k
        private final TransformedTextFieldState textFieldState;

        @m80.k
        private final TextStyle textStyle;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }

        public NonMeasureInputs(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, boolean z12, boolean z13) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z11;
            this.softWrap = z12;
            this.isKeyboardTypePhone = z13;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @m80.k
        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        @m80.k
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean isKeyboardTypePhone() {
            return this.isKeyboardTypePhone;
        }

        @m80.k
        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", isKeyboardTypePhone=" + this.isKeyboardTypePhone + ')';
        }
    }

    private final TextLayoutResult computeLayout(TextFieldCharSequence textFieldCharSequence, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextStyle textStyle;
        Locale current;
        TextMeasurer obtainTextMeasurer = obtainTextMeasurer(measureInputs);
        if (nonMeasureInputs.isKeyboardTypePhone()) {
            LocaleList localeList = nonMeasureInputs.getTextStyle().getLocaleList();
            if (localeList == null || (current = localeList.get(0)) == null) {
                current = Locale.Companion.getCurrent();
            }
            textStyle = nonMeasureInputs.getTextStyle().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, TextFieldLayoutStateCache_androidKt.resolveTextDirectionForKeyboardTypePhone(current.getPlatformLocale()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16711679, (kotlin.jvm.internal.v) null));
        } else {
            textStyle = nonMeasureInputs.getTextStyle();
        }
        String textFieldCharSequence2 = textFieldCharSequence.toString();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations == null) {
            composingAnnotations = a00.h0.J();
        }
        return TextMeasurer.m4533measurexDpz5zY$default(obtainTextMeasurer, new AnnotatedString(textFieldCharSequence2, composingAnnotations), textStyle, 0, nonMeasureInputs.getSoftWrap(), nonMeasureInputs.getSingleLine() ? 1 : Integer.MAX_VALUE, null, measureInputs.m1296getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, 1060, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MeasureInputs getMeasureInputs() {
        return (MeasureInputs) this.measureInputs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NonMeasureInputs getNonMeasureInputs() {
        return (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
    }

    private final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence visualText;
        TextFieldCharSequence visualText2 = nonMeasureInputs.getTextFieldState().getVisualText();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.current(this.record);
        TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && u30.f0.O1(visualText, visualText2) && kotlin.jvm.internal.g0.g(cacheRecord.getComposingAnnotations(), visualText2.getComposingAnnotations()) && kotlin.jvm.internal.g0.g(cacheRecord.m1292getCompositionMzsxiRA(), visualText2.m1188getCompositionMzsxiRA()) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && Constraints.m5061equalsimpl0(cacheRecord.m1293getConstraintsmsEJaDk(), measureInputs.m1296getConstraintsmsEJaDk()) && kotlin.jvm.internal.g0.g(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            TextStyle textStyle = cacheRecord.getTextStyle();
            boolean hasSameLayoutAffectingAttributes = textStyle != null ? textStyle.hasSameLayoutAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            TextStyle textStyle2 = cacheRecord.getTextStyle();
            boolean hasSameDrawAffectingAttributes = textStyle2 != null ? textStyle2.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            if (hasSameLayoutAffectingAttributes && hasSameDrawAffectingAttributes) {
                return layoutResult;
            }
            if (hasSameLayoutAffectingAttributes) {
                return TextLayoutResult.m4527copyO0kMr_c$default(layoutResult, new TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().m4526getOverflowgIe3tQ8(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().m4525getConstraintsmsEJaDk(), (kotlin.jvm.internal.v) null), 0L, 2, null);
            }
        }
        TextLayoutResult computeLayout = computeLayout(visualText2, nonMeasureInputs, measureInputs);
        if (!kotlin.jvm.internal.g0.g(computeLayout, layoutResult)) {
            Snapshot current = Snapshot.Companion.getCurrent();
            if (!current.getReadOnly()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.getLock()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.writableRecord(cacheRecord2, this, current);
                    cacheRecord3.setVisualText(visualText2);
                    cacheRecord3.setComposingAnnotations(visualText2.getComposingAnnotations());
                    cacheRecord3.m1294setCompositionOEnZFl4(visualText2.m1188getCompositionMzsxiRA());
                    cacheRecord3.setSingleLine(nonMeasureInputs.getSingleLine());
                    cacheRecord3.setSoftWrap(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.setTextStyle(nonMeasureInputs.getTextStyle());
                    cacheRecord3.setLayoutDirection(measureInputs.getLayoutDirection());
                    cacheRecord3.setDensityValue(measureInputs.getDensityValue());
                    cacheRecord3.setFontScale(measureInputs.getFontScale());
                    cacheRecord3.m1295setConstraintsBRTryo0(measureInputs.m1296getConstraintsmsEJaDk());
                    cacheRecord3.setFontFamilyResolver(measureInputs.getFontFamilyResolver());
                    cacheRecord3.setLayoutResult(computeLayout);
                    g2 g2Var = g2.f100423a;
                }
                SnapshotKt.notifyWrite(current, this);
                return computeLayout;
            }
        }
        return computeLayout;
    }

    private final TextMeasurer obtainTextMeasurer(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = textMeasurer2;
        return textMeasurer2;
    }

    private final void setMeasureInputs(MeasureInputs measureInputs) {
        this.measureInputs$delegate.setValue(measureInputs);
    }

    private final void setNonMeasureInputs(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs$delegate.setValue(nonMeasureInputs);
    }

    private final void updateCacheIfWritable(x00.l<? super CacheRecord, g2> lVar) {
        Snapshot current = Snapshot.Companion.getCurrent();
        if (current.getReadOnly()) {
            return;
        }
        CacheRecord cacheRecord = this.record;
        synchronized (SnapshotKt.getLock()) {
            try {
                lVar.invoke(SnapshotKt.writableRecord(cacheRecord, this, current));
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.d0.c(1);
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.k
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    @m80.k
    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1291layoutWithNewMeasureInputshBUhpc(@m80.k Density density, @m80.k LayoutDirection layoutDirection, @m80.k FontFamily.Resolver resolver, long j11) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j11, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) {
            return getOrComputeLayout(nonMeasureInputs, measureInputs);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@m80.k StateRecord stateRecord) {
        kotlin.jvm.internal.g0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) stateRecord;
    }

    public final void updateNonMeasureInputs(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions) {
        setNonMeasureInputs(new NonMeasureInputs(transformedTextFieldState, textStyle, z11, z12, KeyboardType.m4778equalsimpl0(keyboardOptions.m1068getKeyboardTypePjHm6EE(), KeyboardType.Companion.m4798getPhonePjHm6EE())));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @m80.l
    public TextLayoutResult getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @m80.k
    public StateRecord mergeRecords(@m80.k StateRecord stateRecord, @m80.k StateRecord stateRecord2, @m80.k StateRecord stateRecord3) {
        return stateRecord3;
    }
}
