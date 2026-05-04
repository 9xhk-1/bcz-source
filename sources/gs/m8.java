package gs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m8 extends l8 implements a.InterfaceC0684a {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55861n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55862o;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55863f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f55864g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f55865h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55866i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55867j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55868k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55869l;

    /* renamed from: m, reason: collision with root package name */
    public long f55870m;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f55861n = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item"}, new int[]{3, 4, 5, 6}, new int[]{R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item});
        f55862o = null;
    }

    public m8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f55861n, f55862o));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        mf.l lVar;
        if (sourceId == 1) {
            mf.l lVar2 = this.f55731e;
            if (lVar2 != null) {
                lVar2.h();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            mf.l lVar3 = this.f55731e;
            if (lVar3 != null) {
                lVar3.d();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (lVar = this.f55731e) != null) {
                lVar.f();
                return;
            }
            return;
        }
        mf.l lVar4 = this.f55731e;
        if (lVar4 != null) {
            lVar4.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.m8.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55870m != 0) {
                    return true;
                }
                return this.f55730d.hasPendingBindings() || this.f55727a.hasPendingBindings() || this.f55729c.hasPendingBindings() || this.f55728b.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55870m = 1024L;
        }
        this.f55730d.invalidateAll();
        this.f55727a.invalidateAll();
        this.f55729c.invalidateAll();
        this.f55728b.invalidateAll();
        requestRebind();
    }

    @Override // gs.l8
    public void j(@Nullable mf.l Viewmodel) {
        this.f55731e = Viewmodel;
        synchronized (this) {
            this.f55870m |= 512;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ck Education, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 8;
        }
        return true;
    }

    public final boolean l(ck EnrollmentDate, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 64;
        }
        return true;
    }

    public final boolean m(ck Major, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 32;
        }
        return true;
    }

    public final boolean n(ck Shcool, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 4;
        }
        return true;
    }

    public final boolean o(LiveData<String> ViewmodelEducationTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return r((SingleLiveEvent) object, fieldId);
            case 1:
                return o((LiveData) object, fieldId);
            case 2:
                return n((ck) object, fieldId);
            case 3:
                return k((ck) object, fieldId);
            case 4:
                return t((SingleLiveEvent) object, fieldId);
            case 5:
                return m((ck) object, fieldId);
            case 6:
                return l((ck) object, fieldId);
            case 7:
                return p((LiveData) object, fieldId);
            case 8:
                return s((SingleLiveEvent) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(LiveData<String> ViewmodelEnrollment, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 128;
        }
        return true;
    }

    public final boolean r(SingleLiveEvent<Boolean> ViewmodelIsCollege, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 1;
        }
        return true;
    }

    public final boolean s(SingleLiveEvent<String> ViewmodelMajor, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 256;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55730d.setLifecycleOwner(lifecycleOwner);
        this.f55727a.setLifecycleOwner(lifecycleOwner);
        this.f55729c.setLifecycleOwner(lifecycleOwner);
        this.f55728b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((mf.l) variable);
        return true;
    }

    public final boolean t(SingleLiveEvent<String> ViewmodelSchool, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55870m |= 16;
        }
        return true;
    }

    public m8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9, (ck) bindings[4], (ck) bindings[6], (ck) bindings[5], (ck) bindings[3]);
        this.f55870m = -1L;
        setContainedBinding(this.f55727a);
        setContainedBinding(this.f55728b);
        setContainedBinding(this.f55729c);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55863f = constraintLayout;
        constraintLayout.setTag(null);
        View view = (View) bindings[1];
        this.f55864g = view;
        view.setTag(null);
        View view2 = (View) bindings[2];
        this.f55865h = view2;
        view2.setTag(null);
        setContainedBinding(this.f55730d);
        setRootTag(root);
        this.f55866i = new hs.a(this, 4);
        this.f55867j = new hs.a(this, 2);
        this.f55868k = new hs.a(this, 3);
        this.f55869l = new hs.a(this, 1);
        invalidateAll();
    }
}
