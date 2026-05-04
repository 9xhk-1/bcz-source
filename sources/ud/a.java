package ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.Fonts;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.jiongji.andriod.card.R;
import gs.ed;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import rx.c;
import wb0.p;
import wb0.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends pd.a {

    /* renamed from: s, reason: collision with root package name */
    public static final String f92120s = "post";

    /* renamed from: o, reason: collision with root package name */
    public ed f92121o;

    /* renamed from: p, reason: collision with root package name */
    public List<String> f92122p;

    /* renamed from: q, reason: collision with root package name */
    public List<Long> f92123q;

    /* renamed from: r, reason: collision with root package name */
    public int f92124r = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ud.a$a, reason: collision with other inner class name */
    public class C1235a implements p<g.j, rx.c<Bitmap>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92125a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ud.a$a$a, reason: collision with other inner class name */
        public class C1236a implements t<ed, Bitmap, Bitmap, Bitmap, g.j, Bitmap> {
            public C1236a() {
            }

            @Override // wb0.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap c(ed binding, Bitmap qrcode, Bitmap logo, Bitmap post, g.j dakaInfo) {
                if (a.this.f92123q != null && a.this.f92123q.size() > a.this.f92124r) {
                    a.this.f80346b.postValue(String.valueOf(a.this.f92123q.get(a.this.f92124r)));
                }
                binding.f54774b.setText(String.valueOf(dakaInfo.f18380b.total_daka_days));
                binding.f54777e.setImageBitmap(post);
                binding.f54778f.setImageBitmap(logo);
                binding.f54779g.setImageBitmap(qrcode);
                TextView textView = binding.f54781i;
                int i11 = dakaInfo.f18380b.total_words;
                textView.setText(i11 == -1 ? String.valueOf(LearnRecordManager.A().I()) : String.valueOf(i11));
                binding.f54773a.setText(new SimpleDateFormat("EEEE，MMMM d", Locale.ENGLISH).format(new Date()));
                return a.this.k(binding.getRoot());
            }
        }

        public C1235a(final Context val$context) {
            this.f92125a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Bitmap> call(g.j dakaInfo) {
            rx.c i11 = a.this.i(dakaInfo.f18379a.qr_image);
            rx.c i12 = a.this.i(dakaInfo.f18379a.logo);
            rx.c M2 = rx.c.M2(dakaInfo);
            for (DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo : dakaInfo.f18379a.category_info) {
                if (pd.a.f80334d.equals(dakaBackgroundCategoryInfo.name)) {
                    a.this.f92122p = dakaBackgroundCategoryInfo.images;
                    a.this.f92123q = dakaBackgroundCategoryInfo.image_ids;
                }
            }
            a aVar = a.this;
            return rx.c.o7(a.this.B(this.f92125a), i11, i12, aVar.i((String) aVar.f92122p.get(a.this.f92124r)), M2, new C1236a()).w5(tb0.a.a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<Bitmap, Bitmap> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(Bitmap bitmap) {
            if (a.this.f92123q != null && a.this.f92123q.size() > a.this.f92124r) {
                a.this.f80346b.postValue(String.valueOf(a.this.f92123q.get(a.this.f92124r)));
            }
            a.this.f92121o.f54777e.setImageBitmap(bitmap);
            a aVar = a.this;
            return aVar.k(aVar.f92121o.getRoot());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<ed> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92129a;

        public c(final Context val$context) {
            this.f92129a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super ed> subscriber) {
            if (a.this.f92121o == null) {
                a.this.f92121o = ed.d(LayoutInflater.from(this.f92129a));
                Fonts.setSafeFace(R.font.sfu_din_eng_alt, a.this.f92121o.f54774b, a.this.f92121o.f54781i);
            }
            subscriber.onStart();
            subscriber.onNext(a.this.f92121o);
            subscriber.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.c<ed> B(final Context context) {
        return rx.c.j1(new c(context)).w5(tb0.a.a());
    }

    @Override // pd.d
    public rx.c<Bitmap> a(final Context context) {
        return g.n().l(context).b2(new C1235a(context)).I3(bc0.c.e()).c3(l("post0"));
    }

    @Override // pd.d
    public String d() {
        return pd.a.f80334d;
    }

    @Override // pd.d
    public rx.c<Bitmap> f(final Context context) {
        if (CollectionUtils.isEmpty(this.f92122p)) {
            return rx.c.T1(new RuntimeException("null post"));
        }
        int size = (this.f92124r + 1) % this.f92122p.size();
        this.f92124r = size;
        return i(this.f92122p.get(size)).I3(tb0.a.a()).c3(new b()).I3(bc0.c.e()).c3(l(f92120s + this.f92124r));
    }
}
