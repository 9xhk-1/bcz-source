package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class re extends qe {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56643m = null;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56644n;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56645k;

    /* renamed from: l, reason: collision with root package name */
    public long f56646l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56644n = sparseIntArray;
        sparseIntArray.put(R.id.word, 1);
        sparseIntArray.put(R.id.collect, 2);
        sparseIntArray.put(R.id.phonetic_container, 3);
        sparseIntArray.put(R.id.phonetic_us, 4);
        sparseIntArray.put(R.id.voice_us, 5);
        sparseIntArray.put(R.id.phonetic_uk, 6);
        sparseIntArray.put(R.id.voice_uk, 7);
        sparseIntArray.put(R.id.meanings_container, 8);
        sparseIntArray.put(R.id.applicable_scopes, 9);
        sparseIntArray.put(R.id.exam_info, 10);
    }

    public re(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, f56643m, f56644n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56646l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56646l != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56646l = 1L;
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

    public re(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[9], (ImageView) bindings[2], (TextView) bindings[10], (LinearLayout) bindings[8], (LinearLayout) bindings[3], (TextView) bindings[6], (TextView) bindings[4], (LottieAnimationView) bindings[7], (LottieAnimationView) bindings[5], (AppCompatTextView) bindings[1]);
        this.f56646l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56645k = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
