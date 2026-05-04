package ac;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.online.bs_socials.BBFriendRankInfo;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Locale;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends RecyclerView.Adapter<a> {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2580e = {R.drawable.friend_trophy_gold, R.drawable.friend_trophy_silver, R.drawable.friend_trophy_bronze};

    /* renamed from: a, reason: collision with root package name */
    public Context f2581a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<BBFriendRankInfo> f2582b;

    /* renamed from: c, reason: collision with root package name */
    public int f2583c;

    /* renamed from: d, reason: collision with root package name */
    public int f2584d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public View f2585a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f2586b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f2587c;

        /* renamed from: d, reason: collision with root package name */
        public ImageView f2588d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f2589e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f2590f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f2591g;

        public a(View itemView) {
            super(itemView);
            this.f2585a = itemView;
            this.f2586b = (ImageView) itemView.findViewById(R.id.rank_trophy);
            this.f2587c = (TextView) itemView.findViewById(R.id.rank_number);
            this.f2588d = (ImageView) itemView.findViewById(R.id.thumb);
            this.f2589e = (TextView) itemView.findViewById(R.id.name);
            this.f2590f = (TextView) itemView.findViewById(R.id.learned);
            this.f2591g = (TextView) itemView.findViewById(R.id.learned_label);
        }
    }

    public d(Context context, ArrayList<BBFriendRankInfo> item) {
        new ArrayList();
        this.f2581a = context;
        this.f2582b = item;
        Resources resources = context.getResources();
        this.f2583c = resources.getColor(R.color.business_dt0);
        this.f2584d = resources.getColor(R.color.business_dt5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int position) {
        BBFriendRankInfo bBFriendRankInfo = this.f2582b.get(position);
        int[] iArr = f2580e;
        if (position < iArr.length) {
            holder.f2587c.setVisibility(4);
            holder.f2586b.setVisibility(0);
            holder.f2586b.setImageDrawable(this.f2581a.getResources().getDrawable(iArr[position]));
        } else {
            holder.f2587c.setVisibility(0);
            holder.f2587c.setText(Integer.toString(position + 1));
            holder.f2586b.setImageDrawable(null);
            holder.f2586b.setVisibility(4);
        }
        String img = bBFriendRankInfo.getFriend_info().getImg();
        if (TextUtils.isEmpty(img)) {
            img = "empty";
        }
        hc.c.l(img).j(R.drawable.defaultavatarbig_normal_default).f(R.drawable.defaultavatarbig_normal_default).o(holder.f2588d);
        holder.f2589e.setText(bBFriendRankInfo.getFriend_info().getNickname());
        holder.f2590f.setText(String.format(Locale.CHINA, TimeModel.f32588i, Integer.valueOf(bBFriendRankInfo.getLearn_count())));
        if (!bBFriendRankInfo.getFriend_info().getPublickey().equals(ia.a.f(x.r().p().getPublicKey()))) {
            holder.f2585a.setBackgroundColor(0);
            return;
        }
        holder.f2587c.setTextColor(this.f2583c);
        holder.f2590f.setTextColor(this.f2583c);
        holder.f2591g.setTextColor(this.f2583c);
        holder.f2585a.setBackgroundColor(this.f2584d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_week_item, parent, false));
    }

    public void d() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f2582b.size();
    }
}
