package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z9 extends y9 implements a.InterfaceC0684a {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57753q = null;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57754r;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57755i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57756j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57757k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57758l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57759m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57760n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57761o;

    /* renamed from: p, reason: collision with root package name */
    public long f57762p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57754r = sparseIntArray;
        sparseIntArray.put(R.id.hint, 7);
    }

    public z9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f57753q, f57754r));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        switch (sourceId) {
            case 1:
                of.a aVar = this.f57572h;
                if (aVar != null) {
                    aVar.t();
                    break;
                }
                break;
            case 2:
                of.a aVar2 = this.f57572h;
                if (aVar2 != null) {
                    aVar2.x(5);
                    break;
                }
                break;
            case 3:
                of.a aVar3 = this.f57572h;
                if (aVar3 != null) {
                    aVar3.x(4);
                    break;
                }
                break;
            case 4:
                of.a aVar4 = this.f57572h;
                if (aVar4 != null) {
                    aVar4.x(3);
                    break;
                }
                break;
            case 5:
                of.a aVar5 = this.f57572h;
                if (aVar5 != null) {
                    aVar5.x(2);
                    break;
                }
                break;
            case 6:
                of.a aVar6 = this.f57572h;
                if (aVar6 != null) {
                    aVar6.x(1);
                    break;
                }
                break;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57762p;
            this.f57762p = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f57565a.setOnClickListener(this.f57761o);
            this.f57566b.setOnClickListener(this.f57760n);
            this.f57567c.setOnClickListener(this.f57759m);
            this.f57569e.setOnClickListener(this.f57757k);
            this.f57570f.setOnClickListener(this.f57758l);
            this.f57571g.setOnClickListener(this.f57756j);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57762p != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57762p = 2L;
        }
        requestRebind();
    }

    @Override // gs.y9
    public void j(@Nullable of.a Viewmodel) {
        this.f57572h = Viewmodel;
        synchronized (this) {
            this.f57762p |= 1;
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
        j((of.a) variable);
        return true;
    }

    public z9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[4], (TextView) bindings[3], (TextView) bindings[7], (TextView) bindings[5], (TextView) bindings[6], (TextView) bindings[1]);
        this.f57762p = -1L;
        this.f57565a.setTag(null);
        this.f57566b.setTag(null);
        this.f57567c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57755i = constraintLayout;
        constraintLayout.setTag(null);
        this.f57569e.setTag(null);
        this.f57570f.setTag(null);
        this.f57571g.setTag(null);
        setRootTag(root);
        this.f57756j = new hs.a(this, 1);
        this.f57757k = new hs.a(this, 5);
        this.f57758l = new hs.a(this, 6);
        this.f57759m = new hs.a(this, 3);
        this.f57760n = new hs.a(this, 4);
        this.f57761o = new hs.a(this, 2);
        invalidateAll();
    }
}
