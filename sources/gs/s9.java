package gs;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.activity.mytab.device.MyDevicesView;
import com.baicizhan.main.activity.mytab.task.AchievementView;
import com.baicizhan.main.activity.mytab.task.TaskVM;
import com.baicizhan.main.activity.mytab.task.TasksView;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class s9 extends r9 implements a.InterfaceC0684a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts W;

    @Nullable
    public static final SparseIntArray X;

    @Nullable
    public final View.OnClickListener H;

    @Nullable
    public final View.OnClickListener I;

    @Nullable
    public final View.OnClickListener J;

    @Nullable
    public final View.OnClickListener K;

    @Nullable
    public final View.OnClickListener L;

    @Nullable
    public final View.OnClickListener M;

    @Nullable
    public final View.OnClickListener N;

    @Nullable
    public final View.OnClickListener O;

    @Nullable
    public final View.OnClickListener P;

    @Nullable
    public final View.OnClickListener Q;

    @Nullable
    public final View.OnClickListener R;

    @Nullable
    public final View.OnClickListener S;

    @Nullable
    public final View.OnClickListener T;

    @Nullable
    public final View.OnClickListener U;
    public long V;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(29);
        W = includedLayouts;
        includedLayouts.setIncludes(9, new String[]{"mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans"}, new int[]{14, 15, 16}, new int[]{R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans});
        includedLayouts.setIncludes(10, new String[]{"mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans"}, new int[]{17, 18, 19}, new int[]{R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans});
        includedLayouts.setIncludes(11, new String[]{"mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans", "mytab_setting_basic_item_trans"}, new int[]{20, 21, 22}, new int[]{R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans, R.layout.mytab_setting_basic_item_trans});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(R.id.head_bg, 23);
        sparseIntArray.put(R.id.content, 24);
        sparseIntArray.put(R.id.img_me_more, 25);
        sparseIntArray.put(R.id.study_layout, 26);
        sparseIntArray.put(R.id.my_devices, 27);
        sparseIntArray.put(R.id.action_bar, 28);
    }

    public s9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 29, W, X));
    }

    public final boolean A(ek MyWordTest, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    public final boolean B(MutableLiveData<Boolean> NotificationsModelMFeedbackState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 64;
        }
        return true;
    }

    public final boolean C(MutableLiveData<Boolean> NotificationsModelMGradeRemind, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 256;
        }
        return true;
    }

    public final boolean D(MutableLiveData<Boolean> NotificationsModelMGradeUpdate, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 16;
        }
        return true;
    }

    public final boolean F(LiveData<Boolean> TaskVmIsTestOpen, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 4;
        }
        return true;
    }

    public final boolean G(MutableLiveData<String> ViewmodelAvater, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 512;
        }
        return true;
    }

    public final boolean H(LiveData<String> ViewmodelBczIdTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 16384;
        }
        return true;
    }

    public final boolean I(MutableLiveData<String> ViewmodelGradle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 1024;
        }
        return true;
    }

    public final boolean J(MutableLiveData<String> ViewmodelName, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 65536;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                he.w wVar = this.D;
                if (wVar != null) {
                    wVar.D();
                    break;
                }
                break;
            case 2:
                he.w wVar2 = this.D;
                if (wVar2 != null) {
                    wVar2.g();
                    break;
                }
                break;
            case 3:
                he.w wVar3 = this.D;
                if (wVar3 != null) {
                    wVar3.y();
                    break;
                }
                break;
            case 4:
                he.w wVar4 = this.D;
                if (wVar4 != null) {
                    wVar4.v();
                    break;
                }
                break;
            case 5:
                he.w wVar5 = this.D;
                if (wVar5 != null) {
                    wVar5.C();
                    break;
                }
                break;
            case 6:
                he.w wVar6 = this.D;
                if (wVar6 != null) {
                    wVar6.I();
                    break;
                }
                break;
            case 7:
                he.w wVar7 = this.D;
                if (wVar7 != null) {
                    wVar7.A();
                    break;
                }
                break;
            case 8:
                he.w wVar8 = this.D;
                if (wVar8 != null) {
                    wVar8.w();
                    break;
                }
                break;
            case 9:
                he.w wVar9 = this.D;
                if (wVar9 != null) {
                    wVar9.B();
                    break;
                }
                break;
            case 10:
                he.w wVar10 = this.D;
                if (wVar10 != null) {
                    wVar10.z();
                    break;
                }
                break;
            case 11:
                he.w wVar11 = this.D;
                if (wVar11 != null) {
                    wVar11.F();
                    break;
                }
                break;
            case 12:
                he.w wVar12 = this.D;
                if (wVar12 != null) {
                    wVar12.x();
                    break;
                }
                break;
            case 13:
                he.w wVar13 = this.D;
                if (wVar13 != null) {
                    wVar13.G();
                    break;
                }
                break;
            case 14:
                he.w wVar14 = this.D;
                if (wVar14 != null) {
                    wVar14.H();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
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
        throw new UnsupportedOperationException("Method not decompiled: gs.s9.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.f56606m.hasPendingBindings() || this.f56612s.hasPendingBindings() || this.f56614u.hasPendingBindings() || this.f56607n.hasPendingBindings() || this.f56609p.hasPendingBindings() || this.f56611r.hasPendingBindings() || this.f56610q.hasPendingBindings() || this.f56599f.hasPendingBindings() || this.f56603j.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.V = 2097152L;
        }
        this.f56606m.invalidateAll();
        this.f56612s.invalidateAll();
        this.f56614u.invalidateAll();
        this.f56607n.invalidateAll();
        this.f56609p.invalidateAll();
        this.f56611r.invalidateAll();
        this.f56610q.invalidateAll();
        this.f56599f.invalidateAll();
        this.f56603j.invalidateAll();
        requestRebind();
    }

    @Override // gs.r9
    public void m(boolean Dark) {
        this.G = Dark;
    }

    @Override // gs.r9
    public void n(@Nullable bh.c NotificationsModel) {
        this.F = NotificationsModel;
        synchronized (this) {
            this.V |= 131072;
        }
        notifyPropertyChanged(46);
        super.requestRebind();
    }

    @Override // gs.r9
    public void o(@Nullable TaskVM TaskVm) {
        this.E = TaskVm;
        synchronized (this) {
            this.V |= PlaybackStateCompat.F;
        }
        notifyPropertyChanged(83);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return A((ek) object, fieldId);
            case 1:
                return v((ek) object, fieldId);
            case 2:
                return F((LiveData) object, fieldId);
            case 3:
                return s((ek) object, fieldId);
            case 4:
                return D((MutableLiveData) object, fieldId);
            case 5:
                return u((ek) object, fieldId);
            case 6:
                return B((MutableLiveData) object, fieldId);
            case 7:
                return x((ek) object, fieldId);
            case 8:
                return C((MutableLiveData) object, fieldId);
            case 9:
                return G((MutableLiveData) object, fieldId);
            case 10:
                return I((MutableLiveData) object, fieldId);
            case 11:
                return r((ek) object, fieldId);
            case 12:
                return z((ek) object, fieldId);
            case 13:
                return t((ek) object, fieldId);
            case 14:
                return H((LiveData) object, fieldId);
            case 15:
                return y((ek) object, fieldId);
            case 16:
                return J((MutableLiveData) object, fieldId);
            default:
                return false;
        }
    }

    @Override // gs.r9
    public void p(@Nullable he.w Viewmodel) {
        this.D = Viewmodel;
        synchronized (this) {
            this.V |= 1048576;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean r(ek GivePraise, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 2048;
        }
        return true;
    }

    public final boolean s(ek HelpAndFeedback, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56606m.setLifecycleOwner(lifecycleOwner);
        this.f56612s.setLifecycleOwner(lifecycleOwner);
        this.f56614u.setLifecycleOwner(lifecycleOwner);
        this.f56607n.setLifecycleOwner(lifecycleOwner);
        this.f56609p.setLifecycleOwner(lifecycleOwner);
        this.f56611r.setLifecycleOwner(lifecycleOwner);
        this.f56610q.setLifecycleOwner(lifecycleOwner);
        this.f56599f.setLifecycleOwner(lifecycleOwner);
        this.f56603j.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (46 == variableId) {
            n((bh.c) variable);
            return true;
        }
        if (20 == variableId) {
            m(((Boolean) variable).booleanValue());
            return true;
        }
        if (83 == variableId) {
            o((TaskVM) variable);
            return true;
        }
        if (89 != variableId) {
            return false;
        }
        p((he.w) variable);
        return true;
    }

    public final boolean t(ek MyCalendar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 8192;
        }
        return true;
    }

    public final boolean u(ek MyCollection, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 32;
        }
        return true;
    }

    public final boolean v(ek MyExam, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 2;
        }
        return true;
    }

    public final boolean x(ek MyMall, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 128;
        }
        return true;
    }

    public final boolean y(ek MyMoney, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 32768;
        }
        return true;
    }

    public final boolean z(ek MyPlan, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 4096;
        }
        return true;
    }

    public s9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17, (LinearLayout) bindings[28], (RoundedImageView) bindings[2], (TextView) bindings[4], (ConstraintLayout) bindings[10], (NestedScrollView) bindings[24], (ek) bindings[21], (View) bindings[6], (TextView) bindings[5], (ImageView) bindings[23], (ek) bindings[22], (ConstraintLayout) bindings[11], (ImageView) bindings[25], (ek) bindings[14], (ek) bindings[17], (MyDevicesView) bindings[27], (ek) bindings[18], (ek) bindings[20], (ek) bindings[19], (ek) bindings[15], (FrameLayout) bindings[0], (ek) bindings[16], (TextView) bindings[3], (LinearLayout) bindings[9], (ImageView) bindings[12], (ImageView) bindings[13], (AchievementView) bindings[26], (View) bindings[7], (TasksView) bindings[8], (ConstraintLayout) bindings[1]);
        this.V = -1L;
        this.f56595b.setTag(null);
        this.f56596c.setTag(null);
        this.f56597d.setTag(null);
        setContainedBinding(this.f56599f);
        this.f56600g.setTag(null);
        this.f56601h.setTag(null);
        setContainedBinding(this.f56603j);
        this.f56604k.setTag(null);
        setContainedBinding(this.f56606m);
        setContainedBinding(this.f56607n);
        setContainedBinding(this.f56609p);
        setContainedBinding(this.f56610q);
        setContainedBinding(this.f56611r);
        setContainedBinding(this.f56612s);
        this.f56613t.setTag(null);
        setContainedBinding(this.f56614u);
        this.f56615v.setTag(null);
        this.f56616w.setTag(null);
        this.f56617x.setTag(null);
        this.f56618y.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        setRootTag(root);
        this.H = new hs.a(this, 13);
        this.I = new hs.a(this, 9);
        this.J = new hs.a(this, 4);
        this.K = new hs.a(this, 14);
        this.L = new hs.a(this, 10);
        this.M = new hs.a(this, 7);
        this.N = new hs.a(this, 3);
        this.O = new hs.a(this, 11);
        this.P = new hs.a(this, 6);
        this.Q = new hs.a(this, 2);
        this.R = new hs.a(this, 12);
        this.S = new hs.a(this, 8);
        this.T = new hs.a(this, 5);
        this.U = new hs.a(this, 1);
        invalidateAll();
    }
}
