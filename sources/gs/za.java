package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class za extends ya {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57763i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57764j;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57765e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final o4 f57766f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f57767g;

    /* renamed from: h, reason: collision with root package name */
    public long f57768h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f57763i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{5}, new int[]{R.layout.bcz_loading_view});
        f57764j = null;
    }

    public za(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f57763i, f57764j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57768h;
            this.f57768h = 0L;
        }
        com.baicizhan.main.activity.schedule_v2.switchschedule.f0 f0Var = this.f57576d;
        long j12 = j11 & 7;
        ta.b bVar = null;
        if (j12 != 0) {
            ta.b B = f0Var != null ? f0Var.B() : null;
            MutableLiveData<Integer> mutableLiveData = B != null ? B.f90400b : null;
            updateLiveDataRegistration(0, mutableLiveData);
            boolean z11 = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null) == 2;
            if (j12 != 0) {
                j11 |= z11 ? 16L : 8L;
            }
            r9 = z11 ? 0 : 8;
            bVar = B;
        }
        if ((j11 & 7) != 0) {
            this.f57573a.setVisibility(r9);
            this.f57574b.setVisibility(r9);
            this.f57767g.setVisibility(r9);
            this.f57575c.setVisibility(r9);
        }
        if ((j11 & 6) != 0) {
            this.f57766f.j(bVar);
        }
        ViewDataBinding.executeBindingsOn(this.f57766f);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57768h != 0) {
                    return true;
                }
                return this.f57766f.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57768h = 4L;
        }
        this.f57766f.invalidateAll();
        requestRebind();
    }

    @Override // gs.ya
    public void j(@Nullable com.baicizhan.main.activity.schedule_v2.switchschedule.f0 Viewmodel) {
        this.f57576d = Viewmodel;
        synchronized (this) {
            this.f57768h |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<Integer> ViewmodelLoadingVmStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57768h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57766f.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((com.baicizhan.main.activity.schedule_v2.switchschedule.f0) variable);
        return true;
    }

    public za(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[3], (View) bindings[2], (RecyclerView) bindings[1]);
        this.f57768h = -1L;
        this.f57573a.setTag(null);
        this.f57574b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57765e = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[5];
        this.f57766f = o4Var;
        setContainedBinding(o4Var);
        View view = (View) bindings[4];
        this.f57767g = view;
        view.setTag(null);
        this.f57575c.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
