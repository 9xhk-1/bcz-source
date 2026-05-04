package gs;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
public class e2 extends d2 implements a.InterfaceC0684a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts D;

    @Nullable
    public static final SparseIntArray E;

    @Nullable
    public final View.OnClickListener A;

    @Nullable
    public final View.OnClickListener B;
    public long C;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54710o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54711p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54712q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54713r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54714s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54715t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54716u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54717v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54718w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54719x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54720y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54721z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        D = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{3}, new int[]{R.layout.action_bar_basic});
        includedLayouts.setIncludes(1, new String[]{"mytab_setting_account_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_switch_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{R.layout.mytab_setting_account_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item});
        E = null;
    }

    public e2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 15, D, E));
    }

    private boolean m(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public final boolean A(MutableLiveData<Boolean> ViewmodelBindWeChart, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 4096;
        }
        return true;
    }

    public final boolean B(MutableLiveData<Boolean> ViewmodelCareMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1024;
        }
        return true;
    }

    public final boolean C(MutableLiveData<Boolean> ViewmodelDakaType, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    public final boolean D(MutableLiveData<Boolean> ViewmodelIsGameMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 512;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                com.baicizhan.main.activity.setting.a aVar = this.f54557n;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 2:
                com.baicizhan.main.activity.setting.a aVar2 = this.f54557n;
                if (aVar2 != null) {
                    aVar2.d();
                    break;
                }
                break;
            case 3:
                com.baicizhan.main.activity.setting.a aVar3 = this.f54557n;
                if (aVar3 != null) {
                    aVar3.i();
                    break;
                }
                break;
            case 4:
                com.baicizhan.main.activity.setting.a aVar4 = this.f54557n;
                if (aVar4 != null) {
                    aVar4.j();
                    break;
                }
                break;
            case 5:
                com.baicizhan.main.activity.setting.a aVar5 = this.f54557n;
                if (aVar5 != null) {
                    aVar5.g();
                    break;
                }
                break;
            case 6:
                com.baicizhan.main.activity.setting.a aVar6 = this.f54557n;
                if (aVar6 != null) {
                    aVar6.m();
                    break;
                }
                break;
            case 7:
                com.baicizhan.main.activity.setting.a aVar7 = this.f54557n;
                if (aVar7 != null) {
                    aVar7.h();
                    break;
                }
                break;
            case 8:
                com.baicizhan.main.activity.setting.a aVar8 = this.f54557n;
                if (aVar8 != null) {
                    aVar8.f();
                    break;
                }
                break;
            case 9:
                com.baicizhan.main.activity.setting.a aVar9 = this.f54557n;
                if (aVar9 != null) {
                    aVar9.k();
                    break;
                }
                break;
            case 10:
                com.baicizhan.main.activity.setting.a aVar10 = this.f54557n;
                if (aVar10 != null) {
                    aVar10.l();
                    break;
                }
                break;
            case 11:
                com.baicizhan.main.activity.setting.a aVar11 = this.f54557n;
                if (aVar11 != null) {
                    aVar11.c();
                    break;
                }
                break;
            case 12:
                com.baicizhan.main.activity.setting.a aVar12 = this.f54557n;
                if (aVar12 != null) {
                    aVar12.n();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.e2.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.f54546c.hasPendingBindings() || this.f54545b.hasPendingBindings() || this.f54550g.hasPendingBindings() || this.f54551h.hasPendingBindings() || this.f54549f.hasPendingBindings() || this.f54556m.hasPendingBindings() || this.f54554k.hasPendingBindings() || this.f54548e.hasPendingBindings() || this.f54547d.hasPendingBindings() || this.f54553j.hasPendingBindings() || this.f54555l.hasPendingBindings() || this.f54544a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.C = PlaybackStateCompat.F;
        }
        this.f54546c.invalidateAll();
        this.f54545b.invalidateAll();
        this.f54550g.invalidateAll();
        this.f54551h.invalidateAll();
        this.f54549f.invalidateAll();
        this.f54556m.invalidateAll();
        this.f54554k.invalidateAll();
        this.f54548e.invalidateAll();
        this.f54547d.invalidateAll();
        this.f54553j.invalidateAll();
        this.f54555l.invalidateAll();
        this.f54544a.invalidateAll();
        requestRebind();
    }

    @Override // gs.d2
    public void j(@Nullable com.baicizhan.main.activity.setting.a Viewmodel) {
        this.f54557n = Viewmodel;
        synchronized (this) {
            this.C |= PlaybackStateCompat.E;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ck AboutUs, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 32;
        }
        return true;
    }

    public final boolean l(ak AccountMgr, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 64;
        }
        return true;
    }

    public final boolean n(ck CacheMgr, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 256;
        }
        return true;
    }

    public final boolean o(kk CareSetting, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 65536;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return m((a) object, fieldId);
            case 1:
                return z((MutableLiveData) object, fieldId);
            case 2:
                return r((ck) object, fieldId);
            case 3:
                return C((MutableLiveData) object, fieldId);
            case 4:
                return v((ck) object, fieldId);
            case 5:
                return k((ck) object, fieldId);
            case 6:
                return l((ak) object, fieldId);
            case 7:
                return y((MutableLiveData) object, fieldId);
            case 8:
                return n((ck) object, fieldId);
            case 9:
                return D((MutableLiveData) object, fieldId);
            case 10:
                return B((MutableLiveData) object, fieldId);
            case 11:
                return p((ck) object, fieldId);
            case 12:
                return A((MutableLiveData) object, fieldId);
            case 13:
                return s((ck) object, fieldId);
            case 14:
                return t((ck) object, fieldId);
            case 15:
                return u((ck) object, fieldId);
            case 16:
                return o((kk) object, fieldId);
            case 17:
                return x((ck) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(ck DakaMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 2048;
        }
        return true;
    }

    public final boolean r(ck LearningRemainder, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean s(ck LearningSetting, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 8192;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54546c.setLifecycleOwner(lifecycleOwner);
        this.f54545b.setLifecycleOwner(lifecycleOwner);
        this.f54550g.setLifecycleOwner(lifecycleOwner);
        this.f54551h.setLifecycleOwner(lifecycleOwner);
        this.f54549f.setLifecycleOwner(lifecycleOwner);
        this.f54556m.setLifecycleOwner(lifecycleOwner);
        this.f54554k.setLifecycleOwner(lifecycleOwner);
        this.f54548e.setLifecycleOwner(lifecycleOwner);
        this.f54547d.setLifecycleOwner(lifecycleOwner);
        this.f54553j.setLifecycleOwner(lifecycleOwner);
        this.f54555l.setLifecycleOwner(lifecycleOwner);
        this.f54544a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((com.baicizhan.main.activity.setting.a) variable);
        return true;
    }

    public final boolean t(ck PersonalInfoCollections, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 16384;
        }
        return true;
    }

    public final boolean u(ck PrivatesSetting, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 32768;
        }
        return true;
    }

    public final boolean v(ck ThirdParties, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    public final boolean x(ck UiSetting, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 131072;
        }
        return true;
    }

    public final boolean y(MutableLiveData<Boolean> ViewmodelBindPhone, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 128;
        }
        return true;
    }

    public final boolean z(MutableLiveData<Boolean> ViewmodelBindQQ, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public e2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 18, (ck) bindings[14], (ak) bindings[4], (a) bindings[3], (ck) bindings[11], (kk) bindings[10], (ck) bindings[7], (ck) bindings[5], (ck) bindings[6], (TextView) bindings[2], (ck) bindings[12], (ck) bindings[9], (ck) bindings[13], (ck) bindings[8]);
        this.C = -1L;
        setContainedBinding(this.f54544a);
        setContainedBinding(this.f54545b);
        setContainedBinding(this.f54546c);
        setContainedBinding(this.f54547d);
        setContainedBinding(this.f54548e);
        setContainedBinding(this.f54549f);
        setContainedBinding(this.f54550g);
        setContainedBinding(this.f54551h);
        this.f54552i.setTag(null);
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f54710o = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.f54711p = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f54553j);
        setContainedBinding(this.f54554k);
        setContainedBinding(this.f54555l);
        setContainedBinding(this.f54556m);
        setRootTag(root);
        this.f54712q = new hs.a(this, 5);
        this.f54713r = new hs.a(this, 12);
        this.f54714s = new hs.a(this, 8);
        this.f54715t = new hs.a(this, 6);
        this.f54716u = new hs.a(this, 1);
        this.f54717v = new hs.a(this, 9);
        this.f54718w = new hs.a(this, 7);
        this.f54719x = new hs.a(this, 3);
        this.f54720y = new hs.a(this, 2);
        this.f54721z = new hs.a(this, 10);
        this.A = new hs.a(this, 4);
        this.B = new hs.a(this, 11);
        invalidateAll();
    }
}
