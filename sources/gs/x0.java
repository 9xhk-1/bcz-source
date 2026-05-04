package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.client.business.widget.share.SharePanelViewV2;
import com.baicizhan.main.customview.PageLineDotIndicator;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class x0 extends w0 implements a.InterfaceC0684a {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57387m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57388n;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57389h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final c6 f57390i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Group f57391j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57392k;

    /* renamed from: l, reason: collision with root package name */
    public long f57393l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        f57387m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"daka_loading_layout"}, new int[]{3}, new int[]{R.layout.daka_loading_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57388n = sparseIntArray;
        sparseIntArray.put(R.id.action_bar_close, 4);
        sparseIntArray.put(R.id.action_bar_more, 5);
        sparseIntArray.put(R.id.image_pager, 6);
        sparseIntArray.put(R.id.pager_tab, 7);
    }

    public x0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f57387m, f57388n));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        sd.u0 u0Var = this.f57254f;
        if (u0Var != null) {
            u0Var.M();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57393l;
            this.f57393l = 0L;
        }
        ObservableInt observableInt = this.f57255g;
        sd.u0 u0Var = this.f57254f;
        int i11 = 0;
        int i12 = ((j11 & 10) == 0 || observableInt == null) ? 0 : observableInt.get();
        long j12 = j11 & 13;
        if (j12 != 0) {
            r12 = u0Var != null ? u0Var.G() : null;
            updateRegistration(0, r12);
            boolean z11 = (r12 != null ? r12.get() : 0) == 2;
            if (j12 != 0) {
                j11 |= z11 ? 32L : 16L;
            }
            if (!z11) {
                i11 = 8;
            }
        }
        if ((8 & j11) != 0) {
            this.f57390i.k(this.f57392k);
        }
        if ((13 & j11) != 0) {
            this.f57390i.l(r12);
            this.f57391j.setVisibility(i11);
        }
        if ((j11 & 10) != 0) {
            od.i.b(this.f57253e, i12);
        }
        ViewDataBinding.executeBindingsOn(this.f57390i);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57393l != 0) {
                    return true;
                }
                return this.f57390i.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57393l = 8L;
        }
        this.f57390i.invalidateAll();
        requestRebind();
    }

    @Override // gs.w0
    public void k(@Nullable ObservableInt DakaImageStatus) {
        updateRegistration(1, DakaImageStatus);
        this.f57255g = DakaImageStatus;
        synchronized (this) {
            this.f57393l |= 2;
        }
        notifyPropertyChanged(19);
        super.requestRebind();
    }

    @Override // gs.w0
    public void l(@Nullable sd.u0 ViewModel) {
        this.f57254f = ViewModel;
        synchronized (this) {
            this.f57393l |= 4;
        }
        notifyPropertyChanged(88);
        super.requestRebind();
    }

    public final boolean m(ObservableInt DakaImageStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57393l |= 2;
        }
        return true;
    }

    public final boolean n(ObservableInt ViewModelStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57393l |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return n((ObservableInt) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return m((ObservableInt) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57390i.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (19 == variableId) {
            k((ObservableInt) variable);
            return true;
        }
        if (88 != variableId) {
            return false;
        }
        l((sd.u0) variable);
        return true;
    }

    public x0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (ImageView) bindings[4], (ImageView) bindings[5], (ViewPager2) bindings[6], (PageLineDotIndicator) bindings[7], (SharePanelViewV2) bindings[1]);
        this.f57393l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57389h = constraintLayout;
        constraintLayout.setTag(null);
        c6 c6Var = (c6) bindings[3];
        this.f57390i = c6Var;
        setContainedBinding(c6Var);
        Group group = (Group) bindings[2];
        this.f57391j = group;
        group.setTag(null);
        this.f57253e.setTag(null);
        setRootTag(root);
        this.f57392k = new hs.a(this, 1);
        invalidateAll();
    }
}
