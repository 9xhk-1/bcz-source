package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class s2 extends r2 {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56698h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56699i;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56700f;

    /* renamed from: g, reason: collision with root package name */
    public long f56701g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56699i = sparseIntArray;
        sparseIntArray.put(R.id.back, 1);
        sparseIntArray.put(R.id.skip, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.title_tip, 4);
        sparseIntArray.put(R.id.grades, 5);
    }

    public s2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56698h, f56699i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56701g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56701g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56701g = 1L;
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

    public s2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (RecyclerView) bindings[5], (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[4]);
        this.f56701g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56700f = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
