package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class rm extends qm {

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56668r = null;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56669s;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56670p;

    /* renamed from: q, reason: collision with root package name */
    public long f56671q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56669s = sparseIntArray;
        sparseIntArray.put(R.id.middle, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.book_name, 3);
        sparseIntArray.put(R.id.divider, 4);
        sparseIntArray.put(R.id.icon_days, 5);
        sparseIntArray.put(R.id.icon_words, 6);
        sparseIntArray.put(R.id.days, 7);
        sparseIntArray.put(R.id.words, 8);
        sparseIntArray.put(R.id.day_bottom_title, 9);
        sparseIntArray.put(R.id.word_bottom_title, 10);
        sparseIntArray.put(R.id.show_off_button, 11);
        sparseIntArray.put(R.id.loading, 12);
        sparseIntArray.put(R.id.loading_progress, 13);
        sparseIntArray.put(R.id.loading_hint, 14);
        sparseIntArray.put(R.id.hint_bottom, 15);
    }

    public rm(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 16, f56668r, f56669s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56671q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56671q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56671q = 1L;
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

    public rm(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[3], (TextView) bindings[9], (TextView) bindings[7], (View) bindings[4], (TextView) bindings[15], (ImageView) bindings[5], (ImageView) bindings[6], (FrameLayout) bindings[12], (TextView) bindings[14], (ProgressBar) bindings[13], (View) bindings[1], (FrameLayout) bindings[11], (TextView) bindings[2], (TextView) bindings[10], (TextView) bindings[8]);
        this.f56671q = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f56670p = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
