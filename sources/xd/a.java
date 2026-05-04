package xd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.jiongji.andriod.card.R;
import gs.kd;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import q9.x;
import rx.c;
import wb0.p;
import wb0.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends pd.a {

    /* renamed from: r, reason: collision with root package name */
    public static final String f98002r = "words";

    /* renamed from: o, reason: collision with root package name */
    public kd f98003o;

    /* renamed from: p, reason: collision with root package name */
    public List<String> f98004p;

    /* renamed from: q, reason: collision with root package name */
    public int f98005q = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xd.a$a, reason: collision with other inner class name */
    public class C1319a implements p<g.j, rx.c<Bitmap>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f98006a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: xd.a$a$a, reason: collision with other inner class name */
        public class C1320a implements u<kd, Bitmap, Bitmap, Bitmap, Bitmap, g.j, Bitmap> {
            public C1320a() {
            }

            @Override // wb0.u
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap g(kd binding, Bitmap qrcode, Bitmap logo, Bitmap words, Bitmap avater, g.j dakaInfo) {
                binding.f55602a.setImageBitmap(avater);
                binding.f55605d.setImageBitmap(words);
                binding.f55606e.setImageBitmap(logo);
                binding.f55607f.setImageBitmap(qrcode);
                binding.f55608g.setText(x.r().p().getNickName());
                binding.f55604c.setText(new SimpleDateFormat("EEEE，MMMM d", Locale.ENGLISH).format(new Date()));
                binding.f55603b.setBackgroundColor(Color.parseColor((String) a.this.f98004p.get(a.this.f98005q)));
                pd.g.c((String) a.this.f98004p.get(a.this.f98005q));
                View root = binding.getRoot();
                a.this.f80346b.postValue("");
                return a.this.k(root);
            }
        }

        public C1319a(final Context val$context) {
            this.f98006a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Bitmap> call(g.j dakaInfo) {
            DakaBackgroundCategoryInfo next;
            rx.c i11 = a.this.i(dakaInfo.f18379a.qr_image);
            rx.c i12 = a.this.i(dakaInfo.f18379a.logo);
            rx.c M2 = rx.c.M2(dakaInfo);
            rx.c j11 = a.this.j(x.r().p().getImage(), R.drawable.defaultavatarbig_normal_default);
            Iterator<DakaBackgroundCategoryInfo> it = dakaInfo.f18379a.category_info.iterator();
            rx.c cVar = null;
            while (true) {
                rx.c cVar2 = cVar;
                while (it.hasNext()) {
                    next = it.next();
                    if (pd.a.f80336f.equals(next.name)) {
                        break;
                    }
                }
                return rx.c.n7(a.this.A(this.f98006a), i11, i12, cVar2, j11, M2, new C1320a()).w5(tb0.a.a());
                a.this.f98004p = next.colors;
                cVar = a.this.i(next.images.get(0));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c.a<Bitmap> {
        public b() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Bitmap> subscriber) {
            subscriber.onStart();
            try {
                a aVar = a.this;
                aVar.f98005q = (aVar.f98005q + 1) % a.this.f98004p.size();
                a.this.f98003o.f55603b.setBackgroundColor(Color.parseColor((String) a.this.f98004p.get(a.this.f98005q)));
                pd.g.d((String) a.this.f98004p.get(a.this.f98005q));
                a aVar2 = a.this;
                subscriber.onNext(aVar2.k(aVar2.f98003o.getRoot()));
            } catch (Exception e11) {
                subscriber.onError(e11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<kd> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f98010a;

        public c(final Context val$context) {
            this.f98010a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super kd> subscriber) {
            if (a.this.f98003o == null) {
                a.this.f98003o = kd.d(LayoutInflater.from(this.f98010a));
            }
            subscriber.onStart();
            subscriber.onNext(a.this.f98003o);
            subscriber.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.c<kd> A(final Context context) {
        return rx.c.j1(new c(context)).w5(tb0.a.a());
    }

    @Override // pd.d
    public rx.c<Bitmap> a(final Context context) {
        return g.n().l(context).b2(new C1319a(context)).c3(l(f98002r + this.f98005q));
    }

    @Override // pd.d
    public String d() {
        return pd.a.f80336f;
    }

    @Override // pd.d
    public rx.c<Bitmap> f(Context context) {
        if (CollectionUtils.isEmpty(this.f98004p)) {
            return rx.c.T1(new RuntimeException("null color"));
        }
        return rx.c.j1(new b()).c3(l(f98002r + this.f98005q));
    }
}
