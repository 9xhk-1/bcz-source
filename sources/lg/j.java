package lg;

import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.home.plan.data.DataType;
import com.baicizhan.main.home.plan.data.WordBanner;
import com.jiongji.andriod.card.R;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import lg.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j extends lg.a<WordBanner, a> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f71265h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f71266i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f71267j = j.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordBannerBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBannerBinder.kt\ncom/baicizhan/main/home/plan/binder/WordBannerBinder$BannerHolder\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n18#2,3:119\n2783#3,7:122\n*S KotlinDebug\n*F\n+ 1 WordBannerBinder.kt\ncom/baicizhan/main/home/plan/binder/WordBannerBinder$BannerHolder\n*L\n47#1:119,3\n69#1:122,7\n*E\n"})
    public final class a extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final LottieAnimationView f71268e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public WordBanner f71269f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j f71270g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lg.j$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0859a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71271a;

            static {
                int[] iArr = new int[DataType.values().length];
                try {
                    iArr[DataType.PNG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataType.LOTTERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71271a = iArr;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements hc.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f71272a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordBanner f71273b;

            public b(j jVar, WordBanner wordBanner) {
                this.f71272a = jVar;
                this.f71273b = wordBanner;
            }

            @Override // hc.d
            public void a(Exception exc) {
                qb.c.d(j.f71267j, this.f71273b.getType() + " error", new Object[0]);
                a3 C = this.f71272a.C();
                if (C != null) {
                    C.U0(this.f71273b, false);
                }
            }

            @Override // hc.d
            public void onSuccess() {
                a3 C = this.f71272a.C();
                if (C != null) {
                    C.U0(this.f71273b, true);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final j jVar, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f71270g = jVar;
            View findViewById = itemView.findViewById(R.id.banner);
            kotlin.jvm.internal.g0.o(findViewById, "findViewById(...)");
            this.f71268e = (LottieAnimationView) findViewById;
            sa.q.t(itemView, 0, new x00.l() { // from class: lg.g
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 o11;
                    o11 = j.a.o(j.this, this, (View) obj);
                    return o11;
                }
            }, 1, null);
            itemView.setEnabled(false);
        }

        public static final g2 o(j jVar, a aVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            a3 C = jVar.C();
            if (C != null) {
                WordBanner wordBanner = aVar.f71269f;
                if (wordBanner == null) {
                    return g2.f100423a;
                }
                C.X(wordBanner);
            }
            return g2.f100423a;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void q(java.io.File r8, final lg.j r9, final com.baicizhan.main.home.plan.data.WordBanner r10, final lg.j.a r11, final java.lang.String r12) {
            /*
                r1 = 0
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L7f
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L7f
                r2.<init>(r8)     // Catch: java.lang.Exception -> L7f
                r0.<init>(r2)     // Catch: java.lang.Exception -> L7f
                java.util.List r8 = r00.u.k(r0)     // Catch: java.lang.Exception -> L7f
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L7f
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L7f
                boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> L7f
                if (r0 == 0) goto Lab
                java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> L7f
            L1f:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L7f
                if (r2 == 0) goto L43
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L3d
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3d
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
                r3.<init>()     // Catch: java.lang.Exception -> L3d
                r3.append(r0)     // Catch: java.lang.Exception -> L3d
                r3.append(r2)     // Catch: java.lang.Exception -> L3d
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L3d
                goto L1f
            L3d:
                r0 = move-exception
                r8 = r0
                r6 = r9
                r7 = r10
                goto Lb5
            L43:
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L7f
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4c
                r8.<init>(r4)     // Catch: java.lang.Exception -> L4c
                goto L6d
            L4c:
                r0 = move-exception
                r8 = r0
                java.lang.String r0 = lg.j.D()     // Catch: java.lang.Exception -> L7f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
                r2.<init>()     // Catch: java.lang.Exception -> L7f
                java.lang.String r3 = "test json: "
                r2.append(r3)     // Catch: java.lang.Exception -> L7f
                r2.append(r8)     // Catch: java.lang.Exception -> L7f
                java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L7f
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L7f
                qb.c.d(r0, r8, r2)     // Catch: java.lang.Exception -> L7f
                org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Exception -> L83
                r8.<init>(r4)     // Catch: java.lang.Exception -> L83
            L6d:
                android.view.View r8 = r11.itemView     // Catch: java.lang.Exception -> L7f
                lg.i r2 = new lg.i     // Catch: java.lang.Exception -> L7f
                r6 = r9
                r7 = r10
                r3 = r11
                r5 = r12
                r2.<init>()     // Catch: java.lang.Exception -> L7c
                r8.post(r2)     // Catch: java.lang.Exception -> L7c
                goto Lc7
            L7c:
                r0 = move-exception
            L7d:
                r8 = r0
                goto Lb5
            L7f:
                r0 = move-exception
                r6 = r9
                r7 = r10
                goto L7d
            L83:
                r0 = move-exception
                r6 = r9
                r7 = r10
                r8 = r0
                java.lang.String r9 = lg.j.D()     // Catch: java.lang.Exception -> L7c
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7c
                r10.<init>()     // Catch: java.lang.Exception -> L7c
                java.lang.String r11 = "test json array: "
                r10.append(r11)     // Catch: java.lang.Exception -> L7c
                r10.append(r8)     // Catch: java.lang.Exception -> L7c
                java.lang.String r8 = r10.toString()     // Catch: java.lang.Exception -> L7c
                java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L7c
                qb.c.d(r9, r8, r10)     // Catch: java.lang.Exception -> L7c
                com.baicizhan.main.home.plan.a3 r8 = r6.C()     // Catch: java.lang.Exception -> L7c
                if (r8 == 0) goto Lc7
                r8.U0(r7, r1)     // Catch: java.lang.Exception -> L7c
                goto Lc7
            Lab:
                r6 = r9
                r7 = r10
                java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L7c
                java.lang.String r9 = "Empty collection can't be reduced."
                r8.<init>(r9)     // Catch: java.lang.Exception -> L7c
                throw r8     // Catch: java.lang.Exception -> L7c
            Lb5:
                java.lang.String r9 = lg.j.D()
                java.lang.String r10 = "read lottie file: "
                qb.c.c(r9, r10, r8)
                com.baicizhan.main.home.plan.a3 r8 = r6.C()
                if (r8 == 0) goto Lc7
                r8.U0(r7, r1)
            Lc7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.j.a.q(java.io.File, lg.j, com.baicizhan.main.home.plan.data.WordBanner, lg.j$a, java.lang.String):void");
        }

        public static final void r(a aVar, String str, String str2, j jVar, WordBanner wordBanner) {
            aVar.f71268e.M(str, str2);
            aVar.f71268e.A();
            a3 C = jVar.C();
            if (C != null) {
                C.U0(wordBanner, true);
            }
        }

        public final void p(@m80.k WordBanner item) {
            final a aVar;
            final WordBanner wordBanner;
            kotlin.jvm.internal.g0.p(item, "item");
            if (this.f71269f == item) {
                return;
            }
            this.f71269f = item;
            qb.c.b(j.f71267j, "bind: {" + item.getImagePath() + "}, " + item.getType(), new Object[0]);
            final String imagePath = item.getImagePath();
            final j jVar = this.f71270g;
            if (imagePath != null && imagePath.length() != 0) {
                File file = new File(imagePath);
                if (!file.exists()) {
                    file = null;
                }
                final File file2 = file;
                if (file2 != null) {
                    int i11 = C0859a.f71271a[item.getType().ordinal()];
                    if (i11 == 1) {
                        aVar = this;
                        wordBanner = item;
                        hc.c.k(file2).b(aVar.f71268e, new b(jVar, wordBanner), false);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = this;
                        wordBanner = item;
                        AsyncTask.execute(new Runnable() { // from class: lg.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                j.a.q(file2, jVar, wordBanner, aVar, imagePath);
                            }
                        });
                    }
                    View view = aVar.itemView;
                    String link = wordBanner.getLink();
                    view.setEnabled(true ^ (link != null || link.length() == 0));
                }
            }
            aVar = this;
            wordBanner = item;
            View view2 = aVar.itemView;
            String link2 = wordBanner.getLink();
            view2.setEnabled(true ^ (link2 != null || link2.length() == 0));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // zf.b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k a holder, @m80.k WordBanner item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.p(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        View inflate = inflater.inflate(R.layout.item_word_banner, parent, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        return new a(this, inflate);
    }
}
