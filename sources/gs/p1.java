package gs;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p1 extends o1 {

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56280r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56281s;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56282p;

    /* renamed from: q, reason: collision with root package name */
    public long f56283q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        f56280r = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{5}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56281s = sparseIntArray;
        sparseIntArray.put(R.id.description, 6);
        sparseIntArray.put(R.id.container, 7);
        sparseIntArray.put(R.id.get_auth_code, 8);
        sparseIntArray.put(R.id.phone_clear, 9);
        sparseIntArray.put(R.id.auth_code, 10);
        sparseIntArray.put(R.id.auth_code_clear, 11);
        sparseIntArray.put(R.id.password_container, 12);
        sparseIntArray.put(R.id.see, 13);
        sparseIntArray.put(R.id.password_clear, 14);
    }

    public p1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 15, f56280r, f56281s));
    }

    private boolean k(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56283q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        String str;
        String str2;
        String str3;
        String str4;
        Resources resources;
        int i11;
        synchronized (this) {
            j11 = this.f56283q;
            this.f56283q = 0L;
        }
        boolean z11 = this.f56164o;
        long j12 = j11 & 6;
        if (j12 != 0) {
            if (j12 != 0) {
                j11 |= z11 ? 1360L : 680L;
            }
            str = this.f56157h.getResources().getString(z11 ? R.string.phone_bind_pswd_hint_edit : R.string.phone_bind_pswd_hint);
            str3 = this.f56160k.getResources().getString(z11 ? R.string.phone_bind_phone_hint_edit : R.string.phone_bind_phone_hint);
            str4 = this.f56163n.getResources().getString(z11 ? R.string.phone_bind_title_edit : R.string.phone_bind_title);
            if (z11) {
                resources = this.f56153d.getResources();
                i11 = R.string.phone_bind_confirm_edit;
            } else {
                resources = this.f56153d.getResources();
                i11 = R.string.phone_bind_confirm;
            }
            str2 = resources.getString(i11);
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((4 & j11) != 0) {
            this.f56150a.W(false);
        }
        if ((j11 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f56153d, str2);
            this.f56157h.setHint(str);
            this.f56160k.setHint(str3);
            TextViewBindingAdapter.setText(this.f56163n, str4);
        }
        ViewDataBinding.executeBindingsOn(this.f56150a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56283q != 0) {
                    return true;
                }
                return this.f56150a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56283q = 4L;
        }
        this.f56150a.invalidateAll();
        requestRebind();
    }

    @Override // gs.o1
    public void j(boolean Editmode) {
        this.f56164o = Editmode;
        synchronized (this) {
            this.f56283q |= 2;
        }
        notifyPropertyChanged(23);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56150a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (23 != variableId) {
            return false;
        }
        j(((Boolean) variable).booleanValue());
        return true;
    }

    public p1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[5], (EditText) bindings[10], (ImageView) bindings[11], (Button) bindings[4], (RelativeLayout) bindings[7], (TextView) bindings[6], (CountDownButton) bindings[8], (EditText) bindings[3], (ImageView) bindings[14], (RelativeLayout) bindings[12], (EditText) bindings[2], (ImageView) bindings[9], (ImageView) bindings[13], (TextView) bindings[1]);
        this.f56283q = -1L;
        setContainedBinding(this.f56150a);
        this.f56153d.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56282p = constraintLayout;
        constraintLayout.setTag(null);
        this.f56157h.setTag(null);
        this.f56160k.setTag(null);
        this.f56163n.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
