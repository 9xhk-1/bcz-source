package com.baicizhan.main.home.plan.golden;

import a00.h0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.home.plan.golden.GoldenView;
import com.baicizhan.main.model.data.GoldenNavigation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import qb.c;
import x00.l;
import x00.p;
import yz.g2;
import zg.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nGoldenUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoldenUI.kt\ncom/baicizhan/main/home/plan/golden/GoldenView\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,331:1\n1247#2,6:332\n1247#2,6:338\n1247#2,6:344\n85#3:350\n64#4,5:351\n*S KotlinDebug\n*F\n+ 1 GoldenUI.kt\ncom/baicizhan/main/home/plan/golden/GoldenView\n*L\n85#1:332,6\n91#1:338,6\n108#1:344,6\n85#1:350\n117#1:351,5\n*E\n"})
/* loaded from: classes4.dex */
public final class GoldenView extends AbstractComposeView {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22420d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LifecycleOwner f22421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MutableState<GoldenNavigation> f22422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MutableState<Boolean> f22423c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 GoldenUI.kt\ncom/baicizhan/main/home/plan/golden/GoldenView\n*L\n1#1,67:1\n118#2,2:68\n*E\n"})
    public static final class a implements DisposableEffectResult {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f22425b;

        public a(LifecycleEventObserver lifecycleEventObserver) {
            this.f22425b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            GoldenView.this.f22421a.getLifecycle().removeObserver(this.f22425b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22426a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22426a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public GoldenView(@k Context context, @k LifecycleOwner lifecycleOwner) {
        this(context, lifecycleOwner, null, 0, 12, null);
        g0.p(context, "context");
        g0.p(lifecycleOwner, "lifecycleOwner");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(final GoldenView goldenView, Composer composer, int i11) {
        String str;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204737650, i11, -1, "com.baicizhan.main.home.plan.golden.GoldenView.Content.<anonymous> (GoldenUI.kt:84)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = goldenView.f22422b;
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            if (g(mutableState).getItems().isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return g2.f100423a;
            }
            boolean changed = composer.changed(goldenView.f22423c.getValue());
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new l() { // from class: ng.o
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = GoldenView.h(GoldenView.this, mutableState, ((Integer) obj).intValue());
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            str = ng.k.f75118a;
            c.i(str, "GoldenView", new Object[0]);
            ng.k.m(null, g(mutableState), (l) rememberedValue2, composer, 0, 1);
            GoldenNavigation g11 = g(mutableState);
            boolean changedInstance = composer.changedInstance(goldenView);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new l() { // from class: ng.p
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        DisposableEffectResult i12;
                        i12 = GoldenView.i(GoldenView.this, mutableState, (DisposableEffectScope) obj);
                        return i12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.DisposableEffect(g11, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final GoldenNavigation g(MutableState<GoldenNavigation> mutableState) {
        return mutableState.getValue();
    }

    public static final g2 h(GoldenView goldenView, MutableState mutableState, int i11) {
        List Q;
        zg.a aVar = g(mutableState).getItems().get(i11);
        if (aVar instanceof a.C1395a) {
            a.C1395a c1395a = (a.C1395a) aVar;
            Q = h0.Q(Integer.valueOf(c1395a.j()), "", c1395a.i());
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = (a.b) aVar;
            Q = h0.Q(Integer.valueOf(bVar.l()), bVar.k(), bVar.j());
        }
        Object obj = Q.get(0);
        Object obj2 = Q.get(1);
        Object obj3 = Q.get(2);
        g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        g0.n(obj2, "null cannot be cast to non-null type kotlin.String");
        g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
        Boolean value = goldenView.f22423c.getValue();
        Context context = goldenView.getContext();
        g0.o(context, "getContext(...)");
        ng.k.w(i11, intValue, (String) obj2, (String) obj3, value, context);
        return g2.f100423a;
    }

    public static final DisposableEffectResult i(GoldenView goldenView, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        g0.p(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: ng.l
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                GoldenView.j(MutableState.this, lifecycleOwner, event);
            }
        };
        goldenView.f22421a.getLifecycle().addObserver(lifecycleEventObserver);
        return goldenView.new a(lifecycleEventObserver);
    }

    public static final void j(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(lifecycleOwner, "<unused var>");
        g0.p(event, "event");
        if (b.f22426a[event.ordinal()] != 2) {
            return;
        }
        ng.k.x(g(mutableState));
    }

    public static final g2 k(GoldenView goldenView, int i11, Composer composer, int i12) {
        goldenView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(486624994);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486624994, i12, -1, "com.baicizhan.main.home.plan.golden.GoldenView.Content (GoldenUI.kt:82)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-204737650, true, new p() { // from class: ng.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 f11;
                    f11 = GoldenView.f(GoldenView.this, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: ng.n
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 k11;
                    k11 = GoldenView.k(GoldenView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return k11;
                }
            });
        }
    }

    @k
    public final MutableState<Boolean> getAvailability() {
        return this.f22423c;
    }

    @k
    public final MutableState<GoldenNavigation> getGoldenNavigation() {
        return this.f22422b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public GoldenView(@k Context context, @k LifecycleOwner lifecycleOwner, @m80.l AttributeSet attributeSet) {
        this(context, lifecycleOwner, attributeSet, 0, 8, null);
        g0.p(context, "context");
        g0.p(lifecycleOwner, "lifecycleOwner");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public GoldenView(@k Context context, @k LifecycleOwner lifecycleOwner, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        g0.p(lifecycleOwner, "lifecycleOwner");
        this.f22421a = lifecycleOwner;
        this.f22422b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new GoldenNavigation(h0.J()), null, 2, null);
        this.f22423c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ GoldenView(Context context, LifecycleOwner lifecycleOwner, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, lifecycleOwner, (i12 & 4) != 0 ? null : attributeSet, (i12 & 8) != 0 ? 0 : i11);
    }
}
