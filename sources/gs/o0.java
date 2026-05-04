package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o0 extends n0 {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56145p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56146q;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ScrollView f56147m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56148n;

    /* renamed from: o, reason: collision with root package name */
    public long f56149o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f56145p = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic"}, new int[]{2}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56146q = sparseIntArray;
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.forget_password_content, 4);
        sparseIntArray.put(R.id.get_auth_code, 5);
        sparseIntArray.put(R.id.account_clear, 6);
        sparseIntArray.put(R.id.account, 7);
        sparseIntArray.put(R.id.auth_code, 8);
        sparseIntArray.put(R.id.auth_code_clear, 9);
        sparseIntArray.put(R.id.see, 10);
        sparseIntArray.put(R.id.password_clear, 11);
        sparseIntArray.put(R.id.new_password, 12);
        sparseIntArray.put(R.id.confirm, 13);
    }

    public o0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 14, f56145p, f56146q));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56149o |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56149o;
            this.f56149o = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55962c.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f55962c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56149o != 0) {
                    return true;
                }
                return this.f55962c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56149o = 2L;
        }
        this.f55962c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55962c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public o0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (EmailAutoCompleteEditText) bindings[7], (ImageView) bindings[6], (a) bindings[2], (EditText) bindings[8], (ImageView) bindings[9], (Button) bindings[13], (RelativeLayout) bindings[4], (CountDownButton) bindings[5], (EditText) bindings[12], (ImageView) bindings[11], (ImageView) bindings[10], (TextView) bindings[3]);
        this.f56149o = -1L;
        setContainedBinding(this.f55962c);
        ScrollView scrollView = (ScrollView) bindings[0];
        this.f56147m = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.f56148n = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
