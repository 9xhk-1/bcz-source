package qd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.jiongji.andriod.card.R;
import gs.cd;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static final String f82044r = "calendar";

    /* renamed from: o, reason: collision with root package name */
    public cd f82045o;

    /* renamed from: p, reason: collision with root package name */
    public List<String> f82046p;

    /* renamed from: q, reason: collision with root package name */
    public int f82047q = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: qd.a$a, reason: collision with other inner class name */
    public class C1016a implements p<g.j, rx.c<Bitmap>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f82048a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: qd.a$a$a, reason: collision with other inner class name */
        public class C1017a implements u<cd, Bitmap, Bitmap, ld.b, Bitmap, g.j, Bitmap> {
            public C1017a() {
            }

            @Override // wb0.u
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap g(cd binding, Bitmap qrcode, Bitmap logo, ld.b calendarData, Bitmap avater, g.j dakaInfo) {
                binding.f54445b.m(calendarData.f71089a, calendarData.f71090b, calendarData.f71091c, null);
                binding.f54444a.setImageBitmap(avater);
                binding.f54449f.setImageBitmap(logo);
                binding.f54450g.setImageBitmap(qrcode);
                binding.f54451h.setText(x.r().p().getNickName());
                Locale locale = Locale.ENGLISH;
                binding.f54448e.setText(new SimpleDateFormat("EEEE，MMMM d", locale).format(new Date()));
                binding.f54446c.setText(new SimpleDateFormat("MMMM，yyyy", locale).format(new Date()));
                binding.f54447d.setBackgroundColor(Color.parseColor((String) a.this.f82046p.get(a.this.f82047q)));
                pd.g.c((String) a.this.f82046p.get(a.this.f82047q));
                View root = binding.getRoot();
                a.this.f80346b.postValue("");
                return a.this.k(root);
            }
        }

        public C1016a(final Context val$context) {
            this.f82048a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Bitmap> call(g.j dakaInfo) {
            rx.c i11 = a.this.i(dakaInfo.f18379a.qr_image);
            rx.c i12 = a.this.i(dakaInfo.f18379a.logo);
            rx.c<ld.b> i13 = g.n().i(dakaInfo.f18380b);
            rx.c M2 = rx.c.M2(dakaInfo);
            rx.c j11 = a.this.j(x.r().p().getImage(), R.drawable.defaultavatarbig_normal_default);
            for (DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo : dakaInfo.f18379a.category_info) {
                if ("calendar".equals(dakaBackgroundCategoryInfo.name)) {
                    a.this.f82046p = dakaBackgroundCategoryInfo.colors;
                }
            }
            return rx.c.n7(a.this.z(this.f82048a), i11, i12, i13, j11, M2, new C1017a()).w5(tb0.a.a());
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
                aVar.f82047q = (aVar.f82047q + 1) % a.this.f82046p.size();
                a.this.f82045o.f54447d.setBackgroundColor(Color.parseColor((String) a.this.f82046p.get(a.this.f82047q)));
                pd.g.c((String) a.this.f82046p.get(a.this.f82047q));
                a aVar2 = a.this;
                subscriber.onNext(aVar2.k(aVar2.f82045o.getRoot()));
            } catch (Exception e11) {
                subscriber.onError(e11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<cd> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f82052a;

        public c(final Context val$context) {
            this.f82052a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super cd> subscriber) {
            if (a.this.f82045o == null) {
                a.this.f82045o = cd.d(LayoutInflater.from(this.f82052a));
                a.this.f82045o.executePendingBindings();
            }
            subscriber.onStart();
            subscriber.onNext(a.this.f82045o);
            subscriber.onCompleted();
        }
    }

    @Override // pd.d
    public rx.c<Bitmap> a(final Context context) {
        return g.n().l(context).b2(new C1016a(context)).c3(l("calendar" + this.f82047q));
    }

    @Override // pd.d
    public String d() {
        return "calendar";
    }

    @Override // pd.d
    public rx.c<Bitmap> f(Context context) {
        if (CollectionUtils.isEmpty(this.f82046p)) {
            return rx.c.T1(new RuntimeException("null color"));
        }
        return rx.c.j1(new b()).c3(l("calendar" + this.f82047q));
    }

    public final rx.c<cd> z(final Context context) {
        return rx.c.j1(new c(context)).w5(tb0.a.a());
    }
}
