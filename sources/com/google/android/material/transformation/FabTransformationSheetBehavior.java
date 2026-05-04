package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import vm.i;
import vm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f32726l;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public FabTransformationBehavior.e I(Context context, boolean z11) {
        int i11 = z11 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f32715a = i.d(context, i11);
        eVar.f32716b = new k(17, 0.0f, 0.0f);
        return eVar;
    }

    public final void K(@NonNull View view, boolean z11) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                this.f32726l = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z12) {
                    if (z11) {
                        this.f32726l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f32726l;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.f32726l.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z11) {
                return;
            }
            this.f32726l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean l(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        K(view2, z11);
        return super.l(view, view2, z11, z12);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
