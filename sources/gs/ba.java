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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ba extends aa {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54273g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54274h;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54275d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final o4 f54276e;

    /* renamed from: f, reason: collision with root package name */
    public long f54277f;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f54273g = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_switch_extended_item", "bcz_loading_view"}, new int[]{1, 2}, new int[]{R.layout.mytab_setting_switch_extended_item, R.layout.bcz_loading_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54274h = sparseIntArray;
        sparseIntArray.put(R.id.auto_size_hint, 3);
    }

    public ba(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f54273g, f54274h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        ta.b bVar;
        synchronized (this) {
            j11 = this.f54277f;
            this.f54277f = 0L;
        }
        ze.i iVar = this.f54162c;
        int i11 = 0;
        if ((30 & j11) != 0) {
            long j13 = j11 & 28;
            if (j13 != 0) {
                bVar = iVar != null ? iVar.f102570b : null;
                LiveData<?> liveData = bVar != null ? bVar.f90400b : null;
                j12 = 0;
                updateLiveDataRegistration(2, liveData);
                boolean z11 = ViewDataBinding.safeUnbox(liveData != null ? liveData.getValue() : null) == 2;
                if (j13 != 0) {
                    j11 |= z11 ? 64L : 32L;
                }
                if (!z11) {
                    i11 = 8;
                }
            } else {
                j12 = 0;
                bVar = null;
            }
            if ((j11 & 26) != j12) {
                r12 = iVar != null ? iVar.f102569a : null;
                updateLiveDataRegistration(1, r12);
                if (r12 != null) {
                    r12.getValue();
                }
            }
        } else {
            j12 = 0;
            bVar = null;
        }
        if ((j11 & 28) != j12) {
            this.f54160a.getRoot().setVisibility(i11);
        }
        if ((j11 & 26) != j12) {
            this.f54160a.m(r12);
        }
        if ((16 & j11) != j12) {
            this.f54160a.o(getRoot().getResources().getString(R.string.setting_ui_private_ad_sub));
            this.f54160a.p(getRoot().getResources().getString(R.string.setting_ui_private_ad));
        }
        if ((j11 & 24) != j12) {
            this.f54276e.j(bVar);
        }
        ViewDataBinding.executeBindingsOn(this.f54160a);
        ViewDataBinding.executeBindingsOn(this.f54276e);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54277f != 0) {
                    return true;
                }
                return this.f54160a.hasPendingBindings() || this.f54276e.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54277f = 16L;
        }
        this.f54160a.invalidateAll();
        this.f54276e.invalidateAll();
        requestRebind();
    }

    @Override // gs.aa
    public void j(@Nullable ze.i Viewmodel) {
        this.f54162c = Viewmodel;
        synchronized (this) {
            this.f54277f |= 8;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ik AutoSize, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54277f |= 1;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Boolean> ViewmodelAdOpen, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54277f |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Integer> ViewmodelLoadingVMStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54277f |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((ik) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return m((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54160a.setLifecycleOwner(lifecycleOwner);
        this.f54276e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ze.i) variable);
        return true;
    }

    public ba(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (ik) bindings[1], (TextView) bindings[3]);
        this.f54277f = -1L;
        setContainedBinding(this.f54160a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54275d = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[2];
        this.f54276e = o4Var;
        setContainedBinding(o4Var);
        setRootTag(root);
        invalidateAll();
    }
}
