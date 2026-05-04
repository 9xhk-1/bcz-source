package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class of extends nf {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56219f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56220g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56221d;

    /* renamed from: e, reason: collision with root package name */
    public long f56222e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56220g = sparseIntArray;
        sparseIntArray.put(R.id.type, 1);
        sparseIntArray.put(R.id.content, 2);
        sparseIntArray.put(R.id.percent, 3);
    }

    public of(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56219f, f56220g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56222e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56222e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56222e = 1L;
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

    public of(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[1]);
        this.f56222e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56221d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
