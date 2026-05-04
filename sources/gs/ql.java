package gs;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ql extends pl {

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56525w = null;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56526x;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56527u;

    /* renamed from: v, reason: collision with root package name */
    public long f56528v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56526x = sparseIntArray;
        sparseIntArray.put(R.id.top_padding, 4);
        sparseIntArray.put(R.id.progress_bar, 5);
        sparseIntArray.put(R.id.today_count_tag, 6);
        sparseIntArray.put(R.id.days_left_tag, 7);
        sparseIntArray.put(R.id.plan_adjust, 8);
        sparseIntArray.put(R.id.book_ad, 9);
        sparseIntArray.put(R.id.progress_tag, 10);
        sparseIntArray.put(R.id.wordlist, 11);
        sparseIntArray.put(R.id.divider, 12);
        sparseIntArray.put(R.id.guideline, 13);
        sparseIntArray.put(R.id.offline_download_view, 14);
        sparseIntArray.put(R.id.plan_padding, 15);
        sparseIntArray.put(R.id.guideline_center, 16);
        sparseIntArray.put(R.id.error_tip, 17);
        sparseIntArray.put(R.id.refresh, 18);
    }

    public ql(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 19, f56525w, f56526x));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56528v;
            this.f56528v = 0L;
        }
        boolean z11 = this.f56411s;
        Typeface typeface = this.f56412t;
        long j12 = j11 & 5;
        Drawable drawable = null;
        if (j12 != 0) {
            if (j12 != 0) {
                j11 |= z11 ? 16L : 8L;
            }
            if (z11) {
                drawable = AppCompatResources.getDrawable(this.f56394b.getContext(), R.drawable.ic_word_plan_book_upgrade);
            }
        }
        long j13 = 6 & j11;
        if ((j11 & 5) != 0) {
            TextViewBindingAdapter.setDrawableRight(this.f56394b, drawable);
        }
        if (j13 != 0) {
            this.f56395c.setTypeface(typeface);
            this.f56407o.setTypeface(typeface);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56528v != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56528v = 4L;
        }
        requestRebind();
    }

    @Override // gs.pl
    public void k(@Nullable Typeface AccentFont) {
        this.f56412t = AccentFont;
        synchronized (this) {
            this.f56528v |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // gs.pl
    public void l(boolean ShowBookUpdate) {
        this.f56411s = ShowBookUpdate;
        synchronized (this) {
            this.f56528v |= 1;
        }
        notifyPropertyChanged(71);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (71 == variableId) {
            l(((Boolean) variable).booleanValue());
            return true;
        }
        if (1 != variableId) {
            return false;
        }
        k((Typeface) variable);
        return true;
    }

    public ql(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[9], (TextView) bindings[3], (TextView) bindings[2], (TextView) bindings[7], (View) bindings[12], (TextView) bindings[17], (Guideline) bindings[13], (Guideline) bindings[16], (OfflineDownloadView) bindings[14], (TextView) bindings[8], (Space) bindings[15], (ProgressBar) bindings[5], (TextView) bindings[10], (TextView) bindings[18], (TextView) bindings[1], (TextView) bindings[6], (View) bindings[4], (TextView) bindings[11]);
        this.f56528v = -1L;
        this.f56394b.setTag(null);
        this.f56395c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56527u = constraintLayout;
        constraintLayout.setTag(null);
        this.f56407o.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
