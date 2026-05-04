package androidx.compose.ui.viewinterop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewbinding.R;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,218:1\n75#2:219\n75#2:226\n1247#3,6:220\n1247#3,6:227\n1247#3,6:234\n1247#3,6:240\n1247#3,6:246\n1#4:233\n55#5,4:252\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n150#1:219\n164#1:226\n155#1:220,6\n166#1:227,6\n174#1:234,6\n175#1:240,6\n195#1:246,6\n211#1:252,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(@k final q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, @l Modifier modifier, @l x00.l<? super T, g2> lVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        final Modifier modifier2;
        final x00.l<? super T, g2> lVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(qVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            x00.l<? super T, g2> lVar3 = i15 != 0 ? new x00.l<T, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$1
                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(ViewBinding viewBinding) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                    invoke((ViewBinding) obj);
                    return g2.f100423a;
                }
            } : lVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i13, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(qVar, modifier3, null, null, lVar3, startRestartGroup, (i13 & 14) | 384 | (i13 & 112) | (57344 & (i13 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            lVar2 = lVar3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lVar2 = lVar;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$2
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

                public final void invoke(Composer composer2, int i16) {
                    AndroidViewBindingKt.AndroidViewBinding(qVar, modifier2, lVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, x00.l<? super FragmentContainerView, g2> lVar) {
        if (viewGroup instanceof FragmentContainerView) {
            lVar.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, lVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(R.id.binding_reference);
        g0.n(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t11) {
        view.setTag(R.id.binding_reference, t11);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(@m80.k final x00.q<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r19, @m80.l androidx.compose.ui.Modifier r20, @m80.l x00.l<? super T, yz.g2> r21, @m80.l x00.l<? super T, yz.g2> r22, @m80.l x00.l<? super T, yz.g2> r23, @m80.l androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(x00.q, androidx.compose.ui.Modifier, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
