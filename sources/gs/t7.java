package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class t7 extends s7 {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56837h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56838i;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f56839f;

    /* renamed from: g, reason: collision with root package name */
    public long f56840g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56838i = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.top_bar_container, 2);
        sparseIntArray.put(R.id.top_title, 3);
        sparseIntArray.put(R.id.button_right, 4);
        sparseIntArray.put(R.id.container, 5);
    }

    public t7(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56837h, f56838i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56840g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56840g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56840g = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public t7(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppBarLayout) bindings[1], (RedDotImageView) bindings[4], (NestedScrollView) bindings[5], (FrameLayout) bindings[2], (TextView) bindings[3]);
        this.f56840g = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) bindings[0];
        this.f56839f = coordinatorLayout;
        coordinatorLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
