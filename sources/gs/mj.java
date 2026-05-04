package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class mj extends lj implements a.InterfaceC0684a {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55919g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55920h = null;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55921d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55922e;

    /* renamed from: f, reason: collision with root package name */
    public long f55923f;

    public mj(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f55919g, f55920h));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ld.g gVar = this.f55782c;
        if (gVar != null) {
            gVar.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (r4 != false) goto L47;
     */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.mj.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55923f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55923f = 8L;
        }
        requestRebind();
    }

    @Override // gs.lj
    public void j(@Nullable ld.g Viewmodel) {
        this.f55782c = Viewmodel;
        synchronized (this) {
            this.f55923f |= 4;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ObservableInt ViewmodelLoadMoreRefreshStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55923f |= 2;
        }
        return true;
    }

    public final boolean l(ObservableInt ViewmodelWordListStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55923f |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return l((ObservableInt) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return k((ObservableInt) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ld.g) variable);
        return true;
    }

    public mj(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (TextView) bindings[2], (TextView) bindings[1]);
        this.f55923f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55921d = constraintLayout;
        constraintLayout.setTag(null);
        this.f55780a.setTag(null);
        this.f55781b.setTag(null);
        setRootTag(root);
        this.f55922e = new hs.a(this, 1);
        invalidateAll();
    }
}
