package gs;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class jb extends ib implements a.InterfaceC0684a {

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55472u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55473v;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55474j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f55475k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55476l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55477m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55478n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55479o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55480p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55481q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55482r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55483s;

    /* renamed from: t, reason: collision with root package name */
    public long f55484t;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        f55472u = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans"}, new int[]{3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans});
        f55473v = null;
    }

    public jb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, f55472u, f55473v));
    }

    private boolean x(MutableLiveData<String> ViewmodelGradle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 2048;
        }
        return true;
    }

    public final boolean A(MutableLiveData<String> ViewmodelLocation, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 16;
        }
        return true;
    }

    public final boolean B(MutableLiveData<String> ViewmodelSchool, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 4096;
        }
        return true;
    }

    public final boolean C(MutableLiveData<String> ViewmodelSex, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 8;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                ef.l lVar = this.f55301i;
                if (lVar != null) {
                    lVar.g();
                    break;
                }
                break;
            case 2:
                ef.l lVar2 = this.f55301i;
                if (lVar2 != null) {
                    lVar2.j();
                    break;
                }
                break;
            case 3:
                ef.l lVar3 = this.f55301i;
                if (lVar3 != null) {
                    lVar3.f();
                    break;
                }
                break;
            case 4:
                ef.l lVar4 = this.f55301i;
                if (lVar4 != null) {
                    lVar4.c();
                    break;
                }
                break;
            case 5:
                ef.l lVar5 = this.f55301i;
                if (lVar5 != null) {
                    lVar5.d();
                    break;
                }
                break;
            case 6:
                ef.l lVar6 = this.f55301i;
                if (lVar6 != null) {
                    lVar6.k();
                    break;
                }
                break;
            case 7:
                ef.l lVar7 = this.f55301i;
                if (lVar7 != null) {
                    lVar7.h();
                    break;
                }
                break;
            case 8:
                ef.l lVar8 = this.f55301i;
                if (lVar8 != null) {
                    lVar8.i();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.jb.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55484t != 0) {
                    return true;
                }
                return this.f55298f.hasPendingBindings() || this.f55300h.hasPendingBindings() || this.f55294b.hasPendingBindings() || this.f55297e.hasPendingBindings() || this.f55299g.hasPendingBindings() || this.f55295c.hasPendingBindings() || this.f55296d.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55484t = PlaybackStateCompat.E;
        }
        this.f55298f.invalidateAll();
        this.f55300h.invalidateAll();
        this.f55294b.invalidateAll();
        this.f55297e.invalidateAll();
        this.f55299g.invalidateAll();
        this.f55295c.invalidateAll();
        this.f55296d.invalidateAll();
        requestRebind();
    }

    @Override // gs.ib
    public void j(@Nullable ef.l Viewmodel) {
        this.f55301i = Viewmodel;
        synchronized (this) {
            this.f55484t |= 131072;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ek Birthday, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 128;
        }
        return true;
    }

    public final boolean l(ek Gradle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 2;
        }
        return true;
    }

    public final boolean m(ek IpDesc, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 256;
        }
        return true;
    }

    public final boolean n(ek Location, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 512;
        }
        return true;
    }

    public final boolean o(ek Nickname, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 1024;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return r((ek) object, fieldId);
            case 1:
                return l((ek) object, fieldId);
            case 2:
                return v((SingleLiveEvent) object, fieldId);
            case 3:
                return C((MutableLiveData) object, fieldId);
            case 4:
                return A((MutableLiveData) object, fieldId);
            case 5:
                return u((MutableLiveData) object, fieldId);
            case 6:
                return s((MutableLiveData) object, fieldId);
            case 7:
                return k((ek) object, fieldId);
            case 8:
                return m((ek) object, fieldId);
            case 9:
                return n((ek) object, fieldId);
            case 10:
                return o((ek) object, fieldId);
            case 11:
                return x((MutableLiveData) object, fieldId);
            case 12:
                return B((MutableLiveData) object, fieldId);
            case 13:
                return y((MutableLiveData) object, fieldId);
            case 14:
                return z((MutableLiveData) object, fieldId);
            case 15:
                return t((MutableLiveData) object, fieldId);
            case 16:
                return p((ek) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(ek School, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 65536;
        }
        return true;
    }

    public final boolean r(ek Sex, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 1;
        }
        return true;
    }

    public final boolean s(MutableLiveData<String> ViewmodelAvatar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55298f.setLifecycleOwner(lifecycleOwner);
        this.f55300h.setLifecycleOwner(lifecycleOwner);
        this.f55294b.setLifecycleOwner(lifecycleOwner);
        this.f55297e.setLifecycleOwner(lifecycleOwner);
        this.f55299g.setLifecycleOwner(lifecycleOwner);
        this.f55295c.setLifecycleOwner(lifecycleOwner);
        this.f55296d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ef.l) variable);
        return true;
    }

    public final boolean t(MutableLiveData<String> ViewmodelBirthday, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 32768;
        }
        return true;
    }

    public final boolean u(MutableLiveData<String> ViewmodelDisplayName, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 32;
        }
        return true;
    }

    public final boolean v(SingleLiveEvent<Boolean> ViewmodelEditingSex, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 4;
        }
        return true;
    }

    public final boolean y(MutableLiveData<Boolean> ViewmodelGradleRedDot, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 8192;
        }
        return true;
    }

    public final boolean z(MutableLiveData<String> ViewmodelIpDesc, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55484t |= 16384;
        }
        return true;
    }

    public jb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17, (LinearLayout) bindings[1], (ek) bindings[5], (ek) bindings[8], (ek) bindings[9], (ek) bindings[6], (ek) bindings[3], (ek) bindings[7], (ek) bindings[4]);
        this.f55484t = -1L;
        this.f55293a.setTag(null);
        setContainedBinding(this.f55294b);
        setContainedBinding(this.f55295c);
        setContainedBinding(this.f55296d);
        setContainedBinding(this.f55297e);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55474j = constraintLayout;
        constraintLayout.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) bindings[2];
        this.f55475k = roundedImageView;
        roundedImageView.setTag(null);
        setContainedBinding(this.f55298f);
        setContainedBinding(this.f55299g);
        setContainedBinding(this.f55300h);
        setRootTag(root);
        this.f55476l = new hs.a(this, 4);
        this.f55477m = new hs.a(this, 3);
        this.f55478n = new hs.a(this, 7);
        this.f55479o = new hs.a(this, 5);
        this.f55480p = new hs.a(this, 8);
        this.f55481q = new hs.a(this, 6);
        this.f55482r = new hs.a(this, 1);
        this.f55483s = new hs.a(this, 2);
        invalidateAll();
    }
}
