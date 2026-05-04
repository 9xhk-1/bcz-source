package wm;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.internal.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f96512a = {R.attr.stateListAnimator};

    public static void a(@NonNull View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(@NonNull View view, float f11) {
        int integer = view.getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j11 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.google.android.material.R.attr.state_liftable, -com.google.android.material.R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j11));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f11).setDuration(j11));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(@NonNull View view, AttributeSet attributeSet, int i11, int i12) {
        Context context = view.getContext();
        TypedArray k11 = d0.k(context, attributeSet, f96512a, i11, i12, new int[0]);
        try {
            if (k11.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, k11.getResourceId(0, 0)));
            }
            k11.recycle();
        } catch (Throwable th2) {
            k11.recycle();
            throw th2;
        }
    }
}
