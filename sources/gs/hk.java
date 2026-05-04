package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class hk extends gk {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55210q = null;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55211r;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55212n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final View f55213o;

    /* renamed from: p, reason: collision with root package name */
    public long f55214p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55211r = sparseIntArray;
        sparseIntArray.put(R.id.barrier, 6);
    }

    public hk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f55210q, f55211r));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0086  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.hk.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55214p != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55214p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.gk
    public void r(@Nullable String Description) {
        this.f55087i = Description;
        synchronized (this) {
            this.f55214p |= 8;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // gs.gk
    public void s(@Nullable Boolean DescriptionHighlight) {
        this.f55090l = DescriptionHighlight;
        synchronized (this) {
            this.f55214p |= 2;
        }
        notifyPropertyChanged(22);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (82 == variableId) {
            y((String) variable);
            return true;
        }
        if (22 == variableId) {
            s((Boolean) variable);
            return true;
        }
        if (48 == variableId) {
            u((View.OnClickListener) variable);
            return true;
        }
        if (21 == variableId) {
            r((String) variable);
            return true;
        }
        if (25 == variableId) {
            t(((Integer) variable).intValue());
            return true;
        }
        if (54 == variableId) {
            v(((Boolean) variable).booleanValue());
            return true;
        }
        if (86 == variableId) {
            z((String) variable);
            return true;
        }
        if (69 != variableId) {
            return false;
        }
        x((Boolean) variable);
        return true;
    }

    @Override // gs.gk
    public void t(int EndIconVisibility) {
        this.f55088j = EndIconVisibility;
        synchronized (this) {
            this.f55214p |= 16;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    @Override // gs.gk
    public void u(@Nullable View.OnClickListener OnClickListener) {
        this.f55084f = OnClickListener;
        synchronized (this) {
            this.f55214p |= 4;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // gs.gk
    public void v(boolean RedDot) {
        this.f55089k = RedDot;
        synchronized (this) {
            this.f55214p |= 32;
        }
        notifyPropertyChanged(54);
        super.requestRebind();
    }

    @Override // gs.gk
    public void x(@Nullable Boolean Selected) {
        this.f55091m = Selected;
        synchronized (this) {
            this.f55214p |= 128;
        }
        notifyPropertyChanged(69);
        super.requestRebind();
    }

    @Override // gs.gk
    public void y(@Nullable String SubTitle) {
        this.f55086h = SubTitle;
        synchronized (this) {
            this.f55214p |= 1;
        }
        notifyPropertyChanged(82);
        super.requestRebind();
    }

    @Override // gs.gk
    public void z(@Nullable String Title) {
        this.f55085g = Title;
        synchronized (this) {
            this.f55214p |= 64;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    public hk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[5], (Barrier) bindings[6], (TextView) bindings[4], (TextView) bindings[2], (TextView) bindings[1]);
        this.f55214p = -1L;
        this.f55079a.setTag(null);
        this.f55081c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55212n = constraintLayout;
        constraintLayout.setTag(null);
        View view = (View) bindings[3];
        this.f55213o = view;
        view.setTag(null);
        this.f55082d.setTag(null);
        this.f55083e.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
