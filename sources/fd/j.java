package fd;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFastTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/ComposableSingletons$FastTestActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,509:1\n1247#2,6:510\n1247#2,6:516\n1247#2,6:522\n1247#2,6:528\n1247#2,6:534\n1247#2,6:579\n113#3:540\n113#3:578\n70#4:541\n67#4,9:542\n77#4:588\n79#5,6:551\n86#5,3:566\n89#5,2:575\n93#5:587\n347#6,9:557\n356#6:577\n357#6,2:585\n4206#7,6:569\n*S KotlinDebug\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/ComposableSingletons$FastTestActivityKt\n*L\n464#1:510,6\n465#1:516,6\n466#1:522,6\n467#1:528,6\n468#1:534,6\n483#1:579,6\n479#1:540\n489#1:578\n477#1:541\n477#1:542,9\n477#1:588\n477#1:551,6\n477#1:566,3\n477#1:575,2\n477#1:587\n477#1:557,9\n477#1:577\n477#1:585,2\n477#1:569,6\n*E\n"})
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f51600a = new j();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f51601b = ComposableLambdaKt.composableLambdaInstance(-580340336, false, new x00.p() { // from class: fd.a
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 n11;
            n11 = j.n((Composer) obj, ((Integer) obj2).intValue());
            return n11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f51602c = ComposableLambdaKt.composableLambdaInstance(-70681249, false, new x00.p() { // from class: fd.b
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 t11;
            t11 = j.t((Composer) obj, ((Integer) obj2).intValue());
            return t11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f51603d = ComposableLambdaKt.composableLambdaInstance(1242515137, false, new x00.p() { // from class: fd.c
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 m11;
            m11 = j.m((Composer) obj, ((Integer) obj2).intValue());
            return m11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 m(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242515137, i11, -1, "com.baicizhan.main.activity.ComposableSingletons$FastTestActivityKt.lambda$1242515137.<anonymous> (FastTestActivity.kt:506)");
            }
            x0.H(Modifier.Companion, "appointment", "/əˈpɔɪntmənt/", composer, 438, 0);
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
    public static final yz.g2 n(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-580340336, i11, -1, "com.baicizhan.main.activity.ComposableSingletons$FastTestActivityKt.lambda$-580340336.<anonymous> (FastTestActivity.kt:452)");
            }
            TopicRecord topicRecord = new TopicRecord();
            topicRecord.topicId = 1;
            topicRecord.word = "appointment";
            topicRecord.phonetic = "/əˈpɔɪntmənt/";
            yz.g2 g2Var = yz.g2.f100423a;
            List l11 = a00.g0.l(new uh.f(1, topicRecord, false, false, false, 28, null));
            com.google.accompanist.pager.f a11 = com.google.accompanist.pager.g.a(0, composer, 0, 1);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: fd.e
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 o11;
                        o11 = j.o((uh.f) obj);
                        return o11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: fd.f
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 p11;
                        p11 = j.p((uh.f) obj);
                        return p11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar2 = (x00.l) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: fd.g
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 q11;
                        q11 = j.q((uh.f) obj);
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            x00.l lVar3 = (x00.l) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.p() { // from class: fd.h
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 r11;
                        r11 = j.r(((Integer) obj).intValue(), (uh.f) obj2);
                        return r11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            x00.p pVar = (x00.p) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l() { // from class: fd.i
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 s11;
                        s11 = j.s(((Integer) obj).intValue());
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x0.s(l11, 2, a11, lVar, lVar2, lVar3, pVar, (x00.l) rememberedValue5, composer, 14380080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 o(uh.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 p(uh.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(uh.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(int i11, uh.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<unused var>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(int i11) {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70681249, i11, -1, "com.baicizhan.main.activity.ComposableSingletons$FastTestActivityKt.lambda$-70681249.<anonymous> (FastTestActivity.kt:476)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(16)), 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(60));
            bk.e a11 = bk.f.a(bk.b.A0(), bk.b.J0(), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.A0(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3510, 0);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.d
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = j.u();
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.platform.base.widget.r.C(m759height3ABfNKs, (x00.a) rememberedValue, "记得", 0L, null, 0, false, false, null, a11, null, composer, 1573302, 0, 1464);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> j() {
        return f51601b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> k() {
        return f51602c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> l() {
        return f51603d;
    }
}
