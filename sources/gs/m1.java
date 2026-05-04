package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m1 extends l1 implements a.InterfaceC0684a {

    @Nullable
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55829z;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55830u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55831v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55832w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55833x;

    /* renamed from: y, reason: collision with root package name */
    public long f55834y;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        f55829z = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{10}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.guide_line_left, 11);
        sparseIntArray.put(R.id.guide_line_right, 12);
        sparseIntArray.put(R.id.service_barrier, 13);
        sparseIntArray.put(R.id.phone_tip_barrier, 14);
        sparseIntArray.put(R.id.agreement_layout, 15);
        sparseIntArray.put(R.id.protocol_check, 16);
        sparseIntArray.put(R.id.agreement, 17);
        sparseIntArray.put(R.id.weibo_mail, 18);
    }

    public m1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 19, f55829z, A));
    }

    private boolean k(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 2;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        tf.a0 a0Var;
        if (sourceId == 1) {
            tf.a0 a0Var2 = this.f55691t;
            if (a0Var2 != null) {
                a0Var2.N();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            tf.a0 a0Var3 = this.f55691t;
            if (a0Var3 != null) {
                a0Var3.O();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (a0Var = this.f55691t) != null) {
                a0Var.M();
                return;
            }
            return;
        }
        tf.a0 a0Var4 = this.f55691t;
        if (a0Var4 != null) {
            a0Var4.P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ed  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.m1.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55834y != 0) {
                    return true;
                }
                return this.f55672a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55834y = 512L;
        }
        this.f55672a.invalidateAll();
        requestRebind();
    }

    @Override // gs.l1
    public void j(@Nullable tf.a0 OneKeyModel) {
        this.f55691t = OneKeyModel;
        synchronized (this) {
            this.f55834y |= 256;
        }
        notifyPropertyChanged(49);
        super.requestRebind();
    }

    public final boolean l(MutableLiveData<Boolean> OneKeyModelIsBindState, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 16;
        }
        return true;
    }

    public final boolean m(MutableLiveData<String> OneKeyModelNextOperateText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 4;
        }
        return true;
    }

    public final boolean n(MutableLiveData<String> OneKeyModelOperatorService, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 1;
        }
        return true;
    }

    public final boolean o(MutableLiveData<String> OneKeyModelOtherWayText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return n((MutableLiveData) object, fieldId);
            case 1:
                return k((a) object, fieldId);
            case 2:
                return m((MutableLiveData) object, fieldId);
            case 3:
                return s((MutableLiveData) object, fieldId);
            case 4:
                return l((MutableLiveData) object, fieldId);
            case 5:
                return o((MutableLiveData) object, fieldId);
            case 6:
                return p((MutableLiveData) object, fieldId);
            case 7:
                return r((MutableLiveData) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(MutableLiveData<String> OneKeyModelSubTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 64;
        }
        return true;
    }

    public final boolean r(MutableLiveData<String> OneKeyModelTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 128;
        }
        return true;
    }

    public final boolean s(MutableLiveData<String> OneKeyModelUserPhone, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55834y |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55672a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (49 != variableId) {
            return false;
        }
        j((tf.a0) variable);
        return true;
    }

    public m1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8, (a) bindings[10], (TextView) bindings[17], (LinearLayout) bindings[15], (TextView) bindings[3], (ConstraintLayout) bindings[0], (Guideline) bindings[11], (Guideline) bindings[12], (FrameLayout) bindings[9], (TextView) bindings[2], (TextView) bindings[4], (TextView) bindings[5], (TextView) bindings[1], (TextView) bindings[7], (Barrier) bindings[14], (ImageView) bindings[16], (Barrier) bindings[13], (TextView) bindings[6], (FrameLayout) bindings[8], (Guideline) bindings[18]);
        this.f55834y = -1L;
        setContainedBinding(this.f55672a);
        this.f55675d.setTag(null);
        this.f55676e.setTag(null);
        this.f55679h.setTag(null);
        this.f55680i.setTag(null);
        this.f55681j.setTag(null);
        this.f55682k.setTag(null);
        this.f55683l.setTag(null);
        this.f55684m.setTag(null);
        this.f55688q.setTag(null);
        this.f55689r.setTag(null);
        setRootTag(root);
        this.f55830u = new hs.a(this, 3);
        this.f55831v = new hs.a(this, 1);
        this.f55832w = new hs.a(this, 4);
        this.f55833x = new hs.a(this, 2);
        invalidateAll();
    }
}
