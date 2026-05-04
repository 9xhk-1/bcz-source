package gs;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import cn.hugo.android.scanner.view.ViewfinderView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i5 extends h5 {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55272f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55273g;

    /* renamed from: e, reason: collision with root package name */
    public long f55274e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f55272f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55273g = sparseIntArray;
        sparseIntArray.put(R.id.capture_preview_view, 2);
        sparseIntArray.put(R.id.capture_viewfinder_view, 3);
    }

    public i5(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55272f, f55273g));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55274e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55274e;
            this.f55274e = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55138a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_black));
            this.f55138a.N(getRoot().getResources().getString(R.string.capture_button_photo));
            this.f55138a.V(getRoot().getResources().getString(R.string.capture_title));
            this.f55138a.W(true);
        }
        ViewDataBinding.executeBindingsOn(this.f55138a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55274e != 0) {
                    return true;
                }
                return this.f55138a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55274e = 2L;
        }
        this.f55138a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55138a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public i5(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (SurfaceView) bindings[2], (ViewfinderView) bindings[3], (ConstraintLayout) bindings[0]);
        this.f55274e = -1L;
        setContainedBinding(this.f55138a);
        this.f55141d.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
