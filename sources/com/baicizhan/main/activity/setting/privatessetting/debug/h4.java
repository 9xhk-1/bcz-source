package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.badlogic.gdx.utils.a;
import com.baicizhan.main.home.player.IslandsKt;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.a;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.bounds.ContentMode;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSpineInCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpineInCompose.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/SpineInComposeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1247#2,6:270\n1247#2,6:313\n1247#2,6:319\n1247#2,6:329\n1247#2,6:335\n1247#2,6:341\n1247#2,6:347\n1247#2,6:390\n1247#2,6:396\n1247#2,6:402\n1247#2,6:413\n1247#2,6:456\n1247#2,6:462\n1247#2,6:472\n70#3:276\n68#3,8:277\n77#3:328\n70#3:353\n67#3,9:354\n77#3:412\n70#3:419\n68#3,8:420\n77#3:471\n79#4,6:285\n86#4,3:300\n89#4,2:309\n93#4:327\n79#4,6:363\n86#4,3:378\n89#4,2:387\n93#4:411\n79#4,6:428\n86#4,3:443\n89#4,2:452\n93#4:470\n347#5,9:291\n356#5:311\n357#5,2:325\n347#5,9:369\n356#5:389\n357#5,2:409\n347#5,9:434\n356#5:454\n357#5,2:468\n4206#6,6:303\n4206#6,6:381\n4206#6,6:446\n113#7:312\n113#7:455\n75#8:408\n85#9:478\n113#9,2:479\n85#9:481\n113#9,2:482\n85#9:484\n113#9,2:485\n230#10,2:487\n*S KotlinDebug\n*F\n+ 1 SpineInCompose.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/SpineInComposeKt\n*L\n52#1:270,6\n72#1:313,6\n75#1:319,6\n88#1:329,6\n89#1:335,6\n92#1:341,6\n93#1:347,6\n174#1:390,6\n182#1:396,6\n188#1:402,6\n221#1:413,6\n244#1:456,6\n247#1:462,6\n260#1:472,6\n62#1:276\n62#1:277,8\n62#1:328\n168#1:353\n168#1:354,9\n168#1:412\n234#1:419\n234#1:420,8\n234#1:471\n62#1:285,6\n62#1:300,3\n62#1:309,2\n62#1:327\n168#1:363,6\n168#1:378,3\n168#1:387,2\n168#1:411\n234#1:428,6\n234#1:443,3\n234#1:452,2\n234#1:470\n62#1:291,9\n62#1:311\n62#1:325,2\n168#1:369,9\n168#1:389\n168#1:409,2\n234#1:434,9\n234#1:454\n234#1:468,2\n62#1:303,6\n168#1:381,6\n234#1:446,6\n68#1:312\n240#1:455\n198#1:408\n88#1:478\n88#1:479,2\n89#1:481\n89#1:482,2\n92#1:484\n92#1:485,2\n159#1:487,2\n*E\n"})
/* loaded from: classes4.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f19717a;

    /* renamed from: c, reason: collision with root package name */
    public static int f19719c;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String[] f19718b = {"ani_idle", "ani_angry", "ani_happy", "ani_impatience"};

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String[] f19720d = {"role_start", "role_chuji", "role_grow_2", "role_xunhuan1", "role_xunhuan2"};

    public static final long A(MutableState<Size> mutableState) {
        return mutableState.getValue().m2342unboximpl();
    }

    public static final void B(MutableState<Size> mutableState, long j11) {
        mutableState.setValue(Size.m2325boximpl(j11));
    }

    public static final void C(MutableState mutableState, final MutableState mutableState2, final com.esotericsoftware.spine.android.c cVar) {
        cVar.j().d(0.5f);
        cVar.i().x(0, "leve0-idle", true);
        cVar.i().d(new a(cVar, mutableState));
        cVar.u(new ml.b() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b4
            @Override // ml.b
            public final void a(com.esotericsoftware.spine.android.c cVar2, Canvas canvas, com.badlogic.gdx.utils.a aVar) {
                h4.D(MutableState.this, cVar2, canvas, aVar);
            }
        });
        cVar.i();
        cVar.v(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.c4
            @Override // ml.d
            public final void a(com.esotericsoftware.spine.android.c cVar2) {
                h4.E(com.esotericsoftware.spine.android.c.this, cVar2);
            }
        });
    }

    public static final void D(MutableState mutableState, com.esotericsoftware.spine.android.c cVar, Canvas canvas, com.badlogic.gdx.utils.a aVar) {
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        kl.b l11 = cVar.l();
        qb.c.i("test", "canvas width: " + canvas.getWidth() + ", height: " + canvas.getHeight(), new Object[0]);
        a.b<com.esotericsoftware.spine.b> it = l11.g().i().iterator();
        kotlin.jvm.internal.g0.o(it, "iterator(...)");
        while (it.hasNext()) {
            com.esotericsoftware.spine.b next = it.next();
            float B = next.B();
            float C = next.C();
            if (kotlin.jvm.internal.g0.g(next.n().f(), "icon_button")) {
                qb.c.i("test", "bone: " + next.n().f() + ", x: " + B + ", y: " + C, new Object[0]);
                Matrix matrix = canvas.getMatrix();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("matrix: ");
                sb2.append(matrix);
                qb.c.i("test", sb2.toString(), new Object[0]);
                float[] fArr = {B, C};
                Matrix matrix2 = new Matrix();
                canvas.getMatrix(matrix2);
                matrix2.mapPoints(fArr);
                canvas.drawRect(new RectF(B - 10.0f, C - 10.0f, B + 10.0f, C + 10.0f), paint);
                z(mutableState, new PointF(fArr[0], fArr[1]));
                canvas.getHeight();
                canvas.drawRect(new RectF(0.0f, 0.0f, canvas.getWidth(), 1.0f), paint);
            }
        }
    }

    public static final void E(com.esotericsoftware.spine.android.c cVar, com.esotericsoftware.spine.android.c cVar2) {
        com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> i11 = cVar.l().g().i();
        kotlin.jvm.internal.g0.o(i11, "getBones(...)");
        for (com.esotericsoftware.spine.b bVar : i11) {
            if (kotlin.jvm.internal.g0.g(bVar.n().f(), "icon_button")) {
                if (bVar != null) {
                    cVar.i();
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(351180614);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(351180614, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.FoxAnimation (SpineInCompose.kt:50)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d4
                    @Override // ml.d
                    public final void a(com.esotericsoftware.spine.android.c cVar) {
                        h4.G(cVar);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(100)), bk.b.t(), null, 2, null);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(cVar);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.e4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 H;
                        H = h4.H(com.esotericsoftware.spine.android.c.this);
                        return H;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m235backgroundbw27NRU$default, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue3, 28, null);
            boolean changedInstance2 = startRestartGroup.changedInstance(cVar);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.f4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        SpineView I;
                        I = h4.I(com.esotericsoftware.spine.android.c.this, (Context) obj);
                        return I;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AndroidView_androidKt.AndroidView((x00.l) rememberedValue4, m267clickableO2vRcR0$default, null, startRestartGroup, 0, 4);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J;
                    J = h4.J(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            });
        }
    }

    public static final void G(com.esotericsoftware.spine.android.c cVar) {
        cVar.j().d(0.5f);
        cVar.i().x(0, "ani_idle", true);
    }

    public static final yz.g2 H(com.esotericsoftware.spine.android.c cVar) {
        com.esotericsoftware.spine.a i11 = cVar.i();
        String[] strArr = f19718b;
        int i12 = f19717a;
        f19717a = i12 + 1;
        i11.x(0, strArr[i12 % strArr.length], true);
        return yz.g2.f100423a;
    }

    public static final SpineView I(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/fox_mini.atlas.txt", "spine/fox_mini.skel.bytes").d(ContentMode.FIT).c(new ll.d()).a();
    }

    public static final yz.g2 J(int i11, Composer composer, int i12) {
        F(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1737078310);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1737078310, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.Island (SpineInCompose.kt:219)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.q3
                    @Override // ml.d
                    public final void a(com.esotericsoftware.spine.android.c cVar) {
                        h4.L(cVar);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f11 = 100;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m775sizeVpY3zN4(companion2, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), bk.b.t(), null, 2, null);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(cVar);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.y3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 M;
                        M = h4.M(com.esotericsoftware.spine.android.c.this);
                        return M;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m235backgroundbw27NRU$default, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue3, 28, null);
            boolean changedInstance2 = startRestartGroup.changedInstance(cVar);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.z3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        SpineView N;
                        N = h4.N(com.esotericsoftware.spine.android.c.this, (Context) obj);
                        return N;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AndroidView_androidKt.AndroidView((x00.l) rememberedValue4, m267clickableO2vRcR0$default, null, startRestartGroup, 0, 4);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = h4.O(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    public static final void L(com.esotericsoftware.spine.android.c cVar) {
        cVar.j().d(0.5f);
        cVar.i().x(0, "role_start", true);
    }

    public static final yz.g2 M(com.esotericsoftware.spine.android.c cVar) {
        com.esotericsoftware.spine.a i11 = cVar.i();
        String[] strArr = f19720d;
        int i12 = f19719c;
        f19719c = i12 + 1;
        i11.x(0, strArr[i12 % strArr.length], true);
        return yz.g2.f100423a;
    }

    public static final SpineView N(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/ui_xiaodao.atlas.txt", "spine/ui_xiaodao.skel.bytes").d(ContentMode.FIT).c(new ll.e("role_start")).a();
    }

    public static final yz.g2 O(int i11, Composer composer, int i12) {
        K(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void P(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1038111093);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038111093, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.TestList (SpineInCompose.kt:258)");
            }
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.w3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 Q;
                        Q = h4.Q((LazyGridScope) obj);
                        return Q;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, null, null, null, false, null, (x00.l) rememberedValue, startRestartGroup, 0, 6, 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.x3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 R;
                    R = h4.R(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return R;
                }
            });
        }
    }

    public static final yz.g2 Q(LazyGridScope LazyVerticalGrid) {
        kotlin.jvm.internal.g0.p(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, 300, null, null, null, x.f19846a.b(), 14, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(int i11, Composer composer, int i12) {
        P(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final int T() {
        return f19717a;
    }

    @m80.k
    public static final String[] U() {
        return f19718b;
    }

    public static final int V() {
        return f19719c;
    }

    @m80.k
    public static final String[] W() {
        return f19720d;
    }

    public static final void X(int i11) {
        f19717a = i11;
    }

    public static final void Y(int i11) {
        f19719c = i11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void r(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1900653314);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900653314, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.CityAnimation (SpineInCompose.kt:86)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new PointF(0.0f, 0.0f), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(Size.Companion.m2346getZeroNHjbRc()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.r3
                    @Override // ml.d
                    public final void a(com.esotericsoftware.spine.android.c cVar) {
                        h4.C(MutableState.this, mutableState2, cVar);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue4;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.s3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 t11;
                        t11 = h4.t(MutableState.this, (LayoutCoordinates) obj);
                        return t11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Modifier matchParentSize = boxScopeInstance.matchParentSize(ZIndexModifierKt.zIndex(OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (x00.l) rememberedValue5), 1.0f));
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue6;
            boolean changedInstance = startRestartGroup.changedInstance(cVar);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.t3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = h4.u(com.esotericsoftware.spine.android.c.this, mutableState);
                        return u11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(matchParentSize, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue7, 28, null);
            boolean changedInstance2 = startRestartGroup.changedInstance(cVar);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.u3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        SpineView v11;
                        v11 = h4.v(com.esotericsoftware.spine.android.c.this, (Context) obj);
                        return v11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            AndroidView_androidKt.AndroidView((x00.l) rememberedValue8, m267clickableO2vRcR0$default, null, startRestartGroup, 0, 4);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            startRestartGroup.startReplaceGroup(572104833);
            qb.c.i("TEST", "position: " + y(mutableState2), new Object[0]);
            TextKt.m1845Text4IGK_g(pn.j.f81006c + y(mutableState2).x + "," + y(mutableState2).y + pn.j.f81007d, BackgroundKt.m235backgroundbw27NRU$default(boxScopeInstance.align(ZIndexModifierKt.zIndex(OffsetKt.m685offsetVpY3zN4(companion2, density.mo373toDpu2uoSUM(y(mutableState2).x), density.mo373toDpu2uoSUM(y(mutableState2).y)), 2.0f), companion3.getTopStart()), bk.b.o(), null, 2, null), bk.b.d0(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 384, 0, 131064);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.v3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 w11;
                    w11 = h4.w(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            });
        }
    }

    public static final int s(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final yz.g2 t(MutableState mutableState, LayoutCoordinates it) {
        kotlin.jvm.internal.g0.p(it, "it");
        qb.c.i("test", "size: " + IntSize.m5289toStringimpl(it.mo3865getSizeYbymL2g()), new Object[0]);
        B(mutableState, IntSizeKt.m5298toSizeozmzZPI(it.mo3865getSizeYbymL2g()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 u(com.esotericsoftware.spine.android.c cVar, MutableState mutableState) {
        if (s(mutableState) < 7) {
            cVar.i().x(0, "leve" + s(mutableState) + "-levelup", false);
            x(mutableState, s(mutableState) + 1);
        }
        return yz.g2.f100423a;
    }

    public static final SpineView v(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/ani_building1.atlas.txt", "spine/ani_building1.skel.bytes").d(ContentMode.FIT).c(new ll.e("leve7-idle")).a();
    }

    public static final yz.g2 w(int i11, Composer composer, int i12) {
        r(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final void x(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final PointF y(MutableState<PointF> mutableState) {
        return mutableState.getValue();
    }

    public static final void z(MutableState<PointF> mutableState, PointF pointF) {
        mutableState.setValue(pointF);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f19721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f19722b;

        public a(com.esotericsoftware.spine.android.c cVar, MutableState<Integer> mutableState) {
            this.f19721a = cVar;
            this.f19722b = mutableState;
        }

        @Override // com.esotericsoftware.spine.a.d
        public void c(a.g gVar) {
            Animation c11;
            String c12;
            if (gVar == null || (c11 = gVar.c()) == null || (c12 = c11.c()) == null || !u30.k0.n3(c12, IslandsKt.f23312q, false, 2, null)) {
                this.f19721a.i().x(0, "leve" + h4.s(this.f19722b) + "-idle", true);
            }
        }

        @Override // com.esotericsoftware.spine.a.d
        public void a(a.g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void b(a.g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void e(a.g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void f(a.g gVar) {
        }

        @Override // com.esotericsoftware.spine.a.d
        public void d(a.g gVar, jl.c cVar) {
        }
    }
}
