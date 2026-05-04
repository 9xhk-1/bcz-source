package com.baicizhan.client.friend.fragment.portrait;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.baicizhan.client.friend.activity.portrait.FriendNotificationActivity;
import com.baicizhan.client.friend.activity.portrait.FriendSearchActivity;
import com.baicizhan.client.friend.activity.portrait.UnifiedFragmentActivity;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.client.friend.model.UIState;
import com.baicizhan.online.bs_socials.BBFriendInfo;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.List;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendListFragment extends Fragment implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public static final String f17683j = "FriendListFragment";

    /* renamed from: k, reason: collision with root package name */
    public static final String f17684k = "mark_new";

    /* renamed from: l, reason: collision with root package name */
    public static final int f17685l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17686m = 2;

    /* renamed from: a, reason: collision with root package name */
    public int f17687a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17688b;

    /* renamed from: c, reason: collision with root package name */
    public RedDotImageView f17689c;

    /* renamed from: d, reason: collision with root package name */
    public RedDotImageView f17690d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f17691e;

    /* renamed from: f, reason: collision with root package name */
    public View f17692f;

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f17693g;

    /* renamed from: h, reason: collision with root package name */
    public ac.b f17694h;

    /* renamed from: i, reason: collision with root package name */
    public d f17695i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17696a;

        static {
            int[] iArr = new int[UIState.values().length];
            f17696a = iArr;
            try {
                iArr[UIState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17696a[UIState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17696a[UIState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17696a[UIState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements SocialNetwork.Listener<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<FriendListFragment> f17697a;

        /* renamed from: b, reason: collision with root package name */
        public final List<BBFriendInfo> f17698b;

        public b(FriendListFragment fragment, List<BBFriendInfo> friend) {
            this.f17697a = new WeakReference<>(fragment);
            this.f17698b = friend;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer notifyCount) {
            FriendListFragment friendListFragment = this.f17697a.get();
            if (friendListFragment == null || friendListFragment.getActivity() == null) {
                return;
            }
            if (notifyCount.intValue() > 0) {
                friendListFragment.f17688b.setText(Html.fromHtml("请求<font color='#d0021b'> " + notifyCount + "</font>"));
            } else {
                friendListFragment.f17688b.setText("请求");
            }
            friendListFragment.A(notifyCount.intValue() + this.f17698b.size() > 0 ? UIState.COMPLETE : UIState.EMPTY);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            qb.c.c("", "check notification count failed.", e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements SocialNetwork.Listener<List<BBFriendInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<FriendListFragment> f17699a;

        public c(FriendListFragment fragment) {
            this.f17699a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBFriendInfo> friend) {
            FriendListFragment friendListFragment = this.f17699a.get();
            if (friendListFragment == null || friendListFragment.getActivity() == null) {
                return;
            }
            friendListFragment.f17694h.p(friend);
            SocialNetwork.checkNotificationCount("FriendListFragment", new b(friendListFragment, friend));
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            qb.c.c("", "fetch friend failed.", e11);
            FriendListFragment friendListFragment = this.f17699a.get();
            if (friendListFragment == null || friendListFragment.getActivity() == null) {
                return;
            }
            friendListFragment.A(UIState.ERROR);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends RecyclerView.OnScrollListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            FriendListFragment.this.f17694h.k();
        }

        public d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(UIState state) {
        int i11 = a.f17696a[state.ordinal()];
        if (i11 == 1) {
            this.f17691e.setVisibility(8);
            this.f17692f.setVisibility(this.f17694h.getItemCount() <= 0 ? 0 : 8);
            this.f17693g.setVisibility(this.f17694h.getItemCount() > 0 ? 0 : 4);
            return;
        }
        if (i11 == 2) {
            this.f17691e.setVisibility(8);
            this.f17692f.setVisibility(8);
            this.f17693g.setVisibility(0);
        } else if (i11 == 3) {
            this.f17691e.setVisibility(0);
            this.f17692f.setVisibility(8);
            this.f17693g.setVisibility(4);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f17691e.setVisibility(8);
            this.f17692f.setVisibility(8);
            this.f17693g.setVisibility(4);
            g.i("请在稳定的网络环境下重试", 0);
        }
    }

    private void x() {
        A(UIState.LOADING);
        SocialNetwork.fetchFriends("FriendListFragment", new c(this));
    }

    public static FriendListFragment y(int markNew) {
        FriendListFragment friendListFragment = new FriendListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(f17684k, markNew);
        friendListFragment.setArguments(bundle);
        return friendListFragment;
    }

    public void B(boolean show) {
        if (show) {
            this.f17687a |= 2;
        } else {
            this.f17687a &= -3;
        }
        RedDotImageView redDotImageView = this.f17690d;
        if (redDotImageView != null) {
            redDotImageView.setShowRedDot(show);
        }
    }

    public void C(boolean show) {
        if (show) {
            this.f17687a |= 1;
        } else {
            this.f17687a &= -2;
        }
        RedDotImageView redDotImageView = this.f17689c;
        if (redDotImageView != null) {
            redDotImageView.setShowRedDot(show);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.friends_request) {
            FriendNotificationActivity.M0(getActivity());
            C(false);
        } else {
            if (id2 == R.id.friends_add) {
                FriendSearchActivity.b1(getActivity());
                return;
            }
            if (id2 == R.id.friends_feed) {
                UnifiedFragmentActivity.I0(getActivity(), bc.a.class, "动态");
                B(false);
            } else if (id2 == R.id.friends_rank) {
                UnifiedFragmentActivity.I0(getActivity(), bc.d.class, "排行榜");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments() != null ? getArguments() : null;
        }
        if (savedInstanceState != null) {
            this.f17687a = savedInstanceState.getInt(f17684k);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.friend_list_fragment, container, false);
        inflate.findViewById(R.id.friends_request).setOnClickListener(this);
        inflate.findViewById(R.id.friends_add).setOnClickListener(this);
        inflate.findViewById(R.id.friends_feed).setOnClickListener(this);
        inflate.findViewById(R.id.friends_rank).setOnClickListener(this);
        this.f17688b = (TextView) inflate.findViewById(R.id.friends_request_text);
        this.f17689c = (RedDotImageView) inflate.findViewById(R.id.friends_request_img);
        this.f17690d = (RedDotImageView) inflate.findViewById(R.id.friends_feed_img);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.friend_list);
        this.f17693g = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        eu.a aVar = new eu.a(getActivity());
        aVar.d(new ColorDrawable(-2631203));
        this.f17693g.addItemDecoration(aVar);
        d dVar = new d();
        this.f17695i = dVar;
        this.f17693g.addOnScrollListener(dVar);
        this.f17692f = inflate.findViewById(R.id.load_progress);
        this.f17691e = (TextView) inflate.findViewById(R.id.empty_view);
        ac.b bVar = new ac.b(getActivity());
        this.f17694h = bVar;
        this.f17693g.setAdapter(bVar);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.baicizhan.client.business.thrift.c.b().b("FriendListFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mc.a.b(getActivity(), "delete-prompt");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f17689c.setShowRedDot((this.f17687a & 1) == 1);
        this.f17690d.setShowRedDot((this.f17687a & 2) == 2);
        x();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(f17684k, this.f17687a);
    }

    public void z(int flags) {
        this.f17687a = flags;
    }
}
