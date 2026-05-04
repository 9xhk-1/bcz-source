package com.baicizhan.client.friend.adapter.portrait;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.online.bs_socials.BBSearchResult;
import com.baicizhan.online.structs.BELogicException;
import com.jiongji.andriod.card.R;
import java.util.Collections;
import java.util.List;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendSuggestionAdapter extends RecyclerView.Adapter<c> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f17665f = "FriendSearchActivity";

    /* renamed from: a, reason: collision with root package name */
    public Mode f17666a;

    /* renamed from: b, reason: collision with root package name */
    public Context f17667b;

    /* renamed from: c, reason: collision with root package name */
    public String f17668c;

    /* renamed from: d, reason: collision with root package name */
    public String f17669d;

    /* renamed from: e, reason: collision with root package name */
    public List<BBSearchResult> f17670e = Collections.EMPTY_LIST;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Mode {
        SYSTEM,
        SEARCH
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BBSearchResult f17671a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f17672b;

        public a(final BBSearchResult val$item, final c val$holder) {
            this.f17671a = val$item;
            this.f17672b = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setSelected(true);
            view.setEnabled(false);
            FriendSuggestionAdapter.this.c(this.f17671a.getPublickey(), this.f17672b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements SocialNetwork.Listener<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f17674a;

        public b(final c val$holder) {
            this.f17674a = val$holder;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Void res) {
            this.f17674a.f17680e.setVisibility(4);
            this.f17674a.f17681f.setVisibility(0);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            if (e11 instanceof BELogicException) {
                String[] strArr = {"好友人数达到上限", "你已经发出过对TA的申请", "不能申请加自己为好友哦", "用户不存在了哦~", "TA已经是你的好友了~", "对方的好友数已达到上限"};
                BELogicException bELogicException = (BELogicException) e11;
                int code = bELogicException.getCode();
                if (code > 6) {
                    code = 6;
                }
                int i11 = code - 1;
                bELogicException.setMessage(strArr[i11]);
                g.i(strArr[i11], 0);
            } else {
                g.i("网络不给力啊", 0);
            }
            this.f17674a.f17680e.setSelected(false);
            this.f17674a.f17680e.setEnabled(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f17676a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f17677b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f17678c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f17679d;

        /* renamed from: e, reason: collision with root package name */
        public View f17680e;

        /* renamed from: f, reason: collision with root package name */
        public View f17681f;

        public c(View itemView) {
            super(itemView);
            this.f17676a = (ImageView) itemView.findViewById(R.id.thumb);
            this.f17677b = (TextView) itemView.findViewById(R.id.name);
            this.f17678c = (TextView) itemView.findViewById(R.id.text1);
            this.f17679d = (TextView) itemView.findViewById(R.id.text2);
            this.f17680e = itemView.findViewById(R.id.invite);
            ThemeResUtil.setBackgroundColorShape(itemView.getContext(), this.f17680e, -11890462, -12939054, 4.0f);
            this.f17681f = itemView.findViewById(R.id.invited);
        }
    }

    public FriendSuggestionAdapter(Context context, Mode mode) {
        this.f17667b = context;
        this.f17666a = mode;
        this.f17668c = context.getString(R.string.friend_current_book_label);
        this.f17669d = context.getString(R.string.friend_current_vocabulary_label);
    }

    public final void c(final String publicKey, final c holder) {
        SocialNetwork.apply("FriendSearchActivity", publicKey, new b(holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final c holder, int position) {
        BBSearchResult bBSearchResult = this.f17670e.get(position);
        String img = bBSearchResult.getImg();
        if (TextUtils.isEmpty(img)) {
            img = "empty";
        }
        hc.c.l(img).j(R.drawable.defaultavatarbig_normal_default).f(R.drawable.defaultavatarbig_normal_default).o(holder.f17676a);
        holder.f17677b.setText(bBSearchResult.getNickname());
        if (this.f17666a == Mode.SYSTEM) {
            holder.f17678c.setText(this.f17668c + bBSearchResult.getBook());
            holder.f17679d.setText(bBSearchResult.getSuggest_reason() == null ? "" : bBSearchResult.getSuggest_reason());
        } else {
            String account_type = bBSearchResult.getAccount_type();
            holder.f17677b.setCompoundDrawablesWithIntrinsicBounds(0, 0, account_type.equals("renren") ? R.drawable.login_renren_normal_default : account_type.equals("weibo") ? R.drawable.login_weibo_normal_default : account_type.equals("weixin") ? R.drawable.login_weixin_normal_default : account_type.equals("qq") ? R.drawable.login_qq_normal_default : R.drawable.login_mail_normal_default, 0);
            holder.f17678c.setText(this.f17668c + bBSearchResult.getBook());
            if (bBSearchResult.getVocab_count() == 0) {
                holder.f17679d.setText(this.f17669d + this.f17667b.getString(R.string.friend_vocabulary_zero));
            } else {
                holder.f17679d.setText(this.f17669d + bBSearchResult.getVocab_count());
            }
        }
        holder.f17680e.setSelected(false);
        holder.f17680e.setEnabled(true);
        holder.f17680e.setVisibility(0);
        holder.f17681f.setVisibility(4);
        holder.f17680e.setOnClickListener(new a(bBSearchResult, holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup parent, int viewType) {
        return new c(LayoutInflater.from(parent.getContext()).inflate(this.f17666a == Mode.SYSTEM ? R.layout.friend_suggestion_item : R.layout.friend_search_item, parent, false));
    }

    public void g(List<BBSearchResult> items) {
        this.f17670e = items;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f17670e.size();
    }
}
