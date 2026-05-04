package da;

import android.content.Context;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.framework.asynctask.LAsyncTask;
import i9.o;
import java.io.File;
import java.util.ArrayList;
import rb.d;
import ub.a;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f47508a;

    /* renamed from: b, reason: collision with root package name */
    public com.baicizhan.client.business.media.update.a f47509b;

    /* renamed from: c, reason: collision with root package name */
    public C0552a f47510c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: da.a$a, reason: collision with other inner class name */
    public class C0552a extends LAsyncTask<Void, Void, Void> {
        public C0552a() {
            N(f.o(a.class.getName()));
            A(1);
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public Void f(Void... arg0) {
            String g11 = o.g(a.this.f47508a, 2);
            String g12 = o.g(a.this.f47508a, 3);
            ArrayList<String> arrayList = new ArrayList(2);
            arrayList.add(g11);
            arrayList.add(g12);
            int b11 = d.b(a.this.f47508a);
            if (3 != b11 && -1 != b11) {
                ub.a a11 = new a.b().a();
                for (String str : arrayList) {
                    String str2 = PathUtil.getResDns() + str;
                    String reformFmPath = PathUtil.reformFmPath(PathUtil.BCZ_HOME + str);
                    if (reformFmPath != null) {
                        File file = new File(reformFmPath);
                        if (!file.exists() || file.length() <= 0) {
                            a11.H(str2);
                            a11.E(reformFmPath);
                            if (!a11.I()) {
                                a11.H(PathUtil.getCandResDns() + str);
                                a11.I();
                            }
                        }
                    }
                }
            }
            return null;
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(Void result) {
            if (a.this.f47509b != null) {
                a.this.f47509b.e();
            }
        }
    }

    public a(Context context, com.baicizhan.client.business.media.update.a fmUpdator) {
        this.f47508a = context;
        this.f47509b = fmUpdator;
    }

    public final C0552a c() {
        String o11 = f.o(a.class.getName());
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(o11);
        if (K != null) {
            K.d();
            LAsyncTask.G(0, o11);
        }
        return new C0552a();
    }

    public void d() {
        int b11 = d.b(this.f47508a);
        if (3 != b11 && -1 != b11) {
            C0552a c11 = c();
            this.f47510c = c11;
            c11.g(null);
        } else {
            com.baicizhan.client.business.media.update.a aVar = this.f47509b;
            if (aVar != null) {
                aVar.e();
            }
        }
    }
}
