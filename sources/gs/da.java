package gs;

import android.support.v4.media.session.PlaybackStateCompat;
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
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class da extends ca implements a.InterfaceC0684a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts L;

    @Nullable
    public static final SparseIntArray M;

    @Nullable
    public final View.OnClickListener A;

    @Nullable
    public final View.OnClickListener B;

    @Nullable
    public final View.OnClickListener C;

    @Nullable
    public final View.OnClickListener D;

    @Nullable
    public final View.OnClickListener E;

    @Nullable
    public final View.OnClickListener F;

    @Nullable
    public final View.OnClickListener G;

    @Nullable
    public final View.OnClickListener H;

    @Nullable
    public final View.OnClickListener I;

    @Nullable
    public final View.OnClickListener J;
    public long K;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f54609w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54610x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54611y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54612z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(23);
        L = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_switch_item", "mytab_setting_switch_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, new int[]{R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_switch_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.vld_section, 20);
        sparseIntArray.put(R.id.hw_section, 21);
        sparseIntArray.put(R.id.ad_cache_section, 22);
    }

    public da(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 23, L, M));
    }

    public final boolean A(MutableLiveData<Boolean> ViewmodelStudyMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 16;
        }
        return true;
    }

    public final boolean B(MutableLiveData<String> ViewmodelTestServer, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 32;
        }
        return true;
    }

    public final boolean C(MutableLiveData<Boolean> ViewmodelVldCameraAdding, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= PlaybackStateCompat.F;
        }
        return true;
    }

    public final boolean D(MutableLiveData<Boolean> ViewmodelVldDevicesEntry, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 8388608;
        }
        return true;
    }

    public final boolean F(MutableLiveData<Boolean> ViewmodelWhiteListEnable, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public final boolean G(kk VldCameraAdding, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 65536;
        }
        return true;
    }

    public final boolean H(kk VldEntry, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1048576;
        }
        return true;
    }

    public final boolean I(ck WatchTest, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 8;
        }
        return true;
    }

    public final boolean J(ck Web, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 256;
        }
        return true;
    }

    public final boolean K(ck WebUrl, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= j60.e.B;
        }
        return true;
    }

    public final boolean L(ck WordList, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 4096;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var = this.f54436v;
                if (j2Var != null) {
                    j2Var.h();
                    break;
                }
                break;
            case 2:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var2 = this.f54436v;
                if (j2Var2 != null) {
                    j2Var2.G();
                    break;
                }
                break;
            case 3:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var3 = this.f54436v;
                if (j2Var3 != null) {
                    j2Var3.i();
                    break;
                }
                break;
            case 4:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var4 = this.f54436v;
                if (j2Var4 != null) {
                    j2Var4.B();
                    break;
                }
                break;
            case 5:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var5 = this.f54436v;
                if (j2Var5 != null) {
                    j2Var5.C();
                    break;
                }
                break;
            case 6:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var6 = this.f54436v;
                if (j2Var6 != null) {
                    j2Var6.Y();
                    break;
                }
                break;
            case 7:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var7 = this.f54436v;
                if (j2Var7 != null) {
                    j2Var7.Z();
                    break;
                }
                break;
            case 8:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var8 = this.f54436v;
                if (j2Var8 != null) {
                    j2Var8.F();
                    break;
                }
                break;
            case 9:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var9 = this.f54436v;
                if (j2Var9 != null) {
                    j2Var9.V();
                    break;
                }
                break;
            case 10:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var10 = this.f54436v;
                if (j2Var10 != null) {
                    j2Var10.W();
                    break;
                }
                break;
            case 11:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var11 = this.f54436v;
                if (j2Var11 != null) {
                    j2Var11.D();
                    break;
                }
                break;
            case 12:
                com.baicizhan.main.activity.setting.privatessetting.debug.j2 j2Var12 = this.f54436v;
                if (j2Var12 != null) {
                    j2Var12.O();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.da.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.f54425k.hasPendingBindings() || this.f54435u.hasPendingBindings() || this.f54420f.hasPendingBindings() || this.f54421g.hasPendingBindings() || this.f54419e.hasPendingBindings() || this.f54433s.hasPendingBindings() || this.f54434t.hasPendingBindings() || this.f54424j.hasPendingBindings() || this.f54427m.hasPendingBindings() || this.f54418d.hasPendingBindings() || this.f54432r.hasPendingBindings() || this.f54426l.hasPendingBindings() || this.f54430p.hasPendingBindings() || this.f54429o.hasPendingBindings() || this.f54422h.hasPendingBindings() || this.f54428n.hasPendingBindings() || this.f54417c.hasPendingBindings() || this.f54415a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.K = 67108864L;
        }
        this.f54425k.invalidateAll();
        this.f54435u.invalidateAll();
        this.f54420f.invalidateAll();
        this.f54421g.invalidateAll();
        this.f54419e.invalidateAll();
        this.f54433s.invalidateAll();
        this.f54434t.invalidateAll();
        this.f54424j.invalidateAll();
        this.f54427m.invalidateAll();
        this.f54418d.invalidateAll();
        this.f54432r.invalidateAll();
        this.f54426l.invalidateAll();
        this.f54430p.invalidateAll();
        this.f54429o.invalidateAll();
        this.f54422h.invalidateAll();
        this.f54428n.invalidateAll();
        this.f54417c.invalidateAll();
        this.f54415a.invalidateAll();
        requestRebind();
    }

    @Override // gs.ca
    public void j(@Nullable com.baicizhan.main.activity.setting.privatessetting.debug.j2 Viewmodel) {
        this.f54436v = Viewmodel;
        synchronized (this) {
            this.K |= 33554432;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ck AdCacheDetail, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 8192;
        }
        return true;
    }

    public final boolean l(ck ApiTest, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 512;
        }
        return true;
    }

    public final boolean m(ck CopyCode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 128;
        }
        return true;
    }

    public final boolean n(ck Crash, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 4194304;
        }
        return true;
    }

    public final boolean o(kk DebugStudyMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return F((MutableLiveData) object, fieldId);
            case 1:
                return s((kk) object, fieldId);
            case 2:
                return t((ck) object, fieldId);
            case 3:
                return I((ck) object, fieldId);
            case 4:
                return A((MutableLiveData) object, fieldId);
            case 5:
                return B((MutableLiveData) object, fieldId);
            case 6:
                return o((kk) object, fieldId);
            case 7:
                return m((ck) object, fieldId);
            case 8:
                return J((ck) object, fieldId);
            case 9:
                return l((ck) object, fieldId);
            case 10:
                return y((MutableLiveData) object, fieldId);
            case 11:
                return v((kk) object, fieldId);
            case 12:
                return L((ck) object, fieldId);
            case 13:
                return k((ck) object, fieldId);
            case 14:
                return z((MutableLiveData) object, fieldId);
            case 15:
                return r((ck) object, fieldId);
            case 16:
                return G((kk) object, fieldId);
            case 17:
                return u((ck) object, fieldId);
            case 18:
                return x((ck) object, fieldId);
            case 19:
                return C((MutableLiveData) object, fieldId);
            case 20:
                return H((kk) object, fieldId);
            case 21:
                return p((kk) object, fieldId);
            case 22:
                return n((ck) object, fieldId);
            case 23:
                return D((MutableLiveData) object, fieldId);
            case 24:
                return K((ck) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(kk DebugWhitelistMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 2097152;
        }
        return true;
    }

    public final boolean r(ck HwPay, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 32768;
        }
        return true;
    }

    public final boolean s(kk MinuteAsSecond, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54425k.setLifecycleOwner(lifecycleOwner);
        this.f54435u.setLifecycleOwner(lifecycleOwner);
        this.f54420f.setLifecycleOwner(lifecycleOwner);
        this.f54421g.setLifecycleOwner(lifecycleOwner);
        this.f54419e.setLifecycleOwner(lifecycleOwner);
        this.f54433s.setLifecycleOwner(lifecycleOwner);
        this.f54434t.setLifecycleOwner(lifecycleOwner);
        this.f54424j.setLifecycleOwner(lifecycleOwner);
        this.f54427m.setLifecycleOwner(lifecycleOwner);
        this.f54418d.setLifecycleOwner(lifecycleOwner);
        this.f54432r.setLifecycleOwner(lifecycleOwner);
        this.f54426l.setLifecycleOwner(lifecycleOwner);
        this.f54430p.setLifecycleOwner(lifecycleOwner);
        this.f54429o.setLifecycleOwner(lifecycleOwner);
        this.f54422h.setLifecycleOwner(lifecycleOwner);
        this.f54428n.setLifecycleOwner(lifecycleOwner);
        this.f54417c.setLifecycleOwner(lifecycleOwner);
        this.f54415a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((com.baicizhan.main.activity.setting.privatessetting.debug.j2) variable);
        return true;
    }

    public final boolean t(ck Network, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 4;
        }
        return true;
    }

    public final boolean u(ck NewGuideFlag, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 131072;
        }
        return true;
    }

    public final boolean v(kk SecondAsMinute, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 2048;
        }
        return true;
    }

    public final boolean x(ck SpineTest, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= PlaybackStateCompat.E;
        }
        return true;
    }

    public final boolean y(MutableLiveData<Boolean> ViewmodelMinuteAsSecond, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1024;
        }
        return true;
    }

    public final boolean z(MutableLiveData<Boolean> ViewmodelSecondAsMinute, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 16384;
        }
        return true;
    }

    public da(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 25, (ck) bindings[19], (TextView) bindings[22], (ck) bindings[18], (ck) bindings[11], (ck) bindings[6], (kk) bindings[4], (kk) bindings[5], (ck) bindings[16], (TextView) bindings[21], (kk) bindings[9], (ck) bindings[2], (ck) bindings[13], (kk) bindings[10], (ck) bindings[17], (kk) bindings[15], (kk) bindings[14], (TextView) bindings[20], (ck) bindings[12], (ck) bindings[7], (ck) bindings[8], (ck) bindings[3]);
        this.K = -1L;
        setContainedBinding(this.f54415a);
        setContainedBinding(this.f54417c);
        setContainedBinding(this.f54418d);
        setContainedBinding(this.f54419e);
        setContainedBinding(this.f54420f);
        setContainedBinding(this.f54421g);
        setContainedBinding(this.f54422h);
        NestedScrollView nestedScrollView = (NestedScrollView) bindings[0];
        this.f54609w = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.f54610x = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f54424j);
        setContainedBinding(this.f54425k);
        setContainedBinding(this.f54426l);
        setContainedBinding(this.f54427m);
        setContainedBinding(this.f54428n);
        setContainedBinding(this.f54429o);
        setContainedBinding(this.f54430p);
        setContainedBinding(this.f54432r);
        setContainedBinding(this.f54433s);
        setContainedBinding(this.f54434t);
        setContainedBinding(this.f54435u);
        setRootTag(root);
        this.f54611y = new hs.a(this, 10);
        this.f54612z = new hs.a(this, 6);
        this.A = new hs.a(this, 2);
        this.B = new hs.a(this, 11);
        this.C = new hs.a(this, 7);
        this.D = new hs.a(this, 3);
        this.E = new hs.a(this, 8);
        this.F = new hs.a(this, 4);
        this.G = new hs.a(this, 12);
        this.H = new hs.a(this, 9);
        this.I = new hs.a(this, 5);
        this.J = new hs.a(this, 1);
        invalidateAll();
    }
}
