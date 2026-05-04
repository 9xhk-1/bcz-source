package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTraining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Training.kt\ncom/baicizhan/main/home/player/ComposableSingletons$TrainingKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n99#2:269\n95#2,10:270\n106#2:310\n99#2:311\n95#2,10:312\n106#2:352\n79#3,6:280\n86#3,3:295\n89#3,2:304\n93#3:309\n79#3,6:322\n86#3,3:337\n89#3,2:346\n93#3:351\n347#4,9:286\n356#4,3:306\n347#4,9:328\n356#4,3:348\n4206#5,6:298\n4206#5,6:340\n*S KotlinDebug\n*F\n+ 1 Training.kt\ncom/baicizhan/main/home/player/ComposableSingletons$TrainingKt\n*L\n103#1:269\n103#1:270,10\n103#1:310\n135#1:311\n135#1:312,10\n135#1:352\n103#1:280,6\n103#1:295,3\n103#1:304,2\n103#1:309\n135#1:322,6\n135#1:337,3\n135#1:346,2\n135#1:351\n103#1:286,9\n103#1:306,3\n135#1:328,9\n135#1:348,3\n103#1:298,6\n135#1:340,6\n*E\n"})
/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d1 f23539a = new d1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23540b = ComposableLambdaKt.composableLambdaInstance(228333848, false, new x00.p() { // from class: com.baicizhan.main.home.player.z0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 i11;
            i11 = d1.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23541c = ComposableLambdaKt.composableLambdaInstance(-1337558540, false, new x00.p() { // from class: com.baicizhan.main.home.player.a1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 k11;
            k11 = d1.k((Composer) obj, ((Integer) obj2).intValue());
            return k11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23542d = ComposableLambdaKt.composableLambdaInstance(-142661538, false, new x00.p() { // from class: com.baicizhan.main.home.player.b1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 l11;
            l11 = d1.l((Composer) obj, ((Integer) obj2).intValue());
            return l11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23543e = ComposableLambdaKt.composableLambdaInstance(821363002, false, new x00.p() { // from class: com.baicizhan.main.home.player.c1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 j11;
            j11 = d1.j((Composer) obj, ((Integer) obj2).intValue());
            return j11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228333848, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TrainingKt.lambda$228333848.<anonymous> (Training.kt:104)");
            }
            TextKt.m1845Text4IGK_g("可得", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 6, 0, 131070);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_training_games_coin, composer, 6), c6.d.f8117i, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            TextKt.m1845Text4IGK_g("或", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 6, 0, 131070);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_training_games_rocket, composer, 6), "rocket", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 j(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(821363002, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TrainingKt.lambda$821363002.<anonymous> (Training.kt:134)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2(), ColorKt.Color(4285559676L), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null)), f23542d, composer, ProvidedValue.$stable | 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1337558540, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TrainingKt.lambda$-1337558540.<anonymous> (Training.kt:102)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2(), ColorKt.Color(4285559676L), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null)), f23540b, composer, ProvidedValue.$stable | 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142661538, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TrainingKt.lambda$-142661538.<anonymous> (Training.kt:136)");
            }
            TextKt.m1845Text4IGK_g("可得", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 6, 0, 131070);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_training_games_rocket, composer, 6), "rocket", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> e() {
        return f23541c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> f() {
        return f23542d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> g() {
        return f23540b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> h() {
        return f23543e;
    }
}
