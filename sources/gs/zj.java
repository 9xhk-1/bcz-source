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
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class zj extends yj {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57794l = null;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57795m;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57796j;

    /* renamed from: k, reason: collision with root package name */
    public long f57797k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57795m = sparseIntArray;
        sparseIntArray.put(R.id.content, 1);
        sparseIntArray.put(R.id.schedule_instruction, 2);
        sparseIntArray.put(R.id.start_study, 3);
        sparseIntArray.put(R.id.finish_buttons, 4);
        sparseIntArray.put(R.id.daka_button, 5);
        sparseIntArray.put(R.id.daka_divider, 6);
        sparseIntArray.put(R.id.want_more_button, 7);
        sparseIntArray.put(R.id.i_read_button_beta, 8);
        sparseIntArray.put(R.id.loadingIcon, 9);
    }

    public zj(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, f57794l, f57795m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57797k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57797k != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57797k = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public zj(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[1], (TextView) bindings[5], (View) bindings[6], (LinearLayout) bindings[4], (TextView) bindings[8], (RotatingImageView) bindings[9], (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[7]);
        this.f57797k = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f57796j = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
