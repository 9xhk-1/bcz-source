package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n113#2:628\n1#3:629\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n444#1:628\n*E\n"})
/* loaded from: classes2.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    @k
    private final View composeView;

    @k
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;

    @k
    private x00.a<g2> onDismissRequest;

    @k
    private DialogProperties properties;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogWrapper(@k x00.a<g2> aVar, @k DialogProperties dialogProperties, @k View view, @k LayoutDirection layoutDirection, @k Density density, @k UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.getDecorFitsSystemWindows() ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        this.composeView = view;
        float m5115constructorimpl = Dp.m5115constructorimpl(8);
        this.maxSupportedElevation = m5115constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo377toPx0680j_4(m5115constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new l<OnBackPressedCallback, g2>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback onBackPressedCallback) {
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i12);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        g0.m(window);
        window.setFlags(shouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @k
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, @k KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress() || !keyEvent.isTracking() || keyEvent.isCanceled() || i11 != 111) {
            return super.onKeyUp(i11, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@k MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.isInsideContent(motionEvent)) {
            return onTouchEvent;
        }
        this.onDismissRequest.invoke();
        return true;
    }

    public final void setContent(@k CompositionContext compositionContext, @k p<? super Composer, ? super Integer, g2> pVar) {
        this.dialogLayout.setContent(compositionContext, pVar);
    }

    public final void updateParameters(@k x00.a<g2> aVar, @k DialogProperties dialogProperties, @k LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = dialogProperties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(dialogProperties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(dialogProperties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(decorFitsSystemWindows ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
