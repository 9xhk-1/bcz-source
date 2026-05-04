package zv;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f102916a = a.f102917a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f102917a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static b f102918b = b.C1400b.f102924a;

        @m80.k
        public final b a() {
            return f102918b;
        }

        public final void b(@m80.k b bVar) {
            g0.p(bVar, "<set-?>");
            f102918b = bVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public static final C1399a f102919b = new C1399a(null);

            /* renamed from: c, reason: collision with root package name */
            public static final int f102920c = 1;

            /* renamed from: d, reason: collision with root package name */
            public static final int f102921d = 2;

            /* renamed from: e, reason: collision with root package name */
            public static final int f102922e = 3;

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final String f102923a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: zv.n$b$a$a, reason: collision with other inner class name */
            public static final class C1399a {
                public /* synthetic */ C1399a(v vVar) {
                    this();
                }

                public C1399a() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@m80.k String locale) {
                super(null);
                g0.p(locale, "locale");
                this.f102923a = locale;
            }

            @Override // zv.n.b
            @m80.k
            public Locale a() {
                List o52 = k0.o5(this.f102923a, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, null);
                int size = o52.size();
                if (size == 1) {
                    return new Locale((String) o52.get(0));
                }
                if (size == 2) {
                    return new Locale((String) o52.get(0), (String) o52.get(1));
                }
                if (size == 3) {
                    return new Locale((String) o52.get(0), (String) o52.get(1), (String) o52.get(2));
                }
                throw new IllegalArgumentException("Invalid language tag " + this.f102923a + " which has more than three parts.");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: zv.n$b$b, reason: collision with other inner class name */
        public static final class C1400b extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final C1400b f102924a = new C1400b();

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public static final Locale f102925b = null;

            public C1400b() {
                super(null);
            }

            @Override // zv.n.b
            @m80.l
            public Locale a() {
                return f102925b;
            }
        }

        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.l
        public abstract Locale a();

        public b() {
        }
    }

    @m80.k
    String a(@m80.k Context context);
}
