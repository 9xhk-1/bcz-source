package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import m80.o;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,957:1\n32#2:958\n80#3:959\n1247#4,6:960\n1247#4,6:970\n1247#4,6:976\n1247#4,6:982\n1247#4,6:988\n1247#4,6:994\n1247#4,6:1000\n1247#4,6:1006\n75#5:966\n75#5:967\n75#5:968\n75#5:969\n79#6,6:1012\n86#6,3:1027\n89#6,2:1036\n93#6:1041\n79#6,6:1042\n86#6,3:1057\n89#6,2:1066\n93#6:1071\n347#7,9:1018\n356#7,3:1038\n347#7,9:1048\n356#7,3:1068\n4206#8,6:1030\n4206#8,6:1060\n85#9:1072\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n123#1:958\n123#1:959\n271#1:960,6\n306#1:970,6\n333#1:976,6\n348#1:982,6\n357#1:988,6\n369#1:994,6\n382#1:1000,6\n390#1:1006,6\n299#1:966\n300#1:967\n301#1:968\n302#1:969\n379#1:1012,6\n379#1:1027,3\n379#1:1036,2\n379#1:1041\n432#1:1042,6\n432#1:1057,3\n432#1:1066,2\n432#1:1071\n379#1:1018,9\n379#1:1038,3\n432#1:1048,9\n432#1:1068,3\n379#1:1030,6\n432#1:1060,6\n304#1:1072\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt {

    @k
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // x00.a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);
    private static final int PopupPropertiesBaseFlags = 262144;

    /* JADX WARN: Removed duplicated region for block: B:107:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Popup(@m80.k androidx.compose.ui.window.PopupPositionProvider r29, @m80.l x00.a<yz.g2> r30, @m80.l androidx.compose.ui.window.PopupProperties r31, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, x00.a, androidx.compose.ui.window.PopupProperties, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, g2> Popup$lambda$1(State<? extends p<? super Composer, ? super Integer, g2>> state) {
        return (p) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5367PopupK5zGePQ(@m80.l androidx.compose.ui.Alignment r25, long r26, @m80.l x00.a<yz.g2> r28, @m80.l androidx.compose.ui.window.PopupProperties r29, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m5367PopupK5zGePQ(androidx.compose.ui.Alignment, long, x00.a, androidx.compose.ui.window.PopupProperties, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(@k final String str, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i12, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:422)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), pVar, startRestartGroup, (i12 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    AndroidPopup_androidKt.PopupTestTag(str, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        int i12 = ((i11 << 3) & 112) | ((i11 >> 3) & 14) | 384;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        x00.a<ComposeUiNode> constructor = companion.getConstructor();
        int i13 = ((i12 << 6) & 896) | 6;
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
        Updater.m1958setimpl(m1951constructorimpl, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        pVar.invoke(composer, Integer.valueOf((i13 >> 6) & 14));
        composer.endNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12) {
        int i11 = !z11 ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i11 |= 8192;
        }
        return !z12 ? i11 | 512 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(PopupProperties popupProperties, boolean z11) {
        return (popupProperties.getInheritSecurePolicy$ui_release() && z11) ? popupProperties.getFlags$ui_release() | 8192 : (!popupProperties.getInheritSecurePolicy$ui_release() || z11) ? popupProperties.getFlags$ui_release() : popupProperties.getFlags$ui_release() & (-8193);
    }

    @k
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(@k View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    @o
    public static final boolean isPopupLayout(@k View view, @l String str) {
        if (view instanceof PopupLayout) {
            return str == null || g0.g(str, ((PopupLayout) view).getTestTag());
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
