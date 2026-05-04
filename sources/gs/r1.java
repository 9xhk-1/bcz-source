package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r1 extends q1 {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56559f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56560g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56561d;

    /* renamed from: e, reason: collision with root package name */
    public long f56562e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f56559f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56560g = sparseIntArray;
        sparseIntArray.put(R.id.phrase_group_grid, 2);
        sparseIntArray.put(R.id.phrase_group_load_progress, 3);
    }

    public r1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56559f, f56560g));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56562e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56562e;
            this.f56562e = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f56430a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_white));
            this.f56430a.V(getRoot().getResources().getString(R.string.phrase_group_title));
            this.f56430a.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f56430a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56562e != 0) {
                    return true;
                }
                return this.f56430a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56562e = 2L;
        }
        this.f56430a.invalidateAll();
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
        this.f56430a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public r1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (RecyclerView) bindings[2], (RotatingImageView) bindings[3]);
        this.f56562e = -1L;
        setContainedBinding(this.f56430a);
        RelativeLayout relativeLayout = (RelativeLayout) bindings[0];
        this.f56561d = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
