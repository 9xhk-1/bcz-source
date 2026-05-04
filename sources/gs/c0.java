package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c0 extends b0 {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54345e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54346f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54347c;

    /* renamed from: d, reason: collision with root package name */
    public long f54348d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f54345e = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54346f = sparseIntArray;
        sparseIntArray.put(R.id.container, 2);
    }

    public c0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f54345e, f54346f));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54348d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54348d;
            this.f54348d = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f54211a.P(Boolean.TRUE);
        }
        ViewDataBinding.executeBindingsOn(this.f54211a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54348d != 0) {
                    return true;
                }
                return this.f54211a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54348d = 2L;
        }
        this.f54211a.invalidateAll();
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
        this.f54211a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public c0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (LinearLayout) bindings[2]);
        this.f54348d = -1L;
        setContainedBinding(this.f54211a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54347c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
