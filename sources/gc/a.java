package gc;

import android.content.Context;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.util.RandomStringCreator;
import com.baicizhan.client.wordtesting.bean.VocabStats;
import com.jiongji.andriod.card.R;
import i9.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import rb.f;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f53567a = 0;

    /* renamed from: b, reason: collision with root package name */
    public c f53568b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gc.a$a, reason: collision with other inner class name */
    public class CallableC0632a implements Callable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f53569a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53570b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: gc.a$a$a, reason: collision with other inner class name */
        public class C0633a extends bp.a<VocabStats> {
            public C0633a() {
            }
        }

        public CallableC0632a(final String val$url, final int val$statType) {
            this.f53569a = val$url;
            this.f53570b = val$statType;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d call() throws Exception {
            RequestFuture newFuture = RequestFuture.newFuture();
            f.d(new StringRequest(this.f53569a, newFuture, newFuture));
            String str = (String) newFuture.get();
            qb.c.i("", "vocabulary curve data from server is [%s]", str);
            VocabStats vocabStats = (VocabStats) new com.google.gson.d().o(str, new C0633a().getType());
            qb.c.i("", "formatted vocabulary curve data from server is [%s]", vocabStats.toString());
            d dVar = new d();
            dVar.f53572a = this.f53570b;
            dVar.f53573b = vocabStats;
            return dVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements q<d, d, List<d>> {
        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<d> call(d result, d result2) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(result);
            arrayList.add(result2);
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(VocabStats stats);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f53572a;

        /* renamed from: b, reason: collision with root package name */
        public VocabStats f53573b;
    }

    public static rx.c<List<d>> a(Context context) {
        return rx.c.q0(b(context, 0), b(context, 1), new b());
    }

    public static rx.c<d> b(Context context, final int statType) {
        String str;
        if (statType == 0) {
            str = String.format(Locale.US, context.getString(R.string.url_read_vocabstats), RandomStringCreator.bornNumCharString(), m.d());
        } else if (1 == statType) {
            str = String.format(Locale.US, context.getString(R.string.url_listen_vocabstats), RandomStringCreator.bornNumCharString(), m.d());
        } else {
            str = null;
        }
        return rx.c.z2(new CallableC0632a(str, statType)).w5(bc0.c.e());
    }
}
