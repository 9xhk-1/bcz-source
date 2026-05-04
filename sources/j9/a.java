package j9;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.WordMediaMidRecord;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.dataset.models.WordMediaUpdRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.online.bs_users.BBUserWordMedia;
import com.baicizhan.online.bs_users.BSUsers;
import com.baicizhan.online.bs_words.BSWords;
import com.baicizhan.online.resource_api.ResourceService;
import i9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f63893d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f63894e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f63895f = 50;

    /* renamed from: a, reason: collision with root package name */
    public Context f63896a;

    /* renamed from: b, reason: collision with root package name */
    public e f63897b;

    /* renamed from: c, reason: collision with root package name */
    public f f63898c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j9.a$a, reason: collision with other inner class name */
    public class C0742a extends ThriftRequest<ResourceService.Client, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f63899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0742a(String domain, final int val$bookid) {
            super(domain);
            this.f63899a = val$bookid;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(ResourceService.Client client) throws Exception {
            List<WordMediaUpdRecord> p11 = o.p(a.this.f63896a, this.f63899a);
            if (xb.e.h(p11)) {
                p11 = l9.d.a(client.get_word_media_update_info(this.f63899a));
            }
            if (p11 != null && !p11.isEmpty()) {
                o.x(a.this.f63896a, this.f63899a, p11);
                List<String> n11 = o.n(a.this.f63896a, this.f63899a);
                if (n11 != null && !n11.isEmpty()) {
                    o.B(a.this.f63896a, this.f63899a, a.h(l9.a.a(n11), client), false);
                }
            }
            return null;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void result) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onUpdated(true, 0);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onUpdated(false, -1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThriftRequest<ResourceService.Client, List<WordMediaRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f63901a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f63902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String domain, final List val$wordids, final int val$bookId) {
            super(domain);
            this.f63901a = val$wordids;
            this.f63902b = val$bookId;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WordMediaRecord> doInBackground(ResourceService.Client client) throws Exception {
            List<WordMediaRecord> h11 = a.h(l9.a.a(this.f63901a), client);
            o.r(a.this.f63896a, this.f63902b, h11);
            return h11;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<WordMediaRecord> records) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onInserted(true, 0, records);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onInserted(false, -1, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThriftRequest<BSWords.Client, Void> {
        public c(String domain) {
            super(domain);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(BSWords.Client client) throws Exception {
            if (x.r().G() != null) {
                boolean v11 = o.v(a.this.f63896a, 0L, 0L);
                List<WordMediaMidRecord> k11 = o.k(a.this.f63896a, 0);
                List<WordMediaMidRecord> k12 = o.k(a.this.f63896a, 1);
                String g11 = o.g(a.this.f63896a, 2);
                String g12 = o.g(a.this.f63896a, 3);
                if (!v11 && k11 != null && !k11.isEmpty() && k12 != null && !k12.isEmpty() && !TextUtils.isEmpty(g11) && !TextUtils.isEmpty(g12)) {
                    return null;
                }
            }
            o.u(a.this.f63896a, l9.b.a(client.get_word_media_halftime_list()));
            return null;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void result) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onMidRefreshed(true, 0);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (a.this.f63897b != null) {
                a.this.f63897b.onMidRefreshed(false, -1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends ThriftRequest<BSUsers.Client, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f63905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String domain, final int val$bookid) {
            super(domain);
            this.f63905a = val$bookid;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(BSUsers.Client client) throws Exception {
            a.this.p(client, this.f63905a);
            return null;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void result) {
            if (a.this.f63898c != null) {
                a.this.f63898c.a(true, 0);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (a.this.f63898c != null) {
                a.this.f63898c.a(false, -1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void onInserted(boolean success, int errCode, List<WordMediaRecord> records);

        void onMidRefreshed(boolean success, int errCode);

        void onUpdated(boolean success, int errCode);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(boolean success, int errCode);
    }

    public a(Context context) {
        this.f63896a = context;
    }

    public static a e(Context context, e l11, f l22) {
        a aVar = new a(context);
        aVar.f63897b = l11;
        aVar.f63898c = l22;
        return aVar;
    }

    public static void g(Context context, int bookid, ResourceService.Client client) throws Exception {
        List arrayList = new ArrayList();
        if (o.t(context, bookid)) {
            List<WordMediaUpdRecord> m11 = m(context, bookid, client);
            if (m11 == null || m11.isEmpty()) {
                return;
            }
            Iterator<WordMediaUpdRecord> it = m11.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getWordid());
            }
        } else {
            arrayList = o.f(context, bookid);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        o.B(context, bookid, h(l9.a.a(arrayList), client), true);
    }

    public static List<WordMediaRecord> h(List<Integer> wordids, ResourceService.Client client) throws Exception {
        ArrayList arrayList = new ArrayList(wordids.size());
        int size = (wordids.size() % 50 == 0 ? wordids.size() : wordids.size() + 50) / 50;
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = new ArrayList(50);
            int i12 = i11 + 1;
            int min = Math.min(wordids.size(), i12 * 50);
            for (int i13 = i11 * 50; i13 < min; i13++) {
                arrayList2.add(wordids.get(i13));
            }
            arrayList.addAll(client.get_media_by_topic_ids(arrayList2));
            qb.c.b("whiz", "get word media seg records, out: " + i11 + "; part: " + size + "; send ids size: " + arrayList2.size(), new Object[0]);
            i11 = i12;
        }
        return WordMediaRecord.fromList(arrayList);
    }

    public static List<WordMediaUpdRecord> m(Context context, int bookid, ResourceService.Client client) throws Exception {
        List<WordMediaUpdRecord> a11 = l9.d.a(client.get_word_media_update_info(bookid));
        if (a11 == null || a11.isEmpty()) {
            return null;
        }
        o.x(context, bookid, a11);
        return a11;
    }

    public void f() {
        this.f63896a = null;
    }

    public void i(int bookId, List<String> wordids) {
        if (this.f63896a == null) {
            return;
        }
        o(bookId, wordids);
    }

    public void j() {
        if (this.f63896a == null) {
            return;
        }
        k();
    }

    public final void k() {
        com.baicizhan.client.business.thrift.c.b().a(new c("/rpc/words"));
    }

    public final void l(final int bookid) {
        com.baicizhan.client.business.thrift.c.b().a(new d("/rpc/users", bookid));
    }

    public final void n(final int bookid) {
        com.baicizhan.client.business.thrift.c.b().a(new C0742a("/rpc/resource_api", bookid));
    }

    public final void o(final int bookId, final List<String> wordids) {
        com.baicizhan.client.business.thrift.c.b().a(new b("/rpc/resource_api", wordids, bookId));
    }

    public final void p(BSUsers.Client client, int bookid) throws Exception {
        List<BBUserWordMedia> a11 = l9.c.a(o.o(this.f63896a, bookid));
        int size = (a11.size() % 50 == 0 ? a11.size() : a11.size() + 50) / 50;
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList = new ArrayList(50);
            i11++;
            int min = Math.min(a11.size(), i11 * 50);
            for (int i12 = i11 * 50; i12 < min; i12++) {
                arrayList.add(a11.get(i12));
            }
            client.sync_user_word_media_record(arrayList);
        }
        o.y(this.f63896a, bookid);
    }

    public void q(BSUsers.Client client, int bookid) throws Exception {
        if (this.f63896a == null) {
            return;
        }
        p(client, bookid);
    }

    public void r(int bookid) {
        if (this.f63896a == null) {
            return;
        }
        n(bookid);
    }

    public void s(int bookid) {
        if (this.f63896a == null) {
            return;
        }
        l(bookid);
    }
}
