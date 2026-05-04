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
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class wa extends va implements a.InterfaceC0684a {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57302k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57303l;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ScrollView f57304g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57305h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57306i;

    /* renamed from: j, reason: collision with root package name */
    public long f57307j;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f57302k = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"mytab_setting_basic_item", "mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_switch_item"}, new int[]{2, 3, 4, 5, 6}, new int[]{R.layout.mytab_setting_basic_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item});
        f57303l = null;
    }

    public wa(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f57302k, f57303l));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        cf.d dVar = this.f57152f;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        long j13;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        synchronized (this) {
            j11 = this.f57307j;
            this.f57307j = 0L;
        }
        cf.d dVar = this.f57152f;
        if ((1841 & j11) != 0) {
            if ((j11 & 1537) != 0) {
                mutableLiveData3 = dVar != null ? dVar.f8586c : null;
                j12 = 0;
                updateLiveDataRegistration(0, mutableLiveData3);
                if (mutableLiveData3 != null) {
                    mutableLiveData3.getValue();
                }
            } else {
                j12 = 0;
                mutableLiveData3 = null;
            }
            if ((j11 & 1552) != j12) {
                mutableLiveData4 = dVar != null ? dVar.f8588e : null;
                updateLiveDataRegistration(4, mutableLiveData4);
                if (mutableLiveData4 != null) {
                    mutableLiveData4.getValue();
                }
            } else {
                mutableLiveData4 = null;
            }
            if ((j11 & 1568) != j12) {
                mutableLiveData2 = dVar != null ? dVar.f8587d : null;
                j13 = 1792;
                updateLiveDataRegistration(5, mutableLiveData2);
                if (mutableLiveData2 != null) {
                    mutableLiveData2.getValue();
                }
            } else {
                j13 = 1792;
                mutableLiveData2 = null;
            }
            if ((j11 & j13) != j12) {
                r15 = dVar != null ? dVar.f8585b : null;
                updateLiveDataRegistration(8, r15);
                if (r15 != null) {
                    r15.getValue();
                }
            }
            mutableLiveData = r15;
            r15 = mutableLiveData4;
        } else {
            j12 = 0;
            j13 = 1792;
            mutableLiveData = null;
            mutableLiveData2 = null;
            mutableLiveData3 = null;
        }
        if ((j11 & 1552) != j12) {
            this.f57147a.l(r15);
        }
        if ((1024 & j11) != j12) {
            this.f57147a.n(getRoot().getResources().getString(R.string.setting_study_deformation));
            this.f57148b.s(this.f57306i);
            this.f57148b.x(getRoot().getResources().getString(R.string.setting_study_extra_problem));
            this.f57149c.n(getRoot().getResources().getString(R.string.setting_study_show_mean));
            this.f57150d.n(getRoot().getResources().getString(R.string.setting_study_sound));
            this.f57151e.n(getRoot().getResources().getString(R.string.setting_study_show_translate));
        }
        if ((j11 & j13) != j12) {
            this.f57149c.l(mutableLiveData);
        }
        if ((j11 & 1568) != j12) {
            this.f57150d.l(mutableLiveData2);
        }
        if ((j11 & 1537) != j12) {
            this.f57151e.l(mutableLiveData3);
        }
        ViewDataBinding.executeBindingsOn(this.f57148b);
        ViewDataBinding.executeBindingsOn(this.f57149c);
        ViewDataBinding.executeBindingsOn(this.f57151e);
        ViewDataBinding.executeBindingsOn(this.f57150d);
        ViewDataBinding.executeBindingsOn(this.f57147a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57307j != 0) {
                    return true;
                }
                return this.f57148b.hasPendingBindings() || this.f57149c.hasPendingBindings() || this.f57151e.hasPendingBindings() || this.f57150d.hasPendingBindings() || this.f57147a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57307j = 1024L;
        }
        this.f57148b.invalidateAll();
        this.f57149c.invalidateAll();
        this.f57151e.invalidateAll();
        this.f57150d.invalidateAll();
        this.f57147a.invalidateAll();
        requestRebind();
    }

    @Override // gs.va
    public void j(@Nullable cf.d Viewmodel) {
        this.f57152f = Viewmodel;
        synchronized (this) {
            this.f57307j |= 512;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(kk Deformation, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 2;
        }
        return true;
    }

    public final boolean l(ck ExtraProblem, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 4;
        }
        return true;
    }

    public final boolean m(kk Mean, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 64;
        }
        return true;
    }

    public final boolean n(kk Sound, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 8;
        }
        return true;
    }

    public final boolean o(kk Translate, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return t((MutableLiveData) object, fieldId);
            case 1:
                return k((kk) object, fieldId);
            case 2:
                return l((ck) object, fieldId);
            case 3:
                return n((kk) object, fieldId);
            case 4:
                return p((MutableLiveData) object, fieldId);
            case 5:
                return s((MutableLiveData) object, fieldId);
            case 6:
                return m((kk) object, fieldId);
            case 7:
                return o((kk) object, fieldId);
            case 8:
                return r((MutableLiveData) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(MutableLiveData<Boolean> ViewmodelDeformationChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 16;
        }
        return true;
    }

    public final boolean r(MutableLiveData<Boolean> ViewmodelMeanChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 256;
        }
        return true;
    }

    public final boolean s(MutableLiveData<Boolean> ViewmodelSoundChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57148b.setLifecycleOwner(lifecycleOwner);
        this.f57149c.setLifecycleOwner(lifecycleOwner);
        this.f57151e.setLifecycleOwner(lifecycleOwner);
        this.f57150d.setLifecycleOwner(lifecycleOwner);
        this.f57147a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((cf.d) variable);
        return true;
    }

    public final boolean t(MutableLiveData<Boolean> ViewmodelTranslateChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57307j |= 1;
        }
        return true;
    }

    public wa(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9, (kk) bindings[6], (ck) bindings[2], (kk) bindings[3], (kk) bindings[5], (kk) bindings[4]);
        this.f57307j = -1L;
        setContainedBinding(this.f57147a);
        setContainedBinding(this.f57148b);
        ScrollView scrollView = (ScrollView) bindings[0];
        this.f57304g = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.f57305h = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f57149c);
        setContainedBinding(this.f57150d);
        setContainedBinding(this.f57151e);
        setRootTag(root);
        this.f57306i = new hs.a(this, 1);
        invalidateAll();
    }
}
