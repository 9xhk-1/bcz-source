package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m5 extends l5 {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55846f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55847g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55848d;

    /* renamed from: e, reason: collision with root package name */
    public long f55849e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55847g = sparseIntArray;
        sparseIntArray.put(R.id.image, 1);
        sparseIntArray.put(R.id.closed, 2);
        sparseIntArray.put(R.id.closed2, 3);
    }

    public m5(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55846f, f55847g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55849e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55849e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55849e = 1L;
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

    public m5(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[2], (ImageView) bindings[3], (ImageView) bindings[1]);
        this.f55849e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55848d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
