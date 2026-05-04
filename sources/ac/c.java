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
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.friend.activity.portrait.FriendNotificationActivity;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.online.bs_socials.BBFriendMsg;
import com.baicizhan.online.bs_socials.BBFriendMsgType;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends RecyclerView.Adapter<e> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2560c = FriendNotificationActivity.f17620f;

    /* renamed from: a, reason: collision with root package name */
    public Context f2561a;

    /* renamed from: b, reason: collision with root package name */
    public List<BBFriendMsg> f2562b = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f2563a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BBFriendMsg f2564b;

        public a(final e val$holder, final BBFriendMsg val$msg) {
            this.f2563a = val$holder;
            this.f2564b = val$msg;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            v11.setSelected(true);
            v11.setEnabled(false);
            c.this.l(this.f2563a, this.f2564b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f2566a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BBFriendMsg f2567b;

        public b(final e val$holder, final BBFriendMsg val$msg) {
            this.f2566a = val$holder;
            this.f2567b = val$msg;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            v11.setSelected(true);
            v11.setEnabled(false);
            c.this.f(this.f2566a, this.f2567b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ac.c$c, reason: collision with other inner class name */
    public class C0016c implements SocialNetwork.Listener<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f2569a;

        public C0016c(final e val$holder) {
            this.f2569a = val$holder;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Void res) {
            c.this.i(this.f2569a, R.string.friend_has_refused);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            g.i(e11.getMessage(), 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements SocialNetwork.Listener<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f2571a;

        public d(final e val$holder) {
            this.f2571a = val$holder;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Void res) {
            c.this.i(this.f2571a, R.string.friend_has_added);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            g.i(e11.getMessage(), 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f2573a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f2574b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f2575c;

        /* renamed from: d, reason: collision with root package name */
        public View f2576d;

        /* renamed from: e, reason: collision with root package name */
        public View f2577e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f2578f;

        public e(View itemView) {
            super(itemView);
            this.f2573a = (ImageView) itemView.findViewById(R.id.thumb);
            this.f2574b = (TextView) itemView.findViewById(R.id.name);
            this.f2575c = (TextView) itemView.findViewById(R.id.text1);
            Resources resources = itemView.getContext().getResources();
            this.f2576d = itemView.findViewById(R.id.refuse);
            ThemeResUtil.setBackgroundShape(itemView.getContext(), this.f2576d, 16777215, 860571712, 1, -11843520, 4.0f);
            this.f2577e = itemView.findViewById(R.id.accept);
            ThemeResUtil.setBackgroundColorShape(itemView.getContext(), this.f2577e, resources.getColor(R.color.main_color_common_blue), resources.getColor(R.color.main_color_common_blue_press), 4.0f);
            this.f2578f = (TextView) itemView.findViewById(R.id.placeholder);
        }
    }

    public c(Context context) {
        this.f2561a = context;
    }

    public final void f(final e holder, BBFriendMsg notification) {
        SocialNetwork.accept(f2560c, notification.getMsg_id(), notification.getFriend_info().getPublickey(), new d(holder));
    }

    public final void g(e holder) {
        holder.f2578f.setVisibility(4);
        holder.f2576d.setVisibility(4);
        holder.f2577e.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f2562b.size();
    }

    public final void h(e holder) {
        holder.f2578f.setVisibility(4);
        holder.f2576d.setVisibility(0);
        holder.f2577e.setVisibility(0);
        holder.f2576d.setSelected(false);
        holder.f2577e.setSelected(false);
        holder.f2576d.setEnabled(true);
        holder.f2577e.setEnabled(true);
    }

    public final void i(e holder, int resId) {
        holder.f2578f.setVisibility(0);
        holder.f2578f.setText(resId);
        holder.f2576d.setVisibility(4);
        holder.f2577e.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final e holder, int position) {
        BBFriendMsg bBFriendMsg = this.f2562b.get(position);
        String img = bBFriendMsg.getFriend_info().getImg();
        if (TextUtils.isEmpty(img)) {
            img = "empty";
        }
        hc.c.l(img).j(R.drawable.defaultavatarbig_normal_default).f(R.drawable.defaultavatarbig_normal_default).o(holder.f2573a);
        holder.f2574b.setText(bBFriendMsg.getFriend_info().getNickname());
        if (bBFriendMsg.getMsg_type() != BBFriendMsgType.APPLY_FRIEND) {
            if (bBFriendMsg.getMsg_type() == BBFriendMsgType.ACCEPT_FRIEND) {
                g(holder);
                holder.f2575c.setText(R.string.friend_peer_accept);
                return;
            }
            return;
        }
        h(holder);
        int vocab_count = bBFriendMsg.getFriend_info().getVocab_count();
        TextView textView = holder.f2575c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("词汇量: ");
        sb2.append(vocab_count == 0 ? "未知" : Integer.valueOf(vocab_count));
        textView.setText(sb2.toString());
        BBFriendMsg bBFriendMsg2 = this.f2562b.get(position);
        holder.f2576d.setOnClickListener(new a(holder, bBFriendMsg2));
        holder.f2577e.setOnClickListener(new b(holder, bBFriendMsg2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup parent, int viewType) {
        return new e(LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_notification_item, parent, false));
    }

    public final void l(final e holder, BBFriendMsg notification) {
        SocialNetwork.ignore(f2560c, notification.getMsg_id(), new C0016c(holder));
    }

    public void m(List<BBFriendMsg> items) {
        this.f2562b.clear();
        this.f2562b.addAll(items);
        notifyDataSetChanged();
    }
}
