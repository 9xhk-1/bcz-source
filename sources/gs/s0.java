package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class s0 extends r0 {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56689h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56690i;

    /* renamed from: g, reason: collision with root package name */
    public long f56691g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56690i = sparseIntArray;
        sparseIntArray.put(R.id.bottomsheet, 1);
        sparseIntArray.put(R.id.direct_container, 2);
        sparseIntArray.put(R.id.fragment_container, 3);
        sparseIntArray.put(R.id.video_container, 4);
        sparseIntArray.put(R.id.close, 5);
    }

    public s0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56689h, f56690i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56691g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56691g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56691g = 1L;
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

    public s0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (BottomSheetLayout) bindings[1], (ImageView) bindings[5], (FrameLayout) bindings[2], (FrameLayout) bindings[3], (FrameLayout) bindings[0], (FrameLayout) bindings[4]);
        this.f56691g = -1L;
        this.f56557e.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
