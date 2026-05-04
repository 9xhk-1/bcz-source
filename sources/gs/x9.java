package gs;

import android.content.res.Resources;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class x9 extends w9 implements a.InterfaceC0684a {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57419p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57420q;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57421h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57422i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57423j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57424k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57425l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57426m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57427n;

    /* renamed from: o, reason: collision with root package name */
    public long f57428o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f57419p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_extended_item", "mytab_setting_extended_item", "mytab_setting_extended_item", "mytab_setting_extended_item", "mytab_setting_extended_item", "mytab_setting_extended_item"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{R.layout.mytab_setting_extended_item, R.layout.mytab_setting_extended_item, R.layout.mytab_setting_extended_item, R.layout.mytab_setting_extended_item, R.layout.mytab_setting_extended_item, R.layout.mytab_setting_extended_item});
        f57420q = null;
    }

    public x9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f57419p, f57420q));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                ze.s sVar = this.f57301g;
                if (sVar != null) {
                    sVar.b();
                    break;
                }
                break;
            case 2:
                ze.s sVar2 = this.f57301g;
                if (sVar2 != null) {
                    sVar2.b();
                    break;
                }
                break;
            case 3:
                ze.s sVar3 = this.f57301g;
                if (sVar3 != null) {
                    sVar3.b();
                    break;
                }
                break;
            case 4:
                ze.s sVar4 = this.f57301g;
                if (sVar4 != null) {
                    sVar4.b();
                    break;
                }
                break;
            case 5:
                ze.s sVar5 = this.f57301g;
                if (sVar5 != null) {
                    sVar5.b();
                    break;
                }
                break;
            case 6:
                ze.s sVar6 = this.f57301g;
                if (sVar6 != null) {
                    sVar6.b();
                    break;
                }
                break;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        synchronized (this) {
            j11 = this.f57428o;
            this.f57428o = 0L;
        }
        ze.s sVar = this.f57301g;
        long j16 = j11 & 4096;
        if (j16 != 0 && j16 != 0) {
            j11 |= Build.VERSION.SDK_INT < 29 ? 16384L : 8192L;
        }
        if ((6709 & j11) != 0) {
            long j17 = j11 & 6145;
            j12 = 4096;
            if (j17 != 0) {
                MutableLiveData<Boolean> mutableLiveData = sVar != null ? sVar.f102594i : null;
                updateLiveDataRegistration(0, mutableLiveData);
                boolean safeUnbox = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
                if (j17 != 0) {
                    j11 |= safeUnbox ? 4194304L : 2097152L;
                }
                z12 = !safeUnbox;
                str2 = safeUnbox ? getRoot().getResources().getString(R.string.setting_permissions_desc_granted) : getRoot().getResources().getString(R.string.setting_permissions_desc_unset);
            } else {
                z12 = false;
                str2 = null;
            }
            long j18 = j11 & 6148;
            if (j18 != 0) {
                MutableLiveData<Boolean> mutableLiveData2 = sVar != null ? sVar.f102596k : null;
                j14 = 6656;
                updateLiveDataRegistration(2, mutableLiveData2);
                boolean safeUnbox2 = ViewDataBinding.safeUnbox(mutableLiveData2 != null ? mutableLiveData2.getValue() : null);
                if (j18 != 0) {
                    j11 |= safeUnbox2 ? 65536L : 32768L;
                }
                Resources resources = getRoot().getResources();
                str3 = safeUnbox2 ? resources.getString(R.string.setting_permissions_desc_granted) : resources.getString(R.string.setting_permissions_desc_unset);
                z11 = !safeUnbox2;
            } else {
                j14 = 6656;
                str3 = null;
                z11 = false;
            }
            long j19 = j11 & 6160;
            j15 = 6176;
            if (j19 != 0) {
                MutableLiveData<Boolean> mutableLiveData3 = sVar != null ? sVar.f102597l : null;
                updateLiveDataRegistration(4, mutableLiveData3);
                boolean safeUnbox3 = ViewDataBinding.safeUnbox(mutableLiveData3 != null ? mutableLiveData3.getValue() : null);
                if (j19 != 0) {
                    j11 |= safeUnbox3 ? j60.e.B : 8388608L;
                }
                z14 = !safeUnbox3;
                str4 = safeUnbox3 ? getRoot().getResources().getString(R.string.setting_permissions_desc_granted) : getRoot().getResources().getString(R.string.setting_permissions_desc_unset);
            } else {
                str4 = null;
                z14 = false;
            }
            long j21 = j11 & 6176;
            j13 = 6160;
            if (j21 != 0) {
                MutableLiveData<Boolean> mutableLiveData4 = sVar != null ? sVar.f102593h : null;
                updateLiveDataRegistration(5, mutableLiveData4);
                boolean safeUnbox4 = ViewDataBinding.safeUnbox(mutableLiveData4 != null ? mutableLiveData4.getValue() : null);
                if (j21 != 0) {
                    j11 |= safeUnbox4 ? 1048576L : PlaybackStateCompat.F;
                }
                z15 = !safeUnbox4;
                str5 = safeUnbox4 ? getRoot().getResources().getString(R.string.setting_permissions_desc_granted) : getRoot().getResources().getString(R.string.setting_permissions_desc_unset);
            } else {
                str5 = null;
                z15 = false;
            }
            long j22 = j11 & j14;
            if (j22 != 0) {
                MutableLiveData<Boolean> mutableLiveData5 = sVar != null ? sVar.f102595j : null;
                updateLiveDataRegistration(9, mutableLiveData5);
                boolean safeUnbox5 = ViewDataBinding.safeUnbox(mutableLiveData5 != null ? mutableLiveData5.getValue() : null);
                if (j22 != 0) {
                    j11 |= safeUnbox5 ? PlaybackStateCompat.E : 131072L;
                }
                z13 = !safeUnbox5;
                str = safeUnbox5 ? getRoot().getResources().getString(R.string.setting_permissions_desc_granted) : getRoot().getResources().getString(R.string.setting_permissions_desc_unset);
            } else {
                str = null;
                z13 = false;
            }
        } else {
            j12 = 4096;
            j13 = 6160;
            j14 = 6656;
            j15 = 6176;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if ((j11 & j15) != 0) {
            this.f57295a.r(str5);
            this.f57295a.s(Boolean.valueOf(z15));
        }
        if ((j11 & j12) != 0) {
            this.f57295a.u(this.f57427n);
            this.f57295a.y(getRoot().getResources().getString(R.string.setting_permissions_manager_bluetooth_sub));
            this.f57295a.z(getRoot().getResources().getString(R.string.setting_permissions_manager_bluetooth));
            this.f57296b.u(this.f57422i);
            this.f57296b.y(getRoot().getResources().getString(R.string.setting_permissions_manager_camera_sub));
            this.f57296b.z(getRoot().getResources().getString(R.string.setting_permissions_manager_camera));
            this.f57297c.u(this.f57426m);
            this.f57297c.y(getRoot().getResources().getString(R.string.setting_permissions_manager_location_sub));
            this.f57297c.z(getRoot().getResources().getString(R.string.setting_permissions_manager_location));
            this.f57298d.u(this.f57424k);
            this.f57298d.y(getRoot().getResources().getString(R.string.setting_permissions_manager_microphone_sub));
            this.f57298d.z(getRoot().getResources().getString(R.string.setting_permissions_manager_microphone));
            this.f57299e.r(getRoot().getResources().getString(R.string.setting_permissions_desc_unset));
            this.f57299e.s(Boolean.TRUE);
            this.f57299e.u(this.f57425l);
            this.f57299e.y(getRoot().getResources().getString(R.string.setting_permissions_manager_network_sub));
            this.f57299e.z(getRoot().getResources().getString(R.string.setting_permissions_manager_network));
            this.f57300f.getRoot().setVisibility(Build.VERSION.SDK_INT < 29 ? 0 : 8);
            this.f57300f.u(this.f57423j);
            this.f57300f.y(getRoot().getResources().getString(R.string.setting_permissions_manager_storage_sub));
            this.f57300f.z(getRoot().getResources().getString(R.string.setting_permissions_manager_storage));
        }
        if ((j11 & 6145) != 0) {
            this.f57296b.r(str2);
            this.f57296b.s(Boolean.valueOf(z12));
        }
        if ((j11 & j13) != 0) {
            this.f57297c.r(str4);
            this.f57297c.s(Boolean.valueOf(z14));
        }
        if ((j11 & 6148) != 0) {
            this.f57298d.r(str3);
            this.f57298d.s(Boolean.valueOf(z11));
        }
        if ((j11 & j14) != 0) {
            this.f57300f.r(str);
            this.f57300f.s(Boolean.valueOf(z13));
        }
        ViewDataBinding.executeBindingsOn(this.f57299e);
        ViewDataBinding.executeBindingsOn(this.f57295a);
        ViewDataBinding.executeBindingsOn(this.f57296b);
        ViewDataBinding.executeBindingsOn(this.f57300f);
        ViewDataBinding.executeBindingsOn(this.f57298d);
        ViewDataBinding.executeBindingsOn(this.f57297c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57428o != 0) {
                    return true;
                }
                return this.f57299e.hasPendingBindings() || this.f57295a.hasPendingBindings() || this.f57296b.hasPendingBindings() || this.f57300f.hasPendingBindings() || this.f57298d.hasPendingBindings() || this.f57297c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57428o = 4096L;
        }
        this.f57299e.invalidateAll();
        this.f57295a.invalidateAll();
        this.f57296b.invalidateAll();
        this.f57300f.invalidateAll();
        this.f57298d.invalidateAll();
        this.f57297c.invalidateAll();
        requestRebind();
    }

    @Override // gs.w9
    public void j(@Nullable ze.s Viewmodel) {
        this.f57301g = Viewmodel;
        synchronized (this) {
            this.f57428o |= 2048;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(gk Bluetooth, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 256;
        }
        return true;
    }

    public final boolean l(gk Camera, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 128;
        }
        return true;
    }

    public final boolean m(gk Location, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 64;
        }
        return true;
    }

    public final boolean n(gk Microphone, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 1024;
        }
        return true;
    }

    public final boolean o(gk Network, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return s((MutableLiveData) object, fieldId);
            case 1:
                return o((gk) object, fieldId);
            case 2:
                return u((MutableLiveData) object, fieldId);
            case 3:
                return p((gk) object, fieldId);
            case 4:
                return t((MutableLiveData) object, fieldId);
            case 5:
                return r((MutableLiveData) object, fieldId);
            case 6:
                return m((gk) object, fieldId);
            case 7:
                return l((gk) object, fieldId);
            case 8:
                return k((gk) object, fieldId);
            case 9:
                return v((MutableLiveData) object, fieldId);
            case 10:
                return n((gk) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(gk Storage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 8;
        }
        return true;
    }

    public final boolean r(MutableLiveData<Boolean> ViewmodelBluetoothStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 32;
        }
        return true;
    }

    public final boolean s(MutableLiveData<Boolean> ViewmodelCameraStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57299e.setLifecycleOwner(lifecycleOwner);
        this.f57295a.setLifecycleOwner(lifecycleOwner);
        this.f57296b.setLifecycleOwner(lifecycleOwner);
        this.f57300f.setLifecycleOwner(lifecycleOwner);
        this.f57298d.setLifecycleOwner(lifecycleOwner);
        this.f57297c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ze.s) variable);
        return true;
    }

    public final boolean t(MutableLiveData<Boolean> ViewmodelLocationStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 16;
        }
        return true;
    }

    public final boolean u(MutableLiveData<Boolean> ViewmodelRecordStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 4;
        }
        return true;
    }

    public final boolean v(MutableLiveData<Boolean> ViewmodelStorageStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57428o |= 512;
        }
        return true;
    }

    public x9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11, (gk) bindings[2], (gk) bindings[3], (gk) bindings[6], (gk) bindings[5], (gk) bindings[1], (gk) bindings[4]);
        this.f57428o = -1L;
        setContainedBinding(this.f57295a);
        setContainedBinding(this.f57296b);
        setContainedBinding(this.f57297c);
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f57421h = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.f57298d);
        setContainedBinding(this.f57299e);
        setContainedBinding(this.f57300f);
        setRootTag(root);
        this.f57422i = new hs.a(this, 3);
        this.f57423j = new hs.a(this, 4);
        this.f57424k = new hs.a(this, 5);
        this.f57425l = new hs.a(this, 1);
        this.f57426m = new hs.a(this, 6);
        this.f57427n = new hs.a(this, 2);
        invalidateAll();
    }
}
