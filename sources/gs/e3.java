package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.wordlistv2.view.WordListTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e3 extends d3 implements a.InterfaceC0684a {

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54722x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54723y;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54724t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54725u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54726v;

    /* renamed from: w, reason: collision with root package name */
    public long f54727w;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        f54722x = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{6}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54723y = sparseIntArray;
        sparseIntArray.put(R.id.rl_top_edit, 7);
        sparseIntArray.put(R.id.tv_select_count, 8);
        sparseIntArray.put(R.id.tv_cancel_edit, 9);
        sparseIntArray.put(R.id.top_app_bar, 10);
        sparseIntArray.put(R.id.word_tab, 11);
        sparseIntArray.put(R.id.tv_word_count, 12);
        sparseIntArray.put(R.id.iv_tip, 13);
        sparseIntArray.put(R.id.tv_option, 14);
        sparseIntArray.put(R.id.tv_hide_show, 15);
        sparseIntArray.put(R.id.vp_list, 16);
        sparseIntArray.put(R.id.cl_bottom_edit, 17);
        sparseIntArray.put(R.id.iv_no_net, 18);
        sparseIntArray.put(R.id.tv_no_net, 19);
    }

    public e3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 20, f54722x, f54723y));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        com.baicizhan.main.wordlistv2.w0 w0Var = this.f54576s;
        if (w0Var != null) {
            w0Var.u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
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
        throw new UnsupportedOperationException("Method not decompiled: gs.e3.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54727w != 0) {
                    return true;
                }
                return this.f54563f.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54727w = 32L;
        }
        this.f54563f.invalidateAll();
        requestRebind();
    }

    @Override // gs.d3
    public void j(@Nullable com.baicizhan.main.wordlistv2.w0 Vm) {
        this.f54576s = Vm;
        synchronized (this) {
            this.f54727w |= 16;
        }
        notifyPropertyChanged(90);
        super.requestRebind();
    }

    public final boolean k(a TitleBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54727w |= 8;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Boolean> VmCheckedAll, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54727w |= 1;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Boolean> VmDataFailed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54727w |= 4;
        }
        return true;
    }

    public final boolean n(MutableLiveData<String> VmEditActionStr, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54727w |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 1) {
            return n((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 2) {
            return m((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return k((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54563f.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (90 != variableId) {
            return false;
        }
        j((com.baicizhan.main.wordlistv2.w0) variable);
        return true;
    }

    public e3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4, (ConstraintLayout) bindings[17], (CoordinatorLayout) bindings[2], (ImageView) bindings[18], (ImageView) bindings[13], (ConstraintLayout) bindings[7], (a) bindings[6], (AppBarLayout) bindings[10], (TextView) bindings[9], (TextView) bindings[3], (TextView) bindings[15], (TextView) bindings[19], (TextView) bindings[14], (TextView) bindings[5], (TextView) bindings[1], (TextView) bindings[8], (TextView) bindings[12], (ViewPager2) bindings[16], (WordListTabLayout) bindings[11]);
        this.f54727w = -1L;
        this.f54559b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54724t = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) bindings[4];
        this.f54725u = constraintLayout2;
        constraintLayout2.setTag(null);
        setContainedBinding(this.f54563f);
        this.f54566i.setTag(null);
        this.f54570m.setTag(null);
        this.f54571n.setTag(null);
        setRootTag(root);
        this.f54726v = new hs.a(this, 1);
        invalidateAll();
    }
}
