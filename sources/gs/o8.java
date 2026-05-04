package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o8 extends n8 {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56193h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56194i = null;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56195d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56196e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f56197f;

    /* renamed from: g, reason: collision with root package name */
    public long f56198g;

    public o8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f56193h, f56194i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        boolean z11;
        synchronized (this) {
            j11 = this.f56198g;
            this.f56198g = 0L;
        }
        Boolean bool = this.f56011c;
        View.OnClickListener onClickListener = this.f56010b;
        String str = this.f56009a;
        long j12 = j11 & 9;
        int i11 = 0;
        if (j12 != 0) {
            z11 = bool == null;
            if (j12 != 0) {
                j11 |= z11 ? 32L : 16L;
            }
        } else {
            z11 = false;
        }
        long j13 = j11 & 9;
        if (j13 != 0) {
            boolean booleanValue = z11 ? false : bool.booleanValue();
            if (j13 != 0) {
                j11 |= booleanValue ? 128L : 64L;
            }
            if (!booleanValue) {
                i11 = 8;
            }
        }
        if ((10 & j11) != 0) {
            this.f56195d.setOnClickListener(onClickListener);
        }
        if ((12 & j11) != 0) {
            TextViewBindingAdapter.setText(this.f56196e, str);
        }
        if ((j11 & 9) != 0) {
            this.f56197f.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56198g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56198g = 8L;
        }
        requestRebind();
    }

    @Override // gs.n8
    public void l(@Nullable View.OnClickListener Click) {
        this.f56010b = Click;
        synchronized (this) {
            this.f56198g |= 2;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    @Override // gs.n8
    public void m(@Nullable Boolean ShowDivider) {
        this.f56011c = ShowDivider;
        synchronized (this) {
            this.f56198g |= 1;
        }
        notifyPropertyChanged(74);
        super.requestRebind();
    }

    @Override // gs.n8
    public void n(@Nullable String Text) {
        this.f56009a = Text;
        synchronized (this) {
            this.f56198g |= 4;
        }
        notifyPropertyChanged(84);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (74 == variableId) {
            m((Boolean) variable);
            return true;
        }
        if (13 == variableId) {
            l((View.OnClickListener) variable);
            return true;
        }
        if (84 != variableId) {
            return false;
        }
        n((String) variable);
        return true;
    }

    public o8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f56198g = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f56195d = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) bindings[1];
        this.f56196e = textView;
        textView.setTag(null);
        View view = (View) bindings[2];
        this.f56197f = view;
        view.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
