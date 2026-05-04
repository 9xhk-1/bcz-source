package bc;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cc.a;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.client.friend.model.UIState;
import com.baicizhan.client.friend.widget.FriendFeedView;
import com.baicizhan.online.bs_socials.BBFeed;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6696k = "FriendFeedFragment";

    /* renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f6698b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f6699c;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f6701e;

    /* renamed from: f, reason: collision with root package name */
    public ac.a f6702f;

    /* renamed from: a, reason: collision with root package name */
    public List<String> f6697a = null;

    /* renamed from: d, reason: collision with root package name */
    public d f6700d = new d();

    /* renamed from: g, reason: collision with root package name */
    public UIState f6703g = UIState.EMPTY;

    /* renamed from: h, reason: collision with root package name */
    public List<BBFeed> f6704h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f6705i = true;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f6706j = new RunnableC0114a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bc.a$a, reason: collision with other inner class name */
    public class RunnableC0114a implements Runnable {
        public RunnableC0114a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f6698b.setRefreshing(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements SwipeRefreshLayout.OnRefreshListener {
        public b() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
        public void onRefresh() {
            a.this.E();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6709a;

        static {
            int[] iArr = new int[UIState.values().length];
            f6709a = iArr;
            try {
                iArr[UIState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6709a[UIState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6709a[UIState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6709a[UIState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends RecyclerView.OnScrollListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                    if (a.this.f6704h.isEmpty() || findLastVisibleItemPosition + 1 != recyclerView.getAdapter().getItemCount()) {
                        return;
                    }
                    a aVar = a.this;
                    aVar.F(((BBFeed) aVar.f6704h.get(a.this.f6704h.size() - 1)).getTimestamp());
                }
            }
        }

        public d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements SocialNetwork.Listener<List<BBFeed>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f6711a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6712b;

        public e(a fragment, boolean more) {
            this.f6711a = new WeakReference<>(fragment);
            this.f6712b = more;
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBFeed> res) {
            a aVar = this.f6711a.get();
            if (aVar == null || aVar.getActivity() == null) {
                return;
            }
            if (this.f6712b) {
                aVar.f6704h.addAll(res);
                aVar.f6702f.h(aVar.f6704h);
                aVar.f6702f.i(res.isEmpty());
            } else {
                aVar.f6704h = res;
                aVar.G(aVar.f6704h.isEmpty() ? UIState.EMPTY : UIState.COMPLETE);
            }
            aVar.f6705i = !res.isEmpty() && aVar.f6704h.size() <= 10;
            if (aVar.f6705i) {
                aVar.F(res.get(res.size() - 1).getTimestamp());
            }
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            a aVar = this.f6711a.get();
            if (aVar == null || aVar.getActivity() == null) {
                return;
            }
            if (this.f6712b) {
                g.i("请在稳定的网络环境下重试", 0);
            } else {
                aVar.G(UIState.ERROR);
            }
            qb.c.c("", "fetch feed failed.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        UIState uIState = this.f6703g;
        UIState uIState2 = UIState.LOADING;
        if (uIState == uIState2) {
            return;
        }
        G(uIState2);
        SocialNetwork.fetchFeed(f6696k, System.currentTimeMillis(), new e(this, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(UIState state) {
        int[] iArr = c.f6709a;
        this.f6703g = state;
        int i11 = iArr[state.ordinal()];
        if (i11 == 1) {
            this.f6698b.post(this.f6706j);
            this.f6701e.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            this.f6698b.removeCallbacks(this.f6706j);
            this.f6698b.setRefreshing(false);
            this.f6702f.h(this.f6704h);
            this.f6701e.setVisibility(8);
            return;
        }
        if (i11 == 3) {
            this.f6698b.removeCallbacks(this.f6706j);
            this.f6698b.setRefreshing(false);
            this.f6701e.setVisibility(0);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f6698b.removeCallbacks(this.f6706j);
            this.f6698b.setRefreshing(false);
            g.i("请在稳定的网络环境下重试", 0);
        }
    }

    public final void D() {
        if (this.f6697a == null) {
            Resources resources = getActivity().getResources();
            ArrayList arrayList = new ArrayList(2);
            this.f6697a = arrayList;
            arrayList.add(resources.getString(R.string.friend_default_empty_feed1));
            this.f6697a.add(resources.getString(R.string.friend_default_empty_feed2));
        }
    }

    public final void F(long before) {
        this.f6702f.i(false);
        SocialNetwork.fetchFeed(f6696k, before, new e(this, true));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int i11 = 0;
        View inflate = inflater.inflate(R.layout.friend_feed_fragment_portrait, container, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.feed_list);
        this.f6699c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6699c.addOnScrollListener(this.f6700d);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.feed_list_swipe);
        this.f6698b = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_message_head));
        this.f6698b.setOnRefreshListener(new b());
        ac.a aVar = new ac.a();
        this.f6702f = aVar;
        this.f6699c.setAdapter(aVar);
        this.f6702f.h(this.f6704h);
        this.f6701e = (ViewGroup) inflate.findViewById(R.id.empty_view);
        D();
        while (i11 < this.f6697a.size()) {
            FriendFeedView friendFeedView = (FriendFeedView) this.f6701e.getChildAt(i11);
            friendFeedView.setContent(Html.fromHtml(this.f6697a.get(i11)));
            friendFeedView.setMarkerColor(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_friends_highlight));
            friendFeedView.setMarkerMode(i11 == 0 ? 1 : 2);
            friendFeedView.setThumb(R.drawable.friend_thumb_system);
            i11++;
        }
        this.f6701e.setVisibility(8);
        i80.c.f().v(this);
        E();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f6698b.removeCallbacks(this.f6706j);
        com.baicizhan.client.business.thrift.c.b().b(f6696k);
        this.f6699c.removeOnScrollListener(this.f6700d);
        i80.c.f().A(this);
    }

    public void onEventMainThread(a.C0146a event) {
        this.f6698b.setEnabled(event.f8511a == 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
