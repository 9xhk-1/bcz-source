package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ac extends zb {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54167f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54168g;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final o4 f54169c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54170d;

    /* renamed from: e, reason: collision with root package name */
    public long f54171e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f54167f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{1}, new int[]{R.layout.bcz_loading_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54168g = sparseIntArray;
        sparseIntArray.put(R.id.info_list, 2);
    }

    public ac(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f54167f, f54168g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54171e;
            this.f54171e = 0L;
        }
        ta.b bVar = this.f57770b;
        if ((j11 & 3) != 0) {
            this.f54169c.j(bVar);
        }
        ViewDataBinding.executeBindingsOn(this.f54169c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54171e != 0) {
                    return true;
                }
                return this.f54169c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54171e = 2L;
        }
        this.f54169c.invalidateAll();
        requestRebind();
    }

    @Override // gs.zb
    public void j(@Nullable ta.b LoadingModel) {
        this.f57770b = LoadingModel;
        synchronized (this) {
            this.f54171e |= 1;
        }
        notifyPropertyChanged(41);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54169c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (41 != variableId) {
            return false;
        }
        j((ta.b) variable);
        return true;
    }

    public ac(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RecyclerView) bindings[2]);
        this.f54171e = -1L;
        o4 o4Var = (o4) bindings[1];
        this.f54169c = o4Var;
        setContainedBinding(o4Var);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f54170d = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
