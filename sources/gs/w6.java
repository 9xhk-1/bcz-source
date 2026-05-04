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
public class w6 extends v6 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57284j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57285k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57286h;

    /* renamed from: i, reason: collision with root package name */
    public long f57287i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57285k = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.card, 2);
        sparseIntArray.put(R.id.plan_desc, 3);
        sparseIntArray.put(R.id.mode_desc, 4);
        sparseIntArray.put(R.id.words_count, 5);
        sparseIntArray.put(R.id.btn_start, 6);
        sparseIntArray.put(R.id.tip, 7);
    }

    public w6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f57284j, f57285k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57287i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57287i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57287i = 1L;
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

    public w6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[6], (View) bindings[2], (TextView) bindings[4], (TextView) bindings[3], (TextView) bindings[7], (TextView) bindings[1], (TextView) bindings[5]);
        this.f57287i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57286h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
