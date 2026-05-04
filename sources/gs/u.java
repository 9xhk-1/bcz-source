package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.online.user_study_api.CalendarDailyWord;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u extends t implements a.InterfaceC0684a {

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56926o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56927p;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56928l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56929m;

    /* renamed from: n, reason: collision with root package name */
    public long f56930n;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f56926o = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic"}, new int[]{7}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56927p = sparseIntArray;
        sparseIntArray.put(R.id.loading_guideline, 8);
    }

    public u(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f56926o, f56927p));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ld.g gVar;
        if (sourceId != 1) {
            if (sourceId == 2 && (gVar = this.f56807j) != null) {
                gVar.j();
                return;
            }
            return;
        }
        ld.g gVar2 = this.f56807j;
        if (gVar2 != null) {
            gVar2.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0062  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.u.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56930n != 0) {
                    return true;
                }
                return this.f56798a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56930n = 64L;
        }
        this.f56798a.invalidateAll();
        requestRebind();
    }

    @Override // gs.t
    public void k(boolean Dark) {
        this.f56808k = Dark;
        synchronized (this) {
            this.f56930n |= 16;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // gs.t
    public void l(@Nullable ld.g Viewmodel) {
        this.f56807j = Viewmodel;
        synchronized (this) {
            this.f56930n |= 32;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean m(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56930n |= 1;
        }
        return true;
    }

    public final boolean n(ObservableField<String> ViewmodelGetHeadItemViewModelYearMonthDay, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56930n |= 2;
        }
        return true;
    }

    public final boolean o(ObservableList<CalendarDailyWord> ViewmodelLearnWordItem, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56930n |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return m((a) object, fieldId);
        }
        if (localFieldId == 1) {
            return n((ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return o((ObservableList) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return p((ObservableInt) object, fieldId);
    }

    public final boolean p(ObservableInt ViewmodelWordListRefreshStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56930n |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56798a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (20 == variableId) {
            k(((Boolean) variable).booleanValue());
            return true;
        }
        if (89 != variableId) {
            return false;
        }
        l((ld.g) variable);
        return true;
    }

    public u(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4, (a) bindings[7], (ConstraintLayout) bindings[1], (BottomSheetLayout) bindings[0], (TextView) bindings[3], (RecyclerView) bindings[2], (Guideline) bindings[8], (ProgressBar) bindings[4], (TextView) bindings[6], (TextView) bindings[5]);
        this.f56930n = -1L;
        setContainedBinding(this.f56798a);
        this.f56799b.setTag(null);
        this.f56800c.setTag(null);
        this.f56801d.setTag(null);
        this.f56802e.setTag(null);
        this.f56804g.setTag(null);
        this.f56805h.setTag(null);
        this.f56806i.setTag(null);
        setRootTag(root);
        this.f56928l = new hs.a(this, 1);
        this.f56929m = new hs.a(this, 2);
        invalidateAll();
    }
}
