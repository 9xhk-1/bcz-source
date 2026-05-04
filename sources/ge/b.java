package ge;

import android.content.Context;
import gc.a;
import java.util.ArrayList;
import java.util.List;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53634a = -9;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<a.d, C0635b> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0635b call(a.d result) {
            if (result.f53573b == null) {
                throw new RuntimeException();
            }
            C0635b c0635b = new C0635b();
            if (result.f53573b.isValid()) {
                List<Integer> vocabCurve = result.f53573b.getData().getVocabCurve();
                c0635b.f53636b = vocabCurve;
                c0635b.f53635a = vocabCurve.get(vocabCurve.size() - 1).intValue();
                return c0635b;
            }
            if (result.f53573b.getError() == null || result.f53573b.getError().getCode() != -9) {
                if (result.f53573b.getError() != null) {
                    throw new RuntimeException(result.f53573b.getError().getMsg());
                }
                throw new RuntimeException("invalid");
            }
            c0635b.f53635a = 0;
            c0635b.f53636b = new ArrayList();
            return c0635b;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ge.b$b, reason: collision with other inner class name */
    public static class C0635b {

        /* renamed from: a, reason: collision with root package name */
        public int f53635a;

        /* renamed from: b, reason: collision with root package name */
        public List<Integer> f53636b;
    }

    public rx.c<C0635b> a(Context context) {
        return gc.a.b(context, 1).c3(new a()).I3(tb0.a.a());
    }

    public rx.c<C0635b> b(Context context) {
        return gc.a.b(context, 0).c3(new a()).I3(tb0.a.a());
    }
}
