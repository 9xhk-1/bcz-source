package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleImageView;
import com.baicizhan.client.friend.widget.FriendFeedView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class fc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FriendFeedView f54914a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54915b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54916c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final CircleImageView f54917d;

    public fc(@NonNull FriendFeedView rootView, @NonNull TextView content, @NonNull TextView datetime, @NonNull CircleImageView thumb) {
        this.f54914a = rootView;
        this.f54915b = content;
        this.f54916c = datetime;
        this.f54917d = thumb;
    }

    @NonNull
    public static fc a(@NonNull View rootView) {
        int i11 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.content);
        if (textView != null) {
            i11 = R.id.datetime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.datetime);
            if (textView2 != null) {
                i11 = R.id.thumb;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.thumb);
                if (circleImageView != null) {
                    return new fc((FriendFeedView) rootView, textView, textView2, circleImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static fc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static fc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_feed_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FriendFeedView getRoot() {
        return this.f54914a;
    }
}
