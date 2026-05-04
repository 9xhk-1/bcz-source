package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a0 extends z {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54111k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54112l;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54113i;

    /* renamed from: j, reason: collision with root package name */
    public long f54114j;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f54111k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54112l = sparseIntArray;
        sparseIntArray.put(R.id.tv_pay_consumed, 2);
        sparseIntArray.put(R.id.tv_pay_no_consumed, 3);
        sparseIntArray.put(R.id.tv_result, 4);
        sparseIntArray.put(R.id.tv_copy, 5);
        sparseIntArray.put(R.id.tv_result_content, 6);
        sparseIntArray.put(R.id.tv_service, 7);
        sparseIntArray.put(R.id.tv_service_content, 8);
    }

    public a0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f54111k, f54112l));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54114j |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54114j;
            this.f54114j = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f57681a.P(Boolean.TRUE);
        }
        ViewDataBinding.executeBindingsOn(this.f57681a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54114j != 0) {
                    return true;
                }
                return this.f57681a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54114j = 2L;
        }
        this.f57681a.invalidateAll();
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
        this.f57681a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public a0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (TextView) bindings[5], (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[6], (TextView) bindings[7], (TextView) bindings[8]);
        this.f54114j = -1L;
        setContainedBinding(this.f57681a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54113i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
