package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
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
public class ua extends ta {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56980h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56981i;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScrollView f56982e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56983f;

    /* renamed from: g, reason: collision with root package name */
    public long f56984g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f56980h = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_switch_item"}, new int[]{2, 3, 4}, new int[]{R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item});
        f56981i = null;
    }

    public ua(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f56980h, f56981i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        synchronized (this) {
            j11 = this.f56984g;
            this.f56984g = 0L;
        }
        xe.d dVar = this.f56867d;
        if ((205 & j11) != 0) {
            if ((j11 & 193) != 0) {
                mutableLiveData2 = dVar != null ? dVar.f98019a : null;
                updateLiveDataRegistration(0, mutableLiveData2);
                if (mutableLiveData2 != null) {
                    mutableLiveData2.getValue();
                }
            } else {
                mutableLiveData2 = null;
            }
            if ((j11 & 196) != 0) {
                mutableLiveData3 = dVar != null ? dVar.f98021c : null;
                updateLiveDataRegistration(2, mutableLiveData3);
                if (mutableLiveData3 != null) {
                    mutableLiveData3.getValue();
                }
            } else {
                mutableLiveData3 = null;
            }
            if ((j11 & 200) != 0) {
                r13 = dVar != null ? dVar.f98020b : null;
                updateLiveDataRegistration(3, r13);
                if (r13 != null) {
                    r13.getValue();
                }
            }
            mutableLiveData = r13;
            r13 = mutableLiveData3;
        } else {
            mutableLiveData = null;
            mutableLiveData2 = null;
        }
        if ((196 & j11) != 0) {
            this.f56864a.l(r13);
        }
        if ((128 & j11) != 0) {
            this.f56864a.n(getRoot().getResources().getString(R.string.setting_extra_problem_cn_word));
            this.f56865b.n(getRoot().getResources().getString(R.string.setting_extra_problem_listen_mean));
            this.f56866c.n(getRoot().getResources().getString(R.string.setting_extra_problem_spell));
        }
        if ((j11 & 193) != 0) {
            this.f56865b.l(mutableLiveData2);
        }
        if ((j11 & 200) != 0) {
            this.f56866c.l(mutableLiveData);
        }
        ViewDataBinding.executeBindingsOn(this.f56865b);
        ViewDataBinding.executeBindingsOn(this.f56866c);
        ViewDataBinding.executeBindingsOn(this.f56864a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56984g != 0) {
                    return true;
                }
                return this.f56865b.hasPendingBindings() || this.f56866c.hasPendingBindings() || this.f56864a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56984g = 128L;
        }
        this.f56865b.invalidateAll();
        this.f56866c.invalidateAll();
        this.f56864a.invalidateAll();
        requestRebind();
    }

    @Override // gs.ta
    public void j(@Nullable xe.d Viewmodel) {
        this.f56867d = Viewmodel;
        synchronized (this) {
            this.f56984g |= 64;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(kk CnWord, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 2;
        }
        return true;
    }

    public final boolean l(kk Listener, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 16;
        }
        return true;
    }

    public final boolean m(kk Spell, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 32;
        }
        return true;
    }

    public final boolean n(MutableLiveData<Boolean> ViewmodelCnWordChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 4;
        }
        return true;
    }

    public final boolean o(MutableLiveData<Boolean> ViewmodelListeneChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return o((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 1) {
            return k((kk) object, fieldId);
        }
        if (localFieldId == 2) {
            return n((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 3) {
            return p((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 4) {
            return l((kk) object, fieldId);
        }
        if (localFieldId != 5) {
            return false;
        }
        return m((kk) object, fieldId);
    }

    public final boolean p(MutableLiveData<Boolean> ViewmodelSpellChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56984g |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56865b.setLifecycleOwner(lifecycleOwner);
        this.f56866c.setLifecycleOwner(lifecycleOwner);
        this.f56864a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((xe.d) variable);
        return true;
    }

    public ua(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6, (kk) bindings[4], (kk) bindings[2], (kk) bindings[3]);
        this.f56984g = -1L;
        setContainedBinding(this.f56864a);
        setContainedBinding(this.f56865b);
        ScrollView scrollView = (ScrollView) bindings[0];
        this.f56982e = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.f56983f = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f56866c);
        setRootTag(root);
        invalidateAll();
    }
}
