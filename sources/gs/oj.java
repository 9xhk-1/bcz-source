package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class oj extends nj {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56237j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56238k = null;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56239g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f56240h;

    /* renamed from: i, reason: collision with root package name */
    public long f56241i;

    public oj(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56237j, f56238k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56241i;
            this.f56241i = 0L;
        }
        String str = this.f56081c;
        boolean z11 = this.f56083e;
        View.OnClickListener onClickListener = this.f56084f;
        String str2 = this.f56082d;
        long j12 = j11 & 18;
        int i11 = 0;
        if (j12 != 0) {
            if (j12 != 0) {
                j11 |= z11 ? 64L : 32L;
            }
            if (!z11) {
                i11 = 8;
            }
        }
        long j13 = 24 & j11;
        if ((20 & j11) != 0) {
            this.f56239g.setOnClickListener(onClickListener);
        }
        if ((j11 & 18) != 0) {
            this.f56240h.setVisibility(i11);
        }
        if (j13 != 0) {
            TextViewBindingAdapter.setText(this.f56079a, str2);
        }
        if ((j11 & 17) != 0) {
            TextViewBindingAdapter.setText(this.f56080b, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56241i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56241i = 16L;
        }
        requestRebind();
    }

    @Override // gs.nj
    public void m(@Nullable String LearnWord) {
        this.f56081c = LearnWord;
        synchronized (this) {
            this.f56241i |= 1;
        }
        notifyPropertyChanged(35);
        super.requestRebind();
    }

    @Override // gs.nj
    public void n(@Nullable String LearnWordMean) {
        this.f56082d = LearnWordMean;
        synchronized (this) {
            this.f56241i |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // gs.nj
    public void o(@Nullable View.OnClickListener OnClick) {
        this.f56084f = OnClick;
        synchronized (this) {
            this.f56241i |= 4;
        }
        notifyPropertyChanged(47);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.nj
    public void p(boolean ShowDivider) {
        this.f56083e = ShowDivider;
        synchronized (this) {
            this.f56241i |= 2;
        }
        notifyPropertyChanged(74);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (35 == variableId) {
            m((String) variable);
            return true;
        }
        if (74 == variableId) {
            p(((Boolean) variable).booleanValue());
            return true;
        }
        if (47 == variableId) {
            o((View.OnClickListener) variable);
            return true;
        }
        if (36 != variableId) {
            return false;
        }
        n((String) variable);
        return true;
    }

    public oj(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[1]);
        this.f56241i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56239g = constraintLayout;
        constraintLayout.setTag(null);
        View view = (View) bindings[3];
        this.f56240h = view;
        view.setTag(null);
        this.f56079a.setTag(null);
        this.f56080b.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
