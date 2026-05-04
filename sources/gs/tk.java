package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.customview.ChunkFillView;
import com.baicizhan.main.customview.ClozeTraditionHintView;
import com.baicizhan.main.customview.DialView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class tk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56899a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ChunkFillView f56900b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56901c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DialView f56902d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56903e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56904f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56905g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56906h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f56907i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ClozeTraditionHintView f56908j;

    public tk(@NonNull ConstraintLayout rootView, @NonNull ChunkFillView chunkFill, @NonNull TextView cnmean, @NonNull DialView dialView, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView phoneticHint, @NonNull View seperator, @NonNull ClozeTraditionHintView tranditionHint) {
        this.f56899a = rootView;
        this.f56900b = chunkFill;
        this.f56901c = cnmean;
        this.f56902d = dialView;
        this.f56903e = frameLayout2;
        this.f56904f = linearLayout2;
        this.f56905g = linearLayout3;
        this.f56906h = phoneticHint;
        this.f56907i = seperator;
        this.f56908j = tranditionHint;
    }

    @NonNull
    public static tk a(@NonNull View rootView) {
        int i11 = R.id.chunk_fill;
        ChunkFillView chunkFillView = (ChunkFillView) ViewBindings.findChildViewById(rootView, R.id.chunk_fill);
        if (chunkFillView != null) {
            i11 = R.id.cnmean;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cnmean);
            if (textView != null) {
                i11 = R.id.dial_view;
                DialView dialView = (DialView) ViewBindings.findChildViewById(rootView, R.id.dial_view);
                if (dialView != null) {
                    i11 = R.id.frameLayout2;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frameLayout2);
                    if (frameLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                        i11 = R.id.linearLayout3;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout3);
                        if (linearLayout != null) {
                            i11 = R.id.phonetic_hint;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phonetic_hint);
                            if (textView2 != null) {
                                i11 = R.id.seperator;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.seperator);
                                if (findChildViewById != null) {
                                    i11 = R.id.trandition_hint;
                                    ClozeTraditionHintView clozeTraditionHintView = (ClozeTraditionHintView) ViewBindings.findChildViewById(rootView, R.id.trandition_hint);
                                    if (clozeTraditionHintView != null) {
                                        return new tk(constraintLayout, chunkFillView, textView, dialView, frameLayout, constraintLayout, linearLayout, textView2, findChildViewById, clozeTraditionHintView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static tk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static tk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_chunk_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56899a;
    }
}
