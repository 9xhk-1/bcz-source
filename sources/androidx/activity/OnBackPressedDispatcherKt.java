package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcherKt {
    @m80.k
    public static final OnBackPressedCallback addCallback(@m80.k OnBackPressedDispatcher onBackPressedDispatcher, @m80.l LifecycleOwner lifecycleOwner, final boolean z11, @m80.k final x00.l<? super OnBackPressedCallback, g2> onBackPressed) {
        g0.p(onBackPressedDispatcher, "<this>");
        g0.p(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z11) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
            return onBackPressedCallback;
        }
        onBackPressedDispatcher.addCallback(onBackPressedCallback);
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z11, lVar);
    }
}
