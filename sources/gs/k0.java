package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.customview.PageDotIndicator;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k0 extends j0 implements a.InterfaceC0684a {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55557s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55558t;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55559p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55560q;

    /* renamed from: r, reason: collision with root package name */
    public long f55561r;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        f55557s = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic", "bottom_blue_btn", "fail_and_retry_layout"}, new int[]{1, 2, 3}, new int[]{R.layout.action_bar_basic, R.layout.bottom_blue_btn, R.layout.fail_and_retry_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55558t = sparseIntArray;
        sparseIntArray.put(R.id.template_pager, 4);
        sparseIntArray.put(R.id.selected_title, 5);
        sparseIntArray.put(R.id.pre_title, 6);
        sparseIntArray.put(R.id.next_title, 7);
        sparseIntArray.put(R.id.page_indicator, 8);
        sparseIntArray.put(R.id.bottom_guide, 9);
        sparseIntArray.put(R.id.cost_bottom_container, 10);
        sparseIntArray.put(R.id.cost_btn, 11);
        sparseIntArray.put(R.id.cost_btn_icon, 12);
        sparseIntArray.put(R.id.cost_btn_text, 13);
        sparseIntArray.put(R.id.cost_remaining_badge, 14);
    }

    public k0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 15, f55557s, f55558t));
    }

    private boolean k(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55561r |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        qj.n nVar = this.f55393o;
        if (nVar != null) {
            nVar.u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55561r;
            this.f55561r = 0L;
        }
        if ((j11 & 16) != 0) {
            this.f55379a.V(getRoot().getResources().getString(R.string.export_template_title));
            this.f55379a.P(Boolean.TRUE);
            this.f55381c.j(getRoot().getResources().getString(R.string.export_pdf_btn_title));
            this.f55390l.n(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.img_default_oops));
            this.f55390l.m(getRoot().getResources().getString(R.string.data_fail_and_retry));
            this.f55390l.o(getRoot().getResources().getString(R.string.do_retry));
            this.f55390l.p(this.f55560q);
        }
        ViewDataBinding.executeBindingsOn(this.f55379a);
        ViewDataBinding.executeBindingsOn(this.f55381c);
        ViewDataBinding.executeBindingsOn(this.f55390l);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55561r != 0) {
                    return true;
                }
                return this.f55379a.hasPendingBindings() || this.f55381c.hasPendingBindings() || this.f55390l.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55561r = 16L;
        }
        this.f55379a.invalidateAll();
        this.f55381c.invalidateAll();
        this.f55390l.invalidateAll();
        requestRebind();
    }

    @Override // gs.j0
    public void j(@Nullable qj.n Model) {
        this.f55393o = Model;
        synchronized (this) {
            this.f55561r |= 8;
        }
        notifyPropertyChanged(43);
        super.requestRebind();
    }

    public final boolean l(x4 ConfirmBtn, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55561r |= 2;
        }
        return true;
    }

    public final boolean m(f7 RetryLayout, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55561r |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((a) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((x4) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return m((f7) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55379a.setLifecycleOwner(lifecycleOwner);
        this.f55381c.setLifecycleOwner(lifecycleOwner);
        this.f55390l.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (43 != variableId) {
            return false;
        }
        j((qj.n) variable);
        return true;
    }

    public k0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (a) bindings[1], (Guideline) bindings[9], (x4) bindings[2], (FrameLayout) bindings[10], (View) bindings[11], (ImageView) bindings[12], (TextView) bindings[13], (TextView) bindings[14], (TextView) bindings[7], (PageDotIndicator) bindings[8], (TextView) bindings[6], (f7) bindings[3], (TextView) bindings[5], (ViewPager2) bindings[4]);
        this.f55561r = -1L;
        setContainedBinding(this.f55379a);
        setContainedBinding(this.f55381c);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55559p = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f55390l);
        setRootTag(root);
        this.f55560q = new hs.a(this, 1);
        invalidateAll();
    }
}
