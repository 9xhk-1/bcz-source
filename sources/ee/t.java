package ee;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49736a = 0;

    public static final List h(Context context, String[] it) {
        kotlin.jvm.internal.g0.p(it, "it");
        String[] stringArray = context.getResources().getStringArray(R.array.main_grade);
        kotlin.jvm.internal.g0.o(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 13; i11++) {
            String str = it[i11];
            kotlin.jvm.internal.g0.o(str, "get(...)");
            arrayList.add(new a(str, i11));
        }
        for (int i12 = 14; i12 < 20; i12++) {
            String str2 = it[i12];
            kotlin.jvm.internal.g0.o(str2, "get(...)");
            arrayList.add(new a(str2, i12));
        }
        for (int i13 = 23; i13 < 25; i13++) {
            String str3 = it[i13];
            kotlin.jvm.internal.g0.o(str3, "get(...)");
            arrayList.add(new a(str3, i13));
        }
        String str4 = stringArray[5];
        kotlin.jvm.internal.g0.o(str4, "get(...)");
        arrayList.add(18, str4);
        String str5 = stringArray[4];
        kotlin.jvm.internal.g0.o(str5, "get(...)");
        arrayList.add(12, str5);
        String str6 = stringArray[3];
        kotlin.jvm.internal.g0.o(str6, "get(...)");
        arrayList.add(9, str6);
        String str7 = stringArray[2];
        kotlin.jvm.internal.g0.o(str7, "get(...)");
        arrayList.add(6, str7);
        String str8 = stringArray[1];
        kotlin.jvm.internal.g0.o(str8, "get(...)");
        arrayList.add(0, str8);
        return arrayList;
    }

    public static final List i(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final String k(int i11, int i12, UnifiedUserService.Client client) {
        return client.update_role_extra(i11, i12);
    }

    public static final String l(x00.l lVar, Object obj) {
        return (String) lVar.invoke(obj);
    }

    public static final g2 m(int i11, int i12, String str) {
        q9.x.r().p().setRole(new UserRecord.Role(i11, i12));
        return g2.f100423a;
    }

    public static final void n(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @m80.k
    public final rx.c<List<Object>> g(@m80.k final Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        rx.c M2 = rx.c.M2(context.getResources().getStringArray(R.array.grade));
        final x00.l lVar = new x00.l() { // from class: ee.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                List h11;
                h11 = t.h(context, (String[]) obj);
                return h11;
            }
        };
        rx.c<List<Object>> c32 = M2.c3(new wb0.p() { // from class: ee.o
            @Override // wb0.p
            public final Object call(Object obj) {
                List i11;
                i11 = t.i(x00.l.this, obj);
                return i11;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }

    @m80.k
    public final rx.c<String> j(final int i11, final int i12) {
        rx.c b11 = com.baicizhan.client.business.thrift.p.b("/rpc/unified_user_service");
        final x00.l lVar = new x00.l() { // from class: ee.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                String k11;
                k11 = t.k(i11, i12, (UnifiedUserService.Client) obj);
                return k11;
            }
        };
        rx.c c32 = b11.c3(new wb0.p() { // from class: ee.q
            @Override // wb0.p
            public final Object call(Object obj) {
                String l11;
                l11 = t.l(x00.l.this, obj);
                return l11;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: ee.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m11;
                m11 = t.m(i11, i12, (String) obj);
                return m11;
            }
        };
        rx.c<String> w52 = c32.L1(new wb0.b() { // from class: ee.s
            @Override // wb0.b
            public final void call(Object obj) {
                t.n(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }
}
