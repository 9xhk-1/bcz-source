package ac;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.widget.CircleImageView;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.online.bs_socials.BBFriendInfo;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kc.r;
import kc.u;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends RecyclerView.Adapter<h> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2526h = "FriendListFragment";

    /* renamed from: a, reason: collision with root package name */
    public Context f2527a;

    /* renamed from: b, reason: collision with root package name */
    public String f2528b;

    /* renamed from: c, reason: collision with root package name */
    public String f2529c;

    /* renamed from: e, reason: collision with root package name */
    public va.f f2531e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference<h> f2532f;

    /* renamed from: d, reason: collision with root package name */
    public List<BBFriendInfo> f2530d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2533g = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2534a;

        public a(final h val$holder) {
            this.f2534a = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            b.this.o(this.f2534a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ac.b$b, reason: collision with other inner class name */
    public class C0013b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2536a;

        public C0013b(final h val$holder) {
            this.f2536a = val$holder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            this.f2536a.f2549a.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2538a;

        public c(final h val$holder) {
            this.f2538a = val$holder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            this.f2538a.f2554f.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2540a;

        public d(final h val$holder) {
            this.f2540a = val$holder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            this.f2540a.f2549a.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2542a;

        public e(final h val$holder) {
            this.f2542a = val$holder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            this.f2542a.f2554f.setVisibility(8);
            b.this.f2533g = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements SocialNetwork.Listener<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2544a;

        public f(final int val$position) {
            this.f2544a = val$position;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Void res) {
            b.this.f2530d.remove(this.f2544a);
            b.this.notifyItemRemoved(this.f2544a);
            va.g.i("删除成功", 0);
            b.this.f2533g = false;
            b.this.f2531e.dismiss();
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            if (e11 instanceof TTransportException) {
                va.g.i("网络不给力啊", 0);
            } else {
                va.g.i("删除失败,原因:" + e11.getMessage(), 0);
            }
            b.this.f2533g = false;
            b.this.f2531e.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public BBFriendInfo f2546a;

        /* renamed from: b, reason: collision with root package name */
        public int f2547b;

        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            if (which == -1) {
                b.this.l(this.f2546a, this.f2547b);
            } else if (which == -2) {
                b.this.k();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public View f2549a;

        /* renamed from: b, reason: collision with root package name */
        public CircleImageView f2550b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f2551c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f2552d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f2553e;

        /* renamed from: f, reason: collision with root package name */
        public View f2554f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends sa.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f2556a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: ac.b$h$a$a, reason: collision with other inner class name */
            public class DialogInterfaceOnDismissListenerC0014a implements DialogInterface.OnDismissListener {
                public DialogInterfaceOnDismissListenerC0014a() {
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialog) {
                    b.this.k();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: ac.b$h$a$b, reason: collision with other inner class name */
            public class C0015b extends r {
                public C0015b() {
                }

                @Override // kc.r, kc.q
                public void onDialogNegativeClick(@NonNull View view) {
                    b.this.k();
                }

                @Override // kc.r, kc.q
                public void onDialogPositiveClick(@NonNull View view) {
                    int adapterPosition = h.this.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    b bVar = b.this;
                    bVar.l((BBFriendInfo) bVar.f2530d.get(adapterPosition), h.this.getAdapterPosition());
                }
            }

            public a(final b val$this$0) {
                this.f2556a = val$this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                super.onClick(v11);
                mc.a.n((FragmentActivity) b.this.f2527a, ((u) new u.a(b.this.f2527a).U(R.string.friend_confirm_delete_message).d()).f0(new C0015b()).B(new DialogInterfaceOnDismissListenerC0014a()), "delete-prompt");
            }
        }

        public h(View itemView) {
            super(itemView);
            this.f2549a = itemView.findViewById(R.id.content);
            this.f2550b = (CircleImageView) itemView.findViewById(R.id.thumb);
            this.f2551c = (TextView) itemView.findViewById(R.id.name);
            this.f2552d = (TextView) itemView.findViewById(R.id.text1);
            this.f2553e = (TextView) itemView.findViewById(R.id.text2);
            View findViewById = itemView.findViewById(R.id.operations);
            this.f2554f = findViewById;
            findViewById.setOnClickListener(new a(b.this));
        }
    }

    public b(Context context) {
        this.f2527a = context;
        this.f2528b = context.getString(R.string.friend_current_book_label);
        this.f2529c = this.f2527a.getString(R.string.friend_current_vocabulary_label);
        va.f fVar = new va.f(this.f2527a);
        this.f2531e = fVar;
        fVar.setCancelable(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BBFriendInfo> list = this.f2530d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void i(final h holder, final int position) {
        BBFriendInfo bBFriendInfo = this.f2530d.get(position);
        String img = bBFriendInfo.getImg();
        if (TextUtils.isEmpty(img)) {
            img = "empty";
        }
        hc.c.l(img).j(R.drawable.defaultavatarbig_normal_default).f(R.drawable.defaultavatarbig_normal_default).o(holder.f2550b);
        holder.f2551c.setText(bBFriendInfo.getNickname());
        holder.f2552d.setText(this.f2528b + bBFriendInfo.getBook_name());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2529c);
        sb2.append(bBFriendInfo.getVocab_count() == 0 ? this.f2527a.getString(R.string.friend_vocabulary_zero) : Integer.toString(bBFriendInfo.getVocab_count()));
        holder.f2553e.setText(sb2.toString());
        holder.f2549a.setOnClickListener(new a(holder));
        holder.f2549a.setVisibility(0);
        holder.f2554f.setVisibility(8);
    }

    public final void j(final h holder) {
        holder.f2549a.animate().alpha(1.0f).setDuration(holder.f2549a.getResources().getInteger(android.R.integer.config_shortAnimTime)).setListener(new d(holder));
        holder.f2554f.animate().alpha(0.0f).setDuration(holder.f2554f.getResources().getInteger(android.R.integer.config_shortAnimTime)).setListener(new e(holder));
    }

    public boolean k() {
        h hVar;
        WeakReference<h> weakReference = this.f2532f;
        if (weakReference == null || (hVar = weakReference.get()) == null) {
            return false;
        }
        j(hVar);
        this.f2532f = null;
        return true;
    }

    public final void l(BBFriendInfo record, final int position) {
        this.f2531e.show();
        SocialNetwork.deleteFriend("FriendListFragment", record.getPublickey(), new f(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(h holder, int position) {
        i(holder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public h onCreateViewHolder(ViewGroup parent, int viewType) {
        return new h(LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_list_friend_item, parent, false));
    }

    public final void o(final h holder) {
        this.f2533g = true;
        if (k()) {
            return;
        }
        holder.f2549a.animate().alpha(0.0f).setDuration(holder.f2549a.getResources().getInteger(android.R.integer.config_shortAnimTime)).setListener(new C0013b(holder));
        holder.f2554f.animate().alpha(1.0f).setDuration(holder.f2554f.getResources().getInteger(android.R.integer.config_shortAnimTime)).setListener(new c(holder));
        this.f2532f = new WeakReference<>(holder);
    }

    public void p(List<BBFriendInfo> friends) {
        if (this.f2533g) {
            return;
        }
        this.f2530d.clear();
        this.f2530d.addAll(friends);
        notifyDataSetChanged();
    }
}
