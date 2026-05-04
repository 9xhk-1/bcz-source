package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i2 extends h2 {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55261e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55262f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55263c;

    /* renamed from: d, reason: collision with root package name */
    public long f55264d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f55261e = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"showoff_drag_view"}, new int[]{2}, new int[]{R.layout.showoff_drag_view});
        f55262f = null;
    }

    public i2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f55261e, f55262f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55264d = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f55131b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55264d != 0) {
                    return true;
                }
                return this.f55131b.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(om ShowOffDragView, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55264d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55264d = 2L;
        }
        this.f55131b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((om) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55131b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public i2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (BottomSheetLayout) bindings[1], (om) bindings[2]);
        this.f55264d = -1L;
        this.f55130a.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f55263c = frameLayout;
        frameLayout.setTag(null);
        setContainedBinding(this.f55131b);
        setRootTag(root);
        invalidateAll();
    }
}
