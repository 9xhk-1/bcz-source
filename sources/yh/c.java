package yh;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import kc.q;
import kc.r;
import kc.u;
import yh.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c implements a.c {

    /* renamed from: a, reason: collision with root package name */
    public yh.a f100149a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1367c f100150b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f100151a;

        public a(final List val$testedIds) {
            this.f100151a = val$testedIds;
        }

        @Override // kc.q
        public void a(@NonNull View view) {
            c.this.j(this.f100151a != null ? new ArrayList(this.f100151a) : null);
            if (c.this.f100150b != null) {
                c.this.f100150b.onExit();
            }
        }

        @Override // kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            c.this.f100149a.v(this.f100151a);
        }

        @Override // kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            a.e j11 = c.this.j(this.f100151a != null ? new ArrayList(this.f100151a) : null);
            if (c.this.f100150b != null) {
                c.this.f100150b.c(j11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f100153a;

        public b(final List val$testedIds) {
            this.f100153a = val$testedIds;
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            c.this.f100149a.u(null);
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            c.this.j(this.f100153a != null ? new ArrayList(this.f100153a) : null);
            if (c.this.f100150b != null) {
                c.this.f100150b.onExit();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yh.c$c, reason: collision with other inner class name */
    public interface InterfaceC1367c {
        void a(a.e result);

        void b(a.e result);

        void c(a.e result);

        void onExit();
    }

    public c(Context context, InterfaceC1367c l11) {
        this.f100150b = l11;
        this.f100149a = yh.a.k(context.getApplicationContext()).y(this);
    }

    public static List<Integer> g(List<Integer> src, int size) {
        if (src == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Integer num : src) {
            num.intValue();
            arrayList.add(num);
            i11++;
            if (i11 == size) {
                break;
            }
        }
        return arrayList;
    }

    public static List<Integer> h(List<Integer> src, int start, int size) {
        if (src == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size2 = src.size();
        int i11 = 0;
        while (start < size2) {
            arrayList.add(src.get(start));
            i11++;
            if (i11 == size) {
                break;
            }
            start++;
        }
        return arrayList;
    }

    @Override // yh.a.c
    public void a(a.e result) {
        InterfaceC1367c interfaceC1367c = this.f100150b;
        if (interfaceC1367c != null) {
            interfaceC1367c.a(result);
        }
    }

    @Override // yh.a.c
    public void b(a.e result) {
        InterfaceC1367c interfaceC1367c = this.f100150b;
        if (interfaceC1367c != null) {
            interfaceC1367c.b(result);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(Context context, final List<Integer> testedIds) {
        mc.a.n((FragmentActivity) context, ((u) ((u.a) ((u.a) new u.a(context).U(R.string.selftest_all_tested).C(R.string.selftest_all_tested_positive)).n(R.string.selftest_all_tested_negative)).d()).f0(new b(testedIds)), "reset-all");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(Context context, final List<Integer> testedIds) {
        if (this.f100149a.r()) {
            mc.a.m((FragmentActivity) context, ((u) ((u.a) ((u.a) ((u.a) ((u.a) new u.a(context).U(R.string.selftest_today_tested).b0(ButtonType.TRIPLE).e(R.layout.layout_dialog_prompt_buttons_triple)).C(R.string.selftest_continue_history)).n(R.string.selftest_reset_today)).t(R.string.selftest_exit)).d()).f0(new a(testedIds)));
        } else {
            e(context, testedIds);
        }
    }

    public void i() {
        this.f100149a.s();
    }

    public a.e j(List<Integer> testedIds) {
        return this.f100149a.w(testedIds);
    }

    public c(Context context, a.e initResult, InterfaceC1367c l11) {
        this.f100150b = l11;
        this.f100149a = yh.a.l(context.getApplicationContext(), initResult).y(this);
    }
}
