package i9;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.BczJson;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60423a = "UserRecordHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final String f60424b = "user_info";

    /* renamed from: c, reason: collision with root package name */
    public static final String f60425c = "user_token";

    /* renamed from: d, reason: collision with root package name */
    public static volatile nc.a f60426d;

    public static void a(Context context) {
        e().r(f60424b);
        e().r(f60425c);
    }

    public static void b(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.b0.C0243a.f16118e, (Integer) 0);
        context.getContentResolver().update(a.b0.f16113b, contentValues, "ZSAVESTATUS!=0", null);
    }

    public static UserRecord c(Context context) {
        UserRecord userRecord = (UserRecord) BczJson.fromJson(e().getString(f60424b, ""), UserRecord.class);
        if (userRecord == null && (userRecord = (UserRecord) k9.a.q(k9.c.i(a.b0.f16113b).m("ZSAVESTATUS = 1", new String[0]).d(context), UserRecord.class, UserRecord.COLUMN_MAP)) != null) {
            f(context, userRecord);
            b(context);
            qb.c.i(f60423a, "move user from db to kv", new Object[0]);
        }
        if (userRecord != null) {
            String g11 = f.g(context, f.L, false);
            if (TextUtils.isEmpty(g11)) {
                g11 = ia.a.f("USER_EMAIL");
            }
            if (!TextUtils.isEmpty(g11)) {
                userRecord.setEmail(g11);
            }
            String g12 = f.g(context, f.M, false);
            if (TextUtils.isEmpty(g12)) {
                g12 = ia.a.f("USER_PUBLIC_KEY");
            }
            if (!TextUtils.isEmpty(g12)) {
                userRecord.setPublicKey(g12);
            }
            userRecord.setUniqueId(f.d(context, f.R));
            userRecord.setIsNewUser(userRecord.getGameBeta() == 2);
            x.r().r0(userRecord, true);
        }
        return userRecord;
    }

    public static String d() {
        String string = e().getString(f60425c, null);
        return string != null ? string : k9.a.D(k9.c.i(a.b0.f16113b).m("ZSAVESTATUS = 1", new String[0]).g(a.b0.C0243a.f16115b).d(pb.a.a()));
    }

    public static nc.a e() {
        if (f60426d == null) {
            synchronized (m.class) {
                try {
                    if (f60426d == null) {
                        f60426d = nc.b.c(f60424b);
                    }
                } finally {
                }
            }
        }
        return f60426d;
    }

    public static void f(Context context, UserRecord user) {
        if (user == null) {
            throw new RuntimeException("null user");
        }
        e().p(f60425c, user.getToken());
        e().p(f60424b, BczJson.toJson(user));
    }
}
