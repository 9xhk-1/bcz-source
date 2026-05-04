package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
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
public class m4 extends l4 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55842j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55843k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55844h;

    /* renamed from: i, reason: collision with root package name */
    public long f55845i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55843k = sparseIntArray;
        sparseIntArray.put(R.id.dialog_bg, 1);
        sparseIntArray.put(R.id.image, 2);
        sparseIntArray.put(R.id.feedback, 3);
        sparseIntArray.put(R.id.noproguard_feedback_arrow, 4);
        sparseIntArray.put(R.id.noproguard_feedback_options, 5);
        sparseIntArray.put(R.id.closed, 6);
        sparseIntArray.put(R.id.feedback_group, 7);
    }

    public m4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f55842j, f55843k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55845i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55845i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55845i = 1L;
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

    public m4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[6], (View) bindings[1], (TextView) bindings[3], (Group) bindings[7], (ImageView) bindings[2], (ImageView) bindings[4], (RecyclerView) bindings[5]);
        this.f55845i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55844h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
