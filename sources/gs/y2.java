package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class y2 extends x2 {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57540e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57541f;

    /* renamed from: d, reason: collision with root package name */
    public long f57542d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f57540e = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57541f = sparseIntArray;
        sparseIntArray.put(R.id.fragment_container, 2);
    }

    public y2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f57540e, f57541f));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57542d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57542d;
            this.f57542d = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f57397a.F(0);
            this.f57397a.P(Boolean.TRUE);
            this.f57397a.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f57397a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57542d != 0) {
                    return true;
                }
                return this.f57397a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57542d = 2L;
        }
        this.f57397a.invalidateAll();
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
        this.f57397a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public y2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (FrameLayout) bindings[0], (FrameLayout) bindings[2]);
        this.f57542d = -1L;
        setContainedBinding(this.f57397a);
        this.f57398b.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
