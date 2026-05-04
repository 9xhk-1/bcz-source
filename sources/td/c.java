package td;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.Fonts;
import com.baicizhan.main.activity.daka.datasource.g;
import com.jiongji.andriod.card.R;
import gs.ed;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import rx.c;
import wb0.p;
import wb0.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends pd.a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f90455q = "photo";

    /* renamed from: o, reason: collision with root package name */
    public ed f90456o;

    /* renamed from: p, reason: collision with root package name */
    public String f90457p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<g.j, rx.c<Bitmap>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90458a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: td.c$a$a, reason: collision with other inner class name */
        public class C1201a implements s<ed, Bitmap, Bitmap, g.j, Bitmap> {
            public C1201a() {
            }

            @Override // wb0.s
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap k(ed binding, Bitmap qrcode, Bitmap logo, g.j dakaInfo) {
                binding.f54774b.setText(String.valueOf(dakaInfo.f18380b.total_daka_days));
                binding.f54777e.setImageBitmap(null);
                binding.f54777e.setBackgroundColor(-4144960);
                binding.f54780h.setVisibility(0);
                binding.f54778f.setImageBitmap(logo);
                binding.f54779g.setImageBitmap(qrcode);
                TextView textView = binding.f54781i;
                int i11 = dakaInfo.f18380b.total_words;
                textView.setText(i11 == -1 ? String.valueOf(LearnRecordManager.A().I()) : String.valueOf(i11));
                binding.f54773a.setText(new SimpleDateFormat("EEEE，MMMM d", Locale.ENGLISH).format(new Date()));
                View root = binding.getRoot();
                c.this.f80346b.postValue("");
                return c.this.k(root);
            }
        }

        public a(final Context val$context) {
            this.f90458a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Bitmap> call(g.j dakaInfo) {
            return rx.c.p7(c.this.u(this.f90458a), c.this.i(dakaInfo.f18379a.qr_image), c.this.i(dakaInfo.f18379a.logo), rx.c.M2(dakaInfo), new C1201a()).w5(tb0.a.a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<Bitmap, Bitmap> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(Bitmap bitmap) {
            c.this.f90456o.f54780h.setVisibility(8);
            c.this.f90456o.f54777e.setImageBitmap(bitmap);
            c cVar = c.this;
            return cVar.k(cVar.f90456o.getRoot());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: td.c$c, reason: collision with other inner class name */
    public class C1202c implements p<String, Bitmap> {
        public C1202c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(String s11) {
            try {
                return hc.c.p(s11).h().get();
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements c.a<ed> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90463a;

        public d(final Context val$context) {
            this.f90463a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super ed> subscriber) {
            if (c.this.f90456o == null) {
                c.this.f90456o = ed.d(LayoutInflater.from(this.f90463a));
                Fonts.setSafeFace(R.font.sfu_din_eng_alt, c.this.f90456o.f54774b, c.this.f90456o.f54781i);
            }
            subscriber.onStart();
            subscriber.onNext(c.this.f90456o);
            subscriber.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.c<ed> u(final Context context) {
        return rx.c.j1(new d(context)).w5(tb0.a.a());
    }

    @Override // pd.d
    public rx.c<Bitmap> a(final Context context) {
        return com.baicizhan.main.activity.daka.datasource.g.n().l(context).b2(new a(context)).I3(bc0.c.e()).c3(l("photonophoto"));
    }

    @Override // pd.d
    public String d() {
        return "photo";
    }

    @Override // pd.d
    public rx.c<Bitmap> f(Context context) {
        rx.c I3 = com.baicizhan.main.activity.daka.datasource.g.n().j(this.f90457p).c3(new C1202c()).w5(bc0.c.e()).I3(tb0.a.a()).c3(new b()).I3(bc0.c.e());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("photo");
        String str = this.f90457p;
        sb2.append(str == null ? "error" : Integer.valueOf(str.hashCode()));
        return I3.c3(l(sb2.toString()));
    }

    public void v(String photoUri) {
        this.f90457p = photoUri;
    }
}
