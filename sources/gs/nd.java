package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class nd extends md implements a.InterfaceC0684a {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56051l = null;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56052m;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56053g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Group f56054h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Group f56055i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56056j;

    /* renamed from: k, reason: collision with root package name */
    public long f56057k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56052m = sparseIntArray;
        sparseIntArray.put(R.id.daka_progress, 4);
        sparseIntArray.put(R.id.daka_tip, 5);
        sparseIntArray.put(R.id.error_title1, 6);
    }

    public nd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f56051l, f56052m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        synchronized (this) {
            j11 = this.f56057k;
            this.f56057k = 0L;
        }
        ObservableInt observableInt = this.f55898e;
        View.OnClickListener onClickListener = this.f55899f;
        long j12 = j11 & 5;
        int i13 = 0;
        if (j12 != 0) {
            int i14 = observableInt != null ? observableInt.get() : 0;
            z12 = i14 == 3;
            z11 = i14 == 1;
            if (j12 != 0) {
                j11 |= z12 ? 16L : 8L;
            }
            if ((j11 & 5) != 0) {
                j11 |= z11 ? 320L : 160L;
            }
            i11 = z12 ? 0 : 8;
            i12 = z11 ? 0 : 8;
        } else {
            z11 = false;
            i11 = 0;
            z12 = false;
            i12 = 0;
        }
        long j13 = j11 & 5;
        if (j13 != 0) {
            boolean z13 = z11 ? true : z12;
            if (j13 != 0) {
                j11 |= z13 ? 1024L : 512L;
            }
            i13 = z13 ? 0 : 8;
        }
        if ((6 & j11) != 0) {
            this.f55895b.setOnClickListener(onClickListener);
        }
        if ((4 & j11) != 0) {
            this.f56053g.setOnClickListener(this.f56056j);
        }
        if ((j11 & 5) != 0) {
            this.f56053g.setVisibility(i13);
            this.f56054h.setVisibility(i12);
            this.f56055i.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56057k != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56057k = 4L;
        }
        requestRebind();
    }

    @Override // gs.md
    public void k(@Nullable View.OnClickListener Retry) {
        this.f55899f = Retry;
        synchronized (this) {
            this.f56057k |= 2;
        }
        notifyPropertyChanged(58);
        super.requestRebind();
    }

    @Override // gs.md
    public void l(@Nullable ObservableInt Status) {
        updateRegistration(0, Status);
        this.f55898e = Status;
        synchronized (this) {
            this.f56057k |= 1;
        }
        notifyPropertyChanged(79);
        super.requestRebind();
    }

    public final boolean m(ObservableInt Status, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56057k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return m((ObservableInt) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (79 == variableId) {
            l((ObservableInt) variable);
            return true;
        }
        if (58 != variableId) {
            return false;
        }
        k((View.OnClickListener) variable);
        return true;
    }

    public nd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ProgressBar) bindings[4], (TextView) bindings[2], (TextView) bindings[5], (TextView) bindings[6]);
        this.f56057k = -1L;
        this.f55895b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56053g = constraintLayout;
        constraintLayout.setTag(null);
        Group group = (Group) bindings[1];
        this.f56054h = group;
        group.setTag(null);
        Group group2 = (Group) bindings[3];
        this.f56055i = group2;
        group2.setTag(null);
        setRootTag(root);
        this.f56056j = new hs.a(this, 1);
        invalidateAll();
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
    }
}
