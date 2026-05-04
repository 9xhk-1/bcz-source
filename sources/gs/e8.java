package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e8 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54754a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f54755b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54756c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54757d;

    public e8(@NonNull RelativeLayout rootView, @NonNull RecyclerView completedScheduleGrid, @NonNull TextView empty, @NonNull TextView tip) {
        this.f54754a = rootView;
        this.f54755b = completedScheduleGrid;
        this.f54756c = empty;
        this.f54757d = tip;
    }

    @NonNull
    public static e8 a(@NonNull View rootView) {
        int i11 = R.id.completed_schedule_grid;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.completed_schedule_grid);
        if (recyclerView != null) {
            i11 = R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
            if (textView != null) {
                i11 = R.id.tip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                if (textView2 != null) {
                    return new e8((RelativeLayout) rootView, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static e8 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static e8 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_completed_schedule, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54754a;
    }
}
