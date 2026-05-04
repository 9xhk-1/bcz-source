package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class t1 extends s1 implements a.InterfaceC0684a {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56814k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56815l;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56816g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56817h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56818i;

    /* renamed from: j, reason: collision with root package name */
    public long f56819j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56815l = sparseIntArray;
        sparseIntArray.put(R.id.container, 4);
    }

    public t1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f56814k, f56815l));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        td.g gVar;
        if (sourceId == 1) {
            td.g gVar2 = this.f56697f;
            if (gVar2 != null) {
                gVar2.g();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (gVar = this.f56697f) != null) {
                gVar.a();
                return;
            }
            return;
        }
        td.g gVar3 = this.f56697f;
        if (gVar3 != null) {
            gVar3.f();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56819j;
            this.f56819j = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f56692a.setOnClickListener(this.f56816g);
            this.f56693b.setOnClickListener(this.f56817h);
            this.f56696e.setOnClickListener(this.f56818i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56819j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56819j = 2L;
        }
        requestRebind();
    }

    @Override // gs.s1
    public void j(@Nullable td.g Viewmodel) {
        this.f56697f = Viewmodel;
        synchronized (this) {
            this.f56819j |= 1;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((td.g) variable);
        return true;
    }

    public t1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[3], (LinearLayout) bindings[4], (FrameLayout) bindings[0], (TextView) bindings[1]);
        this.f56819j = -1L;
        this.f56692a.setTag(null);
        this.f56693b.setTag(null);
        this.f56695d.setTag(null);
        this.f56696e.setTag(null);
        setRootTag(root);
        this.f56816g = new hs.a(this, 2);
        this.f56817h = new hs.a(this, 3);
        this.f56818i = new hs.a(this, 1);
        invalidateAll();
    }
}
