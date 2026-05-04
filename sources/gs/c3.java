package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c3 extends b3 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54373g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54374h;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54375c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f54376d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final ro f54377e;

    /* renamed from: f, reason: collision with root package name */
    public long f54378f;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f54373g = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{3}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54374h = sparseIntArray;
        sparseIntArray.put(R.id.submit, 4);
    }

    public c3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f54373g, f54374h));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54378f |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54378f;
            this.f54378f = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f54223a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_white));
            this.f54223a.V(getRoot().getResources().getString(R.string.error_fb_title));
        }
        ViewDataBinding.executeBindingsOn(this.f54223a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54378f != 0) {
                    return true;
                }
                return this.f54223a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54378f = 2L;
        }
        this.f54223a.invalidateAll();
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
        this.f54223a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public c3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[3], (TextView) bindings[4]);
        this.f54378f = -1L;
        setContainedBinding(this.f54223a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54375c = constraintLayout;
        constraintLayout.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) bindings[1];
        this.f54376d = nestedScrollView;
        nestedScrollView.setTag(null);
        Object obj = bindings[2];
        this.f54377e = obj != null ? ro.a((View) obj) : null;
        setRootTag(root);
        invalidateAll();
    }
}
