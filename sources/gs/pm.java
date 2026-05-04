package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.customview.ShowOffDragView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class pm extends om {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56413m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56414n;

    /* renamed from: l, reason: collision with root package name */
    public long f56415l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        f56413m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"showoff_drag_view_card"}, new int[]{1}, new int[]{R.layout.showoff_drag_view_card});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56414n = sparseIntArray;
        sparseIntArray.put(R.id.bg_circle, 2);
        sparseIntArray.put(R.id.center_img, 3);
        sparseIntArray.put(R.id.main_title, 4);
        sparseIntArray.put(R.id.sub_title, 5);
        sparseIntArray.put(R.id.arrow_container, 6);
        sparseIntArray.put(R.id.arrow_1, 7);
        sparseIntArray.put(R.id.arrow_2, 8);
        sparseIntArray.put(R.id.bg_ribbon, 9);
        sparseIntArray.put(R.id.close, 10);
    }

    public pm(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, f56413m, f56414n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56415l = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f56259h);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56415l != 0) {
                    return true;
                }
                return this.f56259h.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(qm DragCard, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56415l |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56415l = 2L;
        }
        this.f56259h.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((qm) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56259h.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public pm(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ImageView) bindings[7], (ImageView) bindings[8], (LinearLayout) bindings[6], (ImageView) bindings[2], (ImageView) bindings[9], (ImageView) bindings[3], (ImageView) bindings[10], (qm) bindings[1], (ImageView) bindings[4], (ShowOffDragView) bindings[0], (ImageView) bindings[5]);
        this.f56415l = -1L;
        setContainedBinding(this.f56259h);
        this.f56261j.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
