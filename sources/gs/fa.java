package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class fa extends ea implements a.InterfaceC0684a {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54901n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54902o;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54903g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54904h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54905i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54906j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54907k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54908l;

    /* renamed from: m, reason: collision with root package name */
    public long f54909m;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f54901n = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item", "mytab_setting_basic_item"}, new int[]{2, 3, 4, 5}, new int[]{R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item});
        f54902o = null;
    }

    public fa(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f54901n, f54902o));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ze.s sVar;
        if (sourceId == 1) {
            ze.s sVar2 = this.f54765f;
            if (sVar2 != null) {
                sVar2.c();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            ze.s sVar3 = this.f54765f;
            if (sVar3 != null) {
                sVar3.d();
                return;
            }
            return;
        }
        if (sourceId == 3) {
            ze.s sVar4 = this.f54765f;
            if (sVar4 != null) {
                sVar4.a();
                return;
            }
            return;
        }
        if (sourceId != 4) {
            if (sourceId == 5 && (sVar = this.f54765f) != null) {
                sVar.g();
                return;
            }
            return;
        }
        ze.s sVar5 = this.f54765f;
        if (sVar5 != null) {
            sVar5.f();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54909m;
            this.f54909m = 0L;
        }
        if ((j11 & 32) != 0) {
            this.f54760a.s(this.f54906j);
            this.f54760a.x(getRoot().getResources().getString(R.string.setting_ui_develop_setting));
            this.f54761b.s(this.f54904h);
            this.f54761b.x(getRoot().getResources().getString(R.string.setting_ui_private_ad));
            this.f54762c.s(this.f54905i);
            this.f54762c.x(getRoot().getResources().getString(R.string.setting_ui_private_privacy));
            this.f54763d.setOnClickListener(this.f54908l);
            this.f54764e.s(this.f54907k);
            this.f54764e.x(getRoot().getResources().getString(R.string.setting_ui_private_permissions));
        }
        ViewDataBinding.executeBindingsOn(this.f54760a);
        ViewDataBinding.executeBindingsOn(this.f54764e);
        ViewDataBinding.executeBindingsOn(this.f54761b);
        ViewDataBinding.executeBindingsOn(this.f54762c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54909m != 0) {
                    return true;
                }
                return this.f54760a.hasPendingBindings() || this.f54764e.hasPendingBindings() || this.f54761b.hasPendingBindings() || this.f54762c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54909m = 32L;
        }
        this.f54760a.invalidateAll();
        this.f54764e.invalidateAll();
        this.f54761b.invalidateAll();
        this.f54762c.invalidateAll();
        requestRebind();
    }

    @Override // gs.ea
    public void j(@Nullable ze.s Viewmodel) {
        this.f54765f = Viewmodel;
        synchronized (this) {
            this.f54909m |= 16;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ck Developer, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54909m |= 1;
        }
        return true;
    }

    public final boolean l(ck Microphone, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54909m |= 8;
        }
        return true;
    }

    public final boolean m(ck Privacy, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54909m |= 2;
        }
        return true;
    }

    public final boolean n(ck Storage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54909m |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((ck) object, fieldId);
        }
        if (localFieldId == 1) {
            return m((ck) object, fieldId);
        }
        if (localFieldId == 2) {
            return n((ck) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return l((ck) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54760a.setLifecycleOwner(lifecycleOwner);
        this.f54764e.setLifecycleOwner(lifecycleOwner);
        this.f54761b.setLifecycleOwner(lifecycleOwner);
        this.f54762c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ze.s) variable);
        return true;
    }

    public fa(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4, (ck) bindings[2], (ck) bindings[4], (ck) bindings[5], (TextView) bindings[1], (ck) bindings[3]);
        this.f54909m = -1L;
        setContainedBinding(this.f54760a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54903g = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f54761b);
        setContainedBinding(this.f54762c);
        this.f54763d.setTag(null);
        setContainedBinding(this.f54764e);
        setRootTag(root);
        this.f54904h = new hs.a(this, 3);
        this.f54905i = new hs.a(this, 4);
        this.f54906j = new hs.a(this, 1);
        this.f54907k = new hs.a(this, 2);
        this.f54908l = new hs.a(this, 5);
        invalidateAll();
    }
}
