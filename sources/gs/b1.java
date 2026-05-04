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
public class b1 extends a1 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54213g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54214h;

    /* renamed from: f, reason: collision with root package name */
    public long f54215f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54214h = sparseIntArray;
        sparseIntArray.put(R.id.bottomsheet, 1);
        sparseIntArray.put(R.id.fragment_container, 2);
        sparseIntArray.put(R.id.close, 3);
        sparseIntArray.put(R.id.video_container, 4);
    }

    public b1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f54213g, f54214h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54215f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54215f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54215f = 1L;
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

    public b1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (BottomSheetLayout) bindings[1], (ImageView) bindings[3], (FrameLayout) bindings[2], (FrameLayout) bindings[0], (FrameLayout) bindings[4]);
        this.f54215f = -1L;
        this.f54118d.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
