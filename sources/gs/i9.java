package gs;

import android.graphics.Typeface;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i9 extends h9 {

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55284y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55285z;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public final vj f55286t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final TextView f55287u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final View f55288v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55289w;

    /* renamed from: x, reason: collision with root package name */
    public long f55290x;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        f55284y = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"lookup_wiki_error_msg"}, new int[]{11}, new int[]{R.layout.lookup_wiki_error_msg});
        f55285z = null;
    }

    public i9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f55284y, f55285z));
    }

    @Override // gs.h9
    public void A(@Nullable View.OnClickListener LoadClick) {
        this.f55157k = LoadClick;
        synchronized (this) {
            this.f55290x |= 256;
        }
        notifyPropertyChanged(38);
        super.requestRebind();
    }

    @Override // gs.h9
    public void B(boolean LoadFailed) {
        this.f55160n = LoadFailed;
        synchronized (this) {
            this.f55290x |= 2;
        }
        notifyPropertyChanged(39);
        super.requestRebind();
    }

    @Override // gs.h9
    public void C(boolean Loading) {
        this.f55161o = Loading;
        synchronized (this) {
            this.f55290x |= 1;
        }
        notifyPropertyChanged(40);
        super.requestRebind();
    }

    @Override // gs.h9
    public void D(int Studymode) {
        this.f55164r = Studymode;
        synchronized (this) {
            this.f55290x |= 4;
        }
        notifyPropertyChanged(81);
        super.requestRebind();
    }

    @Override // gs.h9
    public void F(@Nullable String Title) {
        this.f55155i = Title;
    }

    @Override // gs.h9
    public void G(@Nullable TopicRecord Topic) {
        this.f55156j = Topic;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x033c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.i9.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55290x != 0) {
                    return true;
                }
                return this.f55286t.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55290x = 2048L;
        }
        this.f55286t.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55286t.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (40 == variableId) {
            C(((Boolean) variable).booleanValue());
            return true;
        }
        if (39 == variableId) {
            B(((Boolean) variable).booleanValue());
            return true;
        }
        if (81 == variableId) {
            D(((Integer) variable).intValue());
            return true;
        }
        if (87 == variableId) {
            G((TopicRecord) variable);
            return true;
        }
        if (28 == variableId) {
            x((Boolean) variable);
            return true;
        }
        if (33 == variableId) {
            y((View.OnClickListener) variable);
            return true;
        }
        if (34 == variableId) {
            z(((Boolean) variable).booleanValue());
            return true;
        }
        if (2 == variableId) {
            v((View.OnClickListener) variable);
            return true;
        }
        if (38 == variableId) {
            A((View.OnClickListener) variable);
            return true;
        }
        if (86 == variableId) {
            F((String) variable);
            return true;
        }
        if (1 != variableId) {
            return false;
        }
        u((Typeface) variable);
        return true;
    }

    @Override // gs.h9
    public void u(@Nullable Typeface AccentFont) {
        this.f55162p = AccentFont;
    }

    @Override // gs.h9
    public void v(@Nullable View.OnClickListener BackClick) {
        this.f55159m = BackClick;
        synchronized (this) {
            this.f55290x |= 128;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // gs.h9
    public void x(@Nullable Boolean HasKilled) {
        this.f55165s = HasKilled;
        synchronized (this) {
            this.f55290x |= 16;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // gs.h9
    public void y(@Nullable View.OnClickListener KillClick) {
        this.f55158l = KillClick;
        synchronized (this) {
            this.f55290x |= 32;
        }
        notifyPropertyChanged(33);
        super.requestRebind();
    }

    @Override // gs.h9
    public void z(boolean Killed) {
        this.f55163q = Killed;
        synchronized (this) {
            this.f55290x |= 64;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    public i9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[8], (LinearLayout) bindings[5], (BottomSheetLayout) bindings[0], (RelativeLayout) bindings[1], (TextView) bindings[7], (ImageView) bindings[6], (ProgressBar) bindings[2], (RecyclerView) bindings[3]);
        this.f55290x = -1L;
        this.f55147a.setTag(null);
        this.f55148b.setTag(null);
        this.f55149c.setTag(null);
        this.f55150d.setTag(null);
        this.f55151e.setTag(null);
        this.f55152f.setTag(null);
        this.f55153g.setTag(null);
        vj vjVar = (vj) bindings[11];
        this.f55286t = vjVar;
        setContainedBinding(vjVar);
        TextView textView = (TextView) bindings[10];
        this.f55287u = textView;
        textView.setTag(null);
        View view = (View) bindings[4];
        this.f55288v = view;
        view.setTag(null);
        LinearLayout linearLayout = (LinearLayout) bindings[9];
        this.f55289w = linearLayout;
        linearLayout.setTag(null);
        this.f55154h.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
