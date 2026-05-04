package ac;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.friend.widget.FriendFeedView;
import com.baicizhan.online.bs_socials.BBFeed;
import com.jiongji.andriod.card.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends RecyclerView.Adapter<C0012a> {

    /* renamed from: c, reason: collision with root package name */
    public static DateFormat f2516c = null;

    /* renamed from: d, reason: collision with root package name */
    public static DateFormat f2517d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2518e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2519f = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2520a = false;

    /* renamed from: b, reason: collision with root package name */
    public List<BBFeed> f2521b = Collections.EMPTY_LIST;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ac.a$a, reason: collision with other inner class name */
    public class C0012a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public FriendFeedView f2522a;

        /* renamed from: b, reason: collision with root package name */
        public View f2523b;

        /* renamed from: c, reason: collision with root package name */
        public View f2524c;

        public C0012a(View itemView, int viewType) {
            super(itemView);
            if (viewType == 0) {
                this.f2522a = (FriendFeedView) itemView;
            } else {
                this.f2523b = itemView.findViewById(R.id.load_progress);
                this.f2524c = itemView.findViewById(R.id.load_no_more);
            }
        }
    }

    static {
        Locale locale = Locale.CHINA;
        f2516c = new SimpleDateFormat("MM月dd日", locale);
        f2517d = new SimpleDateFormat("HH:mm", locale);
    }

    public static String d(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timestamp);
        int i11 = calendar.get(6) - calendar2.get(6);
        if (calendar.get(1) > calendar2.get(1)) {
            i11 += calendar2.getActualMaximum(6);
        }
        return i11 == 0 ? f2517d.format(calendar2.getTime()) : i11 == 1 ? "昨天" : i11 == 2 ? "前天" : f2516c.format(calendar2.getTime());
    }

    public final void b(C0012a holder) {
        if (1 == getItemCount() && !this.f2520a) {
            holder.f2524c.setVisibility(8);
            holder.f2523b.setVisibility(8);
        } else if (this.f2520a) {
            holder.f2524c.setVisibility(0);
            holder.f2523b.setVisibility(8);
        } else {
            holder.f2524c.setVisibility(8);
            holder.f2523b.setVisibility(0);
        }
    }

    public final void c(C0012a holder, int position) {
        FriendFeedView friendFeedView = holder.f2522a;
        BBFeed bBFeed = this.f2521b.get(position);
        friendFeedView.setContent(Html.fromHtml(bBFeed.getContent()));
        friendFeedView.setMarkerColor((int) bBFeed.getMark_color());
        friendFeedView.setThumb(bBFeed.getImg());
        int i11 = position == 0 ? 1 : 0;
        if (position == getItemCount() - 1) {
            i11 |= 2;
        }
        friendFeedView.setMarkerMode(i11);
        friendFeedView.setDateTime(d(bBFeed.getTimestamp()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0012a holder, int position) {
        if (getItemViewType(position) == 0) {
            c(holder, position);
        } else {
            b(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0012a onCreateViewHolder(ViewGroup parent, int viewType) {
        return new C0012a(LayoutInflater.from(parent.getContext()).inflate(viewType == 0 ? R.layout.friend_feed_item : R.layout.friend_feed_more_loading_item, parent, false), viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f2521b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == getItemCount() - 1 ? 1 : 0;
    }

    public void h(List<BBFeed> items) {
        this.f2521b = items;
        notifyDataSetChanged();
    }

    public void i(boolean nomore) {
        this.f2520a = nomore;
        notifyDataSetChanged();
    }
}
