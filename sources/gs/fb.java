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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class fb extends eb {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54910f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54911g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54912d;

    /* renamed from: e, reason: collision with root package name */
    public long f54913e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f54910f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_switch_item"}, new int[]{1}, new int[]{R.layout.mytab_setting_switch_item});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54911g = sparseIntArray;
        sparseIntArray.put(R.id.auto_size_hint, 2);
    }

    public fb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f54910f, f54911g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54913e;
            this.f54913e = 0L;
        }
        df.c cVar = this.f54768c;
        long j12 = 14 & j11;
        if (j12 != 0) {
            r6 = cVar != null ? cVar.f47941a : null;
            updateLiveDataRegistration(1, r6);
            if (r6 != null) {
                r6.getValue();
            }
        }
        if (j12 != 0) {
            this.f54766a.l(r6);
        }
        if ((j11 & 8) != 0) {
            this.f54766a.n(getRoot().getResources().getString(R.string.setting_ui_setting_auto_size));
        }
        ViewDataBinding.executeBindingsOn(this.f54766a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54913e != 0) {
                    return true;
                }
                return this.f54766a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54913e = 8L;
        }
        this.f54766a.invalidateAll();
        requestRebind();
    }

    @Override // gs.eb
    public void j(@Nullable df.c Viewmodel) {
        this.f54768c = Viewmodel;
        synchronized (this) {
            this.f54913e |= 4;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(kk AutoSize, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54913e |= 1;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Boolean> ViewmodelUserCloseAuto, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54913e |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((kk) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return l((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54766a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((df.c) variable);
        return true;
    }

    public fb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (kk) bindings[1], (TextView) bindings[2]);
        this.f54913e = -1L;
        setContainedBinding(this.f54766a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54912d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
