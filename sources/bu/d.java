package bu;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import bu.d;
import g10.j;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/sillydevices/compose/ui/AutoSizeTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,190:1\n74#2:191\n487#3:192\n473#3:193\n1#4:194\n250#5:195\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/sillydevices/compose/ui/AutoSizeTextKt\n*L\n39#1:191\n158#1:192\n158#1:193\n162#1:195\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/sillydevices/compose/ui/AutoSizeTextKt$AutoSizeText$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,190:1\n74#2:191\n74#2:192\n74#2:194\n1#3:193\n1116#4,6:195\n1116#4,6:201\n146#5,2:207\n146#5,2:209\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/sillydevices/compose/ui/AutoSizeTextKt$AutoSizeText$2\n*L\n80#1:191\n82#1:192\n85#1:194\n104#1:195,6\n112#1:201,6\n125#1:207,2\n93#1:209,2\n*E\n"})
    public static final class a implements q<BoxWithConstraintsScope, Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextStyle f7389a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f7390b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f7391c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ FontWeight f7392d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ FontStyle f7393e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ FontFamily f7394f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f7395g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ TextDecoration f7396h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f7397i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f7398j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ float f7399k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f7400l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f7401m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f7402n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f7403o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f7404p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f7405q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f7406r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<TextLayoutResult, g2> f7407s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f7408t;

        /* JADX WARN: Multi-variable type inference failed */
        public a(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, long j13, TextDecoration textDecoration, int i11, long j14, float f11, long j15, long j16, String str, int i12, boolean z11, int i13, int i14, l<? super TextLayoutResult, g2> lVar, boolean z12) {
            this.f7389a = textStyle;
            this.f7390b = j11;
            this.f7391c = j12;
            this.f7392d = fontWeight;
            this.f7393e = fontStyle;
            this.f7394f = fontFamily;
            this.f7395g = j13;
            this.f7396h = textDecoration;
            this.f7397i = i11;
            this.f7398j = j14;
            this.f7399k = f11;
            this.f7400l = j15;
            this.f7401m = j16;
            this.f7402n = str;
            this.f7403o = i12;
            this.f7404p = z11;
            this.f7405q = i13;
            this.f7406r = i14;
            this.f7407s = lVar;
            this.f7408t = z12;
        }

        public static final boolean c(Density density, BoxWithConstraintsScope this_BoxWithConstraints, String text, TextStyle mergedStyle, boolean z11, float f11, int i11, LayoutDirection layoutDirection, boolean z12, FontFamily.Resolver fontFamilyResolver, TextMeasurer textMeasurer, int i12) {
            long m4598getLineHeightXSAIIZE;
            TextStyle m4604mergedA7vx0o;
            g0.p(density, "$density");
            g0.p(this_BoxWithConstraints, "$this_BoxWithConstraints");
            g0.p(text, "$text");
            g0.p(mergedStyle, "$mergedStyle");
            g0.p(layoutDirection, "$layoutDirection");
            g0.p(fontFamilyResolver, "$fontFamilyResolver");
            g0.p(textMeasurer, "$textMeasurer");
            long mo381toSpkPz2Gy4 = density.mo381toSpkPz2Gy4(i12);
            if (z11) {
                TextUnitKt.m5322checkArithmeticR2X_6o(mo381toSpkPz2Gy4);
                m4598getLineHeightXSAIIZE = TextUnitKt.pack(TextUnit.m5307getRawTypeimpl(mo381toSpkPz2Gy4), TextUnit.m5309getValueimpl(mo381toSpkPz2Gy4) * f11);
            } else {
                m4598getLineHeightXSAIIZE = mergedStyle.m4598getLineHeightXSAIIZE();
            }
            m4604mergedA7vx0o = mergedStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : mo381toSpkPz2Gy4, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : null, (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : m4598getLineHeightXSAIIZE, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            return d.l(this_BoxWithConstraints, text, m4604mergedA7vx0o, i11, layoutDirection, z12, density, fontFamilyResolver, textMeasurer);
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(final BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i11) {
            int i12;
            final TextStyle m4604mergedA7vx0o;
            long m4598getLineHeightXSAIIZE;
            TextStyle m4604mergedA7vx0o2;
            g0.p(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            m4604mergedA7vx0o = this.f7389a.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : this.f7390b, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : this.f7391c, (r60 & 4) != 0 ? null : this.f7392d, (r60 & 8) != 0 ? null : this.f7393e, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : this.f7394f, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : this.f7395g, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : this.f7396h, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : null, (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : this.f7397i, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : this.f7398j, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            final TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
            Float valueOf = Float.valueOf(this.f7399k);
            float floatValue = valueOf.floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 1.0f) {
                valueOf = null;
            }
            final float floatValue2 = valueOf != null ? valueOf.floatValue() : 1.0f;
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            final String str = this.f7402n;
            final boolean z11 = this.f7408t;
            final int i13 = this.f7405q;
            final boolean z12 = this.f7404p;
            l lVar = new l() { // from class: bu.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean c11;
                    c11 = d.a.c(Density.this, BoxWithConstraints, str, m4604mergedA7vx0o, z11, floatValue2, i13, layoutDirection, z12, resolver, rememberTextMeasurer, ((Integer) obj).intValue());
                    return Boolean.valueOf(c11);
                }
            };
            float mo633getMaxWidthD9Ej5fM = BoxWithConstraints.mo633getMaxWidthD9Ej5fM();
            float mo632getMaxHeightD9Ej5fM = BoxWithConstraints.mo632getMaxHeightD9Ej5fM();
            composer.startReplaceableGroup(-685295306);
            boolean changed = composer.changed(mo633getMaxWidthD9Ej5fM) | composer.changed(density) | composer.changed(mo632getMaxHeightD9Ej5fM) | composer.changed(this.f7400l) | composer.changed(this.f7401m);
            long j11 = this.f7401m;
            long j12 = this.f7400l;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = d.i(density, DpKt.m5137DpSizeYgX7TsA(BoxWithConstraints.mo633getMaxWidthD9Ej5fM(), BoxWithConstraints.mo632getMaxHeightD9Ej5fM()), j11, j12);
                composer.updateRememberedValue(rememberedValue);
            }
            j jVar = (j) rememberedValue;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-685285253);
            boolean changed2 = composer.changed(jVar) | composer.changed(lVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = TextUnit.m5299boximpl(d.k(jVar, density, lVar));
                composer.updateRememberedValue(rememberedValue2);
            }
            long m5318unboximpl = ((TextUnit) rememberedValue2).m5318unboximpl();
            composer.endReplaceableGroup();
            String str2 = this.f7402n;
            int i14 = this.f7403o;
            boolean z13 = this.f7404p;
            int i15 = this.f7405q;
            int i16 = this.f7406r;
            l<TextLayoutResult, g2> lVar2 = this.f7407s;
            if (this.f7408t) {
                TextUnitKt.m5322checkArithmeticR2X_6o(m5318unboximpl);
                m4598getLineHeightXSAIIZE = TextUnitKt.pack(TextUnit.m5307getRawTypeimpl(m5318unboximpl), TextUnit.m5309getValueimpl(m5318unboximpl) * floatValue2);
            } else {
                m4598getLineHeightXSAIIZE = m4604mergedA7vx0o.m4598getLineHeightXSAIIZE();
            }
            m4604mergedA7vx0o2 = m4604mergedA7vx0o.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : m5318unboximpl, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : null, (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : m4598getLineHeightXSAIIZE, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            TextKt.m1845Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, i14, z13, i15, i16, lVar2, m4604mergedA7vx0o2, composer, 0, 0, 2046);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            b(boxWithConstraintsScope, composer, num.intValue());
            return g2.f100423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ce  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@m80.k final java.lang.String r39, @m80.l androidx.compose.ui.Modifier r40, @m80.l androidx.compose.ui.text.TextStyle r41, long r42, long r44, long r46, long r48, @m80.l androidx.compose.ui.text.font.FontStyle r50, @m80.l androidx.compose.ui.text.font.FontWeight r51, @m80.l androidx.compose.ui.text.font.FontFamily r52, long r53, @m80.l androidx.compose.ui.text.style.TextDecoration r55, int r56, long r57, int r59, boolean r60, int r61, int r62, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r63, boolean r64, float r65, @m80.l androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.d.c(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, long, long, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, int, long, int, boolean, int, int, x00.l, boolean, float, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final g2 d(TextLayoutResult it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 e(String text, Modifier modifier, TextStyle textStyle, long j11, long j12, long j13, long j14, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j15, TextDecoration textDecoration, int i11, long j16, int i12, boolean z11, int i13, int i14, l lVar, boolean z12, float f11, int i15, int i16, int i17, int i18, Composer composer, int i19) {
        g0.p(text, "$text");
        c(text, modifier, textStyle, j11, j12, j13, j14, fontStyle, fontWeight, fontFamily, j15, textDecoration, i11, j16, i12, z11, i13, i14, lVar, z12, f11, composer, RecomposeScopeImplKt.updateChangedFlags(i15 | 1), RecomposeScopeImplKt.updateChangedFlags(i16), RecomposeScopeImplKt.updateChangedFlags(i17), i18);
        return g2.f100423a;
    }

    public static final j i(Density density, long j11, long j12, long j13) {
        DpSize.Companion companion = DpSize.Companion;
        if (j11 == companion.m5222getUnspecifiedMYxV2XQ()) {
            j11 = companion.m5223getZeroMYxV2XQ();
        }
        long IntSize = IntSizeKt.IntSize(density.mo371roundToPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j11)), density.mo371roundToPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j11)));
        int min = Math.min(IntSize.m5286getWidthimpl(IntSize), IntSize.m5285getHeightimpl(IntSize));
        TextUnit m5299boximpl = TextUnit.m5299boximpl(j13);
        if (!TextUnit.m5312isSpimpl(m5299boximpl.m5318unboximpl())) {
            m5299boximpl = null;
        }
        if (m5299boximpl != null) {
            long m5318unboximpl = m5299boximpl.m5318unboximpl();
            min = u.J(!TextUnitKt.m5327isUnspecifiedR2X_6o(m5318unboximpl) ? density.mo370roundToPxR2X_6o(m5318unboximpl) : 0, new g10.l(0, min));
        }
        TextUnit m5299boximpl2 = TextUnit.m5299boximpl(j12);
        TextUnit textUnit = TextUnit.m5312isSpimpl(m5299boximpl2.m5318unboximpl()) ? m5299boximpl2 : null;
        return u.B1(new g10.l(textUnit != null ? u.J(density.mo370roundToPxR2X_6o(textUnit.m5318unboximpl()), new g10.l(0, min)) : 0, min), 1);
    }

    public static /* synthetic */ j j(Density density, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        }
        return i(density, j11, j14, j13);
    }

    public static final long k(j jVar, Density density, l<? super Integer, Boolean> lVar) {
        int d11 = jVar.d();
        int f11 = jVar.f();
        if (!lVar.invoke(Integer.valueOf(f11)).booleanValue()) {
            return density.mo381toSpkPz2Gy4(f11);
        }
        while (d11 <= f11) {
            int i11 = ((f11 - d11) / 2) + d11;
            if (lVar.invoke(Integer.valueOf(i11)).booleanValue()) {
                f11 = i11 - 1;
            } else {
                d11 = i11 + 1;
            }
        }
        return density.mo381toSpkPz2Gy4(u.u(f11, jVar.d()));
    }

    public static final boolean l(BoxWithConstraintsScope boxWithConstraintsScope, String str, TextStyle textStyle, int i11, LayoutDirection layoutDirection, boolean z11, Density density, FontFamily.Resolver resolver, TextMeasurer textMeasurer) {
        return TextMeasurer.m4532measurewNUYSr0$default(textMeasurer, str, textStyle, TextOverflow.Companion.m5028getClipgIe3tQ8(), z11, i11, boxWithConstraintsScope.mo631getConstraintsmsEJaDk(), layoutDirection, density, resolver, false, 512, null).getHasVisualOverflow();
    }
}
