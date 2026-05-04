package androidx.compose.ui.text.platform;

import a00.r0;
import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,174:1\n230#2,3:175\n34#2,6:178\n233#2:184\n150#2,3:185\n34#2,6:188\n153#2:194\n482#2,4:195\n34#2,4:199\n486#2,3:203\n39#2:206\n489#2:207\n34#2,6:216\n77#3,8:208\n94#3,10:222\n94#3,10:232\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,6\n66#1:184\n69#1:185,3\n69#1:188,6\n69#1:194\n73#1:195,4\n73#1:199,4\n73#1:203,3\n73#1:206\n73#1:207\n78#1:216,6\n75#1:208,8\n100#1:222,10\n103#1:232,10\n*E\n"})
@n(message = "This is not supported after downloadable fonts.")
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {

    @k
    private final FontFamily fontFamily;

    @k
    private final FontMatcher fontMatcher$1;

    @k
    private final Map<Font, Typeface> loadedTypefaces;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final FontMatcher fontMatcher = new FontMatcher();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidFontListTypeface(@m80.k androidx.compose.ui.text.font.FontListFontFamily r8, @m80.k android.content.Context r9, @m80.l java.util.List<kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle>> r10, @m80.k androidx.compose.ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r1) goto L3a
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            int r5 = r5.mo4615getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m4662getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.ui.text.font.FontLoadingStrategy.m4657equalsimpl0(r5, r6)
            if (r5 == 0) goto L37
            r0.add(r4)
        L37:
            int r3 = r3 + 1
            goto L1b
        L3a:
            if (r10 == 0) goto Lac
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = r2
        L4d:
            if (r3 >= r1) goto L77
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.ui.text.font.FontStyle) r4
            int r4 = r4.m4673unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m4666matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = a00.r0.L2(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L4d
        L77:
            java.util.List r10 = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto Lac
            androidx.collection.MutableScatterSet r11 = new androidx.collection.MutableScatterSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
        L97:
            if (r4 >= r3) goto Lad
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La9
            r1.add(r5)
        La9:
            int r4 = r4 + 1
            goto L97
        Lac:
            r1 = 0
        Lad:
            if (r1 != 0) goto Lb0
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto Lbc
            java.lang.String r10 = "Could not match font"
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r10)
        Lbc:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lc5:
            if (r2 >= r11) goto Lee
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Ld7
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Ld7
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Ld7
            goto Leb
        Ld7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot create Typeface from "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        Leb:
            int r2 = r2 + 1
            goto Lc5
        Lee:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @k
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @k
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @k
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4810getNativeTypefacePYhJU0U(@k FontWeight fontWeight, int i11, int i12) {
        Font font = (Font) r0.L2(this.fontMatcher$1.m4666matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i11));
        if (font == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        Object m4691synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m4691synthesizeTypefaceFxwP2eA(i12, typeface, font, fontWeight, i11);
        g0.n(m4691synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) m4691synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i11, v vVar) {
        this(fontListFontFamily, context, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
