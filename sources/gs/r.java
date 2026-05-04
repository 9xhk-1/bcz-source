package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r extends q {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56549h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56550i;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56551f;

    /* renamed from: g, reason: collision with root package name */
    public long f56552g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f56549h = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic"}, new int[]{2}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56550i = sparseIntArray;
        sparseIntArray.put(R.id.bottomsheet, 3);
        sparseIntArray.put(R.id.fragment_container, 4);
        sparseIntArray.put(R.id.video_container, 5);
    }

    public r(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56549h, f56550i));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56552g |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56552g;
            this.f56552g = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f56420a.F(0);
            this.f56420a.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f56420a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56552g != 0) {
                    return true;
                }
                return this.f56420a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56552g = 2L;
        }
        this.f56420a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56420a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public r(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[2], (BottomSheetLayout) bindings[3], (FrameLayout) bindings[4], (FrameLayout) bindings[0], (FrameLayout) bindings[5]);
        this.f56552g = -1L;
        setContainedBinding(this.f56420a);
        LinearLayout linearLayout = (LinearLayout) bindings[1];
        this.f56551f = linearLayout;
        linearLayout.setTag(null);
        this.f56423d.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
