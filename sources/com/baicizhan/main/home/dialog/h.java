package com.baicizhan.main.home.dialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAppStoreSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStoreSheet.kt\ncom/baicizhan/main/home/dialog/AppStoreSheetKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,75:1\n29#2:76\n75#3:77\n1247#4,6:78\n1247#4,6:84\n1247#4,6:127\n1247#4,6:133\n1247#4,6:139\n87#5:90\n84#5,9:91\n94#5:148\n79#6,6:100\n86#6,3:115\n89#6,2:124\n93#6:147\n347#7,9:106\n356#7:126\n357#7,2:145\n4206#8,6:118\n*S KotlinDebug\n*F\n+ 1 AppStoreSheet.kt\ncom/baicizhan/main/home/dialog/AppStoreSheetKt\n*L\n29#1:76\n36#1:77\n42#1:78,6\n69#1:84,6\n46#1:127,6\n50#1:133,6\n62#1:139,6\n45#1:90\n45#1:91,9\n45#1:148\n45#1:100,6\n45#1:115,3\n45#1:124,2\n45#1:147\n45#1:106,9\n45#1:126\n45#1:145,2\n45#1:118,6\n*E\n"})
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f20906a = "AppStoreSheet";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.dialog.AppStoreSheetKt$AppStoreSheet$3$1", f = "AppStoreSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f20908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f20908b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f20908b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20907a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f20908b.setValue(l00.a.a(false));
            return g2.f100423a;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(@m80.k final MutableState<Boolean> visibility, @m80.l Composer composer, final int i11) {
        int i12;
        boolean z11;
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        Composer startRestartGroup = composer.startRestartGroup(59710417);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(visibility) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(59710417, i12, -1, "com.baicizhan.main.home.dialog.AppStoreSheet (AppStoreSheet.kt:34)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Uri q11 = q(context);
            final int checkAppStoreTargetCount = BottomSheetUtils.checkAppStoreTargetCount(context, q11, p(q11));
            if (visibility.getValue().booleanValue()) {
                startRestartGroup.startReplaceGroup(716877469);
                if (checkAppStoreTargetCount >= 0) {
                    startRestartGroup.startReplaceGroup(716899975);
                    z11 = (i12 & 14) == 4;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.dialog.a
                            @Override // x00.a
                            public final Object invoke() {
                                g2 i13;
                                i13 = h.i(MutableState.this);
                                return i13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    zj.e0.e(false, (x00.a) rememberedValue, ComposableLambdaKt.rememberComposableLambda(-1534900544, true, new x00.p() { // from class: com.baicizhan.main.home.dialog.b
                        @Override // x00.p
                        public final Object invoke(Object obj, Object obj2) {
                            g2 j11;
                            j11 = h.j(MutableState.this, context, checkAppStoreTargetCount, (Composer) obj, ((Integer) obj2).intValue());
                            return j11;
                        }
                    }, startRestartGroup, 54), startRestartGroup, 384, 1);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(718025678);
                    z11 = (i12 & 14) == 4;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new a(visibility, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    EffectsKt.LaunchedEffect("", (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
            } else {
                startRestartGroup.startReplaceGroup(715412657);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 o11;
                    o11 = h.o(MutableState.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            });
        }
    }

    public static final g2 i(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 j(final MutableState mutableState, final Context context, final int i11, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534900544, i12, -1, "com.baicizhan.main.home.dialog.AppStoreSheet.<anonymous> (AppStoreSheet.kt:44)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(companion, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m235backgroundbw27NRU$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.dialog.e
                    @Override // x00.a
                    public final Object invoke() {
                        g2 k11;
                        k11 = h.k(MutableState.this);
                        return k11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            SpacerKt.Spacer(ComposeUtilsKt.k(weight$default, 0L, false, (x00.a) rememberedValue, 3, null), composer, 0);
            boolean changedInstance = composer.changedInstance(context) | composer.changed(i11) | composer.changed(mutableState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.dialog.f
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        View l11;
                        l11 = h.l(context, i11, mutableState, (Context) obj);
                        return l11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar = (x00.l) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.dialog.g
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 n11;
                        n11 = h.n((View) obj);
                        return n11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(lVar, null, (x00.l) rememberedValue3, composer, 384, 2);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 k(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return g2.f100423a;
    }

    public static final View l(Context context, int i11, final MutableState mutableState, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Log.d(f20906a, "sheet content factory");
        return BottomSheetUtils.buildAppStoreBottomSheet(context, context.getPackageName(), i11 > 0 ? context.getString(R.string.my_tab_give_praise) : "没有可打开的应用", new hj.a() { // from class: com.baicizhan.main.home.dialog.d
            @Override // hj.a
            public final void onResult(Object obj) {
                h.m(MutableState.this, (Boolean) obj);
            }
        }, null);
    }

    public static final void m(MutableState mutableState, Boolean bool) {
        mutableState.setValue(Boolean.FALSE);
    }

    public static final g2 n(View view) {
        Log.d(f20906a, "sheet content update");
        return g2.f100423a;
    }

    public static final g2 o(MutableState mutableState, int i11, Composer composer, int i12) {
        h(mutableState, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final Intent p(Uri uri) {
        return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
    }

    public static final Uri q(Context context) {
        return Uri.parse("market://details?id=" + context.getPackageName());
    }
}
