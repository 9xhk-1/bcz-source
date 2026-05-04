package gs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ok extends nk {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56242d = null;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56243e;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56244b;

    /* renamed from: c, reason: collision with root package name */
    public long f56245c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56243e = sparseIntArray;
        sparseIntArray.put(R.id.ext_list, 1);
    }

    public ok(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f56242d, f56243e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56245c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56245c != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56245c = 1L;
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

    public ok(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RecyclerView) bindings[1]);
        this.f56245c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56244b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
