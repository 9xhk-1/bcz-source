package com.baicizhan.main.home.player;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.esotericsoftware.spine.android.SpineView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIslands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/ComposableSingletons$IslandsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1149:1\n1247#2,6:1150\n1247#2,6:1193\n1247#2,6:1200\n70#3:1156\n67#3,9:1157\n77#3:1209\n79#4,6:1166\n86#4,3:1181\n89#4,2:1190\n93#4:1208\n347#5,9:1172\n356#5:1192\n357#5,2:1206\n4206#6,6:1184\n113#7:1199\n*S KotlinDebug\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/ComposableSingletons$IslandsKt\n*L\n315#1:1150,6\n316#1:1193,6\n323#1:1200,6\n315#1:1156\n315#1:1157,9\n315#1:1209\n315#1:1166,6\n315#1:1181,3\n315#1:1190,2\n315#1:1208\n315#1:1172,9\n315#1:1192\n315#1:1206,2\n315#1:1184,6\n322#1:1199\n*E\n"})
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f23499a = new c0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> f23500b = ComposableLambdaKt.composableLambdaInstance(-844326540, false, new x00.q() { // from class: com.baicizhan.main.home.player.b0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 f11;
            f11 = c0.f((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return f11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-844326540, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$IslandsKt.lambda$-844326540.<anonymous> (Islands.kt:314)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.y
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 g11;
                    g11 = c0.g();
                    return g11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier k11 = ComposeUtilsKt.k(fillMaxSize$default, 0L, false, (x00.a) rememberedValue, 3, null);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, k11);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.home.player.z
                @Override // ml.d
                public final void a(com.esotericsoftware.spine.android.c cVar) {
                    c0.h(cVar);
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        final com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue2;
        Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(boxScopeInstance.align(companion, companion3.getTopCenter()), 0.0f, Dp.m5115constructorimpl(-320), 1, null);
        boolean changedInstance = composer.changedInstance(cVar);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.player.a0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    SpineView i12;
                    i12 = c0.i(com.esotericsoftware.spine.android.c.this, (Context) obj);
                    return i12;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        AndroidView_androidKt.AndroidView((x00.l) rememberedValue3, m686offsetVpY3zN4$default, null, composer, 0, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 g() {
        return yz.g2.f100423a;
    }

    public static final void h(com.esotericsoftware.spine.android.c cVar) {
        cVar.i().x(0, "ani_levelup", false);
    }

    public static final SpineView i(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/spine_levelup.atlas.txt", "spine/spine_levelup.skel.bytes").c(new ll.e("ani_levelup")).a();
    }

    @m80.k
    public final x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> e() {
        return f23500b;
    }
}
