package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class sk extends rk {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56766g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56767h;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56768e;

    /* renamed from: f, reason: collision with root package name */
    public long f56769f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56767h = sparseIntArray;
        sparseIntArray.put(R.id.mean_type, 1);
        sparseIntArray.put(R.id.mean_content, 2);
        sparseIntArray.put(R.id.noproguard_title_group, 3);
        sparseIntArray.put(R.id.sentence_list, 4);
    }

    public sk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f56766g, f56767h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56769f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56769f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56769f = 1L;
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

    public sk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[1], (Group) bindings[3], (RecyclerView) bindings[4]);
        this.f56769f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56768e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
