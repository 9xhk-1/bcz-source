package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ln extends kn {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55801k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55802l;

    /* renamed from: j, reason: collision with root package name */
    public long f55803j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55802l = sparseIntArray;
        sparseIntArray.put(R.id.collect, 1);
        sparseIntArray.put(R.id.collect_icon, 2);
        sparseIntArray.put(R.id.word, 3);
        sparseIntArray.put(R.id.accent_container, 4);
        sparseIntArray.put(R.id.accent, 5);
        sparseIntArray.put(R.id.accent_voice, 6);
        sparseIntArray.put(R.id.cnmean, 7);
        sparseIntArray.put(R.id.variant, 8);
    }

    public ln(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f55801k, f55802l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55803j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55803j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55803j = 1L;
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

    public ln(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[5], (FlowLayout) bindings[4], (ImageView) bindings[6], (TextView) bindings[7], (FrameLayout) bindings[1], (ImageView) bindings[2], (ConstraintLayout) bindings[0], (TextView) bindings[8], (AppCompatTextView) bindings[3]);
        this.f55803j = -1L;
        this.f55656g.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
