package com.baicizhan.main.activity.schedule_v2.mutimode;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDesc;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail;
import gs.k6;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nModeDesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeDesDialog.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModeDesDialog\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n1247#2,6:61\n*S KotlinDebug\n*F\n+ 1 ModeDesDialog.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModeDesDialog\n*L\n41#1:61,6\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class l extends h {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f19388g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f19389h = 8;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f19390i = "mode_detail";

    /* renamed from: f, reason: collision with root package name */
    public k6 f19391f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final l a(@m80.k ModeDetail modeDetail) {
            kotlin.jvm.internal.g0.p(modeDetail, "modeDetail");
            Bundle bundle = new Bundle();
            bundle.putParcelable(l.f19390i, modeDetail);
            l lVar = new l();
            lVar.setArguments(bundle);
            return lVar;
        }

        public a() {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 A(ModeDetail modeDetail, final l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1182968895, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesDialog.onViewCreated.<anonymous>.<anonymous> (ModeDesDialog.kt:40)");
            }
            List<ModeDesc> i12 = modeDetail.i();
            String l11 = modeDetail.l();
            boolean changedInstance = composer.changedInstance(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.i
                    @Override // x00.a
                    public final Object invoke() {
                        g2 B;
                        B = l.B(l.this);
                        return B;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            g0.B(i12, l11, (x00.a) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 B(l lVar) {
        lVar.dismiss();
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 z(final ModeDetail modeDetail, final l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386125333, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeDesDialog.onViewCreated.<anonymous> (ModeDesDialog.kt:39)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1182968895, true, new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.j
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 A;
                    A = l.A(ModeDetail.this, lVar, (Composer) obj, ((Integer) obj2).intValue());
                    return A;
                }
            }, composer, 54), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public final void C(@m80.k k6 k6Var) {
        kotlin.jvm.internal.g0.p(k6Var, "<set-?>");
        this.f19391f = k6Var;
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        k6 d11 = k6.d(inflater);
        kotlin.jvm.internal.g0.o(d11, "inflate(...)");
        C(d11);
        return y().getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        WindowManager.LayoutParams attributes = (dialog == null || (window3 = dialog.getWindow()) == null) ? null : window3.getAttributes();
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawableResource(R.color.transparent);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        if (attributes != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
            attributes.windowAnimations = com.jiongji.andriod.card.R.style.bottomDialogAnimation;
            layoutParams = attributes;
        }
        window.setAttributes(layoutParams);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@m80.k View view, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        final ModeDetail modeDetail = arguments != null ? (ModeDetail) arguments.getParcelable(f19390i) : null;
        if (modeDetail == null) {
            dismiss();
        } else {
            y().f55577a.setContent(ComposableLambdaKt.composableLambdaInstance(386125333, true, new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.k
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 z11;
                    z11 = l.z(ModeDetail.this, this, (Composer) obj, ((Integer) obj2).intValue());
                    return z11;
                }
            }));
        }
    }

    @m80.k
    public final k6 y() {
        k6 k6Var = this.f19391f;
        if (k6Var != null) {
            return k6Var;
        }
        kotlin.jvm.internal.g0.S("binding");
        return null;
    }
}
