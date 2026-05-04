package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.view.PreferenceView;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o7 extends n7 implements a.InterfaceC0684a {

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56186r = null;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56187s;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56188m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56189n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56190o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56191p;

    /* renamed from: q, reason: collision with root package name */
    public long f56192q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56187s = sparseIntArray;
        sparseIntArray.put(R.id.image, 6);
        sparseIntArray.put(R.id.debug1, 7);
        sparseIntArray.put(R.id.debug2, 8);
        sparseIntArray.put(R.id.divider_1, 9);
        sparseIntArray.put(R.id.protocol, 10);
        sparseIntArray.put(R.id.icp, 11);
    }

    public o7(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f56186r, f56187s));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ue.v vVar;
        if (sourceId == 1) {
            ue.v vVar2 = this.f56008l;
            if (vVar2 != null) {
                vVar2.d();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (vVar = this.f56008l) != null) {
                vVar.h();
                return;
            }
            return;
        }
        ue.v vVar3 = this.f56008l;
        if (vVar3 != null) {
            vVar3.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.o7.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56192q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56192q = 32L;
        }
        requestRebind();
    }

    @Override // gs.n7
    public void j(@Nullable ue.v Viewmodel) {
        this.f56008l = Viewmodel;
        synchronized (this) {
            this.f56192q |= 16;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<String> ViewmodelFeedbackEmail, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56192q |= 4;
        }
        return true;
    }

    public final boolean l(MutableLiveData<String> ViewmodelFeedbackPhone, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56192q |= 8;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Boolean> ViewmodelHasNewVersion, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56192q |= 2;
        }
        return true;
    }

    public final boolean n(MutableLiveData<String> ViewmodelVersion, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56192q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return n((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 1) {
            return m((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 2) {
            return k((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return l((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ue.v) variable);
        return true;
    }

    public o7(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4, (PreferenceView) bindings[1], (View) bindings[7], (View) bindings[8], (View) bindings[9], (PreferenceView) bindings[4], (PreferenceView) bindings[3], (TextView) bindings[11], (ImageView) bindings[6], (PreferenceView) bindings[5], (TextView) bindings[10], (PreferenceView) bindings[2]);
        this.f56192q = -1L;
        this.f55997a.setTag(null);
        this.f56001e.setTag(null);
        this.f56002f.setTag(null);
        this.f56005i.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56188m = constraintLayout;
        constraintLayout.setTag(null);
        this.f56007k.setTag(null);
        setRootTag(root);
        this.f56189n = new hs.a(this, 3);
        this.f56190o = new hs.a(this, 2);
        this.f56191p = new hs.a(this, 1);
        invalidateAll();
    }
}
