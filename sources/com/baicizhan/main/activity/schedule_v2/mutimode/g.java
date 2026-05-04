package com.baicizhan.main.activity.schedule_v2.mutimode;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.activity.schedule_v2.mutimode.q0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodeLIstUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modeLIstUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ComposableSingletons$ModeLIstUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 8 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n70#2:228\n67#2,9:229\n77#2:274\n79#3,6:238\n86#3,3:253\n89#3,2:262\n93#3:273\n347#4,9:244\n356#4:264\n357#4,2:271\n4206#5,6:256\n1247#6,6:265\n1247#6,6:288\n1247#6,6:294\n46#7,7:275\n86#8,6:282\n85#9:300\n*S KotlinDebug\n*F\n+ 1 modeLIstUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ComposableSingletons$ModeLIstUiKt\n*L\n163#1:228\n163#1:229,9\n163#1:274\n163#1:238,6\n163#1:253,3\n163#1:262,2\n163#1:273\n163#1:244,9\n163#1:264\n163#1:271,2\n163#1:256,6\n196#1:265,6\n213#1:288,6\n217#1:294,6\n211#1:275,7\n211#1:282,6\n212#1:300\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f19332a = new g();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f19333b = ComposableLambdaKt.composableLambdaInstance(-723494569, false, new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.e
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 m11;
            m11 = g.m((Composer) obj, ((Integer) obj2).intValue());
            return m11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f19334c = ComposableLambdaKt.composableLambdaInstance(-1862969232, false, new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.f
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 i11;
            i11 = g.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862969232, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ComposableSingletons$ModeLIstUiKt.lambda$-1862969232.<anonymous> (modeLIstUi.kt:210)");
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) j0.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            final j0 j0Var = (j0) viewModel;
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(j0Var.o(), q0.c.f19417b, (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, composer, 48, 14);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.c
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 k11;
                        k11 = g.k(j0.this, (com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj);
                        return k11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.d
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 l11;
                        l11 = g.l(j0.this, (com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj);
                        return l11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar2 = (x00.l) rememberedValue2;
            if (kotlin.jvm.internal.g0.g(j(collectAsStateWithLifecycle), q0.a.f19413b)) {
                composer.startReplaceGroup(-157244046);
            } else {
                composer.startReplaceGroup(-148544857);
                ModeLIstUiKt.p(j(collectAsStateWithLifecycle), lVar2, lVar, composer, 432);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final q0 j(State<? extends q0> state) {
        return state.getValue();
    }

    public static final g2 k(j0 j0Var, com.baicizhan.main.activity.schedule_v2.mutimode.data.h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        j0Var.h(it);
        return g2.f100423a;
    }

    public static final g2 l(j0 j0Var, com.baicizhan.main.activity.schedule_v2.mutimode.data.h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        j0Var.r(it);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 m(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-723494569, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ComposableSingletons$ModeLIstUiKt.lambda$-723494569.<anonymous> (modeLIstUi.kt:162)");
            }
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, Color.Companion.m2543getRed0d7_KjU(), null, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m235backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            e.d dVar = e.d.f19308d;
            q0.e eVar = new q0.e(a00.h0.Q(new com.baicizhan.main.activity.schedule_v2.mutimode.data.h(new ModeDetail(dVar, "图片模式", "https://7n.bczcdn.com/r/q9uweeng2wuwnqmybkh97ggp9zkdgfss.jpg", "图片联想记忆，多感官刺激左右脑记忆", a00.h0.J()), false), new com.baicizhan.main.activity.schedule_v2.mutimode.data.h(new ModeDetail(dVar, "图片模式", "https://7n.bczcdn.com/r/q9uweeng2wuwnqmybkh97ggp9zkdgfss.jpg", "图片联想记忆，多感官刺激左右脑记忆", a00.h0.J()), true), new com.baicizhan.main.activity.schedule_v2.mutimode.data.h(new ModeDetail(dVar, "图片模式", "https://7n.bczcdn.com/r/q9uweeng2wuwnqmybkh97ggp9zkdgfss.jpg", "图片联想记忆，多感官刺激左右脑记忆", a00.h0.J()), false)));
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.a
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 n11;
                        n11 = g.n((com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj);
                        return n11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.l lVar = (x00.l) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.b
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 o11;
                        o11 = g.o((com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj);
                        return o11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ModeLIstUiKt.p(eVar, lVar, (x00.l) rememberedValue2, composer, 432);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 n(com.baicizhan.main.activity.schedule_v2.mutimode.data.h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 o(com.baicizhan.main.activity.schedule_v2.mutimode.data.h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> g() {
        return f19334c;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> h() {
        return f19333b;
    }
}
