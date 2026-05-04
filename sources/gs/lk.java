package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class lk extends kk {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55783i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55784j = null;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55785f;

    /* renamed from: g, reason: collision with root package name */
    public InverseBindingListener f55786g;

    /* renamed from: h, reason: collision with root package name */
    public long f55787h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean c11 = te.h.c(lk.this.f55629a);
            MutableLiveData<Boolean> mutableLiveData = lk.this.f55633e;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.valueOf(c11));
            }
        }
    }

    public lk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f55783i, f55784j));
    }

    private boolean o(MutableLiveData<Boolean> Checked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55787h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55787h;
            this.f55787h = 0L;
        }
        String str = this.f55632d;
        View.OnClickListener onClickListener = this.f55631c;
        MutableLiveData<Boolean> mutableLiveData = this.f55633e;
        long j12 = 10 & j11;
        long j13 = 12 & j11;
        long j14 = 9 & j11;
        Boolean value = (j14 == 0 || mutableLiveData == null) ? null : mutableLiveData.getValue();
        if (j13 != 0) {
            this.f55629a.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            te.h.b(this.f55629a, value);
        }
        if ((j11 & 8) != 0) {
            te.h.a(this.f55629a, this.f55786g);
        }
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.f55630b, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55787h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55787h = 8L;
        }
        requestRebind();
    }

    @Override // gs.kk
    public void l(@Nullable MutableLiveData<Boolean> Checked) {
        updateLiveDataRegistration(0, Checked);
        this.f55633e = Checked;
        synchronized (this) {
            this.f55787h |= 1;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    @Override // gs.kk
    public void m(@Nullable View.OnClickListener OnClickListener) {
        this.f55631c = OnClickListener;
        synchronized (this) {
            this.f55787h |= 4;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // gs.kk
    public void n(@Nullable String Title) {
        this.f55632d = Title;
        synchronized (this) {
            this.f55787h |= 2;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return o((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (86 == variableId) {
            n((String) variable);
            return true;
        }
        if (48 == variableId) {
            m((View.OnClickListener) variable);
            return true;
        }
        if (12 != variableId) {
            return false;
        }
        l((MutableLiveData) variable);
        return true;
    }

    public lk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (SwitchButton) bindings[2], (TextView) bindings[1]);
        this.f55786g = new a();
        this.f55787h = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f55785f = linearLayout;
        linearLayout.setTag(null);
        this.f55629a.setTag(null);
        this.f55630b.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
