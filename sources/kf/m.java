package kf;

import android.content.Context;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final String f66483b = "CategoryRoute";

    /* renamed from: a, reason: collision with root package name */
    public Stack<a> f66484a = new Stack<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f66485a;

        /* renamed from: b, reason: collision with root package name */
        public int f66486b;

        public a(Object data, int type) {
            this.f66486b = type;
            this.f66485a = data;
        }

        public String toString() {
            return "{" + this.f66485a + "," + this.f66486b + com.alipay.sdk.m.u.i.f11099d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f66487a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f66488b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f66489c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f66490d = 4;

        public static int a(int level) {
            return level >= 4 ? level : level + 1;
        }
    }

    public final Object a(int searchLevel) {
        Iterator<a> it = this.f66484a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f66486b == searchLevel) {
                return next.f66485a;
            }
        }
        return null;
    }

    public String b() {
        return (String) a(3);
    }

    public String c() {
        return (String) a(4);
    }

    public int d() {
        Object a11 = a(1);
        if (a11 == null) {
            return -1;
        }
        return ((Integer) a11).intValue();
    }

    public String e() {
        return (String) a(2);
    }

    public void f() {
        a pop = this.f66484a.pop();
        qb.c.i(f66483b, "%s", pop == null ? "null" : pop.toString());
    }

    public boolean g(int level) {
        if (!this.f66484a.isEmpty()) {
            return false;
        }
        this.f66484a.push(new a(Integer.valueOf(level), 1));
        return true;
    }

    public boolean h(String subCategory) {
        if (this.f66484a.isEmpty()) {
            return false;
        }
        a peek = this.f66484a.peek();
        int a11 = b.a(peek.f66486b);
        if (a11 == peek.f66486b) {
            return false;
        }
        this.f66484a.push(new a(subCategory, a11));
        return true;
    }

    public String i(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(context.getString(R.string.userinfo_category_all));
        for (int i11 = 0; i11 < this.f66484a.size(); i11++) {
            stringBuffer.append(" / ");
            if (this.f66484a.get(i11).f66486b == 1) {
                stringBuffer.append(jf.a.a(context, ((Integer) this.f66484a.get(i11).f66485a).intValue()));
            } else {
                stringBuffer.append(this.f66484a.get(i11).f66485a);
            }
        }
        return stringBuffer.toString();
    }
}
