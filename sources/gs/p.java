package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public class p extends o {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56276i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56277j;

    /* renamed from: h, reason: collision with root package name */
    public long f56278h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f56276i = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic_without_fit"}, new int[]{2}, new int[]{R.layout.action_bar_basic_without_fit});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56277j = sparseIntArray;
        sparseIntArray.put(R.id.bottomsheet, 3);
        sparseIntArray.put(R.id.fragment_container, 4);
        sparseIntArray.put(R.id.close, 5);
        sparseIntArray.put(R.id.video_container, 6);
    }

    public p(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f56276i, f56277j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56278h;
            this.f56278h = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f56138a.y(0);
            this.f56138a.K(false);
        }
        ViewDataBinding.executeBindingsOn(this.f56138a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56278h != 0) {
                    return true;
                }
                return this.f56138a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(c ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56278h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56278h = 2L;
        }
        this.f56138a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((c) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56138a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public p(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (c) bindings[2], (BottomSheetLayout) bindings[3], (ImageView) bindings[5], (FrameLayout) bindings[4], (LinearLayout) bindings[1], (FrameLayout) bindings[0], (FrameLayout) bindings[6]);
        this.f56278h = -1L;
        setContainedBinding(this.f56138a);
        this.f56142e.setTag(null);
        this.f56143f.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
